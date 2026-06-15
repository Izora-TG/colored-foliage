package sofia.foliage.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.TallBlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import sofia.foliage.ColoredFoliage;

public class ModBlocks {
    public static final Block WHITE_POPPY = registerDyeableFlower("white_poppy", MapColor.WHITE);
    public static final Block ORANGE_POPPY = registerDyeableFlower("orange_poppy", MapColor.ORANGE);
    public static final Block MAGENTA_POPPY = registerDyeableFlower("magenta_poppy", MapColor.MAGENTA);
    public static final Block LIGHT_BLUE_POPPY = registerDyeableFlower("light_blue_poppy", MapColor.LIGHT_BLUE);
    public static final Block YELLOW_POPPY = registerDyeableFlower("yellow_poppy", MapColor.YELLOW);
    public static final Block LIME_POPPY = registerDyeableFlower("lime_poppy", MapColor.LIME);
    public static final Block PINK_POPPY = registerDyeableFlower("pink_poppy", MapColor.PINK);
    public static final Block GRAY_POPPY = registerDyeableFlower("gray_poppy", MapColor.GRAY);
    public static final Block LIGHT_GRAY_POPPY = registerDyeableFlower("light_gray_poppy", MapColor.LIGHT_GRAY);
    public static final Block CYAN_POPPY = registerDyeableFlower("cyan_poppy", MapColor.CYAN);
    public static final Block PURPLE_POPPY = registerDyeableFlower("purple_poppy", MapColor.PURPLE);
    public static final Block BLUE_POPPY = registerDyeableFlower("blue_poppy", MapColor.BLUE);
    public static final Block BROWN_POPPY = registerDyeableFlower("brown_poppy", MapColor.BROWN);
    public static final Block GREEN_POPPY = registerDyeableFlower("green_poppy", MapColor.GREEN);
    public static final Block RED_POPPY = registerDyeableFlower("red_poppy", MapColor.RED);
    public static final Block BLACK_POPPY = registerDyeableFlower("black_poppy", MapColor.BLACK);

    public static final Block WHITE_DANDELION = registerDyeableFlower("white_dandelion", MapColor.WHITE);
    public static final Block ORANGE_DANDELION = registerDyeableFlower("orange_dandelion", MapColor.ORANGE);
    public static final Block MAGENTA_DANDELION = registerDyeableFlower("magenta_dandelion", MapColor.MAGENTA);
    public static final Block LIGHT_BLUE_DANDELION = registerDyeableFlower("light_blue_dandelion", MapColor.LIGHT_BLUE);
    public static final Block YELLOW_DANDELION = registerFlower("yellow_dandelion", MapColor.WHITE);
    public static final Block LIME_DANDELION = registerDyeableFlower("lime_dandelion", MapColor.LIME);
    public static final Block PINK_DANDELION = registerDyeableFlower("pink_dandelion", MapColor.PINK);
    public static final Block GRAY_DANDELION = registerDyeableFlower("gray_dandelion", MapColor.GRAY);
    public static final Block LIGHT_GRAY_DANDELION = registerDyeableFlower("light_gray_dandelion", MapColor.LIGHT_GRAY);
    public static final Block CYAN_DANDELION = registerDyeableFlower("cyan_dandelion", MapColor.CYAN);
    public static final Block PURPLE_DANDELION = registerDyeableFlower("purple_dandelion", MapColor.PURPLE);
    public static final Block BLUE_DANDELION = registerDyeableFlower("blue_dandelion", MapColor.BLUE);
    public static final Block BROWN_DANDELION = registerDyeableFlower("brown_dandelion", MapColor.BROWN);
    public static final Block GREEN_DANDELION = registerDyeableFlower("green_dandelion", MapColor.GREEN);
    public static final Block RED_DANDELION = registerDyeableFlower("red_dandelion", MapColor.RED);
    public static final Block BLACK_DANDELION = registerDyeableFlower("black_dandelion", MapColor.BLACK);

    public static final Block WHITE_ALLIUM = registerDyeableFlower("white_allium", MapColor.WHITE);
    public static final Block ORANGE_ALLIUM = registerDyeableFlower("orange_allium", MapColor.ORANGE);
    public static final Block MAGENTA_ALLIUM = registerDyeableFlower("magenta_allium", MapColor.MAGENTA);
    public static final Block LIGHT_BLUE_ALLIUM = registerDyeableFlower("light_blue_allium", MapColor.LIGHT_BLUE);
    public static final Block YELLOW_ALLIUM = registerDyeableFlower("yellow_allium", MapColor.YELLOW);
    public static final Block LIME_ALLIUM = registerDyeableFlower("lime_allium", MapColor.LIME);
    public static final Block PINK_ALLIUM = registerDyeableFlower("pink_allium", MapColor.PINK);
    public static final Block GRAY_ALLIUM = registerDyeableFlower("gray_allium", MapColor.GRAY);
    public static final Block LIGHT_GRAY_ALLIUM = registerDyeableFlower("light_gray_allium", MapColor.LIGHT_GRAY);
    public static final Block CYAN_ALLIUM = registerDyeableFlower("cyan_allium", MapColor.CYAN);
    public static final Block PURPLE_ALLIUM = registerDyeableFlower("purple_allium", MapColor.PURPLE);
    public static final Block BLUE_ALLIUM = registerDyeableFlower("blue_allium", MapColor.BLUE);
    public static final Block BROWN_ALLIUM = registerDyeableFlower("brown_allium", MapColor.BROWN);
    public static final Block GREEN_ALLIUM = registerDyeableFlower("green_allium", MapColor.GREEN);
    public static final Block RED_ALLIUM = registerDyeableFlower("red_allium", MapColor.RED);
    public static final Block BLACK_ALLIUM = registerDyeableFlower("black_allium", MapColor.BLACK);

    public static final Block WHITE_CORNFLOWER = registerDyeableFlower("white_cornflower", MapColor.WHITE);
    public static final Block ORANGE_CORNFLOWER = registerDyeableFlower("orange_cornflower", MapColor.ORANGE);
    public static final Block MAGENTA_CORNFLOWER = registerDyeableFlower("magenta_cornflower", MapColor.MAGENTA);
    public static final Block LIGHT_BLUE_CORNFLOWER = registerDyeableFlower("light_blue_cornflower", MapColor.LIGHT_BLUE);
    public static final Block YELLOW_CORNFLOWER = registerDyeableFlower("yellow_cornflower", MapColor.YELLOW);
    public static final Block LIME_CORNFLOWER = registerDyeableFlower("lime_cornflower", MapColor.LIME);
    public static final Block PINK_CORNFLOWER = registerDyeableFlower("pink_cornflower", MapColor.PINK);
    public static final Block GRAY_CORNFLOWER = registerDyeableFlower("gray_cornflower", MapColor.GRAY);
    public static final Block LIGHT_GRAY_CORNFLOWER = registerDyeableFlower("light_gray_cornflower", MapColor.LIGHT_GRAY);
    public static final Block CYAN_CORNFLOWER = registerDyeableFlower("cyan_cornflower", MapColor.CYAN);
    public static final Block PURPLE_CORNFLOWER = registerDyeableFlower("purple_cornflower", MapColor.PURPLE);
    public static final Block BLUE_CORNFLOWER = registerDyeableFlower("blue_cornflower", MapColor.BLUE);
    public static final Block BROWN_CORNFLOWER = registerDyeableFlower("brown_cornflower", MapColor.BROWN);
    public static final Block GREEN_CORNFLOWER = registerDyeableFlower("green_cornflower", MapColor.GREEN);
    public static final Block RED_CORNFLOWER = registerDyeableFlower("red_cornflower", MapColor.RED);
    public static final Block BLACK_CORNFLOWER = registerDyeableFlower("black_cornflower", MapColor.BLACK);

    public static final Block WHITE_SUNFLOWER = registerTallFlower("white_sunflower", MapColor.WHITE);
    public static final Block ORANGE_SUNFLOWER = registerTallFlower("orange_sunflower", MapColor.ORANGE);
    public static final Block MAGENTA_SUNFLOWER = registerTallFlower("magenta_sunflower", MapColor.MAGENTA);
    public static final Block LIGHT_BLUE_SUNFLOWER = registerTallFlower("light_blue_sunflower", MapColor.LIGHT_BLUE);
    public static final Block YELLOW_SUNFLOWER = registerTallFlower("yellow_sunflower", MapColor.YELLOW);
    public static final Block LIME_SUNFLOWER = registerTallFlower("lime_sunflower", MapColor.LIME);
    public static final Block PINK_SUNFLOWER = registerTallFlower("pink_sunflower", MapColor.PINK);
    public static final Block GRAY_SUNFLOWER = registerTallFlower("gray_sunflower", MapColor.GRAY);
    public static final Block LIGHT_GRAY_SUNFLOWER = registerTallFlower("light_gray_sunflower", MapColor.LIGHT_GRAY);
    public static final Block CYAN_SUNFLOWER = registerTallFlower("cyan_sunflower", MapColor.CYAN);
    public static final Block PURPLE_SUNFLOWER = registerTallFlower("purple_sunflower", MapColor.PURPLE);
    public static final Block BLUE_SUNFLOWER = registerTallFlower("blue_sunflower", MapColor.BLUE);
    public static final Block BROWN_SUNFLOWER = registerTallFlower("brown_sunflower", MapColor.BROWN);
    public static final Block GREEN_SUNFLOWER = registerTallFlower("green_sunflower", MapColor.GREEN);
    public static final Block RED_SUNFLOWER = registerTallFlower("red_sunflower", MapColor.RED);
    public static final Block BLACK_SUNFLOWER = registerTallFlower("black_sunflower", MapColor.BLACK);

    public static final Block WHITE_LILY_OF_THE_VALLEY = registerFlower("white_lily_of_the_valley", MapColor.WHITE);
    public static final Block ORANGE_LILY_OF_THE_VALLEY = registerFlower("orange_lily_of_the_valley", MapColor.ORANGE);
    public static final Block MAGENTA_LILY_OF_THE_VALLEY = registerFlower("magenta_lily_of_the_valley", MapColor.MAGENTA);
    public static final Block LIGHT_BLUE_LILY_OF_THE_VALLEY = registerFlower("light_blue_lily_of_the_valley", MapColor.LIGHT_BLUE);
    public static final Block YELLOW_LILY_OF_THE_VALLEY = registerFlower("yellow_lily_of_the_valley", MapColor.YELLOW);
    public static final Block LIME_LILY_OF_THE_VALLEY = registerFlower("lime_lily_of_the_valley", MapColor.LIME);
    public static final Block PINK_LILY_OF_THE_VALLEY = registerFlower("pink_lily_of_the_valley", MapColor.PINK);
    public static final Block GRAY_LILY_OF_THE_VALLEY = registerFlower("gray_lily_of_the_valley", MapColor.GRAY);
    public static final Block LIGHT_GRAY_LILY_OF_THE_VALLEY = registerFlower("light_gray_lily_of_the_valley", MapColor.LIGHT_GRAY);
    public static final Block CYAN_LILY_OF_THE_VALLEY = registerFlower("cyan_lily_of_the_valley", MapColor.CYAN);
    public static final Block PURPLE_LILY_OF_THE_VALLEY = registerFlower("purple_lily_of_the_valley", MapColor.PURPLE);
    public static final Block BLUE_LILY_OF_THE_VALLEY = registerFlower("blue_lily_of_the_valley", MapColor.BLUE);
    public static final Block BROWN_LILY_OF_THE_VALLEY = registerFlower("brown_lily_of_the_valley", MapColor.BROWN);
    public static final Block GREEN_LILY_OF_THE_VALLEY = registerFlower("green_lily_of_the_valley", MapColor.GREEN);
    public static final Block RED_LILY_OF_THE_VALLEY = registerFlower("red_lily_of_the_valley", MapColor.RED);
    public static final Block BLACK_LILY_OF_THE_VALLEY = registerFlower("black_lily_of_the_valley", MapColor.BLACK);


    public static final Block[] LILY_OF_THE_VALLEY = {
            WHITE_LILY_OF_THE_VALLEY,
            ORANGE_LILY_OF_THE_VALLEY,
            MAGENTA_LILY_OF_THE_VALLEY,
            LIGHT_BLUE_LILY_OF_THE_VALLEY,
            YELLOW_LILY_OF_THE_VALLEY,
            LIME_LILY_OF_THE_VALLEY,
            PINK_LILY_OF_THE_VALLEY,
            GRAY_LILY_OF_THE_VALLEY,
            LIGHT_GRAY_LILY_OF_THE_VALLEY,
            CYAN_LILY_OF_THE_VALLEY,
            PURPLE_LILY_OF_THE_VALLEY,
            BLUE_LILY_OF_THE_VALLEY,
            BROWN_LILY_OF_THE_VALLEY,
            GREEN_LILY_OF_THE_VALLEY,
            RED_LILY_OF_THE_VALLEY,
            BLACK_LILY_OF_THE_VALLEY
    };
    public static final Block[] CORNFLOWERS = {
            WHITE_CORNFLOWER,
            ORANGE_CORNFLOWER,
            MAGENTA_CORNFLOWER,
            LIGHT_BLUE_CORNFLOWER,
            YELLOW_CORNFLOWER,
            LIME_CORNFLOWER,
            PINK_CORNFLOWER,
            GRAY_CORNFLOWER,
            LIGHT_GRAY_CORNFLOWER,
            CYAN_CORNFLOWER,
            PURPLE_CORNFLOWER,
            BLUE_CORNFLOWER,
            BROWN_CORNFLOWER,
            GREEN_CORNFLOWER,
            RED_CORNFLOWER,
            BLACK_CORNFLOWER
    };

    public static final Block[] SUNFLOWERS = {
            WHITE_SUNFLOWER,
            ORANGE_SUNFLOWER,
            MAGENTA_SUNFLOWER,
            LIGHT_BLUE_SUNFLOWER,
            YELLOW_SUNFLOWER,
            LIME_SUNFLOWER,
            PINK_SUNFLOWER,
            GRAY_SUNFLOWER,
            LIGHT_GRAY_SUNFLOWER,
            CYAN_SUNFLOWER,
            PURPLE_SUNFLOWER,
            BLUE_SUNFLOWER,
            BROWN_SUNFLOWER,
            GREEN_SUNFLOWER,
            RED_SUNFLOWER,
            BLACK_SUNFLOWER
    };

    public static final Block[] COLORED_FLOWERS = {
            WHITE_POPPY,
            ORANGE_POPPY,
            MAGENTA_POPPY,
            LIGHT_BLUE_POPPY,
            YELLOW_POPPY,
            LIME_POPPY,
            PINK_POPPY,
            GRAY_POPPY,
            LIGHT_GRAY_POPPY,
            CYAN_POPPY,
            PURPLE_POPPY,
            BLUE_POPPY,
            BROWN_POPPY,
            GREEN_POPPY,
            RED_POPPY,
            BLACK_POPPY,
            WHITE_DANDELION,
            ORANGE_DANDELION,
            MAGENTA_DANDELION,
            LIGHT_BLUE_DANDELION,
            YELLOW_DANDELION,
            LIME_DANDELION,
            PINK_DANDELION,
            GRAY_DANDELION,
            LIGHT_GRAY_DANDELION,
            CYAN_DANDELION,
            PURPLE_DANDELION,
            BLUE_DANDELION,
            BROWN_DANDELION,
            GREEN_DANDELION,
            RED_DANDELION,
            BLACK_DANDELION,
            WHITE_ALLIUM,
            ORANGE_ALLIUM,
            MAGENTA_ALLIUM,
            LIGHT_BLUE_ALLIUM,
            YELLOW_ALLIUM,
            LIME_ALLIUM,
            PINK_ALLIUM,
            GRAY_ALLIUM,
            LIGHT_GRAY_ALLIUM,
            CYAN_ALLIUM,
            PURPLE_ALLIUM,
            BLUE_ALLIUM,
            BROWN_ALLIUM,
            GREEN_ALLIUM,
            RED_ALLIUM,
            BLACK_ALLIUM,
            WHITE_CORNFLOWER,
            ORANGE_CORNFLOWER,
            MAGENTA_CORNFLOWER,
            LIGHT_BLUE_CORNFLOWER,
            YELLOW_CORNFLOWER,
            LIME_CORNFLOWER,
            PINK_CORNFLOWER,
            GRAY_CORNFLOWER,
            LIGHT_GRAY_CORNFLOWER,
            CYAN_CORNFLOWER,
            PURPLE_CORNFLOWER,
            BLUE_CORNFLOWER,
            BROWN_CORNFLOWER,
            GREEN_CORNFLOWER,
            RED_CORNFLOWER,
            BLACK_CORNFLOWER,
            WHITE_SUNFLOWER,
            ORANGE_SUNFLOWER,
            MAGENTA_SUNFLOWER,
            LIGHT_BLUE_SUNFLOWER,
            YELLOW_SUNFLOWER,
            LIME_SUNFLOWER,
            PINK_SUNFLOWER,
            GRAY_SUNFLOWER,
            LIGHT_GRAY_SUNFLOWER,
            CYAN_SUNFLOWER,
            PURPLE_SUNFLOWER,
            BLUE_SUNFLOWER,
            BROWN_SUNFLOWER,
            GREEN_SUNFLOWER,
            RED_SUNFLOWER,
            BLACK_SUNFLOWER,
            WHITE_LILY_OF_THE_VALLEY,
            ORANGE_LILY_OF_THE_VALLEY,
            MAGENTA_LILY_OF_THE_VALLEY,
            LIGHT_BLUE_LILY_OF_THE_VALLEY,
            YELLOW_LILY_OF_THE_VALLEY,
            LIME_LILY_OF_THE_VALLEY,
            PINK_LILY_OF_THE_VALLEY,
            GRAY_LILY_OF_THE_VALLEY,
            LIGHT_GRAY_LILY_OF_THE_VALLEY,
            CYAN_LILY_OF_THE_VALLEY,
            PURPLE_LILY_OF_THE_VALLEY,
            BLUE_LILY_OF_THE_VALLEY,
            BROWN_LILY_OF_THE_VALLEY,
            GREEN_LILY_OF_THE_VALLEY,
            RED_LILY_OF_THE_VALLEY,
            BLACK_LILY_OF_THE_VALLEY
    };

    private static Block registerFlower(String name, MapColor white) {
        return registerBlock(name,
            new FlowerBlock(StatusEffects.NIGHT_VISION,
                    5.0F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)));
    }

    private static Block registerDyeableFlower(String name, MapColor color) {
        return registerBlock(name,
            new DyeableFlowerBlock(color, StatusEffects.NIGHT_VISION,
                    5.0F,
                    AbstractBlock.Settings.create()
                            .mapColor(color)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)));
    }

    private static Block registerTallFlower(String name, MapColor color) {
        Block block = new DyeableTallFlowerBlock(color, AbstractBlock.Settings.create()
                .mapColor(color)
                .noCollision()
                .breakInstantly()
                .sounds(BlockSoundGroup.GRASS)
                .offset(AbstractBlock.OffsetType.XZ)
                .pistonBehavior(PistonBehavior.DESTROY));
        Registry.register(Registries.ITEM, Identifier.of(ColoredFoliage.MOD_ID, name),
                new TallBlockItem(block, new Item.Settings()));
        return Registry.register(Registries.BLOCK, Identifier.of(ColoredFoliage.MOD_ID, name), block);
    }


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ColoredFoliage.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ColoredFoliage.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBocks() {
        ColoredFoliage.LOGGER.info("Registering Colored for " + ColoredFoliage.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            for (var flower : ModBlocks.COLORED_FLOWERS) {
                entries.add(flower);
            }
        });
    }
}

