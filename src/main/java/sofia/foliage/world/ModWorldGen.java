package sofia.foliage.world;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import sofia.foliage.ColoredFoliage;

public class ModWorldGen {
    /** Defined in data/colored-foliage/worldgen/placed_feature/rainbow_flower.json (rarity is set there). */
    public static final RegistryKey<PlacedFeature> RAINBOW_FLOWER = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier(ColoredFoliage.MOD_ID, "rainbow_flower"));
    /** Extra, much more frequent patches that only generate in flower forests (on top of the normal ones). */
    public static final RegistryKey<PlacedFeature> RAINBOW_FLOWER_FLOWER_FOREST = RegistryKey.of(
            RegistryKeys.PLACED_FEATURE, new Identifier(ColoredFoliage.MOD_ID, "rainbow_flower_flower_forest"));

    public static void registerWorldGen() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.VEGETAL_DECORATION, RAINBOW_FLOWER);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, RAINBOW_FLOWER_FLOWER_FOREST);
    }
}
