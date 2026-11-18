package sofia.foliage.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.ModelIds;
import net.minecraft.data.client.TextureMap;
import net.minecraft.data.client.TextureKey;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import sofia.foliage.ColoredFoliage;
import sofia.foliage.block.DyeableFlowerBlock;
import sofia.foliage.block.ModBlocks;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    private static final TextureKey STEM = TextureKey.of("stem");
    private static final TextureKey BLOSSOM = TextureKey.of("blossom");
    private static final Model LAYERED_CROSS = new Model(
            Optional.of(new Identifier(ColoredFoliage.MOD_ID, "block/layered_cross")),
            Optional.empty(),
            STEM,
            BLOSSOM
    );
    private static final Model TWO_LAYER_GENERATED = new Model(
            Optional.of(new Identifier("minecraft", "item/generated")),
            Optional.empty(),
            TextureKey.LAYER0,
            TextureKey.LAYER1
    );

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
                Identifier stemTexture = new Identifier(ColoredFoliage.MOD_ID, "block/" + baseType + "_stem");
                Identifier blossomTexture = new Identifier(ColoredFoliage.MOD_ID, "block/" + baseType + "_blossom");

                Identifier modelId = LAYERED_CROSS.upload(
                        flower,
                        new TextureMap()
                                .put(STEM, stemTexture)
                                .put(BLOSSOM, blossomTexture),
                        blockStateModelGenerator.modelCollector
                );

                blockStateModelGenerator.blockStateCollector.accept(
                        BlockStateModelGenerator.createSingletonBlockState(flower, modelId)
                );
            }
        }
        for (var grass : ModBlocks.GRASSES) {
            Identifier blockId = Registries.BLOCK.getId(grass);
            String path = blockId.getPath();
            String baseType = path.substring(path.lastIndexOf('_') + 1);
            Identifier stemTexture = new Identifier(ColoredFoliage.MOD_ID, "block/" + baseType + "_stem");

            if (grass instanceof sofia.foliage.block.DyeableTallFlowerBlock) {
                Identifier bottomTexture = new Identifier(ColoredFoliage.MOD_ID, "block/tall_grass_bottom");
                Identifier topTexture = new Identifier(ColoredFoliage.MOD_ID, "block/tall_grass_top");
                Identifier lowerModelId = new Identifier(ColoredFoliage.MOD_ID, "block/" + path + "_bottom");
                Identifier upperModelId = new Identifier(ColoredFoliage.MOD_ID, "block/" + path + "_top");
                net.minecraft.data.client.Models.TINTED_CROSS.upload(
                        lowerModelId,
                        net.minecraft.data.client.TextureMap.cross(bottomTexture),
                        blockStateModelGenerator.modelCollector
                );
                net.minecraft.data.client.Models.TINTED_CROSS.upload(
                        upperModelId,
                        net.minecraft.data.client.TextureMap.cross(topTexture),
                        blockStateModelGenerator.modelCollector
                );
                blockStateModelGenerator.blockStateCollector.accept(
                        net.minecraft.data.client.VariantsBlockStateSupplier.create(grass).coordinate(
                                net.minecraft.data.client.BlockStateVariantMap.create(
                                        net.minecraft.block.TallPlantBlock.HALF
                                ).register(
                                        net.minecraft.block.enums.DoubleBlockHalf.LOWER,
                                        net.minecraft.data.client.BlockStateVariant.create().put(
                                                net.minecraft.data.client.VariantSettings.MODEL, lowerModelId
                                        )
                                ).register(
                                        net.minecraft.block.enums.DoubleBlockHalf.UPPER,
                                        net.minecraft.data.client.BlockStateVariant.create().put(
                                                net.minecraft.data.client.VariantSettings.MODEL, upperModelId
                                        )
                                )
                        )
                );
            } else if (grass instanceof sofia.foliage.block.DyeableShortGrassBlock) {
                Identifier modelId = net.minecraft.data.client.Models.TINTED_CROSS.upload(
                        grass,
                        net.minecraft.data.client.TextureMap.cross(stemTexture),
                        blockStateModelGenerator.modelCollector
                );
                blockStateModelGenerator.blockStateCollector.accept(
                        BlockStateModelGenerator.createSingletonBlockState(grass, modelId)
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
                Identifier stemTexture = new Identifier(ColoredFoliage.MOD_ID, "block/" + baseType + "_stem");
                Identifier blossomTexture = new Identifier(ColoredFoliage.MOD_ID, "block/" + baseType + "_blossom");

                TWO_LAYER_GENERATED.upload(
                        ModelIds.getItemModelId(flower.asItem()),
                        new TextureMap()
                                .put(TextureKey.LAYER0, blossomTexture)
                                .put(TextureKey.LAYER1, stemTexture),
                        itemModelGenerator.writer
                );
            }
        }
        for (var grass : ModBlocks.GRASSES) {
            if (grass instanceof sofia.foliage.block.DyeableShortGrassBlock
                    || grass instanceof sofia.foliage.block.DyeableTallFlowerBlock) {
                Identifier blockId = Registries.BLOCK.getId(grass);
                String path = blockId.getPath();
                String baseType = path.substring(path.lastIndexOf('_') + 1);
                Identifier itemTexture = grass instanceof sofia.foliage.block.DyeableTallFlowerBlock
                        ? new Identifier(ColoredFoliage.MOD_ID, "block/tall_grass_top")
                        : new Identifier(ColoredFoliage.MOD_ID, "block/" + baseType + "_stem");

                net.minecraft.data.client.Models.GENERATED.upload(
                        ModelIds.getItemModelId(grass.asItem()),
                        net.minecraft.data.client.TextureMap.layer0(itemTexture),
                        itemModelGenerator.writer
                );
            }
        }
    }
}




