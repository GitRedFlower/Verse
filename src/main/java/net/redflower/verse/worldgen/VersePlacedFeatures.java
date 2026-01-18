package net.redflower.verse.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.redflower.verse.VERSE;

import java.util.List;

public class VersePlacedFeatures {

    //Overworld Ores
    public static final ResourceKey<PlacedFeature> OVERWORLD_QUARTZ_ORE_PLACED_KEY = registerKey("overworld_quartz_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_AMBER_ORE_PLACED_KEY = registerKey("overworld_amber_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_BOSKALT_ORE_PLACED_KEY = registerKey("overworld_boskalt_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_SAPPHIRE_ORE_PLACED_KEY = registerKey("overworld_sapphire_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_GARNET_ORE_PLACED_KEY = registerKey("overworld_garnet_ore_placed");

    //Overworld Compressed Ores
    public static final ResourceKey<PlacedFeature> OVERWORLD_COMPRESSED_COAL_PLACED_KEY = registerKey("overworld_compressed_coal_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_COMPRESSED_COPPER_PLACED_KEY = registerKey("overworld_compressed_copper_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_COMPRESSED_IRON_PLACED_KEY = registerKey("overworld_compressed_iron_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_COMPRESSED_GOLD_PLACED_KEY = registerKey("overworld_compressed_gold_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_COMPRESSED_REDSTONE_PLACED_KEY = registerKey("overworld_compressed_redstone_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_COMPRESSED_EMERALD_PLACED_KEY = registerKey("overworld_compressed_emerald_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_COMPRESSED_LAPIS_PLACED_KEY = registerKey("overworld_compressed_lapis_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_COMPRESSED_DIAMOND_PLACED_KEY = registerKey("overworld_compressed_diamond_ore_placed");

    //End Ores
    public static final ResourceKey<PlacedFeature> END_DRAGONRITE_ORE_PLACED_KEY = registerKey("end_dragonrite_ore_placed");

    //Miners Dream
    //Dirty Caves
    public static final ResourceKey<PlacedFeature> TOP_LAYER_SILT_PLACED_KEY = registerKey("top_layer_silt_placed");
    public static final ResourceKey<PlacedFeature> SILT_BLOB_PLACED_KEY = registerKey("silt_blob_placed");

    //Limestone Caves
    public static final ResourceKey<PlacedFeature> TOP_LAYER_LIMESTONE_PLACED_KEY = registerKey("top_layer_limestone_placed");
    public static final ResourceKey<PlacedFeature> LIMESTONE_BLOB_PLACED_KEY = registerKey("limestone_blob_placed");

    //Marble Caves
    public static final ResourceKey<PlacedFeature> TOP_LAYER_MARBLE_PLACED_KEY = registerKey("top_layer_marble_placed");
    public static final ResourceKey<PlacedFeature> MARBLE_BLOB_PLACED_KEY = registerKey("marble_blob_placed");

    //Mystical Caves
    public static final ResourceKey<PlacedFeature> TOP_LAYER_MILVI_PLACED_KEY = registerKey("top_layer_milvi_placed");
    public static final ResourceKey<PlacedFeature> MILVI_BLOB_PLACED_KEY = registerKey("milvi_blob_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        //Overworld Ores
        register(context, OVERWORLD_QUARTZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.OVERWORLD_QUARTZ_ORE_KEY),
                VerseOrePlacement.commonOrePlacement(14, HeightRangePlacement.triangle(VerticalAnchor.absolute(-15), VerticalAnchor.absolute(95))));
        register(context, OVERWORLD_AMBER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.OVERWORLD_AMBER_ORE_KEY),
                VerseOrePlacement.commonOrePlacement(10, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(28))));
        register(context, OVERWORLD_BOSKALT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.OVERWORLD_BOSKALT_ORE_KEY),
                VerseOrePlacement.commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(72))));
        register(context, OVERWORLD_SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.OVERWORLD_SAPPHIRE_ORE_KEY),
                VerseOrePlacement.commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(16))));
        register(context, OVERWORLD_GARNET_ORE_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.OVERWORLD_GARNET_ORE_KEY),
                VerseOrePlacement.commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(16))));

        //Overworld Compressed Ores
        register(context, OVERWORLD_COMPRESSED_COAL_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.OVERWORLD_COMPRESSED_COAL_ORE_KEY),
                VerseOrePlacement.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(300))));
        register(context, OVERWORLD_COMPRESSED_COPPER_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.OVERWORLD_COMPRESSED_COPPER_ORE_KEY),
                VerseOrePlacement.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(-10), VerticalAnchor.absolute(118))));
        register(context, OVERWORLD_COMPRESSED_IRON_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.OVERWORLD_COMPRESSED_IRON_ORE_KEY),
                VerseOrePlacement.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(-54), VerticalAnchor.absolute(240))));
        register(context, OVERWORLD_COMPRESSED_GOLD_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.OVERWORLD_COMPRESSED_GOLD_ORE_KEY),
                VerseOrePlacement.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(-54), VerticalAnchor.absolute(24))));
        register(context, OVERWORLD_COMPRESSED_REDSTONE_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.OVERWORLD_COMPRESSED_REDSTONE_ORE_KEY),
                VerseOrePlacement.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(-54), VerticalAnchor.absolute(12))));
        register(context, OVERWORLD_COMPRESSED_EMERALD_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.OVERWORLD_COMPRESSED_EMERALD_ORE_KEY),
                VerseOrePlacement.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(-12), VerticalAnchor.absolute(300))));
        register(context, OVERWORLD_COMPRESSED_LAPIS_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.OVERWORLD_COMPRESSED_LAPIS_ORE_KEY),
                VerseOrePlacement.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(-54), VerticalAnchor.absolute(54))));
        register(context, OVERWORLD_COMPRESSED_DIAMOND_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.OVERWORLD_COMPRESSED_DIAMOND_ORE_KEY),
                VerseOrePlacement.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(16))));

        //End Ores
        register(context, END_DRAGONRITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.END_DRAGONRITE_ORE_KEY),
                VerseOrePlacement.commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.absolute(12), VerticalAnchor.absolute(64))));

        //Miners Dream
        //Dirty Caves
        register(context, TOP_LAYER_SILT_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.TOP_LAYER_SILT), amount(256, PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT));
        register(context, SILT_BLOB_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.SILT_BLOB), amount(16, PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT));

        //Limestone Caves
        register(context, TOP_LAYER_LIMESTONE_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.TOP_LAYER_LIMESTONE), amount(256, PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT));
        register(context, LIMESTONE_BLOB_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.LIMESTONE_BLOB), amount(18, PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT));

        //Marble Caves
        register(context, TOP_LAYER_MARBLE_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.TOP_LAYER_MARBLE), amount(256, PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT));
        register(context, MARBLE_BLOB_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.MARBLE_BLOB), amount(18, PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT));

        //Mystical Caves
        register(context, TOP_LAYER_MILVI_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.TOP_LAYER_MILVI), amount(230, PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT));
        register(context, MILVI_BLOB_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.MILVI_BLOB), amount(12, PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT));
    }

    private static List<PlacementModifier> amount(int attempts, PlacementModifier height) {
        return modifiedPlacement(CountPlacement.of(attempts), height);
    }

    private static List<PlacementModifier> modifiedPlacement(PlacementModifier count, PlacementModifier height) {
        return List.of(count, InSquarePlacement.spread(), height, BiomeFilter.biome());
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, VERSE.location(name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}

