package net.slyzoo.moremetals;

import net.fabricmc.api.ModInitializer;

import net.slyzoo.moremetals.block.ModBlocks;
import net.slyzoo.moremetals.item.ModItemGroups;
import net.slyzoo.moremetals.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Moremetals implements ModInitializer {
	public static final String MOD_ID = "moremetals";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}