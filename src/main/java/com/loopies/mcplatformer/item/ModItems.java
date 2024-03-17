package com.loopies.mcplatformer.item;

import com.loopies.mcplatformer.Pibescados;

import com.loopies.mcplatformer.entity.ModEntities;
import com.loopies.mcplatformer.item.custom.ThingamabobItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item THINGAMABOB = registerItem("thingamabob", new ThingamabobItem(new FabricItemSettings()));
    public static final Item WOBO_SPAWN_EGG = registerItem("wobo_spawn_egg",
            new SpawnEggItem(ModEntities.WOBO, 0x1BEF24, 0x116114, new FabricItemSettings()));
    private static void addItemsToSpawnEggsItemGroup(FabricItemGroupEntries entries) {
        //entries.add(THINGAMABOB);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Pibescados.MOD_ID, name), item);
    }
    public static void registerLoopiesItems() {
        Pibescados.LOGGER.info("Item registration start." + Pibescados.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(ModItems::addItemsToSpawnEggsItemGroup);
    }
}
