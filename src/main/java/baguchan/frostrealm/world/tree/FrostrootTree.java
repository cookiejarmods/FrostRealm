package baguchan.frostrealm.world.tree;

import baguchan.frostrealm.world.gen.FrostTreeFeatures;
import net.minecraft.core.Holder;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import javax.annotation.Nullable;

public class FrostrootTree extends AbstractTreeGrower {
	@Nullable
	@Override
	protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource p_60014_, boolean p_60015_) {
		return p_60014_.nextInt(8) == 0 ? FrostTreeFeatures.FROST_TREE_BIG : FrostTreeFeatures.FROST_TREE;
	}
}
