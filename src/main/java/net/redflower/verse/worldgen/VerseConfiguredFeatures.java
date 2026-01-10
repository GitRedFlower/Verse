package net.redflower.verse.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.redflower.verse.VERSE;
import net.redflower.verse.block.VerseBlocks;

import java.util.List;

public class VerseConfiguredFeatures {


    //Overworld
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZ_ORE_KEY = registerKey("overworld_quartz_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_AMBER_ORE_KEY = registerKey("overworld_amber_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BOSKALT_ORE_KEY = registerKey("overworld_boskalt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE_KEY = registerKey("overworld_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GARNET_ORE_KEY = registerKey("overworld_garnet_ore");

    //Overworld Compressed
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COMPRESSED_COAL_ORE_KEY = registerKey("overworld_compressed_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COMPRESSED_COPPER_ORE_KEY = registerKey("overworld_compressed_copper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COMPRESSED_IRON_ORE_KEY = registerKey("overworld_compressed_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COMPRESSED_GOLD_ORE_KEY = registerKey("overworld_compressed_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COMPRESSED_REDSTONE_ORE_KEY = registerKey("overworld_compressed_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COMPRESSED_EMERALD_ORE_KEY = registerKey("overworld_compressed_emerald_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COMPRESSED_LAPIS_ORE_KEY = registerKey("overworld_compressed_lapis_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COMPRESSED_DIAMOND_ORE_KEY = registerKey("overworld_compressed_diamond_ore");

    //End
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_DRAGONRITE_ORE_KEY = registerKey("end_dragonrite_ore");



    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        //What Blocks Get Replaced
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest endstoneReplaceables = new BlockMatchTest(Blocks.END_STONE);

        //Overworld Setup Blocks
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


        //Overworld Setup
        register(context, OVERWORLD_QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(overworldQuartzOres, 10));
        register(context, OVERWORLD_AMBER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAmberOres, 8));
        register(context, OVERWORLD_BOSKALT_ORE_KEY, Feature.ORE, new OreConfiguration(overworldBoskaltOres, 10));
        register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSapphireOres, 4));
        register(context, OVERWORLD_GARNET_ORE_KEY, Feature.ORE, new OreConfiguration(overworldGarnetOres, 4));

        //Overworld Compressed Setup
        register(context, OVERWORLD_COMPRESSED_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCompressedCoalOres, 3));
        register(context, OVERWORLD_COMPRESSED_COPPER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCompressedCopperOres, 3));
        register(context, OVERWORLD_COMPRESSED_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCompressedIronOres, 3));
        register(context, OVERWORLD_COMPRESSED_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCompressedGoldOres, 3));
        register(context, OVERWORLD_COMPRESSED_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCompressedRedstoneOres, 3));
        register(context, OVERWORLD_COMPRESSED_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCompressedEmeraldOres, 3));
        register(context, OVERWORLD_COMPRESSED_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCompressedLapisOres, 3));
        register(context, OVERWORLD_COMPRESSED_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCompressedDiamondOres, 3));

        //End Setup
        register(context, END_DRAGONRITE_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplaceables,
                VerseBlocks.ENDSTONE_DRAGONRITE_ORE.get().defaultBlockState(), 4));
    }
    
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey (String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(VERSE.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register (BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                           ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}