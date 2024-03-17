package com.loopies.mcplatformer.entity;

import com.loopies.mcplatformer.Pibescados;
import com.loopies.mcplatformer.entity.custom.WoboEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<WoboEntity> WOBO = Registry.
            register(
                    Registries.ENTITY_TYPE,
                    new Identifier(Pibescados.MOD_ID, "wobo"),
                    FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, WoboEntity::new)
                            .dimensions(EntityDimensions.fixed(0.6f, 0.8f)).build());
}
