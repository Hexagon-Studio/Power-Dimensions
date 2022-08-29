
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.powerdimensions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerDimensionsModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("power_dimensions", "stone_deactivation"),
				new SoundEvent(new ResourceLocation("power_dimensions", "stone_deactivation")));
		REGISTRY.put(new ResourceLocation("power_dimensions", "powerful_stone"),
				new SoundEvent(new ResourceLocation("power_dimensions", "powerful_stone")));
		REGISTRY.put(new ResourceLocation("power_dimensions", "tyrannosaurus_rex.hurt"),
				new SoundEvent(new ResourceLocation("power_dimensions", "tyrannosaurus_rex.hurt")));
		REGISTRY.put(new ResourceLocation("power_dimensions", "tyrannosaurus_rex.dead"),
				new SoundEvent(new ResourceLocation("power_dimensions", "tyrannosaurus_rex.dead")));
		REGISTRY.put(new ResourceLocation("power_dimensions", "raptor.dead"),
				new SoundEvent(new ResourceLocation("power_dimensions", "raptor.dead")));
		REGISTRY.put(new ResourceLocation("power_dimensions", "raptor.hurt"),
				new SoundEvent(new ResourceLocation("power_dimensions", "raptor.hurt")));
		REGISTRY.put(new ResourceLocation("power_dimensions", "time_power"), new SoundEvent(new ResourceLocation("power_dimensions", "time_power")));
		REGISTRY.put(new ResourceLocation("power_dimensions", "music1"), new SoundEvent(new ResourceLocation("power_dimensions", "music1")));
		REGISTRY.put(new ResourceLocation("power_dimensions", "music2"), new SoundEvent(new ResourceLocation("power_dimensions", "music2")));
		REGISTRY.put(new ResourceLocation("power_dimensions", "music3"), new SoundEvent(new ResourceLocation("power_dimensions", "music3")));
		REGISTRY.put(new ResourceLocation("power_dimensions", "music4"), new SoundEvent(new ResourceLocation("power_dimensions", "music4")));
		REGISTRY.put(new ResourceLocation("power_dimensions", "music5"), new SoundEvent(new ResourceLocation("power_dimensions", "music5")));
		REGISTRY.put(new ResourceLocation("power_dimensions", "music6"), new SoundEvent(new ResourceLocation("power_dimensions", "music6")));
		REGISTRY.put(new ResourceLocation("power_dimensions", "music7"), new SoundEvent(new ResourceLocation("power_dimensions", "music7")));
		REGISTRY.put(new ResourceLocation("power_dimensions", "music8"), new SoundEvent(new ResourceLocation("power_dimensions", "music8")));
		REGISTRY.put(new ResourceLocation("power_dimensions", "music9"), new SoundEvent(new ResourceLocation("power_dimensions", "music9")));
		REGISTRY.put(new ResourceLocation("power_dimensions", "music10"), new SoundEvent(new ResourceLocation("power_dimensions", "music10")));
		REGISTRY.put(new ResourceLocation("power_dimensions", "stone_activation"),
				new SoundEvent(new ResourceLocation("power_dimensions", "stone_activation")));
		REGISTRY.put(new ResourceLocation("power_dimensions", "rocket.fly"), new SoundEvent(new ResourceLocation("power_dimensions", "rocket.fly")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
