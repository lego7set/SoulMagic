
package net.mcreator.soul_magic.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.soul_magic.init.SoulMagicModItems;
import net.mcreator.soul_magic.init.SoulMagicModFluids;
import net.mcreator.soul_magic.init.SoulMagicModBlocks;

public abstract class LiquidManaFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(SoulMagicModFluids.LIQUID_MANA,
			SoulMagicModFluids.FLOWING_LIQUID_MANA,
			FluidAttributes.builder(new ResourceLocation("soul_magic:blocks/manastill"), new ResourceLocation("soul_magic:blocks/manaflow"))

					.gaseous()

	).explosionResistance(6900f)

			.bucket(SoulMagicModItems.LIQUID_MANA_BUCKET).block(() -> (LiquidBlock) SoulMagicModBlocks.LIQUID_MANA.get());

	private LiquidManaFluid() {
		super(PROPERTIES);
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(-1);
	}

	public static class Source extends LiquidManaFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LiquidManaFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
