package sofia.foliage.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import sofia.foliage.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(BlockTags.FLOWERS).add(ModBlocks.COLORED_FLOWERS);
        getOrCreateTagBuilder(BlockTags.TALL_FLOWERS).add(ModBlocks.SUNFLOWERS);

        for (var flower : ModBlocks.COLORED_FLOWERS) {
            if (flower instanceof net.minecraft.block.TallFlowerBlock) continue;
            getOrCreateTagBuilder(BlockTags.FLOWER_POTS).add(flower);
            getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS).add(flower);
        }
    }
}
