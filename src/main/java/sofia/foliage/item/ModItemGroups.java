package sofia.foliage.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import sofia.foliage.ColoredFoliage;
import sofia.foliage.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup Colored_FOLIAGE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ColoredFoliage.MOD_ID, "colored_foliage_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PURPLE_ALLIUM))
                    .displayName(Text.translatable("itemgroup.colored-foliage.colored_foliage_group"))
                    .entries((displayContext, entries) -> {
                        for (var flower : ModBlocks.COLORED_FLOWERS) {
                            entries.add(flower);
                        }
                        entries.add(ModItems.RAINBOW_DYE);
                    })
                    .build());


    public static void registerItemGroups() {
        ColoredFoliage.LOGGER.info("Registering item groups");
    }
}
