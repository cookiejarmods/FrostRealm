package baguchan.frostrealm.world.gen;

import baguchan.frostrealm.FrostRealm;
import baguchan.frostrealm.registry.FrostBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

import java.util.OptionalInt;

public class FrostTreeFeatures {

	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FROST_TREE = FeatureUtils.register(prefix("frostroot_tree"), Feature.TREE, createFrostRoot().build());
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FROST_TREE_BIG = FeatureUtils.register(prefix("frostroot_tree_big"), Feature.TREE, createFancyFrostRoot().build());
	public static String prefix(String name) {
		return FrostRealm.MODID + ":" + name;
	}


	private static TreeConfiguration.TreeConfigurationBuilder createStraightBlobTree(Block p_195147_, Block p_195148_, int p_195149_, int p_195150_, int p_195151_, int p_195152_) {
		return new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(p_195147_), new StraightTrunkPlacer(p_195149_, p_195150_, p_195151_), BlockStateProvider.simple(p_195148_), new BlobFoliagePlacer(ConstantInt.of(p_195152_), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1));
	}

	private static TreeConfiguration.TreeConfigurationBuilder createFrostRoot() {
		return createStraightBlobTree(FrostBlocks.FROSTROOT_LOG.get(), FrostBlocks.FROSTROOT_LEAVES.get(), 4, 2, 0, 2).ignoreVines().dirt(BlockStateProvider.simple(FrostBlocks.FROZEN_DIRT.get()));
	}


	private static TreeConfiguration.TreeConfigurationBuilder createFancyFrostRoot() {
		return (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(FrostBlocks.FROSTROOT_LOG.get()), new FancyTrunkPlacer(3, 11, 0), BlockStateProvider.simple(FrostBlocks.FROSTROOT_LEAVES.get()), new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines().dirt(BlockStateProvider.simple(FrostBlocks.FROZEN_DIRT.get()));
	}

	public static void init() {

	}
}
