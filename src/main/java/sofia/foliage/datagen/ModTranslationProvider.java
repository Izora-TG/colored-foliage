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
        translationBuilder.add("block.colored-foliage.black_short_grass", "Black Short Grass");
        translationBuilder.add("block.colored-foliage.white_short_grass", "White Short Grass");
        translationBuilder.add("block.colored-foliage.orange_short_grass", "Orange Short Grass");
        translationBuilder.add("block.colored-foliage.magenta_short_grass", "Magenta Short Grass");
        translationBuilder.add("block.colored-foliage.light_blue_short_grass", "Light Blue Short Grass");
        translationBuilder.add("block.colored-foliage.yellow_short_grass", "Yellow Short Grass");
        translationBuilder.add("block.colored-foliage.lime_short_grass", "Lime Short Grass");
        translationBuilder.add("block.colored-foliage.pink_short_grass", "Pink Short Grass");
        translationBuilder.add("block.colored-foliage.gray_short_grass", "Gray Short Grass");
        translationBuilder.add("block.colored-foliage.light_gray_short_grass", "Light Gray Short Grass");
        translationBuilder.add("block.colored-foliage.cyan_short_grass", "Cyan Short Grass");
        translationBuilder.add("block.colored-foliage.purple_short_grass", "Purple Short Grass");
        translationBuilder.add("block.colored-foliage.blue_short_grass", "Blue Short Grass");
        translationBuilder.add("block.colored-foliage.brown_short_grass", "Brown Short Grass");
        //translationBuilder.add("block.colored-foliage.green_short_grass", "Green Short Grass");
        translationBuilder.add("block.colored-foliage.red_short_grass", "Red Short Grass");

    }
}
