package net.redflower.verse.worldgen.minersdream;

import com.google.common.collect.ImmutableSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redflower.verse.VERSE;
import net.redflower.verse.block.VerseBlocks;
import net.redflower.verse.util.VerseTags;

import java.util.OptionalLong;

public class MinersDreamDimension {

    public static final ResourceKey<Level> MINERS_DREAM_LEVEL = ResourceKey.create(Registries.DIMENSION, VERSE.location("miners_dream"));
    public static final ResourceKey<DimensionType> MINERS_DREAM = ResourceKey.create(Registries.DIMENSION_TYPE, VERSE.location("miners_dream"));
    public static final ResourceLocation MINERS_DREAM_EFFECTS = VERSE.location("miners_dream_effects");

    public static void bootstrap (BootstrapContext<DimensionType> context) {
        context.register(MINERS_DREAM, new DimensionType(OptionalLong.of(18000L), false, true, false, true,
                1, false, false, -64, 320, 320, VerseTags.Blocks.MINERS_DREAM_INFINBURN, MINERS_DREAM_EFFECTS,
                0.05f, new DimensionType.MonsterSettings(false, false, ConstantInt.of(7), 7)));
    }

    public static final DeferredRegister<PoiType> POI = DeferredRegister.create(Registries.POINT_OF_INTEREST_TYPE, VERSE.MODID);
    public static final DeferredHolder<PoiType, PoiType> MINERS_DREAM_PORTAL = POI.register("miners_dream_portal",
            () -> new PoiType(ImmutableSet.copyOf(VerseBlocks.MINERS_DREAM_PORTAL.get().getStateDefinition().getPossibleStates()), 0, 1));
}
