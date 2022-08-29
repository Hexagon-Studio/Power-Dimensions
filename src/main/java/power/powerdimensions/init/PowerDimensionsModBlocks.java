
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.powerdimensions.init;

import power.powerdimensions.block.SunnyKingdomPortalBlock;
import power.powerdimensions.block.OblivionPortalBlock;
import power.powerdimensions.block.CrystallizedPortalBlock;
import power.powerdimensions.block.CrystalYellowBlock;
import power.powerdimensions.block.CrystalVioletBlock;
import power.powerdimensions.block.CrystalRedBlock;
import power.powerdimensions.block.CrystalPurpleBlock;
import power.powerdimensions.block.CrystalPinkBlock;
import power.powerdimensions.block.CrystalOrangeBlock;
import power.powerdimensions.block.CrystalLimeBlock;
import power.powerdimensions.block.CrystalLightBlueBlock;
import power.powerdimensions.block.CrystalGreenBlock;
import power.powerdimensions.block.CrystalGrayBlock;
import power.powerdimensions.block.CrystalBrownBlock;
import power.powerdimensions.block.CrystalBlueBlock;
import power.powerdimensions.PowerDimensionsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class PowerDimensionsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PowerDimensionsMod.MODID);
	public static final RegistryObject<Block> CRYSTALLIZED_PORTAL = REGISTRY.register("crystallized_portal", () -> new CrystallizedPortalBlock());
	public static final RegistryObject<Block> OBLIVION_PORTAL = REGISTRY.register("oblivion_portal", () -> new OblivionPortalBlock());
	public static final RegistryObject<Block> SUNNY_KINGDOM_PORTAL = REGISTRY.register("sunny_kingdom_portal", () -> new SunnyKingdomPortalBlock());
	public static final RegistryObject<Block> CRYSTAL_BLUE = REGISTRY.register("crystal_blue", () -> new CrystalBlueBlock());
	public static final RegistryObject<Block> CRYSTAL_BROWN = REGISTRY.register("crystal_brown", () -> new CrystalBrownBlock());
	public static final RegistryObject<Block> CRYSTAL_GRAY = REGISTRY.register("crystal_gray", () -> new CrystalGrayBlock());
	public static final RegistryObject<Block> CRYSTAL_GREEN = REGISTRY.register("crystal_green", () -> new CrystalGreenBlock());
	public static final RegistryObject<Block> CRYSTAL_LIGHT_BLUE = REGISTRY.register("crystal_light_blue", () -> new CrystalLightBlueBlock());
	public static final RegistryObject<Block> CRYSTAL_LIME = REGISTRY.register("crystal_lime", () -> new CrystalLimeBlock());
	public static final RegistryObject<Block> CRYSTAL_ORANGE = REGISTRY.register("crystal_orange", () -> new CrystalOrangeBlock());
	public static final RegistryObject<Block> CRYSTAL_PINK = REGISTRY.register("crystal_pink", () -> new CrystalPinkBlock());
	public static final RegistryObject<Block> CRYSTAL_PURPLE = REGISTRY.register("crystal_purple", () -> new CrystalPurpleBlock());
	public static final RegistryObject<Block> CRYSTAL_RED = REGISTRY.register("crystal_red", () -> new CrystalRedBlock());
	public static final RegistryObject<Block> CRYSTAL_VIOLET = REGISTRY.register("crystal_violet", () -> new CrystalVioletBlock());
	public static final RegistryObject<Block> CRYSTAL_YELLOW = REGISTRY.register("crystal_yellow", () -> new CrystalYellowBlock());
}
