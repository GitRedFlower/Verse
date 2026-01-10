package net.redflower.verse.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.redflower.verse.VERSE;

import java.util.List;

public class VersePlacedFeatures {

    //Overworld
    public static final ResourceKey<PlacedFeature> OVERWORLD_QUARTZ_ORE_PLACED_KEY = registerKey("overworld_quartz_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_AMBER_ORE_PLACED_KEY = registerKey("overworld_amber_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_BOSKALT_ORE_PLACED_KEY = registerKey("overworld_boskalt_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_PYRITE_ORE_PLACED_KEY = registerKey("overworld_pyrite_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_SAPPHIRE_ORE_PLACED_KEY = registerKey("overworld_sapphire_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_GARNET_ORE_PLACED_KEY = registerKey("overworld_garnet_ore_placed");

    //Overworld Compressed
    public static final ResourceKey<PlacedFeature> OVERWORLD_COMPRESSED_COAL_PLACED_KEY = registerKey("overworld_compressed_coal_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_COMPRESSED_COPPER_PLACED_KEY = registerKey("overworld_compressed_copper_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_COMPRESSED_IRON_PLACED_KEY = registerKey("overworld_compressed_iron_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_COMPRESSED_GOLD_PLACED_KEY = registerKey("overworld_compressed_gold_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_COMPRESSED_REDSTONE_PLACED_KEY = registerKey("overworld_compressed_redstone_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_COMPRESSED_EMERALD_PLACED_KEY = registerKey("overworld_compressed_emerald_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_COMPRESSED_LAPIS_PLACED_KEY = registerKey("overworld_compressed_lapis_ore_placed");
    public static final ResourceKey<PlacedFeature> OVERWORLD_COMPRESSED_DIAMOND_PLACED_KEY = registerKey("overworld_compressed_diamond_ore_placed");

    //Nether
    public static final ResourceKey<PlacedFeature> NETHER_IRON_ORE_PLACED_KEY = registerKey("nether_iron_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_DIAMOND_ORE_PLACED_KEY = registerKey("nether_diamond_ore_placed");

    //End
    public static final ResourceKey<PlacedFeature> END_DRAGONRITE_ORE_PLACED_KEY = registerKey("end_dragonrite_ore_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        //Overworld
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

        //Overworld Compressed
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

        //End
        register(context, END_DRAGONRITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(VerseConfiguredFeatures.END_DRAGONRITE_ORE_KEY),
                VerseOrePlacement.commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.absolute(12), VerticalAnchor.absolute(64))));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(VERSE.MODID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}

