package sofia.foliage.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.ModelIds;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureMap;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import sofia.foliage.ColoredFoliage;
import sofia.foliage.block.DyeableFlowerBlock;
import sofia.foliage.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        for (var flower : ModBlocks.COLORED_FLOWERS) {
            if (flower instanceof DyeableFlowerBlock) {
                Identifier blockId = Registries.BLOCK.getId(flower);
                String path = blockId.getPath();
                String baseType = path.substring(path.lastIndexOf('_') + 1);
                Identifier texture = Identifier.of(ColoredFoliage.MOD_ID, "block/" + baseType + "_base");

                Identifier modelId = Models.TINTED_CROSS.upload(
                        flower,
                        TextureMap.cross(texture),
                        blockStateModelGenerator.modelCollector
                );

                blockStateModelGenerator.blockStateCollector.accept(
                        BlockStateModelGenerator.createSingletonBlockState(flower, modelId)
                );
            }
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        for (var flower : ModBlocks.COLORED_FLOWERS) {
            if (flower instanceof DyeableFlowerBlock) {
                Identifier blockId = Registries.BLOCK.getId(flower);
                String path = blockId.getPath();
                String baseType = path.substring(path.lastIndexOf('_') + 1);
                Identifier texture = Identifier.of(ColoredFoliage.MOD_ID, "block/" + baseType + "_base");

                Models.TINTED_CROSS.upload(
                        ModelIds.getItemModelId(flower.asItem()),
                        TextureMap.cross(texture),
                        itemModelGenerator.writer
                );
            }
        }
    }
}