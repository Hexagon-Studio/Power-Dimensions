
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.powerdimensions.init;

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

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
