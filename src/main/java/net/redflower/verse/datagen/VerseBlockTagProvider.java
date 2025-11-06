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
                .add(VerseBlocks.BLOCK_OF_BOSKALT.get());

        //Custom Tool Tiers Setup
        //Boskalt Setup
        tag(VerseTags.Blocks.NEEDS_BOSKALT_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(VerseTags.Blocks.INCORRECT_FOR_BOSKALT_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(VerseTags.Blocks.NEEDS_BOSKALT_TOOL);
    }
}
