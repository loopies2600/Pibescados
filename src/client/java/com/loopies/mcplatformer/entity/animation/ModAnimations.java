package com.loopies.mcplatformer.entity.animation;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;
import net.minecraft.client.render.entity.animation.Transformation.Interpolations;

public class ModAnimations {
    public static final Animation WOBO_GRIDDY = Animation.Builder.create(1.375f).looping()
            .addBoneAnimation("torso",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(12.5f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(5f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.875f, AnimationHelper.createRotationalVector(12.5f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(1.0416767f, AnimationHelper.createRotationalVector(5f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(1.375f, AnimationHelper.createRotationalVector(12.5f, 0f, 0f),
                                    Interpolations.CUBIC)))
            .addBoneAnimation("head",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-7.5f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.875f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(1.0416767f, AnimationHelper.createRotationalVector(-7.5f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(1.375f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Interpolations.CUBIC)))
            .addBoneAnimation("leftarm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(37.5f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-112.5f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.875f, AnimationHelper.createRotationalVector(37.5f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(1.0416767f, AnimationHelper.createRotationalVector(-112.5f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(1.375f, AnimationHelper.createRotationalVector(37.5f, 0f, 0f),
                                    Interpolations.CUBIC)))
            .addBoneAnimation("rightarm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(37.5f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-122.5f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.875f, AnimationHelper.createRotationalVector(37.5f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(1.0416767f, AnimationHelper.createRotationalVector(-122.5f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(1.375f, AnimationHelper.createRotationalVector(37.5f, 0f, 0f),
                                    Interpolations.CUBIC))).build();
    public static final Animation WOBO_IDLE = Animation.Builder.create(2f).looping()
            .addBoneAnimation("leftarm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0.08343333f, AnimationHelper.createRotationalVector(0f, 0f, -5f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.875f, AnimationHelper.createRotationalVector(0f, 0f, 2.5f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.9167667f, AnimationHelper.createRotationalVector(0f, 0f, -5f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("rightarm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 5f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.0834333f, AnimationHelper.createRotationalVector(0f, 0f, -2.5f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(2f, AnimationHelper.createRotationalVector(0f, 0f, 5f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("torso",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0.25f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(2f, AnimationHelper.createTranslationalVector(0f, 0.25f, 0f),
                                    Transformation.Interpolations.LINEAR))).build();
    public static final Animation WOBO_WALK = Animation.Builder.create(1f).looping()
            .addBoneAnimation("body",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, -5f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(0f, 0f, 5f),
                                    Interpolations.CUBIC),
                            new Keyframe(1f, AnimationHelper.createRotationalVector(0f, 0f, -5f),
                                    Interpolations.CUBIC)))
            .addBoneAnimation("body",
                    new Transformation(Transformation.Targets.SCALE,
                            new Keyframe(0f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.25f, AnimationHelper.createScalingVector(1f, 0.97f, 1f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createScalingVector(1f, 1.08f, 1f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.75f, AnimationHelper.createScalingVector(1f, 0.98f, 1f),
                                    Interpolations.CUBIC),
                            new Keyframe(1f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                    Interpolations.CUBIC)))
            .addBoneAnimation("torso",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(7.5f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-7.5f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(1f, AnimationHelper.createRotationalVector(7.5f, 0f, 0f),
                                    Interpolations.CUBIC)))
            .addBoneAnimation("leftleg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-45f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(45f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(1f, AnimationHelper.createRotationalVector(-45f, 0f, 0f),
                                    Interpolations.CUBIC)))
            .addBoneAnimation("rightleg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(40f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-50f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(1f, AnimationHelper.createRotationalVector(40f, 0f, 0f),
                                    Interpolations.CUBIC)))
            .addBoneAnimation("leftarm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(45f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-45f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(1f, AnimationHelper.createRotationalVector(45f, 0f, 0f),
                                    Interpolations.CUBIC)))
            .addBoneAnimation("rightarm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-45f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(45f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(1f, AnimationHelper.createRotationalVector(-45f, 0f, 0f),
                                    Interpolations.CUBIC))).build();
    public static final Animation WOBO_CHASE = Animation.Builder.create(0.5f).looping()
            .addBoneAnimation("torso",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(-12.5f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                                    Interpolations.CUBIC)))
            .addBoneAnimation("leftleg",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, -2f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.25f, AnimationHelper.createTranslationalVector(0f, 0f, 2f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createTranslationalVector(0f, 0f, -2f),
                                    Interpolations.CUBIC)))
            .addBoneAnimation("leftleg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-45f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(50f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-45f, 0f, 0f),
                                    Interpolations.CUBIC)))
            .addBoneAnimation("rightleg",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 2f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.25f, AnimationHelper.createTranslationalVector(0f, 0f, -2f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createTranslationalVector(0f, 0f, 2f),
                                    Interpolations.CUBIC)))
            .addBoneAnimation("rightleg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(45f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(-45f, 0f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(45f, 0f, 0f),
                                    Interpolations.CUBIC)))
            .addBoneAnimation("leftarm",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 1f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createTranslationalVector(0f, 1f, 0f),
                                    Interpolations.CUBIC)))
            .addBoneAnimation("leftarm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-202.5f, 0f, -5f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(-214.9f, 2.87f, -0.9f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-202.5f, 0f, -5f),
                                    Interpolations.CUBIC)))
            .addBoneAnimation("rightarm",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 1f, 0f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createTranslationalVector(0f, 1f, 0f),
                                    Interpolations.CUBIC)))
            .addBoneAnimation("rightarm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-202.5f, 0f, 5f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(-209.79f, -3.74f, -1.5f),
                                    Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-202.5f, 0f, 5f),
                                    Interpolations.CUBIC))).build();
}
