package de.shadowdara.offroadcars;

import de.shadowdara.offroadcars.item.ModItemGroups;
import de.shadowdara.offroadcars.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OffroadCars implements ModInitializer {
	public static final String MOD_ID = "offroadcars";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        LOGGER.info("Loading Offroad Cars");

        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
	}
}
