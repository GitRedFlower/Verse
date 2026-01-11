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
import net.redflower.verse.block.custom.AltarBlock;
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

    public static final DeferredBlock<Block> GARNET_ORE = registerBlock("garnet_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> QUARTZ_ORE = registerBlock("quartz_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> AMBER_ORE = registerBlock("amber_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    //Compressed Stone Ores
    public static final DeferredBlock<Block> COMPRESSED_COAL_ORE = registerBlock("compressed_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COMPRESSED_IRON_ORE = registerBlock("compressed_iron_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COMPRESSED_COPPER_ORE = registerBlock("compressed_copper_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COMPRESSED_GOLD_ORE = registerBlock("compressed_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COMPRESSED_REDSTONE_ORE = registerBlock("compressed_redstone_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COMPRESSED_EMERALD_ORE = registerBlock("compressed_emerald_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COMPRESSED_LAPIS_ORE = registerBlock("compressed_lapis_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COMPRESSED_DIAMOND_ORE = registerBlock("compressed_diamond_ore",
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

    public static final DeferredBlock<Block> DEEPSLATE_GARNET_ORE = registerBlock("deepslate_garnet_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DEEPSLATE_QUARTZ_ORE = registerBlock("deepslate_quartz_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DEEPSLATE_AMBER_ORE = registerBlock("deepslate_amber_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.DEEPSLATE)));

    //Compressed Deepslate Ores
    public static final DeferredBlock<Block> COMPRESSED_DEEPSLATE_COAL_ORE = registerBlock("compressed_deepslate_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> COMPRESSED_DEEPSLATE_IRON_ORE = registerBlock("compressed_deepslate_iron_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> COMPRESSED_DEEPSLATE_COPPER_ORE = registerBlock("compressed_deepslate_copper_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> COMPRESSED_DEEPSLATE_GOLD_ORE = registerBlock("compressed_deepslate_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> COMPRESSED_DEEPSLATE_REDSTONE_ORE = registerBlock("compressed_deepslate_redstone_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> COMPRESSED_DEEPSLATE_EMERALD_ORE = registerBlock("compressed_deepslate_emerald_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> COMPRESSED_DEEPSLATE_LAPIS_ORE = registerBlock("compressed_deepslate_lapis_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> COMPRESSED_DEEPSLATE_DIAMOND_ORE = registerBlock("compressed_deepslate_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.DEEPSLATE)));

    //End Ores
    public static final DeferredBlock<Block> ENDSTONE_DRAGONRITE_ORE = registerBlock("endstone_dragonrite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

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

    public static final DeferredBlock<Block> BLOCK_OF_GARNET = registerBlock("block_of_garnet",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> BLOCK_OF_SAPPHIRE = registerBlock("block_of_sapphire",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> BLOCK_OF_AMBER = registerBlock("block_of_amber",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> BLOCK_OF_DRAGONRITE = registerBlock("block_of_dragonrite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> BLOCK_OF_EMERITE = registerBlock("block_of_emerite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> BLOCK_OF_ECHO_SHARD = registerBlock("block_of_echo_shard",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> BLOCK_OF_SCULK_STEEL = registerBlock("block_of_sculk_steel",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.METAL)));


    //Functional Block
    public static final DeferredBlock<Block> ALTAR = registerBlock("altar",
            () -> new AltarBlock(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> REINFORCED_STONE = registerBlock("reinforced_stone",
            () -> new AltarBlock(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.COPPER)));


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
