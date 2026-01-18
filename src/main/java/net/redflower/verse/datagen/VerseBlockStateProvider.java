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
        //Surface
        blockWIthItem(VerseBlocks.SILT);

        //Stones
        blockWIthItem(VerseBlocks.DARK_STONE);
        blockWIthItem(VerseBlocks.LIMESTONE);
        blockWIthItem(VerseBlocks.MARBLE);
        blockWIthItem(VerseBlocks.MILVI);

        //Overworld Ores
        //Regular Ores
        blockWIthItem(VerseBlocks.BOSKALT_ORE);
        blockWIthItem(VerseBlocks.DEEPSLATE_BOSKALT_ORE);
        blockWIthItem(VerseBlocks.GARNET_ORE);
        blockWIthItem(VerseBlocks.DEEPSLATE_GARNET_ORE);
        blockWIthItem(VerseBlocks.SAPPHIRE_ORE);
        blockWIthItem(VerseBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockWIthItem(VerseBlocks.QUARTZ_ORE);
        blockWIthItem(VerseBlocks.DEEPSLATE_QUARTZ_ORE);
        blockWIthItem(VerseBlocks.AMBER_ORE);
        blockWIthItem(VerseBlocks.DEEPSLATE_AMBER_ORE);

        //Compressed Ores
        blockWIthItem(VerseBlocks.COMPRESSED_COAL_ORE);
        blockWIthItem(VerseBlocks.COMPRESSED_DEEPSLATE_COAL_ORE);
        blockWIthItem(VerseBlocks.COMPRESSED_COPPER_ORE);
        blockWIthItem(VerseBlocks.COMPRESSED_DEEPSLATE_COPPER_ORE);
        blockWIthItem(VerseBlocks.COMPRESSED_IRON_ORE);
        blockWIthItem(VerseBlocks.COMPRESSED_DEEPSLATE_IRON_ORE);
        blockWIthItem(VerseBlocks.COMPRESSED_GOLD_ORE);
        blockWIthItem(VerseBlocks.COMPRESSED_DEEPSLATE_GOLD_ORE);
        blockWIthItem(VerseBlocks.COMPRESSED_LAPIS_ORE);
        blockWIthItem(VerseBlocks.COMPRESSED_DEEPSLATE_LAPIS_ORE);
        blockWIthItem(VerseBlocks.COMPRESSED_REDSTONE_ORE);
        blockWIthItem(VerseBlocks.COMPRESSED_DEEPSLATE_REDSTONE_ORE);
        blockWIthItem(VerseBlocks.COMPRESSED_EMERALD_ORE);
        blockWIthItem(VerseBlocks.COMPRESSED_DEEPSLATE_EMERALD_ORE);
        blockWIthItem(VerseBlocks.COMPRESSED_DIAMOND_ORE);
        blockWIthItem(VerseBlocks.COMPRESSED_DEEPSLATE_DIAMOND_ORE);

        //Nether Ores

        //End Ores
        blockWIthItem(VerseBlocks.ENDSTONE_DRAGONRITE_ORE);

        //Raw Material Blocks
        blockWIthItem(VerseBlocks.BLOCK_OF_RAW_BOSKALT);


        //Material Blocks
        blockWIthItem(VerseBlocks.BLOCK_OF_BOSKALT);
        blockWIthItem(VerseBlocks.BLOCK_OF_GARNET);
        blockWIthItem(VerseBlocks.BLOCK_OF_SAPPHIRE);
        blockWIthItem(VerseBlocks.BLOCK_OF_AMBER);
        blockWIthItem(VerseBlocks.BLOCK_OF_DRAGONRITE);
        blockWIthItem(VerseBlocks.BLOCK_OF_EMERITE);
        blockWIthItem(VerseBlocks.BLOCK_OF_ECHO_SHARD);
        blockWIthItem(VerseBlocks.BLOCK_OF_SCULK_STEEL);

        //Other Blocks
        blockWIthItem(VerseBlocks.REINFORCED_STONE);
        blockWIthItem(VerseBlocks.COBBLED_DARK_STONE);
    }

    private void blockWIthItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
