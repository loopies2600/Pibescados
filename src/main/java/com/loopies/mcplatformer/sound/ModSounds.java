package com.loopies.mcplatformer.sound;

import com.loopies.mcplatformer.Pibescados;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final Identifier WOBO_AMBIENT_ID = new Identifier(Pibescados.MOD_ID, "wobo_ambient");
    public static SoundEvent WOBO_AMBIENT = SoundEvent.of(WOBO_AMBIENT_ID);

    public static void registerSoundEvents() {
        Registry.register(Registries.SOUND_EVENT, Pibescados.MOD_ID, WOBO_AMBIENT);
    }
}
