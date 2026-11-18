package sofia.foliage.dyeing;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import sofia.foliage.ColoredFoliage;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Knows, for every kind of foliage (poppy, tulip, short grass, ...), which item
 * it becomes in each of the 16 colors. Mod variants are looked up by name
 * ("colored-foliage:<color>_<type>"); colors the mod has no block for fall back
 * to the vanilla plant of that color (e.g. orange tulip, blue orchid, green grass).
 */
public final class FoliageDyeing {
    private record FoliageType(String suffix, List<Item> vanillaInputs, Map<DyeColor, Item> vanillaColors) {}

    private static final List<FoliageType> TYPES = List.of(
            type("poppy", List.of(Items.POPPY), Map.of()),
            type("dandelion", List.of(Items.DANDELION), Map.of()),
            type("allium", List.of(Items.ALLIUM), Map.of()),
            type("cornflower", List.of(Items.CORNFLOWER), Map.of()),
            type("lily_of_the_valley", List.of(Items.LILY_OF_THE_VALLEY), Map.of()),
            type("wither_rose", List.of(Items.WITHER_ROSE), Map.of()),
            type("oxeye_daisy", List.of(Items.OXEYE_DAISY), Map.of()),
            type("tulip", List.of(Items.RED_TULIP, Items.ORANGE_TULIP, Items.WHITE_TULIP, Items.PINK_TULIP),
                    Map.of(DyeColor.WHITE, Items.WHITE_TULIP, DyeColor.ORANGE, Items.ORANGE_TULIP, DyeColor.PINK, Items.PINK_TULIP)),
            type("orchid", List.of(Items.BLUE_ORCHID), Map.of(DyeColor.BLUE, Items.BLUE_ORCHID)),
            type("sunflower", List.of(Items.SUNFLOWER), Map.of()),
            type("short_grass", List.of(Items.GRASS), Map.of(DyeColor.GREEN, Items.GRASS)),
            type("tall_grass", List.of(Items.TALL_GRASS), Map.of(DyeColor.GREEN, Items.TALL_GRASS)),
            type("short_fern", List.of(Items.FERN), Map.of(DyeColor.GREEN, Items.FERN))
    );

    /** item -> its color variants; built lazily because it needs the registries to be filled. */
    private static Map<Item, Map<DyeColor, Item>> variantsByItem;

    private FoliageDyeing() {}

    private static FoliageType type(String suffix, List<Item> vanillaInputs, Map<DyeColor, Item> vanillaColors) {
        return new FoliageType(suffix, vanillaInputs, vanillaColors);
    }

    private static Map<Item, Map<DyeColor, Item>> variants() {
        if (variantsByItem == null) {
            Map<Item, Map<DyeColor, Item>> map = new HashMap<>();
            for (FoliageType type : TYPES) {
                Map<DyeColor, Item> colors = new EnumMap<>(DyeColor.class);
                for (DyeColor color : DyeColor.values()) {
                    Identifier id = new Identifier(ColoredFoliage.MOD_ID, color.getName() + "_" + type.suffix());
                    Item item = Registries.ITEM.containsId(id) ? Registries.ITEM.get(id) : type.vanillaColors().get(color);
                    if (item != null) colors.put(color, item);
                }
                colors.values().forEach(item -> map.put(item, colors));
                type.vanillaInputs().forEach(item -> map.put(item, colors));
            }
            variantsByItem = map;
        }
        return variantsByItem;
    }

    public static boolean isDyeable(ItemStack stack) {
        return !stack.isEmpty() && variants().containsKey(stack.getItem());
    }

    /** The item {@code input} turns into when dyed {@code color}, or EMPTY if there is no such variant. */
    public static ItemStack getResult(ItemStack input, DyeColor color) {
        if (input.isEmpty()) return ItemStack.EMPTY;
        Map<DyeColor, Item> colors = variants().get(input.getItem());
        if (colors == null) return ItemStack.EMPTY;
        Item result = colors.get(color);
        return result == null ? ItemStack.EMPTY : new ItemStack(result);
    }
}
