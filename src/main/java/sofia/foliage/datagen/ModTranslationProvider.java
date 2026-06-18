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
        translationBuilder.add("block.colored-foliage.black_tulip", "Black Tulip");
        //translationBuilder.add("block.colored-foliage.white_tulip", "White Tulip");
        //translationBuilder.add("block.colored-foliage.orange_tulip", "Orange Tulip");
        translationBuilder.add("block.colored-foliage.magenta_tulip", "Magenta Tulip");
        translationBuilder.add("block.colored-foliage.light_blue_tulip", "Light Blue Tulip");
        translationBuilder.add("block.colored-foliage.yellow_tulip", "Yellow Tulip");
        translationBuilder.add("block.colored-foliage.lime_tulip", "Lime Tulip");
        //translationBuilder.add("block.colored-foliage.pink_tulip", "Pink Tulip");
        translationBuilder.add("block.colored-foliage.gray_tulip", "Gray Tulip");
        translationBuilder.add("block.colored-foliage.light_gray_tulip", "Light Gray Tulip");
        translationBuilder.add("block.block.colored-foliage.cyan_tulip", "Cyan Tulip");
        translationBuilder.add("block.colored-foliage.purple_tulip", "Purple Tulip");
        translationBuilder.add("block.colored-foliage.blue_tulip", "Blue Tulip");
        translationBuilder.add("block.colored-foliage.brown_tulip", "Brown Tulip");
        translationBuilder.add("block.colored-foliage.green_tulip", "Green Tulip");
        //translationBuilder.add("block.colored-foliage.red_tulip", "Red Tulip");

    }
}
