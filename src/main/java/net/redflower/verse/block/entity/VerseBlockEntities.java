package net.redflower.verse.block.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redflower.verse.VERSE;
import net.redflower.verse.block.VerseBlocks;
import net.redflower.verse.block.entity.custom.AltarBlockEntity;

import java.util.function.Supplier;

public class VerseBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, VERSE.MODID);

    public static final Supplier<BlockEntityType<AltarBlockEntity>> ALTAR_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("altar_block_entity", () -> BlockEntityType.Builder.of(
                    AltarBlockEntity::new, VerseBlocks.ALTAR.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
