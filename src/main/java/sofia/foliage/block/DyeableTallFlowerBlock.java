package sofia.foliage.block;

import net.minecraft.block.MapColor;
import net.minecraft.block.TallFlowerBlock;

public class DyeableTallFlowerBlock extends TallFlowerBlock {
    private final MapColor mapColor;

    public DyeableTallFlowerBlock(MapColor mapColor, Settings settings) {
        super(settings);
        this.mapColor = mapColor;
    }

    public MapColor getMapColor() {
        return this.mapColor;
    }
}
