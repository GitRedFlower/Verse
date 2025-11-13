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
        //Overworld Ores
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

    }

    private void blockWIthItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
