package sofia.foliage.item;


import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import sofia.foliage.ColoredFoliage;

public class ModItems {

    public static final Item RAINBOW_DYE = registerItem("rainbow_dye", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ColoredFoliage.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ColoredFoliage.LOGGER.info("Registering Items for " + ColoredFoliage.MOD_ID);
    }
}
