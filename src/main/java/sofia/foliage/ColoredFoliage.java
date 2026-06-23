package sofia.foliage;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sofia.foliage.block.ModBlocks;
import sofia.foliage.item.ModItemGroups;
import sofia.foliage.item.ModItems;


public class ColoredFoliage implements ModInitializer {
	public static final String MOD_ID = "colored-foliage";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Colored foliage initialized");
		ModBlocks.registerModBocks();
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}
