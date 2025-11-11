package net.redflower.verse.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.redflower.verse.VERSE;
import net.redflower.verse.block.VerseBlocks;
import net.redflower.verse.util.VerseTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class VerseBlockTagProvider extends BlockTagsProvider {

    public VerseBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, VERSE.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //Needs Pickaxe
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(VerseBlocks.BOSKALT_ORE.get())
                .add(VerseBlocks.DEEPSLATE_BOSKALT_ORE.get())
                .add(VerseBlocks.BLOCK_OF_RAW_BOSKALT.get())
                .add(VerseBlocks.BLOCK_OF_BOSKALT.get())
                .add(VerseBlocks.GARNET_ORE.get())
                .add(VerseBlocks.DEEPSLATE_GARNET_ORE.get())
                .add(VerseBlocks.BLOCK_OF_GARNET.get())
                .add(VerseBlocks.SAPPHIRE_ORE.get())
                .add(VerseBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(VerseBlocks.BLOCK_OF_SAPPHIRE.get())
                .add(VerseBlocks.ALTAR.get())
                .add(VerseBlocks.QUARTZ_ORE.get())
                .add(VerseBlocks.DEEPSLATE_QUARTZ_ORE.get())
                .add(VerseBlocks.AMBER_ORE.get())
                .add(VerseBlocks.DEEPSLATE_AMBER_ORE.get())
                .add(VerseBlocks.BLOCK_OF_AMBER.get());


        //Stone Level
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(VerseBlocks.BOSKALT_ORE.get())
                .add(VerseBlocks.DEEPSLATE_BOSKALT_ORE.get())
                .add(VerseBlocks.BLOCK_OF_RAW_BOSKALT.get())
                .add(VerseBlocks.BLOCK_OF_BOSKALT.get())
                .add(VerseBlocks.ALTAR.get());

        //Iron Level
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(VerseBlocks.GARNET_ORE.get())
                .add(VerseBlocks.DEEPSLATE_GARNET_ORE.get())
                .add(VerseBlocks.BLOCK_OF_GARNET.get())
                .add(VerseBlocks.SAPPHIRE_ORE.get())
                .add(VerseBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(VerseBlocks.BLOCK_OF_SAPPHIRE.get())
                .add(VerseBlocks.QUARTZ_ORE.get())
                .add(VerseBlocks.DEEPSLATE_QUARTZ_ORE.get())
                .add(VerseBlocks.AMBER_ORE.get())
                .add(VerseBlocks.DEEPSLATE_AMBER_ORE.get())
                .add(VerseBlocks.BLOCK_OF_AMBER.get());

        //Beacon Base Blocks
        tag(BlockTags.BEACON_BASE_BLOCKS)
                .add(VerseBlocks.BLOCK_OF_GARNET.get());

        //Custom Tool Tiers Setup
        //Boskalt Setup
        tag(VerseTags.Blocks.NEEDS_BOSKALT_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(VerseTags.Blocks.INCORRECT_FOR_BOSKALT_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(VerseTags.Blocks.NEEDS_BOSKALT_TOOL);

        //Garnet Setup
        tag(VerseTags.Blocks.NEEDS_GARNET_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(VerseTags.Blocks.INCORRECT_FOR_GARNET_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(VerseTags.Blocks.NEEDS_GARNET_TOOL);
    }
}
