package net.redflower.verse.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.redflower.verse.VERSE;
import net.redflower.verse.block.VerseBlocks;

public class VerseBlockStateProvider extends BlockStateProvider {

    public VerseBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, VERSE.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //Natural Blocks
        //Dirt / Dirt Like
        blockWithItem(VerseBlocks.SILT);

        //Stones
        blockWithItem(VerseBlocks.DARK_STONE);
        blockWithItem(VerseBlocks.LIMESTONE);
        blockWithItem(VerseBlocks.MARBLE);
        blockWithItem(VerseBlocks.MILVI);

        //Overworld Ores
        //Regular Ores
        blockWithItem(VerseBlocks.BOSKALT_ORE);
        blockWithItem(VerseBlocks.DEEPSLATE_BOSKALT_ORE);
        blockWithItem(VerseBlocks.GARNET_ORE);
        blockWithItem(VerseBlocks.DEEPSLATE_GARNET_ORE);
        blockWithItem(VerseBlocks.SAPPHIRE_ORE);
        blockWithItem(VerseBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockWithItem(VerseBlocks.QUARTZ_ORE);
        blockWithItem(VerseBlocks.DEEPSLATE_QUARTZ_ORE);
        blockWithItem(VerseBlocks.AMBER_ORE);
        blockWithItem(VerseBlocks.DEEPSLATE_AMBER_ORE);

        //Compressed Ores
        blockWithItem(VerseBlocks.COMPRESSED_COAL_ORE);
        blockWithItem(VerseBlocks.COMPRESSED_DEEPSLATE_COAL_ORE);
        blockWithItem(VerseBlocks.COMPRESSED_COPPER_ORE);
        blockWithItem(VerseBlocks.COMPRESSED_DEEPSLATE_COPPER_ORE);
        blockWithItem(VerseBlocks.COMPRESSED_IRON_ORE);
        blockWithItem(VerseBlocks.COMPRESSED_DEEPSLATE_IRON_ORE);
        blockWithItem(VerseBlocks.COMPRESSED_GOLD_ORE);
        blockWithItem(VerseBlocks.COMPRESSED_DEEPSLATE_GOLD_ORE);
        blockWithItem(VerseBlocks.COMPRESSED_LAPIS_ORE);
        blockWithItem(VerseBlocks.COMPRESSED_DEEPSLATE_LAPIS_ORE);
        blockWithItem(VerseBlocks.COMPRESSED_REDSTONE_ORE);
        blockWithItem(VerseBlocks.COMPRESSED_DEEPSLATE_REDSTONE_ORE);
        blockWithItem(VerseBlocks.COMPRESSED_EMERALD_ORE);
        blockWithItem(VerseBlocks.COMPRESSED_DEEPSLATE_EMERALD_ORE);
        blockWithItem(VerseBlocks.COMPRESSED_DIAMOND_ORE);
        blockWithItem(VerseBlocks.COMPRESSED_DEEPSLATE_DIAMOND_ORE);

        //Nether Ores

        //End Ores
        blockWithItem(VerseBlocks.ENDSTONE_DRAGONRITE_ORE);

        //Miners Dream Ores
        //Dark Stone
        blockWithItem(VerseBlocks.DARK_STONE_COAL_ORE);
        blockWithItem(VerseBlocks.DARK_STONE_IRON_ORE);
        blockWithItem(VerseBlocks.DARK_STONE_COPPER_ORE);
        blockWithItem(VerseBlocks.DARK_STONE_QUARTZ_ORE);
        blockWithItem(VerseBlocks.DARK_STONE_GOLD_ORE);
        blockWithItem(VerseBlocks.DARK_STONE_REDSTONE_ORE);
        blockWithItem(VerseBlocks.DARK_STONE_EMERALD_ORE);
        blockWithItem(VerseBlocks.DARK_STONE_LAPIS_ORE);
        blockWithItem(VerseBlocks.DARK_STONE_DIAMOND_ORE);
        blockWithItem(VerseBlocks.DARK_STONE_BOSKALT_ORE);
        blockWithItem(VerseBlocks.DARK_STONE_AMBER_ORE);
        blockWithItem(VerseBlocks.DARK_STONE_GARNET_ORE);
        blockWithItem(VerseBlocks.DARK_STONE_SAPPHIRE_ORE);

        //Limestone
        blockWithItem(VerseBlocks.LIMESTONE_COAL_ORE);
        blockWithItem(VerseBlocks.LIMESTONE_IRON_ORE);
        blockWithItem(VerseBlocks.LIMESTONE_COPPER_ORE);
        blockWithItem(VerseBlocks.LIMESTONE_QUARTZ_ORE);
        blockWithItem(VerseBlocks.LIMESTONE_GOLD_ORE);
        blockWithItem(VerseBlocks.LIMESTONE_REDSTONE_ORE);
        blockWithItem(VerseBlocks.LIMESTONE_EMERALD_ORE);
        blockWithItem(VerseBlocks.LIMESTONE_LAPIS_ORE);
        blockWithItem(VerseBlocks.LIMESTONE_DIAMOND_ORE);
        blockWithItem(VerseBlocks.LIMESTONE_BOSKALT_ORE);
        blockWithItem(VerseBlocks.LIMESTONE_AMBER_ORE);
        blockWithItem(VerseBlocks.LIMESTONE_GARNET_ORE);
        blockWithItem(VerseBlocks.LIMESTONE_SAPPHIRE_ORE);

        //Marble
        //Limestone
        blockWithItem(VerseBlocks.MARBLE_COAL_ORE);
        blockWithItem(VerseBlocks.MARBLE_IRON_ORE);
        blockWithItem(VerseBlocks.MARBLE_COPPER_ORE);
        blockWithItem(VerseBlocks.MARBLE_QUARTZ_ORE);
        blockWithItem(VerseBlocks.MARBLE_GOLD_ORE);
        blockWithItem(VerseBlocks.MARBLE_REDSTONE_ORE);
        blockWithItem(VerseBlocks.MARBLE_EMERALD_ORE);
        blockWithItem(VerseBlocks.MARBLE_LAPIS_ORE);
        blockWithItem(VerseBlocks.MARBLE_DIAMOND_ORE);
        blockWithItem(VerseBlocks.MARBLE_BOSKALT_ORE);
        blockWithItem(VerseBlocks.MARBLE_AMBER_ORE);
        blockWithItem(VerseBlocks.MARBLE_GARNET_ORE);
        blockWithItem(VerseBlocks.MARBLE_SAPPHIRE_ORE);

        //Raw Material Blocks
        blockWithItem(VerseBlocks.BLOCK_OF_RAW_BOSKALT);


        //Material Blocks
        blockWithItem(VerseBlocks.BLOCK_OF_BOSKALT);
        blockWithItem(VerseBlocks.BLOCK_OF_GARNET);
        blockWithItem(VerseBlocks.BLOCK_OF_SAPPHIRE);
        blockWithItem(VerseBlocks.BLOCK_OF_AMBER);
        blockWithItem(VerseBlocks.BLOCK_OF_DRAGONRITE);
        blockWithItem(VerseBlocks.BLOCK_OF_EMERITE);
        blockWithItem(VerseBlocks.BLOCK_OF_ECHO_SHARD);
        blockWithItem(VerseBlocks.BLOCK_OF_SCULK_STEEL);

        //Other Blocks
        blockWithItem(VerseBlocks.REINFORCED_STONE);
        blockWithItem(VerseBlocks.COBBLED_DARK_STONE);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
