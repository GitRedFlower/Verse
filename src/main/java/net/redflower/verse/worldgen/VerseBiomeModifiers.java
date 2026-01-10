package net.redflower.verse.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.redflower.verse.VERSE;

public class VerseBiomeModifiers {

    //Overworld
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_QUARTZ_ORE = registerKey("add_overworld_quartz_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_AMBER_ORE = registerKey("add_overworld_amber_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_BOSKALT_ORE = registerKey("add_overworld_boskalt_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_SAPPHIRE_ORE = registerKey("add_overworld_sapphire_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_GARNET_ORE = registerKey("add_overworld_garnet_ore");

    //Overworld Compressed
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_COMPRESSED_COAL_ORE = registerKey("add_overworld_compressed_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_COMPRESSED_COPPER_ORE = registerKey("add_overworld_compressed_copper_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_COMPRESSED_IRON_ORE = registerKey("add_overworld_compressed_iron_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_COMPRESSED_GOLD_ORE = registerKey("add_overworld_compressed_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_COMPRESSED_REDSTONE_ORE = registerKey("add_overworld_compressed_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_COMPRESSED_EMERALD_ORE = registerKey("add_overworld_compressed_emerald_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_COMPRESSED_LAPIS_ORE = registerKey("add_overworld_compressed_lapis_ore");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_COMPRESSED_DIAMOND_ORE = registerKey("add_overworld_compressed_diamond_ore");

    //End
    public static final ResourceKey<BiomeModifier> ADD_END_DRAGONRITE_ORE = registerKey("add_end_dragonrite_ore");


    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        //Overworld
        context.register(ADD_OVERWORLD_QUARTZ_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VersePlacedFeatures.OVERWORLD_QUARTZ_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_AMBER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VersePlacedFeatures.OVERWORLD_AMBER_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_BOSKALT_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VersePlacedFeatures.OVERWORLD_BOSKALT_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_SAPPHIRE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VersePlacedFeatures.OVERWORLD_SAPPHIRE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_GARNET_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VersePlacedFeatures.OVERWORLD_GARNET_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //Overworld Compressed Ores
        context.register(ADD_OVERWORLD_COMPRESSED_COAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VersePlacedFeatures.OVERWORLD_COMPRESSED_COAL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_COMPRESSED_COPPER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VersePlacedFeatures.OVERWORLD_COMPRESSED_COPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_COMPRESSED_IRON_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VersePlacedFeatures.OVERWORLD_COMPRESSED_IRON_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_COMPRESSED_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VersePlacedFeatures.OVERWORLD_COMPRESSED_GOLD_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_COMPRESSED_REDSTONE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(VersePlacedFeatures.OVERWORLD_COMPRESSED_REDSTONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_COMPRESSED_EMERALD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(VersePlacedFeatures.OVERWORLD_COMPRESSED_EMERALD_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_COMPRESSED_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(VersePlacedFeatures.OVERWORLD_COMPRESSED_LAPIS_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_COMPRESSED_DIAMOND_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(VersePlacedFeatures.OVERWORLD_COMPRESSED_DIAMOND_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        //End
        context.register(ADD_END_DRAGONRITE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(VersePlacedFeatures.END_DRAGONRITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(VERSE.MODID, name));
    }
}
