package net.redflower.verse.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.redflower.verse.VERSE;
import net.redflower.verse.worldgen.VerseBiomeModifiers;
import net.redflower.verse.worldgen.VerseConfiguredFeatures;
import net.redflower.verse.worldgen.VersePlacedFeatures;
import net.redflower.verse.worldgen.minersdream.MinersDreamDimension;
import net.redflower.verse.worldgen.minersdream.generation.MinersDreamGen;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class VerseDatapackProvider extends DatapackBuiltinEntriesProvider {

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, VerseConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, VersePlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, VerseBiomeModifiers::bootstrap)
            .add(Registries.DIMENSION_TYPE, MinersDreamDimension::bootstrap)
            .add(Registries.LEVEL_STEM, MinersDreamGen::levelBootstrap)
            .add(Registries.NOISE_SETTINGS, MinersDreamGen::noiseBootstrap);

    public VerseDatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(VERSE.MODID));
    }
}
