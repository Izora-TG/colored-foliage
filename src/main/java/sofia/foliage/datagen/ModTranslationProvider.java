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
        translationBuilder.add("block.colored-foliage.black_sunflower", "Black Sunflower");
        translationBuilder.add("block.colored-foliage.white_sunflower", "White Sunflower");
        translationBuilder.add("block.colored-foliage.orange_sunflower", "Orange Sunflower");
        translationBuilder.add("block.colored-foliage.magenta_sunflower", "Magenta Sunflower");
        translationBuilder.add("block.colored-foliage.light_blue_sunflower", "Light Blue Sunflower");
        translationBuilder.add("block.colored-foliage.yellow_sunflower", "Yellow Sunflower");
        translationBuilder.add("block.colored-foliage.lime_sunflower", "Lime Sunflower");
        translationBuilder.add("block.colored-foliage.pink_sunflower", "Pink Sunflower");
        translationBuilder.add("block.colored-foliage.gray_sunflower", "Gray Sunflower");
        translationBuilder.add("block.colored-foliage.light_gray_sunflower", "Light Sunflower");
        translationBuilder.add("block.block.colored-foliage.cyan_sunflower", "Cyan Sunflower");
        translationBuilder.add("block.colored-foliage.purple_sunflower", "Purple Sunflower");
        translationBuilder.add("block.colored-foliage.blue_sunflower", "Blue Sunflower");
        translationBuilder.add("block.colored-foliage.brown_sunflower", "Brown Sunflower");
        translationBuilder.add("block.colored-foliage.green_sunflower", "Green Sunflower");
        translationBuilder.add("block.colored-foliage.red_sunflower", "Red Sunflower");

        translationBuilder.add("block.colored-foliage.black_allium", "Black Allium");
        translationBuilder.add("block.colored-foliage.white_allium", "White Allium");
        translationBuilder.add("block.colored-foliage.orange_allium", "Orange Allium");
        translationBuilder.add("block.colored-foliage.magenta_allium", "Magenta Allium");
        translationBuilder.add("block.colored-foliage.light_blue_allium", "Light Blue Allium");
        translationBuilder.add("block.colored-foliage.yellow_allium", "Yellow Allium");
        translationBuilder.add("block.colored-foliage.lime_allium", "Lime Allium");
        translationBuilder.add("block.colored-foliage.pink_allium", "Pink Allium");
        translationBuilder.add("block.colored-foliage.gray_allium", "Gray Allium");
        translationBuilder.add("block.colored-foliage.light_gray_allium", "Light Gray Allium");
        translationBuilder.add("block.block.colored-foliage.cyan_allium", "Cyan Allium");
        translationBuilder.add("block.colored-foliage.purple_allium", "Purple Allium");
        translationBuilder.add("block.colored-foliage.blue_allium", "Blue Allium");
        translationBuilder.add("block.colored-foliage.brown_allium", "Brown Allium");
        translationBuilder.add("block.colored-foliage.green_allium", "Green Allium");
        translationBuilder.add("block.colored-foliage.red_allium", "Red Allium");

        translationBuilder.add("block.colored-foliage.black_dandelion", "Black Dandelion");
        translationBuilder.add("block.colored-foliage.white_dandelion", "White Dandelion");
        translationBuilder.add("block.colored-foliage.orange_dandelion", "Orange Dandelion");
        translationBuilder.add("block.colored-foliage.magenta_dandelion", "Magenta Dandelion");
        translationBuilder.add("block.colored-foliage.light_blue_dandelion", "Light Blue Dandelion");
        translationBuilder.add("block.colored-foliage.yellow_dandelion", "Golden Dandelion");
        translationBuilder.add("block.colored-foliage.lime_dandelion", "Lime Dandelion");
        translationBuilder.add("block.colored-foliage.pink_dandelion", "Pink Dandelion");
        translationBuilder.add("block.colored-foliage.gray_dandelion", "Gray Dandelion");
        translationBuilder.add("block.colored-foliage.light_gray_dandelion", "Light Gray Dandelion");
        translationBuilder.add("block.block.colored-foliage.cyan_dandelion", "Cyan Dandelion");
        translationBuilder.add("block.colored-foliage.purple_dandelion", "Purple Dandelion");
        translationBuilder.add("block.colored-foliage.blue_dandelion", "Blue Dandelion");
        translationBuilder.add("block.colored-foliage.brown_dandelion", "Brown Dandelion");
        translationBuilder.add("block.colored-foliage.green_dandelion", "Green Dandelion");
        translationBuilder.add("block.colored-foliage.red_dandelion", "Red Dandelion");

        translationBuilder.add("block.colored-foliage.black_cornflower", "Black Cornflower");
        translationBuilder.add("block.colored-foliage.white_cornflower", "White Cornflower");
        translationBuilder.add("block.colored-foliage.orange_cornflower", "Orange Cornflower");
        translationBuilder.add("block.colored-foliage.magenta_cornflower", "Magenta Cornflower");
        translationBuilder.add("block.colored-foliage.light_blue_cornflower", "Light Blue Cornflower");
        translationBuilder.add("block.colored-foliage.yellow_cornflower", "Yellow Cornflower");
        translationBuilder.add("block.colored-foliage.lime_cornflower", "Lime Cornflower");
        translationBuilder.add("block.colored-foliage.pink_cornflower", "Pink Cornflower");
        translationBuilder.add("block.colored-foliage.gray_cornflower", "Gray Cornflower");
        translationBuilder.add("block.colored-foliage.light_gray_cornflower", "Light Gray Cornflower");
        translationBuilder.add("block.colored-foliage.cyan_cornflower", "Cyan Cornflower");
        translationBuilder.add("block.colored-foliage.purple_cornflower", "Purple Cornflower");
        translationBuilder.add("block.colored-foliage.blue_cornflower", "Blue Cornflower");
        translationBuilder.add("block.colored-foliage.brown_cornflower", "Brown Cornflower");
        translationBuilder.add("block.colored-foliage.green_cornflower", "Green Cornflower");
        translationBuilder.add("block.colored-foliage.red_cornflower", "Red Cornflower");

        translationBuilder.add("block.colored-foliage.black_poppy", "Black Poppy");
        translationBuilder.add("block.colored-foliage.white_poppy", "White Poppy");
        translationBuilder.add("block.colored-foliage.orange_poppy", "Orange Poppy");
        translationBuilder.add("block.colored-foliage.magenta_poppy", "Magenta Poppy");
        translationBuilder.add("block.colored-foliage.light_blue_poppy", "Light Blue Poppy");
        translationBuilder.add("block.colored-foliage.yellow_poppy", "Yellow Poppy");
        translationBuilder.add("block.colored-foliage.lime_poppy", "Lime Poppy");
        translationBuilder.add("block.colored-foliage.pink_poppy", "Pink Poppy");
        translationBuilder.add("block.colored-foliage.gray_poppy", "Gray Poppy");
        translationBuilder.add("block.colored-foliage.light_gray_poppy", "Light Gray Poppy");
        translationBuilder.add("block.colored-foliage.cyan_poppy", "Cyan Poppy");
        translationBuilder.add("block.colored-foliage.purple_poppy", "Purple Poppy");
        translationBuilder.add("block.colored-foliage.blue_poppy", "Blue Poppy");
        translationBuilder.add("block.colored-foliage.brown_poppy", "Brown Poppy");
        translationBuilder.add("block.colored-foliage.green_poppy", "Green Poppy");
        translationBuilder.add("block.colored-foliage.red_poppy", "Red Poppy");

        translationBuilder.add("block.colored-foliage.black_lily_of_the_valley", "Black Lily of The Valley");
        translationBuilder.add("block.colored-foliage.white_lily_of_the_valley", "White Lily of The Valley");
        translationBuilder.add("block.colored-foliage.orange_lily_of_the_valley", "Orange Lily of The Valley");
        translationBuilder.add("block.colored-foliage.magenta_lily_of_the_valley", "Magenta Lily of The Valley");
        translationBuilder.add("block.colored-foliage.light_blue_lily_of_the_valley", "Light Blue Lily of The Valley");
        translationBuilder.add("block.colored-foliage.yellow_lily_of_the_valley", "Yellow Lily of The Valley");
        translationBuilder.add("block.colored-foliage.lime_lily_of_the_valley", "Lime Lily of The Valley");
        translationBuilder.add("block.colored-foliage.pink_lily_of_the_valley", "Pink Lily of The Valley");
        translationBuilder.add("block.colored-foliage.gray_lily_of_the_valley", "Gray Lily of The Valley");
        translationBuilder.add("block.colored-foliage.light_gray_lily_of_the_valley", "Light Gray Lily of The Valley");
        translationBuilder.add("block.colored-foliage.cyan_lily_of_the_valley", "Cyan Lily of The Valley");
        translationBuilder.add("block.colored-foliage.purple_lily_of_the_valley", "Purple Lily of The Valley");
        translationBuilder.add("block.colored-foliage.blue_lily_of_the_valley", "Blue Lily of The Valley");
        translationBuilder.add("block.colored-foliage.brown_lily_of_the_valley", "Brown Lily of The Valley");
        translationBuilder.add("block.colored-foliage.green_lily_of_the_valley", "Green Lily of The Valley");
        translationBuilder.add("block.colored-foliage.red_lily_of_the_valley", "Red Lily of The Valley");

        translationBuilder.add("itemgroup.colored-foliage.colored_foliage_group", "Colored Foliage");

    }
}
