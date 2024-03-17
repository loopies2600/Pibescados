package com.loopies.mcplatformer.entity.custom;

import com.loopies.mcplatformer.sound.ModSounds;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.entity.passive.HorseEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class WoboEntity extends HostileEntity {
    public final AnimationState idleAnimState = new AnimationState();
    private int idleAnimTimeout = 0;

    public WoboEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }
    public float scale = 1.0f;

    private void updateAnimations() {
        if (this.idleAnimTimeout <= 0) {
            this.idleAnimTimeout = this.random.nextInt(40) + 80;
            this.idleAnimState.start(this.age);
        } else {
            --this.idleAnimTimeout;
        }
    }

    @Override
    protected void updateLimbs(float posDelta) {
        float f = this.getPose() == EntityPose.STANDING ? Math.min(posDelta * 6.0f, 1.0f) : 0.0f;
        this.limbAnimator.updateLimbs(f, 0.2f);
    }

    @Override
    public void tick() {
        super.tick();

        if (this.getWorld().isClient()) {
            updateAnimations();
        }
    }
    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(4, new WanderAroundFarGoal(this, 1.0));
        this.goalSelector.add(5, new LookAtEntityGoal(this, PlayerEntity.class, 16));
        this.goalSelector.add(6, new LookAroundGoal(this));
        this.initCustomGoals();
    }

    protected void initCustomGoals() {
        this.goalSelector.add(4, new AttackGoal(this));
        this.targetSelector.add(1, new ActiveTargetGoal<WolfEntity>((MobEntity)this, WolfEntity.class, true));
        this.targetSelector.add(1, new ActiveTargetGoal<HorseEntity>((MobEntity)this, HorseEntity.class, true));
        this.targetSelector.add(2, new ActiveTargetGoal<PlayerEntity>((MobEntity)this, PlayerEntity.class, true));
    }

    public static DefaultAttributeContainer.Builder createWoboAttributes() {
        return HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 36.0)
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 30)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.23f)
                .add(EntityAttributes.GENERIC_ARMOR, 0.75f)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 4);
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return ModSounds.WOBO_AMBIENT;
    }
}
