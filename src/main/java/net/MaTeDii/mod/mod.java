package net.MaTeDii.mod;

import net.MaTeDii.mod.block.ModBlocks;
import net.MaTeDii.mod.item.ModItems;
import net.MaTeDii.mod.item.ModItemsGroup;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class mod implements ModInitializer {

	public static final String MOD_ID = "mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
