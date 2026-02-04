package net.redflower.verse.worldgen.minersdream.generation;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.*;
import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.redflower.verse.VERSE;
import net.redflower.verse.block.VerseBlocks;
import net.redflower.verse.worldgen.minersdream.MinersDreamBiomes;
import net.redflower.verse.worldgen.minersdream.MinersDreamDimension;

import java.util.List;

public class MinersDreamGen {

    public static final ResourceKey<NoiseGeneratorSettings> MINERS_DREAM_GEN = ResourceKey.create(Registries.NOISE_SETTINGS, VERSE.location("miners_dream"));
    public static final ResourceKey<LevelStem> MINERS_DREAM_STEM = ResourceKey.create(Registries.LEVEL_STEM, VERSE.location("miners_dream"));

    private static LevelStem levelStem(HolderGetter<Biome> biomes, HolderGetter<NoiseGeneratorSettings> noiseSettings, HolderGetter<DimensionType> dimensions) {
        NoiseBasedChunkGenerator chunkGenerator = new NoiseBasedChunkGenerator(MultiNoiseBiomeSource.createFromList(new Climate.ParameterList<>(List.of(
                Pair.of(Climate.parameters(-0.8f, -0.8f, 0, 0, 0, 0, 0), biomes.getOrThrow(MinersDreamBiomes.DIRTY_CAVES)),
                Pair.of(Climate.parameters(-0.35f, -0.35f, 0, 0, 0, 0, 0), biomes.getOrThrow(MinersDreamBiomes.LIMESTONE_CAVES)),
                Pair.of(Climate.parameters(0.65f, 0.65f, 0, 0, 0, 0, 0), biomes.getOrThrow(MinersDreamBiomes.MARBLE_CAVES)),
                Pair.of(Climate.parameters(0.7f, 0.7f, 0, 0, 0, 0, 0), biomes.getOrThrow(MinersDreamBiomes.MYSTICAL_CAVES))
        ))), noiseSettings.getOrThrow(MINERS_DREAM_GEN));
        return new LevelStem(dimensions.getOrThrow(MinersDreamDimension.MINERS_DREAM), chunkGenerator);
    }

    public static void noiseBootstrap(BootstrapContext<NoiseGeneratorSettings> context) {
        HolderGetter<DensityFunction> densityFunction = context.lookup(Registries.DENSITY_FUNCTION);
        HolderGetter<NormalNoise.NoiseParameters> noise = context.lookup(Registries.NOISE);
        context.register(MINERS_DREAM_GEN, noiseSettings(densityFunction, noise));
    }

    private static NoiseGeneratorSettings noiseSettings(HolderGetter<DensityFunction> densityFunction, HolderGetter<NormalNoise.NoiseParameters> noise) {
        SurfaceRules.RuleSource bedrockFloor = SurfaceRules.ifTrue(SurfaceRules.verticalGradient("bedrock_floor", VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(7)), SurfaceRules.state(Blocks.BEDROCK.defaultBlockState()));
        SurfaceRules.RuleSource bedrockRoof = SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.verticalGradient("bedrock_roof", VerticalAnchor.belowTop(7), VerticalAnchor.top())), SurfaceRules.state(Blocks.BEDROCK.defaultBlockState()));

        SurfaceRules.RuleSource topBiomeLayer = SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, CaveSurface.FLOOR), SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(MinersDreamBiomes.DIRTY_CAVES), SurfaceRules.state(VerseBlocks.SILT.get().defaultBlockState())),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(MinersDreamBiomes.LIMESTONE_CAVES), SurfaceRules.state(VerseBlocks.LIMESTONE.get().defaultBlockState())),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(MinersDreamBiomes.MARBLE_CAVES), SurfaceRules.state(VerseBlocks.MARBLE.get().defaultBlockState())),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(MinersDreamBiomes.MYSTICAL_CAVES), SurfaceRules.state(VerseBlocks.MILVI.get().defaultBlockState())),
                SurfaceRules.state(VerseBlocks.DARK_STONE.get().defaultBlockState())
        ));

        return new NoiseGeneratorSettings(NoiseSettings.create(-64, 320, 1, 2), VerseBlocks.DARK_STONE.get().defaultBlockState(), Blocks.LAVA.defaultBlockState(), MinersDreamNoiseRouter.minersDream(densityFunction, noise), SurfaceRules.sequence(bedrockFloor, bedrockRoof, topBiomeLayer), List.of(), 10, false, false, true, false);
    }

    public static void levelBootstrap(BootstrapContext<LevelStem> context) {
        HolderGetter<Biome> biomes = context.lookup(Registries.BIOME);
        HolderGetter<NoiseGeneratorSettings> noiseSettings = context.lookup(Registries.NOISE_SETTINGS);
        HolderGetter<DimensionType> dimensions = context.lookup(Registries.DIMENSION_TYPE);

        context.register(MINERS_DREAM_STEM, levelStem(biomes, noiseSettings, dimensions));
    }
}
