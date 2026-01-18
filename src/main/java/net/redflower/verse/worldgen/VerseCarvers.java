package net.redflower.verse.worldgen;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformFloat;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.carver.CarverDebugSettings;
import net.minecraft.world.level.levelgen.carver.CaveCarverConfiguration;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.carver.WorldCarver;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.redflower.verse.VERSE;
import net.redflower.verse.block.VerseBlocks;
import net.redflower.verse.util.VerseTags;

public class VerseCarvers {

    public static final ResourceKey<ConfiguredWorldCarver<?>> CAVE = create("cave");


    public static void bootstrap(BootstrapContext<ConfiguredWorldCarver<?>> context) {
        HolderGetter<Block> blocks = context.lookup(Registries.BLOCK);
        context.register(CAVE, WorldCarver.CAVE.configured(new CaveCarverConfiguration(
                0.25f,
                UniformHeight.of(VerticalAnchor.aboveBottom(17), VerticalAnchor.belowTop(17)),
                UniformFloat.of(0.2f,1.0f),
                VerticalAnchor.bottom(),
                CarverDebugSettings.of(false, VerseBlocks.BLOCK_OF_DRAGONRITE.get().defaultBlockState()),
                blocks.getOrThrow(VerseTags.Blocks.MINERS_DREAM_CARVER),
                UniformFloat.of(0.8f, 2.2f),
                UniformFloat.of(0.6f, 1.6f),
                UniformFloat.of(-1.0f, -0.2f)
        )));
    }





    public static ResourceKey<ConfiguredWorldCarver<?>> create(String name) {
        return ResourceKey.create(Registries.CONFIGURED_CARVER, VERSE.location(name));
    }
}
