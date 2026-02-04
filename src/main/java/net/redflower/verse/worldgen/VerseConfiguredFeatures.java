package net.redflower.verse.worldgen;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.VegetationPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.redflower.verse.VERSE;
import net.redflower.verse.block.VerseBlocks;
import net.redflower.verse.util.VerseTags;

import java.util.List;

public class VerseConfiguredFeatures {


    //Overworld
    //Ores
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZ_ORE_KEY = registerKey("overworld_quartz_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_AMBER_ORE_KEY = registerKey("overworld_amber_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BOSKALT_ORE_KEY = registerKey("overworld_boskalt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE_KEY = registerKey("overworld_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GARNET_ORE_KEY = registerKey("overworld_garnet_ore");

    //Compressed Ores
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COMPRESSED_COAL_ORE_KEY = registerKey("overworld_compressed_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COMPRESSED_COPPER_ORE_KEY = registerKey("overworld_compressed_copper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COMPRESSED_IRON_ORE_KEY = registerKey("overworld_compressed_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COMPRESSED_GOLD_ORE_KEY = registerKey("overworld_compressed_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COMPRESSED_REDSTONE_ORE_KEY = registerKey("overworld_compressed_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COMPRESSED_EMERALD_ORE_KEY = registerKey("overworld_compressed_emerald_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COMPRESSED_LAPIS_ORE_KEY = registerKey("overworld_compressed_lapis_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COMPRESSED_DIAMOND_ORE_KEY = registerKey("overworld_compressed_diamond_ore");

    //End
    //Ores
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_DRAGONRITE_ORE_KEY = registerKey("end_dragonrite_ore");

    //Miners Dream
    //Dirty Caves
    public static final ResourceKey<ConfiguredFeature<?, ?>> TOP_LAYER_SILT = registerKey("top_layer_silt");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILT_BLOB = registerKey("silt_blob");

    //Limestone Caves
    public static final ResourceKey<ConfiguredFeature<?, ?>> TOP_LAYER_LIMESTONE = registerKey("top_layer_limestone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIMESTONE_BLOB = registerKey("limestone_blob");

    //Marble Caves
    public static final ResourceKey<ConfiguredFeature<?, ?>> TOP_LAYER_MARBLE = registerKey("top_layer_marble");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MARBLE_BLOB = registerKey("marble_blob");

    //Mystical Caves
    public static final ResourceKey<ConfiguredFeature<?, ?>> TOP_LAYER_MILVI = registerKey("top_layer_milvi");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MILVI_BLOB = registerKey("milvi_blob");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MILVI_CRYSTAL = registerKey("milvi_crystal");

    //Ores
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINERS_DREAM_COAL_ORE = registerKey("miners_dream_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINERS_DREAM_IRON_ORE = registerKey("miners_dream_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINERS_DREAM_BOSKALT_ORE = registerKey("miners_dream_boskalt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINERS_DREAM_COPPER_ORE = registerKey("miners_dream_copper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINERS_DREAM_QUARTZ_ORE = registerKey("miners_dream_quartz_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINERS_DREAM_GOLD_ORE = registerKey("miners_dream_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINERS_DREAM_REDSTONE_ORE = registerKey("miners_dream_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINERS_DREAM_EMERALD_ORE = registerKey("miners_dream_emerald_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINERS_DREAM_LAPIS_ORE = registerKey("miners_dream_lapis_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINERS_DREAM_AMBER_ORE = registerKey("miners_dream_amber_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINERS_DREAM_DIAMOND_ORE = registerKey("miners_dream_diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINERS_DREAM_GARNET_ORE = registerKey("miners_dream_garnet_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINERS_DREAM_SAPPHIRE_ORE = registerKey("miners_dream_sapphire_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        //What Blocks Get Replaced
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest endstoneReplaceables = new BlockMatchTest(Blocks.END_STONE);
        RuleTest darkStoneReplaceables = new BlockMatchTest(VerseBlocks.DARK_STONE.get());
        RuleTest limestoneReplaceables = new BlockMatchTest(VerseBlocks.LIMESTONE.get());
        RuleTest marbleReplaceables = new BlockMatchTest(VerseBlocks.MARBLE.get());

        //Overworld Ores Setup Blocks
        List<OreConfiguration.TargetBlockState> overworldQuartzOres = List.of(
                OreConfiguration.target(stoneReplaceables, VerseBlocks.QUARTZ_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, VerseBlocks.DEEPSLATE_QUARTZ_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldAmberOres = List.of(
                OreConfiguration.target(stoneReplaceables, VerseBlocks.AMBER_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, VerseBlocks.DEEPSLATE_AMBER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldBoskaltOres = List.of(
                OreConfiguration.target(stoneReplaceables, VerseBlocks.BOSKALT_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, VerseBlocks.DEEPSLATE_BOSKALT_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldSapphireOres = List.of(
                OreConfiguration.target(stoneReplaceables, VerseBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, VerseBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldGarnetOres = List.of(
                OreConfiguration.target(stoneReplaceables, VerseBlocks.GARNET_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, VerseBlocks.DEEPSLATE_GARNET_ORE.get().defaultBlockState()));

        //Overworld Compressed Setup Blocks
        List<OreConfiguration.TargetBlockState> overworldCompressedCoalOres = List.of(
                OreConfiguration.target(stoneReplaceables, VerseBlocks.COMPRESSED_COAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, VerseBlocks.COMPRESSED_DEEPSLATE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldCompressedCopperOres = List.of(
                OreConfiguration.target(stoneReplaceables, VerseBlocks.COMPRESSED_COPPER_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, VerseBlocks.COMPRESSED_DEEPSLATE_COPPER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldCompressedIronOres = List.of(
                OreConfiguration.target(stoneReplaceables, VerseBlocks.COMPRESSED_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, VerseBlocks.COMPRESSED_DEEPSLATE_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldCompressedGoldOres = List.of(
                OreConfiguration.target(stoneReplaceables, VerseBlocks.COMPRESSED_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, VerseBlocks.COMPRESSED_DEEPSLATE_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldCompressedRedstoneOres = List.of(
                OreConfiguration.target(stoneReplaceables, VerseBlocks.COMPRESSED_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, VerseBlocks.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldCompressedEmeraldOres = List.of(
                OreConfiguration.target(stoneReplaceables, VerseBlocks.COMPRESSED_EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, VerseBlocks.COMPRESSED_DEEPSLATE_EMERALD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldCompressedLapisOres = List.of(
                OreConfiguration.target(stoneReplaceables, VerseBlocks.COMPRESSED_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, VerseBlocks.COMPRESSED_DEEPSLATE_LAPIS_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldCompressedDiamondOres = List.of(
                OreConfiguration.target(stoneReplaceables, VerseBlocks.COMPRESSED_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, VerseBlocks.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get().defaultBlockState()));

        //Miners Dream Ore Setup Blocks
        List<OreConfiguration.TargetBlockState> MDCoalOres = List.of(
                OreConfiguration.target(darkStoneReplaceables, VerseBlocks.DARK_STONE_COAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(limestoneReplaceables, VerseBlocks.LIMESTONE_COAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(marbleReplaceables, VerseBlocks.MARBLE_COAL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> MDIronOres = List.of(
                OreConfiguration.target(darkStoneReplaceables, VerseBlocks.DARK_STONE_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(limestoneReplaceables, VerseBlocks.LIMESTONE_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(marbleReplaceables, VerseBlocks.MARBLE_IRON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> MDBoskaltOres = List.of(
                OreConfiguration.target(darkStoneReplaceables, VerseBlocks.DARK_STONE_BOSKALT_ORE.get().defaultBlockState()),
                OreConfiguration.target(limestoneReplaceables, VerseBlocks.LIMESTONE_BOSKALT_ORE.get().defaultBlockState()),
                OreConfiguration.target(marbleReplaceables, VerseBlocks.MARBLE_BOSKALT_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> MDCopperOres = List.of(
                OreConfiguration.target(darkStoneReplaceables, VerseBlocks.DARK_STONE_COPPER_ORE.get().defaultBlockState()),
                OreConfiguration.target(limestoneReplaceables, VerseBlocks.LIMESTONE_COPPER_ORE.get().defaultBlockState()),
                OreConfiguration.target(marbleReplaceables, VerseBlocks.MARBLE_COPPER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> MDQuartzOres = List.of(
                OreConfiguration.target(darkStoneReplaceables, VerseBlocks.DARK_STONE_QUARTZ_ORE.get().defaultBlockState()),
                OreConfiguration.target(limestoneReplaceables, VerseBlocks.LIMESTONE_QUARTZ_ORE.get().defaultBlockState()),
                OreConfiguration.target(marbleReplaceables, VerseBlocks.MARBLE_QUARTZ_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> MDGoldOres = List.of(
                OreConfiguration.target(darkStoneReplaceables, VerseBlocks.DARK_STONE_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(limestoneReplaceables, VerseBlocks.LIMESTONE_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(marbleReplaceables, VerseBlocks.MARBLE_GOLD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> MDRedstoneOres = List.of(
                OreConfiguration.target(darkStoneReplaceables, VerseBlocks.DARK_STONE_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(limestoneReplaceables, VerseBlocks.LIMESTONE_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(marbleReplaceables, VerseBlocks.MARBLE_REDSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> MDEmeraldOres = List.of(
                OreConfiguration.target(darkStoneReplaceables, VerseBlocks.DARK_STONE_EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(limestoneReplaceables, VerseBlocks.LIMESTONE_EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(marbleReplaceables, VerseBlocks.MARBLE_EMERALD_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> MDLapisOres = List.of(
                OreConfiguration.target(darkStoneReplaceables, VerseBlocks.DARK_STONE_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(limestoneReplaceables, VerseBlocks.LIMESTONE_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(marbleReplaceables, VerseBlocks.MARBLE_LAPIS_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> MDAmberOres = List.of(
                OreConfiguration.target(darkStoneReplaceables, VerseBlocks.DARK_STONE_AMBER_ORE.get().defaultBlockState()),
                OreConfiguration.target(limestoneReplaceables, VerseBlocks.LIMESTONE_AMBER_ORE.get().defaultBlockState()),
                OreConfiguration.target(marbleReplaceables, VerseBlocks.MARBLE_AMBER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> MDDiamondOres = List.of(
                OreConfiguration.target(darkStoneReplaceables, VerseBlocks.DARK_STONE_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(limestoneReplaceables, VerseBlocks.LIMESTONE_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(marbleReplaceables, VerseBlocks.MARBLE_DIAMOND_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> MDGarnetOres = List.of(
                OreConfiguration.target(darkStoneReplaceables, VerseBlocks.DARK_STONE_GARNET_ORE.get().defaultBlockState()),
                OreConfiguration.target(limestoneReplaceables, VerseBlocks.LIMESTONE_GARNET_ORE.get().defaultBlockState()),
                OreConfiguration.target(marbleReplaceables, VerseBlocks.MARBLE_GARNET_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> MDSapphireOres = List.of(
                OreConfiguration.target(darkStoneReplaceables, VerseBlocks.DARK_STONE_SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(limestoneReplaceables, VerseBlocks.LIMESTONE_SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(marbleReplaceables, VerseBlocks.MARBLE_SAPPHIRE_ORE.get().defaultBlockState()));


        //Overworld
        //Ores Setup
        register(context, OVERWORLD_QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(overworldQuartzOres, 10));
        register(context, OVERWORLD_AMBER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAmberOres, 8));
        register(context, OVERWORLD_BOSKALT_ORE_KEY, Feature.ORE, new OreConfiguration(overworldBoskaltOres, 10));
        register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSapphireOres, 4));
        register(context, OVERWORLD_GARNET_ORE_KEY, Feature.ORE, new OreConfiguration(overworldGarnetOres, 4));

        //Compressed Ores Setup
        register(context, OVERWORLD_COMPRESSED_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCompressedCoalOres, 3));
        register(context, OVERWORLD_COMPRESSED_COPPER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCompressedCopperOres, 3));
        register(context, OVERWORLD_COMPRESSED_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCompressedIronOres, 3));
        register(context, OVERWORLD_COMPRESSED_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCompressedGoldOres, 3));
        register(context, OVERWORLD_COMPRESSED_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCompressedRedstoneOres, 3));
        register(context, OVERWORLD_COMPRESSED_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCompressedEmeraldOres, 3));
        register(context, OVERWORLD_COMPRESSED_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCompressedLapisOres, 3));
        register(context, OVERWORLD_COMPRESSED_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCompressedDiamondOres, 3));

        //End
        //Ores Setup
        register(context, END_DRAGONRITE_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplaceables,
                VerseBlocks.ENDSTONE_DRAGONRITE_ORE.get().defaultBlockState(), 4));

        //Miners Dream
        //Dirty Plains
        register(context, TOP_LAYER_SILT, Feature.VEGETATION_PATCH, new VegetationPatchConfiguration(VerseTags.Blocks.MINERS_DREAM_CARVER, new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(VerseBlocks.SILT.get().defaultBlockState(), 1).add(VerseBlocks.SILT.get().defaultBlockState(), 2)), PlacementUtils.inlinePlaced(configuredFeatures.getOrThrow(TOP_LAYER_SILT)), CaveSurface.FLOOR, ConstantInt.of(1), 0, 3, 0, UniformInt.of(1, 5), 0.3f));
        register(context, SILT_BLOB, Feature.ORE, new OreConfiguration(darkStoneReplaceables, VerseBlocks.SILT.get().defaultBlockState(), 45));

        //Limestone Caves
        register(context, TOP_LAYER_LIMESTONE, Feature.VEGETATION_PATCH, new VegetationPatchConfiguration(VerseTags.Blocks.MINERS_DREAM_CARVER, new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(VerseBlocks.LIMESTONE.get().defaultBlockState(), 1).add(VerseBlocks.LIMESTONE.get().defaultBlockState(), 2)), PlacementUtils.inlinePlaced(configuredFeatures.getOrThrow(TOP_LAYER_LIMESTONE)), CaveSurface.FLOOR, ConstantInt.of(1), 0, 3, 0, UniformInt.of(1, 5), 0.3f));
        register(context, LIMESTONE_BLOB, Feature.ORE, new OreConfiguration(darkStoneReplaceables, VerseBlocks.LIMESTONE.get().defaultBlockState(), 60));

        //Marble Caves
        register(context, TOP_LAYER_MARBLE, Feature.VEGETATION_PATCH, new VegetationPatchConfiguration(VerseTags.Blocks.MINERS_DREAM_CARVER, new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(VerseBlocks.MARBLE.get().defaultBlockState(), 1).add(VerseBlocks.MARBLE.get().defaultBlockState(), 2)), PlacementUtils.inlinePlaced(configuredFeatures.getOrThrow(TOP_LAYER_MARBLE)), CaveSurface.FLOOR, ConstantInt.of(1), 0, 3, 0, UniformInt.of(1, 5), 0.3f));
        register(context, MARBLE_BLOB, Feature.ORE, new OreConfiguration(darkStoneReplaceables, VerseBlocks.MARBLE.get().defaultBlockState(), 60));

        //Mystical Caves
        register(context, TOP_LAYER_MILVI, Feature.VEGETATION_PATCH, new VegetationPatchConfiguration(VerseTags.Blocks.MINERS_DREAM_CARVER, new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(VerseBlocks.MILVI.get().defaultBlockState(), 1).add(VerseBlocks.MILVI.get().defaultBlockState(), 2)), PlacementUtils.inlinePlaced(configuredFeatures.getOrThrow(TOP_LAYER_MILVI)), CaveSurface.FLOOR, ConstantInt.of(1), 0, 3, 0, UniformInt.of(1, 5), 0.3f));
        register(context, MILVI_BLOB, Feature.ORE, new OreConfiguration(darkStoneReplaceables, VerseBlocks.MILVI.get().defaultBlockState(), 30));
        register(context, MILVI_CRYSTAL, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(VerseBlocks.MILVI_CRYSTAL.get().defaultBlockState(), 99).add(VerseBlocks.MILVI_CRYSTAL.get().defaultBlockState()))));

        //Ores
        register(context, MINERS_DREAM_COAL_ORE, Feature.ORE, new OreConfiguration(MDCoalOres, 9));
        register(context, MINERS_DREAM_IRON_ORE, Feature.ORE, new OreConfiguration(MDIronOres, 9));
        register(context, MINERS_DREAM_BOSKALT_ORE, Feature.ORE, new OreConfiguration(MDBoskaltOres, 9));
        register(context, MINERS_DREAM_COPPER_ORE, Feature.ORE, new OreConfiguration(MDCopperOres, 9));
        register(context, MINERS_DREAM_QUARTZ_ORE, Feature.ORE, new OreConfiguration(MDQuartzOres, 9));
        register(context, MINERS_DREAM_GOLD_ORE, Feature.ORE, new OreConfiguration(MDGoldOres, 9));
        register(context, MINERS_DREAM_REDSTONE_ORE, Feature.ORE, new OreConfiguration(MDRedstoneOres, 9));
        register(context, MINERS_DREAM_EMERALD_ORE, Feature.ORE, new OreConfiguration(MDEmeraldOres, 9));
        register(context, MINERS_DREAM_LAPIS_ORE, Feature.ORE, new OreConfiguration(MDLapisOres, 9));
        register(context, MINERS_DREAM_AMBER_ORE, Feature.ORE, new OreConfiguration(MDAmberOres, 9));
        register(context, MINERS_DREAM_DIAMOND_ORE, Feature.ORE, new OreConfiguration(MDDiamondOres, 9));
        register(context, MINERS_DREAM_GARNET_ORE, Feature.ORE, new OreConfiguration(MDGarnetOres, 9));
        register(context, MINERS_DREAM_SAPPHIRE_ORE, Feature.ORE, new OreConfiguration(MDSapphireOres, 9));
    }
    
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey (String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, VERSE.location(name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register (BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                           ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}