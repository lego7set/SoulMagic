
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.souls_and_energy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.souls_and_energy.item.SoulItem;
import net.mcreator.souls_and_energy.item.LiquidManaItem;
import net.mcreator.souls_and_energy.item.BaseStaffItem;
import net.mcreator.souls_and_energy.SoulsAndEnergyMod;

public class SoulsAndEnergyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SoulsAndEnergyMod.MODID);
	public static final RegistryObject<Item> SOUL = REGISTRY.register("soul", () -> new SoulItem());
	public static final RegistryObject<Item> LIQUID_MANA_BUCKET = REGISTRY.register("liquid_mana_bucket", () -> new LiquidManaItem());
	public static final RegistryObject<Item> BASE_STAFF = REGISTRY.register("base_staff", () -> new BaseStaffItem());
	public static final RegistryObject<Item> SOUL_ORE = block(SoulsAndEnergyModBlocks.SOUL_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SOUL_BLOCK = block(SoulsAndEnergyModBlocks.SOUL_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
