package sofia.foliage.block.entity;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import sofia.foliage.ColoredFoliage;
import sofia.foliage.block.ModBlocks;

public class ModBlockEntities {
    public static final BlockEntityType<DyeStationBlockEntity> DYE_STATION = Registry.register(
            Registries.BLOCK_ENTITY_TYPE,
            new Identifier(ColoredFoliage.MOD_ID, "dye_station"),
            BlockEntityType.Builder.create(DyeStationBlockEntity::new, ModBlocks.DYE_STATION).build(null));

    public static void registerBlockEntities() {
        ColoredFoliage.LOGGER.info("Registering block entities for " + ColoredFoliage.MOD_ID);
    }
}
