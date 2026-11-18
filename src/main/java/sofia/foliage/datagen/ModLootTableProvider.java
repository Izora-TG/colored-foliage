package sofia.foliage.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import sofia.foliage.block.ModBlocks;


public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        for (var flower : ModBlocks.COLORED_FLOWERS) {
            addDrop(flower);
        }
        for (var grass : ModBlocks.GRASSES) {
            addDrop(grass, this.grassDrops(grass));
        }
        for (var sunflower : ModBlocks.SUNFLOWERS) {
            addDrop(sunflower, this.dropsWithProperty(sunflower, net.minecraft.block.TallPlantBlock.HALF, net.minecraft.block.enums.DoubleBlockHalf.LOWER));
        }
    }
}
