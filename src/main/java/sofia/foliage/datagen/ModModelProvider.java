package sofia.foliage.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.util.Identifier;
import sofia.foliage.ColoredFoliage;
import sofia.foliage.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        for (var flower : ModBlocks.COLORED_FLOWERS) {
            if (flower instanceof sofia.foliage.block.DyeableFlowerBlock) {
                String path = net.minecraft.registry.Registries.BLOCK.getId(flower).getPath();
                String baseType = path.substring(path.lastIndexOf('_') + 1);
                Identifier texture = Identifier.of(ColoredFoliage.MOD_ID, "block/" + baseType + "_base");
                
                net.minecraft.data.client.TextureMap textureMap = net.minecraft.data.client.TextureMap.cross(texture);
                Identifier modelId = net.minecraft.data.client.Models.TINTED_CROSS.upload(flower, textureMap, blockStateModelGenerator.modelCollector);
                blockStateModelGenerator.blockStateCollector.accept(net.minecraft.data.client.BlockStateModelGenerator.createSingletonBlockState(flower, modelId));
            } else if (flower == ModBlocks.YELLOW_DANDELION) {
                blockStateModelGenerator.registerTintableCross(flower, BlockStateModelGenerator.TintType.NOT_TINTED);
            }
        }

        Identifier topModel = Identifier.of(ColoredFoliage.MOD_ID, "block/sunflower_top");
        Identifier bottomModel = Identifier.of(ColoredFoliage.MOD_ID, "block/sunflower_bottom");

        for (var flower : ModBlocks.SUNFLOWERS) {
            blockStateModelGenerator.blockStateCollector.accept(
                    net.minecraft.data.client.VariantsBlockStateSupplier.create(flower)
                            .coordinate(net.minecraft.data.client.BlockStateVariantMap.create(net.minecraft.block.TallPlantBlock.HALF)
                                    .register(net.minecraft.block.enums.DoubleBlockHalf.LOWER, net.minecraft.data.client.BlockStateVariant.create().put(net.minecraft.data.client.VariantSettings.MODEL, bottomModel))
                                    .register(net.minecraft.block.enums.DoubleBlockHalf.UPPER, net.minecraft.data.client.BlockStateVariant.create().put(net.minecraft.data.client.VariantSettings.MODEL, topModel))
                            )
            );
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        for (var flower : ModBlocks.COLORED_FLOWERS) {
            if (flower instanceof sofia.foliage.block.DyeableFlowerBlock) {
                String path = net.minecraft.registry.Registries.BLOCK.getId(flower).getPath();
                String baseType = path.substring(path.lastIndexOf('_') + 1);
                Identifier texture = Identifier.of(ColoredFoliage.MOD_ID, "block/" + baseType + "_base");
                net.minecraft.data.client.Models.GENERATED.upload(net.minecraft.data.client.ModelIds.getItemModelId(flower.asItem()), net.minecraft.data.client.TextureMap.layer0(texture), itemModelGenerator.writer);
            }
        }

        Identifier itemModelTexture = Identifier.of(ColoredFoliage.MOD_ID, "block/sunflower_front");
        for (var flower : ModBlocks.SUNFLOWERS) {
            net.minecraft.data.client.Models.GENERATED.upload(net.minecraft.data.client.ModelIds.getItemModelId(flower.asItem()), net.minecraft.data.client.TextureMap.layer0(itemModelTexture), itemModelGenerator.writer);
        }
    }
}
