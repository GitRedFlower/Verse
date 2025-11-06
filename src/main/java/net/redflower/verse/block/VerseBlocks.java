package net.redflower.verse.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redflower.verse.VERSE;
import net.redflower.verse.item.VerseItems;

import java.util.function.Supplier;

public class VerseBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(VERSE.MODID);

    //Stone Ores
    public static final DeferredBlock<Block> BOSKALT_ORE = registerBlock("boskalt_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    //Deepslate Ores
    public static final DeferredBlock<Block> DEEPSLATE_BOSKALT_ORE = registerBlock("deepslate_boskalt_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.DEEPSLATE)));

    //Raw Material Blocks
    public static final DeferredBlock<Block> BLOCK_OF_RAW_BOSKALT = registerBlock("block_of_raw_boskalt",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    //Material Blocks
    public static final DeferredBlock<Block> BLOCK_OF_BOSKALT = registerBlock("block_of_boskalt",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.METAL)));


    //Registers The Blocks. DO NOT TOUCH!!!!
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        VerseItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
