
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.soul_magic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.soul_magic.fluid.LiquidManaFluid;
import net.mcreator.soul_magic.SoulMagicMod;

public class SoulMagicModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, SoulMagicMod.MODID);
	public static final RegistryObject<Fluid> LIQUID_MANA = REGISTRY.register("liquid_mana", () -> new LiquidManaFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_LIQUID_MANA = REGISTRY.register("flowing_liquid_mana", () -> new LiquidManaFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(LIQUID_MANA.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIQUID_MANA.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
