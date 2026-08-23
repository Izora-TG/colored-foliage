package sofia.foliage.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModTranslationProvider extends FabricLanguageProvider {
    public ModTranslationProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("block.colored-foliage.black_tall_grass", "Black Tall Grass");
        translationBuilder.add("block.colored-foliage.white_tall_grass", "White Tall Grass");
        translationBuilder.add("block.colored-foliage.orange_tall_grass", "Orange Tall Grass");
        translationBuilder.add("block.colored-foliage.magenta_tall_grass", "Magenta Tall Grass");
        translationBuilder.add("block.colored-foliage.light_blue_tall_grass", "Light Blue Tall Grass");
        translationBuilder.add("block.colored-foliage.yellow_tall_grass", "Yellow Tall Grass");
        translationBuilder.add("block.colored-foliage.lime_tall_grass", "Lime Tall Grass");
        translationBuilder.add("block.colored-foliage.pink_tall_grass", "Pink Tall Grass");
        translationBuilder.add("block.colored-foliage.gray_tall_grass", "Gray Tall Grass");
        translationBuilder.add("block.colored-foliage.light_gray_tall_grass", "Light Gray Tall Grass");
        translationBuilder.add("block.colored-foliage.cyan_tall_grass", "Cyan Tall Grass");
        translationBuilder.add("block.colored-foliage.purple_tall_grass", "Purple Tall Grass");
        translationBuilder.add("block.colored-foliage.blue_tall_grass", "Blue Tall Grass");
        translationBuilder.add("block.colored-foliage.brown_tall_grass", "Brown Tall Grass");
        //translationBuilder.add("block.colored-foliage.green_tall_grass", "Green Tall Grass");
        translationBuilder.add("block.colored-foliage.red_tall_grass", "Red Tall Grass");

    }
}
