
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.powerdimensions.init;

import power.powerdimensions.item.SunnyKingdomItem;
import power.powerdimensions.item.OblivionItem;
import power.powerdimensions.item.CrystallizedItem;
import power.powerdimensions.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class PowerModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PowerMod.MODID);
	public static final RegistryObject<Item> CRYSTALLIZED = REGISTRY.register("crystallized", () -> new CrystallizedItem());
	public static final RegistryObject<Item> OBLIVION = REGISTRY.register("oblivion", () -> new OblivionItem());
	public static final RegistryObject<Item> SUNNY_KINGDOM = REGISTRY.register("sunny_kingdom", () -> new SunnyKingdomItem());
	public static final RegistryObject<Item> CRYSTAL_BLUE = block(PowerModBlocks.CRYSTAL_BLUE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CRYSTAL_BROWN = block(PowerModBlocks.CRYSTAL_BROWN, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CRYSTAL_GRAY = block(PowerModBlocks.CRYSTAL_GRAY, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CRYSTAL_GREEN = block(PowerModBlocks.CRYSTAL_GREEN, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CRYSTAL_LIGHT_BLUE = block(PowerModBlocks.CRYSTAL_LIGHT_BLUE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CRYSTAL_LIME = block(PowerModBlocks.CRYSTAL_LIME, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CRYSTAL_ORANGE = block(PowerModBlocks.CRYSTAL_ORANGE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CRYSTAL_PINK = block(PowerModBlocks.CRYSTAL_PINK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CRYSTAL_PURPLE = block(PowerModBlocks.CRYSTAL_PURPLE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CRYSTAL_RED = block(PowerModBlocks.CRYSTAL_RED, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CRYSTAL_VIOLET = block(PowerModBlocks.CRYSTAL_VIOLET, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CRYSTAL_YELLOW = block(PowerModBlocks.CRYSTAL_YELLOW, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
