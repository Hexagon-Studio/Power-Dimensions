
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.powerdimensions.init;

import power.powerdimensions.item.SunnyKingdomItem;
import power.powerdimensions.item.OblivionItem;
import power.powerdimensions.item.CrystallizedItem;
import power.powerdimensions.PowerDimensionsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class PowerDimensionsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PowerDimensionsMod.MODID);
	public static final RegistryObject<Item> CRYSTALLIZED = REGISTRY.register("crystallized", () -> new CrystallizedItem());
	public static final RegistryObject<Item> OBLIVION = REGISTRY.register("oblivion", () -> new OblivionItem());
	public static final RegistryObject<Item> SUNNY_KINGDOM = REGISTRY.register("sunny_kingdom", () -> new SunnyKingdomItem());
}
