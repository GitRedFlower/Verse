package net.redflower.verse.worldgen.minersdream;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.Musics;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.redflower.verse.VERSE;
import net.redflower.verse.worldgen.VerseCarvers;
import net.redflower.verse.worldgen.VersePlacedFeatures;

public class MinersDreamBiomes {
    public static final ResourceKey<Biome> DIRTY_CAVES = create("dirty_caves");
    public static final ResourceKey<Biome> LIMESTONE_CAVES = create("limestone_caves");
    public static final ResourceKey<Biome> MARBLE_CAVES = create("marble_caves");
    public static final ResourceKey<Biome> MYSTICAL_CAVES = create("mystical_caves");

    public static void bootstrap(BootstrapContext<Biome> context) {
        HolderGetter<PlacedFeature> placedFeature = context.lookup(Registries.PLACED_FEATURE);
        HolderGetter<ConfiguredWorldCarver<?>> worldCarver = context.lookup(Registries.CONFIGURED_CARVER);

        context.register(DIRTY_CAVES, dirtyCaves(placedFeature, worldCarver));
        context.register(LIMESTONE_CAVES, limestoneCaves(placedFeature, worldCarver));
        context.register(MARBLE_CAVES, marbleCaves(placedFeature, worldCarver));
        context.register(MYSTICAL_CAVES, mysticalCaves(placedFeature, worldCarver));
    }

    public static Biome dirtyCaves(HolderGetter<PlacedFeature> placedFeature, HolderGetter<ConfiguredWorldCarver<?>> worldCarver) {

        MobSpawnSettings.Builder mobSpawnSettings = new MobSpawnSettings.Builder();

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeature, worldCarver);
        biomeBuilder.addCarver(GenerationStep.Carving.AIR, VerseCarvers.CAVE);
        //Features
        biomeBuilder.addFeature(GenerationStep.Decoration.RAW_GENERATION, VersePlacedFeatures.TOP_LAYER_SILT_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.RAW_GENERATION, VersePlacedFeatures.SILT_BLOB_PLACED_KEY);

        //Ores
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_COAL_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_IRON_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_BOSKALT_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_COPPER_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_QUARTZ_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_GOLD_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_REDSTONE_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_EMERALD_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_LAPIS_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_AMBER_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_DIAMOND_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_GARNET_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_SAPPHIRE_ORE_PLACED_KEY);

        return (new Biome.BiomeBuilder()).hasPrecipitation(false)
                .temperature(-0.8f)
                .downfall(-0.8f)
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x330f00)
                        .waterFogColor(0x330f00)
                        .fogColor(0x330f00)
                        .skyColor(0x330f00)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.GAME).build())
                .mobSpawnSettings(mobSpawnSettings.build())
                .generationSettings(biomeBuilder.build()).build();
    }

    public static Biome limestoneCaves(HolderGetter<PlacedFeature> placedFeature, HolderGetter<ConfiguredWorldCarver<?>> worldCarver) {

        MobSpawnSettings.Builder mobSpawnSettings = new MobSpawnSettings.Builder();

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeature, worldCarver);
        biomeBuilder.addCarver(GenerationStep.Carving.AIR, VerseCarvers.CAVE);
        //Features
        biomeBuilder.addFeature(GenerationStep.Decoration.RAW_GENERATION, VersePlacedFeatures.TOP_LAYER_LIMESTONE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.RAW_GENERATION, VersePlacedFeatures.LIMESTONE_BLOB_PLACED_KEY);

        //Ores
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_COAL_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_IRON_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_BOSKALT_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_COPPER_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_QUARTZ_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_GOLD_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_REDSTONE_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_EMERALD_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_LAPIS_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_AMBER_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_DIAMOND_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_GARNET_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_SAPPHIRE_ORE_PLACED_KEY);

        return (new Biome.BiomeBuilder()).hasPrecipitation(false)
                .temperature(-0.55f)
                .downfall(-0.55f)
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0xa1a188)
                        .waterFogColor(0xa1a188)
                        .fogColor(0xa1a188)
                        .skyColor(0xa1a188)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.GAME).build())
                .mobSpawnSettings(mobSpawnSettings.build())
                .generationSettings(biomeBuilder.build()).build();
    }

    public static Biome marbleCaves(HolderGetter<PlacedFeature> placedFeature, HolderGetter<ConfiguredWorldCarver<?>> worldCarver) {

        MobSpawnSettings.Builder mobSpawnSettings = new MobSpawnSettings.Builder();

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeature, worldCarver);
        biomeBuilder.addCarver(GenerationStep.Carving.AIR, VerseCarvers.CAVE);
        //Features
        biomeBuilder.addFeature(GenerationStep.Decoration.RAW_GENERATION, VersePlacedFeatures.TOP_LAYER_MARBLE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.RAW_GENERATION, VersePlacedFeatures.MARBLE_BLOB_PLACED_KEY);

        //Ores
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_COAL_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_IRON_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_BOSKALT_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_COPPER_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_QUARTZ_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_GOLD_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_REDSTONE_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_EMERALD_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_LAPIS_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_AMBER_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_DIAMOND_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_GARNET_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_SAPPHIRE_ORE_PLACED_KEY);

        return (new Biome.BiomeBuilder()).hasPrecipitation(false)
                .temperature(0.55f)
                .downfall(0.55f)
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0xc8c8c8)
                        .waterFogColor(0xc8c8c8)
                        .fogColor(0xc8c8c8)
                        .skyColor(0xc8c8c8)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.GAME).build())
                .mobSpawnSettings(mobSpawnSettings.build())
                .generationSettings(biomeBuilder.build()).build();


    }

    public static Biome mysticalCaves(HolderGetter<PlacedFeature> placedFeature, HolderGetter<ConfiguredWorldCarver<?>> worldCarver) {

        MobSpawnSettings.Builder mobSpawnSettings = new MobSpawnSettings.Builder();

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeature, worldCarver);
        biomeBuilder.addCarver(GenerationStep.Carving.AIR, VerseCarvers.CAVE);
        //Features
        biomeBuilder.addFeature(GenerationStep.Decoration.RAW_GENERATION, VersePlacedFeatures.TOP_LAYER_MILVI_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.RAW_GENERATION, VersePlacedFeatures.MILVI_BLOB_PLACED_KEY);

        //Ores
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_COAL_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_IRON_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_BOSKALT_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_COPPER_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_QUARTZ_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_GOLD_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_REDSTONE_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_EMERALD_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_LAPIS_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_AMBER_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_DIAMOND_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_GARNET_ORE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, VersePlacedFeatures.MINERS_DREAM_SAPPHIRE_ORE_PLACED_KEY);

        return (new Biome.BiomeBuilder()).hasPrecipitation(false)
                .temperature(0.74f)
                .downfall(0.74f)
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x898297)
                        .waterFogColor(0x898297)
                        .fogColor(0x898297)
                        .skyColor(0x898297)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.GAME).build())
                .mobSpawnSettings(mobSpawnSettings.build())
                .generationSettings(biomeBuilder.build()).build();


    }

    public static ResourceKey<Biome> create(String name) {
        return ResourceKey.create(Registries.BIOME, VERSE.location(name));
    }
}
