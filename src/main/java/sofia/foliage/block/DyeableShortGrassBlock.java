package sofia.foliage.block;

import net.minecraft.block.MapColor;
import net.minecraft.block.FernBlock;

public class DyeableShortGrassBlock extends FernBlock {
    private final MapColor mapColor;

    public DyeableShortGrassBlock(MapColor mapColor, Settings settings) {
        super(settings);
        this.mapColor = mapColor;
    }

    public MapColor getMapColor() {
        return this.mapColor;
    }
}
