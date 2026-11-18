package sofia.foliage.screen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.CraftingResultInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.Property;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.DyeColor;
import sofia.foliage.block.ModBlocks;
import sofia.foliage.dyeing.DyeStorage;
import sofia.foliage.dyeing.FoliageDyeing;

public class DyeStationScreenHandler extends ScreenHandler {
    public static final int FLOWER_SLOT = 0;
    public static final int DYE_SLOT = 1;
    public static final int OUTPUT_SLOT = 2;
    private static final int INVENTORY_START = 3;
    private static final int HOTBAR_START = 30;
    private static final int INVENTORY_END = 39;

    /** Vertical position of the player inventory; the screen is taller than a vanilla one. */
    public static final int PLAYER_INVENTORY_Y = 104;

    private final ScreenHandlerContext context;
    private final PropertyDelegate storage;
    private final Property selectedColor = Property.create();
    private final Inventory input = new SimpleInventory(2) {
        @Override
        public void markDirty() {
            super.markDirty();
            DyeStationScreenHandler.this.onContentChanged(this);
        }
    };
    private final CraftingResultInventory output = new CraftingResultInventory();

    public final TabSlot flowerSlot;
    public final TabSlot outputSlot;

    /** Client side: the storage values arrive through property syncing. */
    public DyeStationScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new ArrayPropertyDelegate(DyeStorage.SIZE), ScreenHandlerContext.EMPTY);
    }

    public DyeStationScreenHandler(int syncId, PlayerInventory playerInventory, PropertyDelegate storage, ScreenHandlerContext context) {
        super(ModScreenHandlers.DYE_STATION, syncId);
        checkDataCount(storage, DyeStorage.SIZE);
        this.context = context;
        this.storage = storage;

        this.flowerSlot = (TabSlot) addSlot(new TabSlot(input, 0, 20, 26) {
            @Override
            public boolean canInsert(ItemStack stack) {
                return FoliageDyeing.isDyeable(stack);
            }
        });
        addSlot(new Slot(input, 1, 20, 62) {
            @Override
            public boolean canInsert(ItemStack stack) {
                return DyeStorage.indexOf(stack) >= 0;
            }
        });
        this.outputSlot = (TabSlot) addSlot(new TabSlot(output, 0, 147, 45) {
            @Override
            public boolean canInsert(ItemStack stack) {
                return false;
            }

            @Override
            public void onTakeItem(PlayerEntity player, ItemStack stack) {
                stack.onCraft(player.getWorld(), player, stack.getCount());
                int color = selectedColor.get();
                if (color >= 0) DyeStorage.consume(storage, DyeColor.byId(color));
                input.removeStack(0, 1);
                populateResult();
                super.onTakeItem(player, stack);
            }
        });

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                addSlot(new Slot(playerInventory, col + row * 9 + 9, 8 + col * 18, PLAYER_INVENTORY_Y + row * 18));
            }
        }
        for (int col = 0; col < 9; col++) {
            addSlot(new Slot(playerInventory, col, 8 + col * 18, PLAYER_INVENTORY_Y + 58));
        }

        addProperties(storage);
        selectedColor.set(-1);
        addProperty(selectedColor);
    }

    public int getStored(int index) {
        return storage.get(index);
    }

    public int getSelectedColor() {
        return selectedColor.get();
    }

    public ItemStack getFlower() {
        return input.getStack(0);
    }

    /** True if the flower in the input slot can currently be dyed {@code color}. */
    public boolean canDye(DyeColor color) {
        ItemStack flower = getFlower();
        ItemStack result = FoliageDyeing.getResult(flower, color);
        return !result.isEmpty() && !result.isOf(flower.getItem()) && DyeStorage.canColor(storage, color);
    }

    @Override
    public boolean onButtonClick(PlayerEntity player, int id) {
        if (id < 0 || id >= 16) return false;
        selectedColor.set(id);
        populateResult();
        return true;
    }

    @Override
    public void onContentChanged(Inventory inventory) {
        if (inventory == input) {
            // Dye put into the dye slot is poured straight into the station's storage (server only).
            context.run((world, pos) -> DyeStorage.absorb(storage, input.getStack(1)));
            populateResult();
        }
        super.onContentChanged(inventory);
    }

    private void populateResult() {
        int color = selectedColor.get();
        ItemStack result = ItemStack.EMPTY;
        if (color >= 0 && canDye(DyeColor.byId(color))) {
            result = FoliageDyeing.getResult(getFlower(), DyeColor.byId(color));
        }
        output.setStack(0, result);
        sendContentUpdates();
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int index) {
        Slot slot = slots.get(index);
        if (slot == null || !slot.hasStack()) return ItemStack.EMPTY;

        ItemStack original = slot.getStack();
        ItemStack copy = original.copy();
        if (index == OUTPUT_SLOT) {
            original.getItem().onCraft(original, player.getWorld(), player);
            if (!insertItem(original, INVENTORY_START, INVENTORY_END, true)) return ItemStack.EMPTY;
            slot.onQuickTransfer(original, copy);
        } else if (index == FLOWER_SLOT || index == DYE_SLOT) {
            if (!insertItem(original, INVENTORY_START, INVENTORY_END, false)) return ItemStack.EMPTY;
        } else if (DyeStorage.indexOf(original) >= 0) {
            if (!insertItem(original, DYE_SLOT, DYE_SLOT + 1, false)) return ItemStack.EMPTY;
        } else if (FoliageDyeing.isDyeable(original)) {
            if (!insertItem(original, FLOWER_SLOT, FLOWER_SLOT + 1, false)) return ItemStack.EMPTY;
        } else if (index < HOTBAR_START) {
            if (!insertItem(original, HOTBAR_START, INVENTORY_END, false)) return ItemStack.EMPTY;
        } else if (!insertItem(original, INVENTORY_START, HOTBAR_START, false)) {
            return ItemStack.EMPTY;
        }

        if (original.isEmpty()) slot.setStack(ItemStack.EMPTY);
        slot.markDirty();
        if (original.getCount() == copy.getCount()) return ItemStack.EMPTY;
        slot.onTakeItem(player, original);
        sendContentUpdates();
        return copy;
    }

    @Override
    public boolean canInsertIntoSlot(ItemStack stack, Slot slot) {
        return slot.inventory != output && super.canInsertIntoSlot(stack, slot);
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return canUse(context, player, ModBlocks.DYE_STATION);
    }

    @Override
    public void onClosed(PlayerEntity player) {
        super.onClosed(player);
        output.removeStack(0);
        context.run((world, pos) -> dropInventory(player, input));
    }

    /** A slot the screen can hide while the storage tab is open. */
    public static class TabSlot extends Slot {
        public boolean visible = true;

        public TabSlot(Inventory inventory, int index, int x, int y) {
            super(inventory, index, x, y);
        }

        @Override
        public boolean isEnabled() {
            return visible;
        }
    }
}
