
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.ryorama.tstpcontent.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.ryorama.tstpcontent.TstpContentMod;

public class TstpContentModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TstpContentMod.MODID);
	public static final RegistryObject<SoundEvent> CRYSTAL_DESTROY = REGISTRY.register("crystal_destroy", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tstp_content", "crystal_destroy")));
	public static final RegistryObject<SoundEvent> DIG0 = REGISTRY.register("dig0", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tstp_content", "dig0")));
	public static final RegistryObject<SoundEvent> EAT = REGISTRY.register("eat", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tstp_content", "eat")));
	public static final RegistryObject<SoundEvent> GRASS = REGISTRY.register("grass", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tstp_content", "grass")));
	public static final RegistryObject<SoundEvent> HEALTH_CRYSTAL = REGISTRY.register("health_crystal", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tstp_content", "health_crystal")));
	public static final RegistryObject<SoundEvent> ICEHIT = REGISTRY.register("icehit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tstp_content", "icehit")));
	public static final RegistryObject<SoundEvent> SNOWHIT1 = REGISTRY.register("snowhit1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tstp_content", "snowhit1")));
	public static final RegistryObject<SoundEvent> TINK0 = REGISTRY.register("tink0", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tstp_content", "tink0")));
	public static final RegistryObject<SoundEvent> TINK1 = REGISTRY.register("tink1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tstp_content", "tink1")));
	public static final RegistryObject<SoundEvent> UNIVERSAL_COLLAPSE_EPIC = REGISTRY.register("universal_collapse_epic", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tstp_content", "universal_collapse_epic")));
}
