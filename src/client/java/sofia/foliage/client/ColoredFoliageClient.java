package sofia.foliage.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.client.render.RenderLayer;
import sofia.foliage.block.DyeableTallFlowerBlock;
import sofia.foliage.block.ModBlocks;

public class ColoredFoliageClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		for (Block flower : ModBlocks.COLORED_FLOWERS) {
			BlockRenderLayerMap.INSTANCE.putBlock(flower, RenderLayer.getCutout());

			if (flower instanceof DyeableTallFlowerBlock) {
				ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
					if (state.get(TallPlantBlock.HALF) == DoubleBlockHalf.UPPER && tintIndex == 0) {
						return ((DyeableTallFlowerBlock) flower).getMapColor().color;
					}
					return -1;
				}, flower);

				ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
					return tintIndex == 0 ? ((DyeableTallFlowerBlock) flower).getMapColor().color : -1;
				}, flower.asItem());
			} else if (flower instanceof sofia.foliage.block.DyeableFlowerBlock) {
				ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
					return tintIndex == 0 ? ((sofia.foliage.block.DyeableFlowerBlock) flower).getMapColor().color : -1;
				}, flower);

				ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
					return tintIndex == 0 ? ((sofia.foliage.block.DyeableFlowerBlock) flower).getMapColor().color : -1;
				}, flower.asItem());
			}
		}
		for (Block grass : ModBlocks.GRASSES) {
			BlockRenderLayerMap.INSTANCE.putBlock(grass, RenderLayer.getCutout());

			if (grass instanceof DyeableTallFlowerBlock) {
				ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
					if (state.get(TallPlantBlock.HALF) == DoubleBlockHalf.UPPER && tintIndex == 0) {
						return ((DyeableTallFlowerBlock) grass).getMapColor().color;
					}
					return -1;
				}, grass);

				ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
					return tintIndex == 0 ? ((DyeableTallFlowerBlock) grass).getMapColor().color : -1;
				}, grass.asItem());
			} else if (grass instanceof sofia.foliage.block.DyeableShortGrassBlock) {
				ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
					return tintIndex == 0 ? ((sofia.foliage.block.DyeableShortGrassBlock) grass).getMapColor().color : -1;
				}, grass);

				ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
					return tintIndex == 0 ? ((sofia.foliage.block.DyeableShortGrassBlock) grass).getMapColor().color : -1;
				}, grass.asItem());
			}
		}

		for (Block suns : ModBlocks.SUNFLOWERS) {
			BlockRenderLayerMap.INSTANCE.putBlock(suns, RenderLayer.getCutout());

			if (suns instanceof DyeableTallFlowerBlock) {
				ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
					if (state.get(TallPlantBlock.HALF) == DoubleBlockHalf.UPPER && tintIndex == 0) {
						return ((DyeableTallFlowerBlock) suns).getMapColor().color;
					}
					return -1;
				}, suns);

				ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
					return tintIndex == 0 ? ((DyeableTallFlowerBlock) suns).getMapColor().color : -1;
				}, suns.asItem());
			} else if (suns instanceof sofia.foliage.block.DyeableFlowerBlock) {
				ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
					return tintIndex == 0 ? ((sofia.foliage.block.DyeableFlowerBlock) suns).getMapColor().color : -1;
				}, suns);

				ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
					return tintIndex == 0 ? ((sofia.foliage.block.DyeableFlowerBlock) suns).getMapColor().color : -1;
				}, suns.asItem());
			}
		}
	}
}

