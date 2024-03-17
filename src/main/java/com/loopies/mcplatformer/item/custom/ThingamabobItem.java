package com.loopies.mcplatformer.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ThingamabobItem extends Item {
    public ThingamabobItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.sendMessage(Text.literal("FAGGOT"));

        Vec3d playerPos = playerEntity.getPos();
        world.createExplosion(playerEntity, playerPos.x, playerPos.y, playerPos.z, 4.0F, World.ExplosionSourceType.MOB);
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
