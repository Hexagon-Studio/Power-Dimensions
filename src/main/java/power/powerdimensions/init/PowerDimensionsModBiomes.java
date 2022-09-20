
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.powerdimensions.init;

import power.powerdimensions.world.biome.SunPlainsBiome;
import power.powerdimensions.world.biome.OblivionPlainsBiome;
import power.powerdimensions.world.biome.OblivionForestBiome;
import power.powerdimensions.world.biome.OblivionDesertBiome;
import power.powerdimensions.world.biome.CrystallizedLandsBiome;
import power.powerdimensions.world.biome.CrystallizedForestBiome;
import power.powerdimensions.PowerDimensionsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.WorldGenSettings;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import com.mojang.datafixers.util.Pair;

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

	@SubscribeEvent
	public static void onServerAboutToStart(ServerAboutToStartEvent event) {
		MinecraftServer server = event.getServer();
		Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registry.DIMENSION_TYPE_REGISTRY);
		Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY);
		WorldGenSettings worldGenSettings = server.getWorldData().worldGenSettings();
		for (Map.Entry<ResourceKey<LevelStem>, LevelStem> entry : worldGenSettings.dimensions().entrySet()) {
			DimensionType dimensionType = entry.getValue().typeHolder().value();
			if (dimensionType == dimensionTypeRegistry.getOrThrow(BuiltinDimensionTypes.OVERWORLD)) {
				ChunkGenerator chunkGenerator = entry.getValue().generator();
				// Inject biomes to biome source
				if (chunkGenerator.getBiomeSource() instanceof MultiNoiseBiomeSource noiseSource) {
					List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters.values());
					parameters.add(new Pair<>(SunPlainsBiome.PARAMETER_POINT,
							biomeRegistry.getOrCreateHolderOrThrow(ResourceKey.create(Registry.BIOME_REGISTRY, SUN_PLAINS.getId()))));

					chunkGenerator.biomeSource = new MultiNoiseBiomeSource(new Climate.ParameterList<>(parameters), noiseSource.preset);
				}
				// Inject surface rules
				if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
					NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
					SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
					if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
						List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(sequenceRuleSource.sequence());
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, SUN_PLAINS.getId()),
								Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState(), Blocks.SAND.defaultBlockState()));
						NoiseGeneratorSettings moddedNoiseGeneratorSettings = new NoiseGeneratorSettings(noiseGeneratorSettings.noiseSettings(),
								noiseGeneratorSettings.defaultBlock(), noiseGeneratorSettings.defaultFluid(), noiseGeneratorSettings.noiseRouter(),
								SurfaceRules.sequence(surfaceRules.toArray(i -> new SurfaceRules.RuleSource[i])),
								noiseGeneratorSettings.spawnTarget(), noiseGeneratorSettings.seaLevel(),
								noiseGeneratorSettings.disableMobGeneration(), noiseGeneratorSettings.aquifersEnabled(),
								noiseGeneratorSettings.oreVeinsEnabled(), noiseGeneratorSettings.useLegacyRandomSource());
						noiseGenerator.settings = new Holder.Direct(moddedNoiseGeneratorSettings);
					}
				}
			}

		}
	}

	private static SurfaceRules.RuleSource preliminarySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock,
			BlockState underwaterBlock) {
		return SurfaceRules
				.ifTrue(SurfaceRules.isBiome(biomeKey),
						SurfaceRules
								.ifTrue(SurfaceRules.abovePreliminarySurface(),
										SurfaceRules.sequence(
												SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
														SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0),
																SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock))),
												SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR),
														SurfaceRules.state(undergroundBlock)))));
	}
}
