
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.souls_and_energy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.souls_and_energy.block.SoulOreBlock;
import net.mcreator.souls_and_energy.block.SoulBlockBlock;
import net.mcreator.souls_and_energy.block.LiquidManaBlock;
import net.mcreator.souls_and_energy.SoulsAndEnergyMod;

public class SoulsAndEnergyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SoulsAndEnergyMod.MODID);
	public static final RegistryObject<Block> LIQUID_MANA = REGISTRY.register("liquid_mana", () -> new LiquidManaBlock());
	public static final RegistryObject<Block> SOUL_ORE = REGISTRY.register("soul_ore", () -> new SoulOreBlock());
	public static final RegistryObject<Block> SOUL_BLOCK = REGISTRY.register("soul_block", () -> new SoulBlockBlock());
}
