
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.soul_magic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.soul_magic.item.LiquidManaItem;
import net.mcreator.soul_magic.SoulMagicMod;

public class SoulMagicModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SoulMagicMod.MODID);
	public static final RegistryObject<Item> LIQUID_MANA_BUCKET = REGISTRY.register("liquid_mana_bucket", () -> new LiquidManaItem());
}
