package net.redflower.verse.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.redflower.verse.VERSE;

public class VerseTags {

    public static class Blocks {

        public static final TagKey<Block> NEEDS_BOSKALT_TOOL = createTag("needs_boskalt_tool");
        public static final TagKey<Block> INCORRECT_FOR_BOSKALT_TOOL = createTag("incorrect_for_boskalt_tool");

        public static final TagKey<Block> NEEDS_GARNET_TOOL = createTag("needs_garnet_tool");
        public static final TagKey<Block> INCORRECT_FOR_GARNET_TOOL = createTag("incorrect_for_garnet_tool");

        public static final TagKey<Block> NEEDS_SAPPHIRE_TOOL = createTag("needs_sapphire_tool");
        public static final TagKey<Block> INCORRECT_FOR_SAPPHIRE_TOOL = createTag("incorrect_for_sapphire_tool");

        public static final TagKey<Block> NEEDS_DRAGONRITE_TOOL = createTag("needs_dragonrite_tool");
        public static final TagKey<Block> INCORRECT_FOR_DRAGONRITE_TOOL = createTag("incorrect_for_dragonrite_tool");

        public static final TagKey<Block> NEEDS_EMERITE_TOOL = createTag("needs_emerite_tool");
        public static final TagKey<Block> INCORRECT_FOR_EMERITE_TOOL = createTag("incorrect_for_emerite_tool");



        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(VERSE.MODID, name));
        }
    }

    public static class Items {

        //Things for tier 2 items
        public static final TagKey<Item> TIER_2_UPGRADE = createTag("tier_2_upgrade");
        public static final TagKey<Item> TIER_2_SWORD = createTag("tier_2_sword");
        public static final TagKey<Item> TIER_2_SHOVEL = createTag("tier_2_shovel");
        public static final TagKey<Item> TIER_2_PICKAXE = createTag("tier_2_pickaxe");
        public static final TagKey<Item> TIER_2_AXE = createTag("tier_2_axe");
        public static final TagKey<Item> TIER_2_HOE = createTag("tier_2_hoe");
        public static final TagKey<Item> TIER_2_HELMET = createTag("tier_2_helmet");
        public static final TagKey<Item> TIER_2_CHESTPLATE = createTag("tier_2_chestplate");
        public static final TagKey<Item> TIER_2_LEGGINGS = createTag("tier_2_leggings");
        public static final TagKey<Item> TIER_2_BOOTS = createTag("tier_2_boots");

        public static final TagKey<Item> TIER_3_UPGRADE = createTag("tier_3_upgrade");
        public static final TagKey<Item> TIER_3_SWORD = createTag("tier_3_sword");
        public static final TagKey<Item> TIER_3_SHOVEL = createTag("tier_3_shovel");
        public static final TagKey<Item> TIER_3_PICKAXE = createTag("tier_3_pickaxe");
        public static final TagKey<Item> TIER_3_AXE = createTag("tier_3_axe");
        public static final TagKey<Item> TIER_3_HOE = createTag("tier_3_hoe");
        public static final TagKey<Item> TIER_3_HELMET = createTag("tier_3_helmet");
        public static final TagKey<Item> TIER_3_CHESTPLATE = createTag("tier_3_chestplate");
        public static final TagKey<Item> TIER_3_LEGGINGS = createTag("tier_3_leggings");
        public static final TagKey<Item> TIER_3_BOOTS = createTag("tier_3_boots");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(VERSE.MODID, name));
        }
    }
}
