package sofia.foliage.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.item.Items;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import sofia.foliage.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerShapelessLily(exporter, ModBlocks.WHITE_LILY_OF_THE_VALLEY, Items.WHITE_DYE);
        offerShapelessLily(exporter, ModBlocks.ORANGE_LILY_OF_THE_VALLEY, Items.ORANGE_DYE);
        offerShapelessLily(exporter, ModBlocks.MAGENTA_LILY_OF_THE_VALLEY, Items.MAGENTA_DYE);
        offerShapelessLily(exporter, ModBlocks.LIGHT_BLUE_LILY_OF_THE_VALLEY, Items.LIGHT_BLUE_DYE);
        offerShapelessLily(exporter, ModBlocks.YELLOW_LILY_OF_THE_VALLEY, Items.YELLOW_DYE);
        offerShapelessLily(exporter, ModBlocks.LIME_LILY_OF_THE_VALLEY, Items.LIME_DYE);
        offerShapelessLily(exporter, ModBlocks.PINK_LILY_OF_THE_VALLEY, Items.PINK_DYE);
        offerShapelessLily(exporter, ModBlocks.GRAY_LILY_OF_THE_VALLEY, Items.GRAY_DYE);
        offerShapelessLily(exporter, ModBlocks.LIGHT_GRAY_LILY_OF_THE_VALLEY, Items.LIGHT_GRAY_DYE);
        offerShapelessLily(exporter, ModBlocks.CYAN_LILY_OF_THE_VALLEY, Items.CYAN_DYE);
        offerShapelessLily(exporter, ModBlocks.PURPLE_LILY_OF_THE_VALLEY, Items.PURPLE_DYE);
        offerShapelessLily(exporter, ModBlocks.BLUE_LILY_OF_THE_VALLEY, Items.BLUE_DYE);
        offerShapelessLily(exporter, ModBlocks.BROWN_LILY_OF_THE_VALLEY, Items.BROWN_DYE);
        offerShapelessLily(exporter, ModBlocks.GREEN_LILY_OF_THE_VALLEY, Items.GREEN_DYE);
        offerShapelessLily(exporter, ModBlocks.RED_LILY_OF_THE_VALLEY, Items.RED_DYE);
        offerShapelessLily(exporter, ModBlocks.BLACK_LILY_OF_THE_VALLEY, Items.BLACK_DYE);

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

        offerShapelessWither(exporter, ModBlocks.WHITE_WITHER_ROSE, Items.WHITE_DYE);
        offerShapelessWither(exporter, ModBlocks.ORANGE_WITHER_ROSE, Items.ORANGE_DYE);
        offerShapelessWither(exporter, ModBlocks.MAGENTA_WITHER_ROSE, Items.MAGENTA_DYE);
        offerShapelessWither(exporter, ModBlocks.LIGHT_BLUE_WITHER_ROSE, Items.LIGHT_BLUE_DYE);
        offerShapelessWither(exporter, ModBlocks.YELLOW_WITHER_ROSE, Items.YELLOW_DYE);
        offerShapelessWither(exporter, ModBlocks.LIME_WITHER_ROSE, Items.LIME_DYE);
        offerShapelessWither(exporter, ModBlocks.PINK_WITHER_ROSE, Items.PINK_DYE);
        offerShapelessWither(exporter, ModBlocks.GRAY_WITHER_ROSE, Items.GRAY_DYE);
        offerShapelessWither(exporter, ModBlocks.LIGHT_GRAY_WITHER_ROSE, Items.LIGHT_GRAY_DYE);
        offerShapelessWither(exporter, ModBlocks.CYAN_WITHER_ROSE, Items.CYAN_DYE);
        offerShapelessWither(exporter, ModBlocks.PURPLE_WITHER_ROSE, Items.PURPLE_DYE);
        offerShapelessWither(exporter, ModBlocks.BLUE_WITHER_ROSE, Items.BLUE_DYE);
        offerShapelessWither(exporter, ModBlocks.BROWN_WITHER_ROSE, Items.BROWN_DYE);
        offerShapelessWither(exporter, ModBlocks.GREEN_WITHER_ROSE, Items.GREEN_DYE);
        offerShapelessWither(exporter, ModBlocks.RED_WITHER_ROSE, Items.RED_DYE);
        offerShapelessWither(exporter, ModBlocks.BLACK_WITHER_ROSE, Items.BLACK_DYE);
    }
    private static void offerShapelessWither(RecipeExporter exporter, net.minecraft.item.ItemConvertible output, net.minecraft.item.ItemConvertible dye) {
        net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output)
                .input(Items.WITHER_ROSE)
                .input(dye)
                .criterion(hasItem(Items.WITHER_ROSE), conditionsFromItem(Items.WITHER_ROSE))
                .offerTo(exporter);
    }
    private static void offerShapelessLily(RecipeExporter exporter, net.minecraft.item.ItemConvertible output, net.minecraft.item.ItemConvertible dye) {
        net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output)
                .input(Items.WITHER_ROSE)
                .input(dye)
                .criterion(hasItem(Items.WITHER_ROSE), conditionsFromItem(Items.WITHER_ROSE))
                .offerTo(exporter);
    }

    private static void offerSunflowerRecipe(RecipeExporter exporter, net.minecraft.item.ItemConvertible output, net.minecraft.item.ItemConvertible dye) {
        net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.create(net.minecraft.recipe.book.RecipeCategory.DECORATIONS, output)
                .input(Items.SUNFLOWER)
                .input(dye)
                .criterion(hasItem(Items.SUNFLOWER), conditionsFromItem(Items.SUNFLOWER))
                .offerTo(exporter);
    }
}
