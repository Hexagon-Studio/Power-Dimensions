
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.powerdimensions.init;

import power.powerdimensions.world.biome.SunPlainsBiome;
import power.powerdimensions.world.biome.SunOceanBiome;
import power.powerdimensions.world.biome.SunForestBiome;
import power.powerdimensions.world.biome.OblivionPlainsBiome;
import power.powerdimensions.world.biome.OblivionForestBiome;
import power.powerdimensions.world.biome.OblivionDesertBiome;
import power.powerdimensions.world.biome.CrystallizedLandsBiome;
import power.powerdimensions.world.biome.CrystallizedForestBiome;
import power.powerdimensions.PowerDimensionsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

public class PowerDimensionsModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, PowerDimensionsMod.MODID);
	public static final RegistryObject<Biome> CRYSTALLIZED_LANDS = REGISTRY.register("crystallized_lands",
			() -> CrystallizedLandsBiome.createBiome());
	public static final RegistryObject<Biome> OBLIVION_FOREST = REGISTRY.register("oblivion_forest", () -> OblivionForestBiome.createBiome());
	public static final RegistryObject<Biome> OBLIVION_PLAINS = REGISTRY.register("oblivion_plains", () -> OblivionPlainsBiome.createBiome());
	public static final RegistryObject<Biome> OBLIVION_DESERT = REGISTRY.register("oblivion_desert", () -> OblivionDesertBiome.createBiome());
	public static final RegistryObject<Biome> CRYSTALLIZED_FOREST = REGISTRY.register("crystallized_forest",
			() -> CrystallizedForestBiome.createBiome());
	public static final RegistryObject<Biome> SUN_PLAINS = REGISTRY.register("sun_plains", () -> SunPlainsBiome.createBiome());
	public static final RegistryObject<Biome> SUN_FOREST = REGISTRY.register("sun_forest", () -> SunForestBiome.createBiome());
	public static final RegistryObject<Biome> SUN_OCEAN = REGISTRY.register("sun_ocean", () -> SunOceanBiome.createBiome());
}
