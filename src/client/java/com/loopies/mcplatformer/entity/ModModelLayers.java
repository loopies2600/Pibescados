package com.loopies.mcplatformer.entity;

import com.loopies.mcplatformer.Pibescados;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer WOBO =
            new EntityModelLayer(new Identifier(Pibescados.MOD_ID, "wobo"), "main");
}
