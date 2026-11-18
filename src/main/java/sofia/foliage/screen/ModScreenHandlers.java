package sofia.foliage.screen;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import sofia.foliage.ColoredFoliage;

public class ModScreenHandlers {
    public static final ScreenHandlerType<DyeStationScreenHandler> DYE_STATION = Registry.register(
            Registries.SCREEN_HANDLER,
            new Identifier(ColoredFoliage.MOD_ID, "dye_station"),
            new ScreenHandlerType<>(DyeStationScreenHandler::new, FeatureFlags.VANILLA_FEATURES));

    public static void registerScreenHandlers() {
        ColoredFoliage.LOGGER.info("Registering screen handlers for " + ColoredFoliage.MOD_ID);
    }
}
