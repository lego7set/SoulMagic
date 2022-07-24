
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.soul_magic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.soul_magic.item.SoulItem;
import net.mcreator.soul_magic.item.LiquidManaItem;
import net.mcreator.soul_magic.item.BaseStaffItem;
import net.mcreator.soul_magic.SoulMagicMod;

public class SoulMagicModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SoulMagicMod.MODID);
	public static final RegistryObject<Item> SOUL = REGISTRY.register("soul", () -> new SoulItem());
	public static final RegistryObject<Item> LIQUID_MANA_BUCKET = REGISTRY.register("liquid_mana_bucket", () -> new LiquidManaItem());
	public static final RegistryObject<Item> BASE_STAFF = REGISTRY.register("base_staff", () -> new BaseStaffItem());
	public static final RegistryObject<Item> SOUL_ORE = block(SoulMagicModBlocks.SOUL_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SOUL_BLOCK = block(SoulMagicModBlocks.SOUL_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
