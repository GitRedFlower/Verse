package net.redflower.verse.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redflower.verse.VERSE;
import net.redflower.verse.block.custom.AltarBlock;
import net.redflower.verse.block.custom.MilviCrystal;
import net.redflower.verse.block.custom.MinersDreamPortalBlock;
import net.redflower.verse.item.VerseItems;

import java.util.function.Supplier;

public class VerseBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(VERSE.MODID);

    //Natural Blocks
    //Surface
    public static final DeferredBlock<Block> SILT = registerBlock("silt",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .sound(SoundType.GRAVEL)));

    //Stones
    public static final DeferredBlock<Block> DARK_STONE = registerBlock("dark_stone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> LIMESTONE = registerBlock("limestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> MARBLE = registerBlock("marble",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> MILVI = registerBlock("milvi",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.STONE)));

    //Crystals
    public static final DeferredBlock<Block> MILVI_CRYSTAL = registerBlock("milvi_crystal",
            () -> new MilviCrystal(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

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

    //Nether Ores
    public static final DeferredBlock<Block> NETHER_IRON_ORE = registerBlock("nether_iron_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.NETHER_ORE)));

    public static final DeferredBlock<Block> NETHER_DIAMOND_ORE = registerBlock("nether_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.NETHER_ORE)));

    //End Ores
    public static final DeferredBlock<Block> ENDSTONE_DRAGONRITE_ORE = registerBlock("endstone_dragonrite_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    //Miners Dream Ores
    //Dark Stone
    public static final DeferredBlock<Block> DARK_STONE_COAL_ORE = registerBlock("dark_stone_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DARK_STONE_IRON_ORE = registerBlock("dark_stone_iron_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DARK_STONE_QUARTZ_ORE = registerBlock("dark_stone_quartz_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DARK_STONE_COPPER_ORE = registerBlock("dark_stone_copper_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DARK_STONE_GOLD_ORE = registerBlock("dark_stone_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DARK_STONE_REDSTONE_ORE = registerBlock("dark_stone_redstone_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DARK_STONE_EMERALD_ORE = registerBlock("dark_stone_emerald_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DARK_STONE_LAPIS_ORE = registerBlock("dark_stone_lapis_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DARK_STONE_DIAMOND_ORE = registerBlock("dark_stone_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DARK_STONE_BOSKALT_ORE = registerBlock("dark_stone_boskalt_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DARK_STONE_AMBER_ORE = registerBlock("dark_stone_amber_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DARK_STONE_GARNET_ORE = registerBlock("dark_stone_garnet_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DARK_STONE_SAPPHIRE_ORE = registerBlock("dark_stone_sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    //Limestone
    public static final DeferredBlock<Block> LIMESTONE_COAL_ORE = registerBlock("limestone_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> LIMESTONE_IRON_ORE = registerBlock("limestone_iron_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> LIMESTONE_QUARTZ_ORE = registerBlock("limestone_quartz_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> LIMESTONE_COPPER_ORE = registerBlock("limestone_copper_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> LIMESTONE_GOLD_ORE = registerBlock("limestone_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> LIMESTONE_REDSTONE_ORE = registerBlock("limestone_redstone_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> LIMESTONE_EMERALD_ORE = registerBlock("limestone_emerald_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> LIMESTONE_LAPIS_ORE = registerBlock("limestone_lapis_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> LIMESTONE_DIAMOND_ORE = registerBlock("limestone_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> LIMESTONE_BOSKALT_ORE = registerBlock("limestone_boskalt_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> LIMESTONE_AMBER_ORE = registerBlock("limestone_amber_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> LIMESTONE_GARNET_ORE = registerBlock("limestone_garnet_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> LIMESTONE_SAPPHIRE_ORE = registerBlock("limestone_sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    //Marble
    public static final DeferredBlock<Block> MARBLE_COAL_ORE = registerBlock("marble_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> MARBLE_IRON_ORE = registerBlock("marble_iron_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> MARBLE_QUARTZ_ORE = registerBlock("marble_quartz_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> MARBLE_COPPER_ORE = registerBlock("marble_copper_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> MARBLE_GOLD_ORE = registerBlock("marble_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> MARBLE_REDSTONE_ORE = registerBlock("marble_redstone_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> MARBLE_EMERALD_ORE = registerBlock("marble_emerald_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> MARBLE_LAPIS_ORE = registerBlock("marble_lapis_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> MARBLE_DIAMOND_ORE = registerBlock("marble_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> MARBLE_BOSKALT_ORE = registerBlock("marble_boskalt_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> MARBLE_AMBER_ORE = registerBlock("marble_amber_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> MARBLE_GARNET_ORE = registerBlock("marble_garnet_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
                    .sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> MARBLE_SAPPHIRE_ORE = registerBlock("marble_sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.5f)
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

    //Mystical Caves Ores
    public static final DeferredBlock<Block> RAW_MILVIRA = registerBlock("raw_milvira",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.AMETHYST)));

    //Other Blocks
    public static final DeferredBlock<Block> COBBLED_DARK_STONE = registerBlock("cobbled_dark_stone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));


    //Functional Block
    public static final DeferredBlock<Block> ALTAR = registerBlock("altar",
            () -> new AltarBlock(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> REINFORCED_STONE = registerBlock("reinforced_stone",
            () -> new Block(BlockBehaviour.Properties.of().noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(3f)
                    .sound(SoundType.COPPER)));

    //Portal Blocks AKA: Copy of a Nether Portal Block
    public static final DeferredBlock<MinersDreamPortalBlock> MINERS_DREAM_PORTAL = BLOCKS.register("miners_dream_portal",
            () -> new MinersDreamPortalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_PORTAL).noLootTable()));


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
