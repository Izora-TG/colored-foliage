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
            Optional.of(Identifier.of(ColoredFoliage.MOD_ID, "block/layered_cross")),
            Optional.empty(),
            STEM,
            BLOSSOM
    );
    private static final Model TWO_LAYER_GENERATED = new Model(
            Optional.of(Identifier.ofVanilla("item/generated")),
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
                Identifier stemTexture = Identifier.of(ColoredFoliage.MOD_ID, "block/" + baseType + "_stem");
                Identifier blossomTexture = Identifier.of(ColoredFoliage.MOD_ID, "block/" + baseType + "_blossom");

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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        for (var flower : ModBlocks.COLORED_FLOWERS) {
            if (flower instanceof DyeableFlowerBlock) {
                Identifier blockId = Registries.BLOCK.getId(flower);
                String path = blockId.getPath();
                String baseType = path.substring(path.lastIndexOf('_') + 1);
                Identifier stemTexture = Identifier.of(ColoredFoliage.MOD_ID, "block/" + baseType + "_stem");
                Identifier blossomTexture = Identifier.of(ColoredFoliage.MOD_ID, "block/" + baseType + "_blossom");

                TWO_LAYER_GENERATED.upload(
                        ModelIds.getItemModelId(flower.asItem()),
                        new TextureMap()
                                .put(TextureKey.LAYER0, blossomTexture)
                                .put(TextureKey.LAYER1, stemTexture),
                        itemModelGenerator.writer
                );
            }
        }
    }
}
