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
        translationBuilder.add("block.colored-foliage.black_wither_rose", "Black Wither Rose");
        translationBuilder.add("block.colored-foliage.white_wither_rose", "White Wither Rose");
        translationBuilder.add("block.colored-foliage.orange_wither_rose", "Orange Wither Rose");
        translationBuilder.add("block.colored-foliage.magenta_wither_rose", "Magenta Wither Rose");
        translationBuilder.add("block.colored-foliage.light_blue_wither_rose", "Light Blue Wither Rose");
        translationBuilder.add("block.colored-foliage.yellow_wither_rose", "Yellow Wither Rose");
        translationBuilder.add("block.colored-foliage.lime_wither_rose", "Lime Wither Rose");
        translationBuilder.add("block.colored-foliage.pink_wither_rose", "Pink Wither Rose");
        translationBuilder.add("block.colored-foliage.gray_wither_rose", "Gray Wither Rose");
        translationBuilder.add("block.colored-foliage.light_gray_wither_rose", "Light Wither Rose");
        translationBuilder.add("block.block.colored-foliage.cyan_wither_rose", "Cyan Wither Rose");
        translationBuilder.add("block.colored-foliage.purple_wither_rose", "Purple Wither Rose");
        translationBuilder.add("block.colored-foliage.blue_wither_rose", "Blue Wither Rose");
        translationBuilder.add("block.colored-foliage.brown_wither_rose", "Brown Wither Rose");
        translationBuilder.add("block.colored-foliage.green_wither_rose", "Green Wither Rose");
        translationBuilder.add("block.colored-foliage.red_wither_rose", "Red Wither Rose");

    }
}
