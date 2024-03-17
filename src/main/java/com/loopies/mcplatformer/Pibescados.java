package com.loopies.mcplatformer;

import com.loopies.mcplatformer.entity.ModEntities;
import com.loopies.mcplatformer.entity.custom.WoboEntity;
import com.loopies.mcplatformer.item.ModItemGroups;
import com.loopies.mcplatformer.item.ModItems;
import com.loopies.mcplatformer.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pibescados implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "pibescados";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItemGroups.registerItemGroups();
		ModItems.registerLoopiesItems();
		ModSounds.registerSoundEvents();

		FabricDefaultAttributeRegistry.register(ModEntities.WOBO, WoboEntity.createWoboAttributes());
		LOGGER.info(MOD_ID + " fully loaded!");
	}
}