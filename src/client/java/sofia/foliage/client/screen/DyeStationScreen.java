package sofia.foliage.client.screen;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import sofia.foliage.ColoredFoliage;
import sofia.foliage.block.ModBlocks;
import sofia.foliage.dyeing.DyeStorage;
import sofia.foliage.dyeing.FoliageDyeing;
import sofia.foliage.screen.DyeStationScreenHandler;

import java.util.ArrayList;
import java.util.List;

public class DyeStationScreen extends HandledScreen<DyeStationScreenHandler> {
    private static final Identifier DYEING_TEXTURE = new Identifier(ColoredFoliage.MOD_ID, "textures/gui/container/dye_station_dyeing.png");
    private static final Identifier STORAGE_TEXTURE = new Identifier(ColoredFoliage.MOD_ID, "textures/gui/container/dye_station_storage.png");
    /** Vanilla sprites: stonecutter recipe buttons and creative inventory tabs. */
    private static final Identifier STONECUTTER_TEXTURE = new Identifier("textures/gui/container/stonecutter.png");
    private static final Identifier TABS_TEXTURE = new Identifier("textures/gui/container/creative_inventory/tabs.png");

    private static final int TAB_DYEING = 0;
    private static final int TAB_STORAGE = 1;
    private static final int TAB_WIDTH = 26;
    private static final int TAB_HEIGHT = 32;

    // Dyeing tab: 4x4 grid of 16x18 color buttons
    private static final int BUTTONS_X = 44;
    private static final int BUTTONS_Y = 16;
    private static final int BUTTON_W = 16;
    private static final int BUTTON_H = 18;

    // Storage tab: 6 columns of cells, each an 18x18 slot plus a fill bar
    private static final int CELLS_X = 44;
    private static final int CELLS_Y = 16;
    private static final int CELL_W = 21;
    private static final int CELL_H = 24;

    private int tab = TAB_DYEING;

    public DyeStationScreen(DyeStationScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
        this.backgroundWidth = 176;
        this.backgroundHeight = 186;
        this.playerInventoryTitleY = this.backgroundHeight - 94;
    }

    private void setTab(int newTab) {
        tab = newTab;
        handler.flowerSlot.visible = tab == TAB_DYEING;
        handler.outputSlot.visible = tab == TAB_DYEING;
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        // Unselected tab behind the window, selected tab in front of it (like the creative inventory).
        drawTab(context, 1 - tab, false);
        context.drawTexture(tab == TAB_DYEING ? DYEING_TEXTURE : STORAGE_TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight);
        drawTab(context, tab, true);

        if (tab == TAB_DYEING) {
            drawColorButtons(context, mouseX, mouseY);
        } else {
            drawStorage(context);
        }
    }

    private void drawTab(DrawContext context, int index, boolean selected) {
        int tabX = x + index * (TAB_WIDTH + 1);
        int tabY = y - 28;
        context.drawTexture(TABS_TEXTURE, tabX, tabY, index * TAB_WIDTH, selected ? TAB_HEIGHT : 0, TAB_WIDTH, TAB_HEIGHT);
        context.drawItem(tabIcon(index), tabX + 5, tabY + 9);
    }

    private static ItemStack tabIcon(int index) {
        return index == TAB_DYEING ? new ItemStack(ModBlocks.DYE_STATION) : DyeStorage.dyeItem(DyeStorage.UNIVERSAL);
    }

    private void drawColorButtons(DrawContext context, int mouseX, int mouseY) {
        for (DyeColor color : DyeColor.values()) {
            int bx = x + BUTTONS_X + (color.getId() % 4) * BUTTON_W;
            int by = y + BUTTONS_Y + (color.getId() / 4) * BUTTON_H;
            boolean selected = handler.getSelectedColor() == color.getId();
            boolean hovered = isIn(mouseX, mouseY, bx, by, BUTTON_W, BUTTON_H);
            int v = selected ? 184 : hovered && isSelectable(color) ? 202 : 166;
            context.drawTexture(STONECUTTER_TEXTURE, bx, by, 0, v, BUTTON_W, BUTTON_H);
            context.drawItem(DyeStorage.dyeItem(color.getId()), bx, by + 1);
            if (!handler.canDye(color)) {
                // Greyed out: no variant, same color, or out of dye.
                context.fill(bx, by, bx + BUTTON_W, by + BUTTON_H, 200, 0x99_8B8B8B);
            }
        }
    }

    private void drawStorage(DrawContext context) {
        for (int i = 0; i < DyeStorage.SIZE; i++) {
            int cx = x + CELLS_X + (i % 6) * CELL_W;
            int cy = y + CELLS_Y + (i / 6) * CELL_H;
            int amount = handler.getStored(i);
            ItemStack dye = DyeStorage.dyeItem(i);
            context.drawItem(dye, cx + 1, cy + 1);
            String count = amount > 0 ? String.valueOf(amount) : Formatting.DARK_GRAY + "0";
            context.drawItemInSlot(textRenderer, dye, cx + 1, cy + 1, count);

            int filled = Math.round(16f * amount / DyeStorage.CAPACITY);
            for (int px = 0; px < filled; px++) {
                context.fill(cx + 1 + px, cy + 20, cx + 2 + px, cy + 22, barColor(i, px));
            }
        }
    }

    private static int barColor(int index, int px) {
        if (index == DyeStorage.UNIVERSAL) {
            return 0xFF000000 | java.awt.Color.HSBtoRGB(px / 16f, 0.8f, 1f);
        }
        return 0xFF000000 | DyeColor.byId(index).getFireworkColor();
    }

    @Override
    protected void drawMouseoverTooltip(DrawContext context, int mouseX, int mouseY) {
        super.drawMouseoverTooltip(context, mouseX, mouseY);
        if (!handler.getCursorStack().isEmpty()) return;

        for (int i = 0; i < 2; i++) {
            if (isIn(mouseX, mouseY, x + i * (TAB_WIDTH + 1), y - 28, TAB_WIDTH, 28)) {
                context.drawTooltip(textRenderer, Text.translatable(i == TAB_DYEING ? "gui.colored-foliage.tab.dyeing" : "gui.colored-foliage.tab.storage"), mouseX, mouseY);
                return;
            }
        }

        if (focusedSlot != null && !focusedSlot.hasStack()) {
            if (focusedSlot == handler.flowerSlot) {
                context.drawTooltip(textRenderer, Text.translatable("gui.colored-foliage.slot.flower"), mouseX, mouseY);
            } else if (focusedSlot.id == DyeStationScreenHandler.DYE_SLOT) {
                context.drawTooltip(textRenderer, List.of(
                        Text.translatable("gui.colored-foliage.slot.dye"),
                        Text.translatable("gui.colored-foliage.dye.per_dye", DyeStorage.COLORINGS_PER_DYE).formatted(Formatting.GRAY)), mouseX, mouseY);
            }
            return;
        }

        if (tab == TAB_DYEING) {
            for (DyeColor color : DyeColor.values()) {
                int bx = x + BUTTONS_X + (color.getId() % 4) * BUTTON_W;
                int by = y + BUTTONS_Y + (color.getId() / 4) * BUTTON_H;
                if (isIn(mouseX, mouseY, bx, by, BUTTON_W, BUTTON_H)) {
                    context.drawTooltip(textRenderer, buttonTooltip(color), mouseX, mouseY);
                    return;
                }
            }
        } else {
            for (int i = 0; i < DyeStorage.SIZE; i++) {
                int cx = x + CELLS_X + (i % 6) * CELL_W;
                int cy = y + CELLS_Y + (i / 6) * CELL_H;
                if (isIn(mouseX, mouseY, cx, cy, 18, 23)) {
                    List<Text> lines = new ArrayList<>();
                    lines.add(DyeStorage.dyeItem(i).getName());
                    lines.add(Text.translatable("gui.colored-foliage.dye.stock", handler.getStored(i), DyeStorage.CAPACITY).formatted(Formatting.GRAY));
                    if (i == DyeStorage.UNIVERSAL) {
                        lines.add(Text.translatable("gui.colored-foliage.dye.universal_hint").formatted(Formatting.LIGHT_PURPLE));
                    }
                    context.drawTooltip(textRenderer, lines, mouseX, mouseY);
                    return;
                }
            }
        }
    }

    private List<Text> buttonTooltip(DyeColor color) {
        List<Text> lines = new ArrayList<>();
        lines.add(Text.translatable("color.minecraft." + color.getName()));
        ItemStack flower = handler.getFlower();
        if (flower.isEmpty()) {
            lines.add(Text.translatable("gui.colored-foliage.slot.flower").formatted(Formatting.GRAY));
            return lines;
        }
        ItemStack result = FoliageDyeing.getResult(flower, color);
        if (result.isEmpty()) {
            lines.add(Text.translatable("gui.colored-foliage.button.no_variant").formatted(Formatting.RED));
        } else if (result.isOf(flower.getItem())) {
            lines.add(Text.translatable("gui.colored-foliage.button.same").formatted(Formatting.GRAY));
        } else {
            lines.add(result.getName().copy().formatted(Formatting.GRAY));
            int own = handler.getStored(color.getId());
            lines.add(Text.translatable("gui.colored-foliage.dye.stock", own, DyeStorage.CAPACITY).formatted(Formatting.GRAY));
            if (own == 0 && handler.getStored(DyeStorage.UNIVERSAL) > 0) {
                lines.add(Text.translatable("gui.colored-foliage.button.uses_universal").formatted(Formatting.LIGHT_PURPLE));
            } else if (own == 0) {
                lines.add(Text.translatable("gui.colored-foliage.button.empty").formatted(Formatting.RED));
            }
        }
        return lines;
    }

    /** A color can be picked when the flower has a different-colored variant, even if dye is missing right now. */
    private boolean isSelectable(DyeColor color) {
        ItemStack flower = handler.getFlower();
        ItemStack result = FoliageDyeing.getResult(flower, color);
        return !result.isEmpty() && !result.isOf(flower.getItem());
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (button == 0) {
            for (int i = 0; i < 2; i++) {
                if (i != tab && isIn(mouseX, mouseY, x + i * (TAB_WIDTH + 1), y - 28, TAB_WIDTH, 28)) {
                    setTab(i);
                    playClick();
                    return true;
                }
            }
            if (tab == TAB_DYEING) {
                for (DyeColor color : DyeColor.values()) {
                    int bx = x + BUTTONS_X + (color.getId() % 4) * BUTTON_W;
                    int by = y + BUTTONS_Y + (color.getId() / 4) * BUTTON_H;
                    if (isIn(mouseX, mouseY, bx, by, BUTTON_W, BUTTON_H) && isSelectable(color)
                            && handler.onButtonClick(client.player, color.getId())) {
                        client.interactionManager.clickButton(handler.syncId, color.getId());
                        playClick();
                        return true;
                    }
                }
            }
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    protected boolean isClickOutsideBounds(double mouseX, double mouseY, int left, int top, int button) {
        // The tabs stick out above the window; clicks there must not drop the held item.
        boolean onTabs = mouseY >= top - 28 && mouseY < top && mouseX >= left && mouseX < left + 2 * (TAB_WIDTH + 1);
        return !onTabs && super.isClickOutsideBounds(mouseX, mouseY, left, top, button);
    }

    private void playClick() {
        client.getSoundManager().play(PositionedSoundInstance.master(SoundEvents.UI_BUTTON_CLICK, 1.0F));
    }

    private static boolean isIn(double mouseX, double mouseY, int x, int y, int w, int h) {
        return mouseX >= x && mouseX < x + w && mouseY >= y && mouseY < y + h;
    }
}
