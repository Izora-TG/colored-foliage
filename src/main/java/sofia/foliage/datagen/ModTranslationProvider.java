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
        translationBuilder.add("block.colored-foliage.black_orchid", "Black Orchid");
        translationBuilder.add("block.colored-foliage.white_orchid", "White Orchid");
        translationBuilder.add("block.colored-foliage.orange_orchid", "Orange Orchid");
        translationBuilder.add("block.colored-foliage.magenta_orchid", "Magenta Orchid");
        translationBuilder.add("block.colored-foliage.light_blue_orchid", "Light Blue Orchid");
        translationBuilder.add("block.colored-foliage.yellow_orchid", "Yellow Orchid");
        translationBuilder.add("block.colored-foliage.lime_orchid", "Lime Orchid");
        translationBuilder.add("block.colored-foliage.pink_orchid", "Pink Orchid");
        translationBuilder.add("block.colored-foliage.gray_orchid", "Gray Orchid");
        translationBuilder.add("block.colored-foliage.light_gray_orchid", "Light Gray Orchid");
        translationBuilder.add("block.colored-foliage.cyan_orchid", "Cyan Orchid");
        translationBuilder.add("block.colored-foliage.purple_orchid", "Purple Orchid");
        //translationBuilder.add("block.colored-foliage.blue_orchid", "Blue Orchid");
        translationBuilder.add("block.colored-foliage.brown_orchid", "Brown Orchid");
        translationBuilder.add("block.colored-foliage.green_orchid", "Green Orchid");
        translationBuilder.add("block.colored-foliage.red_orchid", "Red Orchid");

    }
}
