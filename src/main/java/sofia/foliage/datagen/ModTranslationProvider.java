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
        translationBuilder.add("block.colored-foliage.black_oxeye_daisy", "Black Oxeye Daisy");
        translationBuilder.add("block.colored-foliage.white_oxeye_daisy", "White Oxeye Daisy");
        translationBuilder.add("block.colored-foliage.orange_oxeye_daisy", "Orange Oxeye Daisy");
        translationBuilder.add("block.colored-foliage.magenta_oxeye_daisy", "Magenta Oxeye Daisy");
        translationBuilder.add("block.colored-foliage.light_blue_oxeye_daisy", "Light Blue Oxeye Daisy");
        translationBuilder.add("block.colored-foliage.yellow_oxeye_daisy", "Yellow Oxeye Daisy");
        translationBuilder.add("block.colored-foliage.lime_oxeye_daisy", "Lime Oxeye Daisy");
        translationBuilder.add("block.colored-foliage.pink_oxeye_daisy", "Pink Oxeye Daisy");
        translationBuilder.add("block.colored-foliage.gray_oxeye_daisy", "Gray Oxeye Daisy");
        translationBuilder.add("block.colored-foliage.light_gray_oxeye_daisy", "Light Oxeye Daisy");
        translationBuilder.add("block.block.colored-foliage.cyan_oxeye_daisy", "Cyan Oxeye Daisy");
        translationBuilder.add("block.colored-foliage.purple_oxeye_daisy", "Purple Oxeye Daisy");
        translationBuilder.add("block.colored-foliage.blue_oxeye_daisy", "Blue Oxeye Daisy");
        translationBuilder.add("block.colored-foliage.brown_oxeye_daisy", "Brown Oxeye Daisy");
        translationBuilder.add("block.colored-foliage.green_oxeye_daisy", "Green Oxeye Daisy");
        translationBuilder.add("block.colored-foliage.red_oxeye_daisy", "Red Oxeye Daisy");

    }
}
