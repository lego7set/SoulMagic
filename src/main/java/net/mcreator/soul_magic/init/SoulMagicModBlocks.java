
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.soul_magic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.soul_magic.block.LiquidManaBlock;
import net.mcreator.soul_magic.SoulMagicMod;

public class SoulMagicModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SoulMagicMod.MODID);
	public static final RegistryObject<Block> LIQUID_MANA = REGISTRY.register("liquid_mana", () -> new LiquidManaBlock());
}
