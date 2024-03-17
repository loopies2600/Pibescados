package com.loopies.mcplatformer.item;

import com.loopies.mcplatformer.Pibescados;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup WHIMSY_ITEMS = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(Pibescados.MOD_ID, "whimsy_items"),
            FabricItemGroup
                    .builder()
                    .displayName(Text.translatable("itemgroup.whimsy_items"))
                    .icon(() -> new ItemStack(ModItems.THINGAMABOB)).entries((displayContext, entries) -> {
                        entries.add(ModItems.THINGAMABOB);
                        entries.add(ModItems.WOBO_SPAWN_EGG);
                    }).build());

    public static void registerItemGroups() {
        Pibescados.LOGGER.info(Pibescados.MOD_ID + " item group registration start.");
    }
}
