
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.powerdimensions.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PowerDimensionsModTabs {
	public static CreativeModeTab TAB_DIMENSIONS;

	public static void load() {
		TAB_DIMENSIONS = new CreativeModeTab("tabdimensions") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerDimensionsModItems.CRYSTALLIZED.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
