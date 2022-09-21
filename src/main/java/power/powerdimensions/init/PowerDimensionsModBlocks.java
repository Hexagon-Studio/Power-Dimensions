
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.powerdimensions.init;

import power.powerdimensions.block.SunnyKingdomPortalBlock;
import power.powerdimensions.block.OblivionPortalBlock;
import power.powerdimensions.block.CrystallizedPortalBlock;
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
}
