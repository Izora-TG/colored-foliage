package sofia.foliage.block;

import net.minecraft.block.FlowerBlock;
import net.minecraft.block.MapColor;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.entry.RegistryEntry;

public class DyeableFlowerBlock extends FlowerBlock {
    private final MapColor mapColor;

    public DyeableFlowerBlock(MapColor mapColor, RegistryEntry<StatusEffect> stewEffect, float effectLengthInSeconds, Settings settings) {
        super(stewEffect, effectLengthInSeconds, settings);
        this.mapColor = mapColor;
    }

    public MapColor getMapColor() {
        return this.mapColor;
    }
}
