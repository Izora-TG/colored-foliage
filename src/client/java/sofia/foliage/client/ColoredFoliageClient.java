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
	}
}
