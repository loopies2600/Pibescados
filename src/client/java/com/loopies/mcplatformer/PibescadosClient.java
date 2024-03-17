package com.loopies.mcplatformer;

import com.loopies.mcplatformer.entity.ModEntities;
import com.loopies.mcplatformer.entity.ModModelLayers;
import com.loopies.mcplatformer.entity.WoboEntityModel;
import com.loopies.mcplatformer.entity.WoboRenderer;
import net.fabricmc.api.ClientModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class PibescadosClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		EntityRendererRegistry.register(ModEntities.WOBO, WoboRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.WOBO, WoboEntityModel::getTexturedModelData);

		Pibescados.LOGGER.info("CLIENT SIDE ready.");
	}
}