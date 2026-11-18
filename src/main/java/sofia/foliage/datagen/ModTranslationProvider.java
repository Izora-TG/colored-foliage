package sofia.foliage.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;


public class ModTranslationProvider extends FabricLanguageProvider {
    public ModTranslationProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("block.colored-foliage.black_short_fern", "Black Fern");
        translationBuilder.add("block.colored-foliage.white_short_fern", "White Fern");
        translationBuilder.add("block.colored-foliage.orange_short_fern", "Orange Fern");
        translationBuilder.add("block.colored-foliage.magenta_short_fern", "Magenta Fern");
        translationBuilder.add("block.colored-foliage.light_blue_short_fern", "Light Blue Fern");
        translationBuilder.add("block.colored-foliage.yellow_short_fern", "Yellow Fern");
        translationBuilder.add("block.colored-foliage.lime_short_fern", "Lime Fern");
        translationBuilder.add("block.colored-foliage.pink_short_fern", "Pink Fern");
        translationBuilder.add("block.colored-foliage.gray_short_fern", "Gray Fern");
        translationBuilder.add("block.colored-foliage.light_gray_short_fern", "Light Gray Fern");
        translationBuilder.add("block.colored-foliage.cyan_short_fern", "Cyan Fern");
        translationBuilder.add("block.colored-foliage.purple_short_fern", "Purple Fern");
        translationBuilder.add("block.colored-foliage.blue_short_fern", "Blue Fern");
        translationBuilder.add("block.colored-foliage.brown_short_fern", "Brown Fern");
        //translationBuilder.add("block.colored-foliage.green_short_fern", "Green  Fern");
        translationBuilder.add("block.colored-foliage.red_short_fern", "Red Fern");

    }
}
