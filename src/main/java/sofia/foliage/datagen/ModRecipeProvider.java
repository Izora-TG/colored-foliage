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

        offerShapelessCorn(exporter, ModBlocks.WHITE_CORNFLOWER, Items.WHITE_DYE);
        offerShapelessCorn(exporter, ModBlocks.ORANGE_CORNFLOWER, Items.ORANGE_DYE);
        offerShapelessCorn(exporter, ModBlocks.MAGENTA_CORNFLOWER, Items.MAGENTA_DYE);
        offerShapelessCorn(exporter, ModBlocks.LIGHT_BLUE_CORNFLOWER, Items.LIGHT_BLUE_DYE);
        offerShapelessCorn(exporter, ModBlocks.YELLOW_CORNFLOWER, Items.YELLOW_DYE);
        offerShapelessCorn(exporter, ModBlocks.LIME_CORNFLOWER, Items.LIME_DYE);
        offerShapelessCorn(exporter, ModBlocks.PINK_CORNFLOWER, Items.PINK_DYE);
        offerShapelessCorn(exporter, ModBlocks.GRAY_CORNFLOWER, Items.GRAY_DYE);
        offerShapelessCorn(exporter, ModBlocks.LIGHT_GRAY_CORNFLOWER, Items.LIGHT_GRAY_DYE);
        offerShapelessCorn(exporter, ModBlocks.CYAN_CORNFLOWER, Items.CYAN_DYE);
        offerShapelessCorn(exporter, ModBlocks.PURPLE_CORNFLOWER, Items.PURPLE_DYE);
        offerShapelessCorn(exporter, ModBlocks.BLUE_CORNFLOWER, Items.BLUE_DYE);
        offerShapelessCorn(exporter, ModBlocks.BROWN_CORNFLOWER, Items.BROWN_DYE);
        offerShapelessCorn(exporter, ModBlocks.GREEN_CORNFLOWER, Items.GREEN_DYE);
        offerShapelessCorn(exporter, ModBlocks.RED_CORNFLOWER, Items.RED_DYE);
        offerShapelessCorn(exporter, ModBlocks.BLACK_CORNFLOWER, Items.BLACK_DYE);

        offerShapelessAllium(exporter, ModBlocks.WHITE_ALLIUM, Items.WHITE_DYE);
        offerShapelessAllium(exporter, ModBlocks.ORANGE_ALLIUM, Items.ORANGE_DYE);
        offerShapelessAllium(exporter, ModBlocks.MAGENTA_ALLIUM, Items.MAGENTA_DYE);
        offerShapelessAllium(exporter, ModBlocks.LIGHT_BLUE_ALLIUM, Items.LIGHT_BLUE_DYE);
        offerShapelessAllium(exporter, ModBlocks.YELLOW_ALLIUM, Items.YELLOW_DYE);
        offerShapelessAllium(exporter, ModBlocks.LIME_ALLIUM, Items.LIME_DYE);
        offerShapelessAllium(exporter, ModBlocks.PINK_ALLIUM, Items.PINK_DYE);
        offerShapelessAllium(exporter, ModBlocks.GRAY_ALLIUM, Items.GRAY_DYE);
        offerShapelessAllium(exporter, ModBlocks.LIGHT_GRAY_ALLIUM, Items.LIGHT_GRAY_DYE);
        offerShapelessAllium(exporter, ModBlocks.CYAN_ALLIUM, Items.CYAN_DYE);
        offerShapelessAllium(exporter, ModBlocks.PURPLE_ALLIUM, Items.PURPLE_DYE);
        offerShapelessAllium(exporter, ModBlocks.BLUE_ALLIUM, Items.BLUE_DYE);
        offerShapelessAllium(exporter, ModBlocks.BROWN_ALLIUM, Items.BROWN_DYE);
        offerShapelessAllium(exporter, ModBlocks.GREEN_ALLIUM, Items.GREEN_DYE);
        offerShapelessAllium(exporter, ModBlocks.RED_ALLIUM, Items.RED_DYE);
        offerShapelessAllium(exporter, ModBlocks.BLACK_ALLIUM, Items.BLACK_DYE);

        offerShapelessDande(exporter, ModBlocks.WHITE_DANDELION, Items.WHITE_DYE);
        offerShapelessDande(exporter, ModBlocks.ORANGE_DANDELION, Items.ORANGE_DYE);
        offerShapelessDande(exporter, ModBlocks.MAGENTA_DANDELION, Items.MAGENTA_DYE);
        offerShapelessDande(exporter, ModBlocks.LIGHT_BLUE_DANDELION, Items.LIGHT_BLUE_DYE);
        offerShapelessDande(exporter, ModBlocks.YELLOW_DANDELION, Items.YELLOW_DYE);
        offerShapelessDande(exporter, ModBlocks.LIME_DANDELION, Items.LIME_DYE);
        offerShapelessDande(exporter, ModBlocks.PINK_DANDELION, Items.PINK_DYE);
        offerShapelessDande(exporter, ModBlocks.GRAY_DANDELION, Items.GRAY_DYE);
        offerShapelessDande(exporter, ModBlocks.LIGHT_GRAY_DANDELION, Items.LIGHT_GRAY_DYE);
        offerShapelessDande(exporter, ModBlocks.CYAN_DANDELION, Items.CYAN_DYE);
        offerShapelessDande(exporter, ModBlocks.PURPLE_DANDELION, Items.PURPLE_DYE);
        offerShapelessDande(exporter, ModBlocks.BLUE_DANDELION, Items.BLUE_DYE);
        offerShapelessDande(exporter, ModBlocks.BROWN_DANDELION, Items.BROWN_DYE);
        offerShapelessDande(exporter, ModBlocks.GREEN_DANDELION, Items.GREEN_DYE);
        offerShapelessDande(exporter, ModBlocks.RED_DANDELION, Items.RED_DYE);
        offerShapelessDande(exporter, ModBlocks.BLACK_DANDELION, Items.BLACK_DYE);

        offerShapelessPoppy(exporter, ModBlocks.WHITE_POPPY, Items.WHITE_DYE);
        offerShapelessPoppy(exporter, ModBlocks.ORANGE_POPPY, Items.ORANGE_DYE);
        offerShapelessPoppy(exporter, ModBlocks.MAGENTA_POPPY, Items.MAGENTA_DYE);
        offerShapelessPoppy(exporter, ModBlocks.LIGHT_BLUE_POPPY, Items.LIGHT_BLUE_DYE);
        offerShapelessPoppy(exporter, ModBlocks.YELLOW_POPPY, Items.YELLOW_DYE);
        offerShapelessPoppy(exporter, ModBlocks.LIME_POPPY, Items.LIME_DYE);
        offerShapelessPoppy(exporter, ModBlocks.PINK_POPPY, Items.PINK_DYE);
        offerShapelessPoppy(exporter, ModBlocks.GRAY_POPPY, Items.GRAY_DYE);
        offerShapelessPoppy(exporter, ModBlocks.LIGHT_GRAY_POPPY, Items.LIGHT_GRAY_DYE);
        offerShapelessPoppy(exporter, ModBlocks.CYAN_POPPY, Items.CYAN_DYE);
        offerShapelessPoppy(exporter, ModBlocks.PURPLE_POPPY, Items.PURPLE_DYE);
        offerShapelessPoppy(exporter, ModBlocks.BLUE_POPPY, Items.BLUE_DYE);
        offerShapelessPoppy(exporter, ModBlocks.BROWN_POPPY, Items.BROWN_DYE);
        offerShapelessPoppy(exporter, ModBlocks.GREEN_POPPY, Items.GREEN_DYE);
        offerShapelessPoppy(exporter, ModBlocks.RED_POPPY, Items.RED_DYE);
        offerShapelessPoppy(exporter, ModBlocks.BLACK_POPPY, Items.BLACK_DYE);
    }
    private static void offerShapelessLily(RecipeExporter exporter, net.minecraft.item.ItemConvertible output, net.minecraft.item.ItemConvertible dye) {
        net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output)
                .input(Items.LILY_OF_THE_VALLEY)
                .input(dye)
                .criterion(hasItem(Items.LILY_OF_THE_VALLEY), conditionsFromItem(Items.LILY_OF_THE_VALLEY))
                .offerTo(exporter);
    }
    private static void offerSunflowerRecipe(RecipeExporter exporter, net.minecraft.item.ItemConvertible output, net.minecraft.item.ItemConvertible dye) {
        net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.create(net.minecraft.recipe.book.RecipeCategory.DECORATIONS, output)
                .input(Items.SUNFLOWER)
                .input(dye)
                .criterion(hasItem(Items.SUNFLOWER), conditionsFromItem(Items.SUNFLOWER))
                .offerTo(exporter);
    }
    private static void offerShapelessWither(RecipeExporter exporter, net.minecraft.item.ItemConvertible output, net.minecraft.item.ItemConvertible dye) {
        net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output)
                .input(Items.WITHER_ROSE)
                .input(dye)
                .criterion(hasItem(Items.WITHER_ROSE), conditionsFromItem(Items.WITHER_ROSE))
                .offerTo(exporter);
    }
    private static void offerShapelessCorn(RecipeExporter exporter, net.minecraft.item.ItemConvertible output, net.minecraft.item.ItemConvertible dye) {
        net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output)
                .input(Items.CORNFLOWER)
                .input(dye)
                .criterion(hasItem(Items.CORNFLOWER), conditionsFromItem(Items.CORNFLOWER))
                .offerTo(exporter);
    }
    private static void offerShapelessAllium(RecipeExporter exporter, net.minecraft.item.ItemConvertible output, net.minecraft.item.ItemConvertible dye) {
        net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output)
                .input(Items.ALLIUM)
                .input(dye)
                .criterion(hasItem(Items.ALLIUM), conditionsFromItem(Items.ALLIUM))
                .offerTo(exporter);
    }
    private static void offerShapelessDande(RecipeExporter exporter, net.minecraft.item.ItemConvertible output, net.minecraft.item.ItemConvertible dye) {
        net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output)
                .input(Items.DANDELION)
                .input(dye)
                .criterion(hasItem(Items.DANDELION), conditionsFromItem(Items.DANDELION))
                .offerTo(exporter);
    }
    private static void offerShapelessPoppy(RecipeExporter exporter, net.minecraft.item.ItemConvertible output, net.minecraft.item.ItemConvertible dye) {
        net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output)
                .input(Items.POPPY)
                .input(dye)
                .criterion(hasItem(Items.POPPY), conditionsFromItem(Items.POPPY))
                .offerTo(exporter);
    }
}
