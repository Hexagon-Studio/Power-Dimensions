
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.powerdimensions.init;

import power.powerdimensions.world.features.ores.CrystalYellowFeature;
import power.powerdimensions.world.features.ores.CrystalVioletFeature;
import power.powerdimensions.world.features.ores.CrystalRedFeature;
import power.powerdimensions.world.features.ores.CrystalPurpleFeature;
import power.powerdimensions.world.features.ores.CrystalPinkFeature;
import power.powerdimensions.world.features.ores.CrystalOrangeFeature;
import power.powerdimensions.world.features.ores.CrystalLimeFeature;
import power.powerdimensions.world.features.ores.CrystalLightBlueFeature;
import power.powerdimensions.world.features.ores.CrystalGreenFeature;
import power.powerdimensions.world.features.ores.CrystalGrayFeature;
import power.powerdimensions.world.features.ores.CrystalBrownFeature;
import power.powerdimensions.world.features.ores.CrystalBlueFeature;
import power.powerdimensions.PowerDimensionsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class PowerDimensionsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, PowerDimensionsMod.MODID);
	public static final RegistryObject<Feature<?>> CRYSTAL_BLUE = REGISTRY.register("crystal_blue", CrystalBlueFeature::feature);
	public static final RegistryObject<Feature<?>> CRYSTAL_BROWN = REGISTRY.register("crystal_brown", CrystalBrownFeature::feature);
	public static final RegistryObject<Feature<?>> CRYSTAL_GRAY = REGISTRY.register("crystal_gray", CrystalGrayFeature::feature);
	public static final RegistryObject<Feature<?>> CRYSTAL_GREEN = REGISTRY.register("crystal_green", CrystalGreenFeature::feature);
	public static final RegistryObject<Feature<?>> CRYSTAL_LIGHT_BLUE = REGISTRY.register("crystal_light_blue", CrystalLightBlueFeature::feature);
	public static final RegistryObject<Feature<?>> CRYSTAL_LIME = REGISTRY.register("crystal_lime", CrystalLimeFeature::feature);
	public static final RegistryObject<Feature<?>> CRYSTAL_ORANGE = REGISTRY.register("crystal_orange", CrystalOrangeFeature::feature);
	public static final RegistryObject<Feature<?>> CRYSTAL_PINK = REGISTRY.register("crystal_pink", CrystalPinkFeature::feature);
	public static final RegistryObject<Feature<?>> CRYSTAL_PURPLE = REGISTRY.register("crystal_purple", CrystalPurpleFeature::feature);
	public static final RegistryObject<Feature<?>> CRYSTAL_RED = REGISTRY.register("crystal_red", CrystalRedFeature::feature);
	public static final RegistryObject<Feature<?>> CRYSTAL_VIOLET = REGISTRY.register("crystal_violet", CrystalVioletFeature::feature);
	public static final RegistryObject<Feature<?>> CRYSTAL_YELLOW = REGISTRY.register("crystal_yellow", CrystalYellowFeature::feature);
}
