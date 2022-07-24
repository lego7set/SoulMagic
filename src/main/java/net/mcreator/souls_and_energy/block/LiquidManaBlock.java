
package net.mcreator.souls_and_energy.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.souls_and_energy.init.SoulsAndEnergyModFluids;

public class LiquidManaBlock extends LiquidBlock {
	public LiquidManaBlock() {
		super(() -> (FlowingFluid) SoulsAndEnergyModFluids.LIQUID_MANA.get(), BlockBehaviour.Properties.of(Material.WATER).strength(6900f)
				.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)

		);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
