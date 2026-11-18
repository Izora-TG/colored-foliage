package sofia.foliage.block;

import net.minecraft.block.FlowerBlock;
import net.minecraft.block.MapColor;
import net.minecraft.entity.effect.StatusEffect;

public class DyeableFlowerBlock extends FlowerBlock {
    private final MapColor mapColor;

    public DyeableFlowerBlock(MapColor mapColor, StatusEffect stewEffect, int effectDuration, Settings settings) {
        super(stewEffect, effectDuration, settings);
        this.mapColor = mapColor;
    }

    public MapColor getMapColor() {
        return this.mapColor;
    }
}
