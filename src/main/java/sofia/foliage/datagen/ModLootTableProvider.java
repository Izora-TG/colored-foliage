package sofia.foliage.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import sofia.foliage.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        for (var flower : ModBlocks.COLORED_FLOWERS) {
            addDrop(flower);
        }
        for (var grass : ModBlocks.GRASSES) {
            addDrop(grass, this.shortPlantDrops(grass));
        }
        for (var sunflower : ModBlocks.SUNFLOWERS) {
            addDrop(sunflower, this.dropsWithProperty(sunflower, net.minecraft.block.TallPlantBlock.HALF, net.minecraft.block.enums.DoubleBlockHalf.LOWER));
        }
    }
}
