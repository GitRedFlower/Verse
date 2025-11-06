package net.redflower.verse.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.redflower.verse.VERSE;

public class VerseTags {

    public static class Blocks {

        public static final TagKey<Block> NEEDS_BOSKALT_TOOL = createTag("needs_boskalt_tool");
        public static final TagKey<Block> INCORRECT_FOR_BOSKALT_TOOL = createTag("incorrect_for_boskalt_tool");



        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(VERSE.MODID, name));
        }
    }
}
