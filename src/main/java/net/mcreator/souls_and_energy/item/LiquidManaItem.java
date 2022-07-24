
package net.mcreator.souls_and_energy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.souls_and_energy.init.SoulsAndEnergyModFluids;

public class LiquidManaItem extends BucketItem {
	public LiquidManaItem() {
		super(SoulsAndEnergyModFluids.LIQUID_MANA,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
