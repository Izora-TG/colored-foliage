package sofia.foliage.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.item.Items;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.registry.RegistryWrapper;
import sofia.foliage.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSingleOutputShapelessRecipe(exporter, ModBlocks.WHITE_LILY_OF_THE_VALLEY, Items.WHITE_DYE, null);
        offerSingleOutputShapelessRecipe(exporter, ModBlocks.ORANGE_LILY_OF_THE_VALLEY, Items.ORANGE_DYE, null);
        offerSingleOutputShapelessRecipe(exporter, ModBlocks.MAGENTA_LILY_OF_THE_VALLEY, Items.MAGENTA_DYE, null);
        offerSingleOutputShapelessRecipe(exporter, ModBlocks.LIGHT_BLUE_LILY_OF_THE_VALLEY, Items.LIGHT_BLUE_DYE, null);
        offerSingleOutputShapelessRecipe(exporter, ModBlocks.YELLOW_LILY_OF_THE_VALLEY, Items.YELLOW_DYE, null);
        offerSingleOutputShapelessRecipe(exporter, ModBlocks.LIME_LILY_OF_THE_VALLEY, Items.LIME_DYE, null);
        offerSingleOutputShapelessRecipe(exporter, ModBlocks.PINK_LILY_OF_THE_VALLEY, Items.PINK_DYE, null);
        offerSingleOutputShapelessRecipe(exporter, ModBlocks.GRAY_LILY_OF_THE_VALLEY, Items.GRAY_DYE, null);
        offerSingleOutputShapelessRecipe(exporter, ModBlocks.LIGHT_GRAY_LILY_OF_THE_VALLEY, Items.LIGHT_GRAY_DYE, null);
        offerSingleOutputShapelessRecipe(exporter, ModBlocks.CYAN_LILY_OF_THE_VALLEY, Items.CYAN_DYE, null);
        offerSingleOutputShapelessRecipe(exporter, ModBlocks.PURPLE_LILY_OF_THE_VALLEY, Items.PURPLE_DYE, null);
        offerSingleOutputShapelessRecipe(exporter, ModBlocks.BLUE_LILY_OF_THE_VALLEY, Items.BLUE_DYE, null);
        offerSingleOutputShapelessRecipe(exporter, ModBlocks.BROWN_LILY_OF_THE_VALLEY, Items.BROWN_DYE, null);
        offerSingleOutputShapelessRecipe(exporter, ModBlocks.GREEN_LILY_OF_THE_VALLEY, Items.GREEN_DYE, null);
        offerSingleOutputShapelessRecipe(exporter, ModBlocks.RED_LILY_OF_THE_VALLEY, Items.RED_DYE, null);
        offerSingleOutputShapelessRecipe(exporter, ModBlocks.BLACK_LILY_OF_THE_VALLEY, Items.BLACK_DYE, null);

        offerSunflowerRecipe(exporter, ModBlocks.WHITE_SUNFLOWER, Items.WHITE_DYE);
        offerSunflowerRecipe(exporter, ModBlocks.ORANGE_SUNFLOWER, Items.ORANGE_DYE);
        offerSunflowerRecipe(exporter, ModBlocks.MAGENTA_SUNFLOWER, Items.MAGENTA_DYE);
        offerSunflowerRecipe(exporter, ModBlocks.LIGHT_BLUE_SUNFLOWER, Items.LIGHT_BLUE_DYE);
        offerSunflowerRecipe(exporter, ModBlocks.YELLOW_SUNFLOWER, Items.YELLOW_DYE);
        offerSunflowerRecipe(exporter, ModBlocks.LIME_SUNFLOWER, Items.LIME_DYE);
        offerSunflowerRecipe(exporter, ModBlocks.PINK_SUNFLOWER, Items.PINK_DYE);
        offerSunflowerRecipe(exporter, ModBlocks.GRAY_SUNFLOWER, Items.GRAY_DYE);
        offerSunflowerRecipe(exporter, ModBlocks.LIGHT_GRAY_SUNFLOWER, Items.LIGHT_GRAY_DYE);
        offerSunflowerRecipe(exporter, ModBlocks.CYAN_SUNFLOWER, Items.CYAN_DYE);
        offerSunflowerRecipe(exporter, ModBlocks.PURPLE_SUNFLOWER, Items.PURPLE_DYE);
        offerSunflowerRecipe(exporter, ModBlocks.BLUE_SUNFLOWER, Items.BLUE_DYE);
        offerSunflowerRecipe(exporter, ModBlocks.BROWN_SUNFLOWER, Items.BROWN_DYE);
        offerSunflowerRecipe(exporter, ModBlocks.GREEN_SUNFLOWER, Items.GREEN_DYE);
        offerSunflowerRecipe(exporter, ModBlocks.RED_SUNFLOWER, Items.RED_DYE);
        offerSunflowerRecipe(exporter, ModBlocks.BLACK_SUNFLOWER, Items.BLACK_DYE);
    }

    private static void offerSunflowerRecipe(RecipeExporter exporter, net.minecraft.item.ItemConvertible output, net.minecraft.item.ItemConvertible dye) {
        net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.create(net.minecraft.recipe.book.RecipeCategory.DECORATIONS, output)
                .input(Items.SUNFLOWER)
                .input(dye)
                .criterion(hasItem(Items.SUNFLOWER), conditionsFromItem(Items.SUNFLOWER))
                .offerTo(exporter);
    }
}
