package net.redflower.verse.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.redflower.verse.VERSE;
import net.redflower.verse.item.VerseItems;
import net.redflower.verse.util.VerseTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class VerseItemTagProvider extends ItemTagsProvider {

    public VerseItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, VERSE.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //Beacons
        tag(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(VerseItems.BOSKALT_INGOT.get())
                .add(VerseItems.GARNET.get())
                .add(VerseItems.SAPPHIRE.get())
                .add(VerseItems.QUARTZ.get())
                .add(VerseItems.AMBER.get())
                .add(VerseItems.DRAGONRITE_INGOT.get())
                .add(VerseItems.EMERITE_INGOT.get())
                .add(VerseItems.SCULK_STEEL_INGOT.get());

        //Gems
        this.tag(Tags.Items.GEMS)
                .add(VerseItems.QUARTZ.get())
                .add(VerseItems.SAPPHIRE.get())
                .add(VerseItems.GARNET.get())
                .add(VerseItems.AMBER.get());


        this.tag(Tags.Items.GEMS_QUARTZ)
                .add(VerseItems.QUARTZ.get());

        //Smithing Templates
        tag(VerseTags.Items.TIER_3_UPGRADE)
                .add(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                .add(VerseItems.EMERITE_UPGRADE_SMITHING_TEMPLATE.get());

        //Tier 2 Armor and Tools
        tag(VerseTags.Items.TIER_2_SWORD)
                .add(Items.DIAMOND_SWORD)
                .add(VerseItems.SAPPHIRE_SWORD.get())
                .add(VerseItems.GARNET_SWORD.get());

        tag(VerseTags.Items.TIER_2_SHOVEL)
                .add(Items.DIAMOND_SHOVEL)
                .add(VerseItems.SAPPHIRE_SHOVEL.get())
                .add(VerseItems.GARNET_SHOVEL.get());

        tag(VerseTags.Items.TIER_2_PICKAXE)
                .add(Items.DIAMOND_PICKAXE)
                .add(VerseItems.SAPPHIRE_PICKAXE.get())
                .add(VerseItems.GARNET_PICKAXE.get());

        tag(VerseTags.Items.TIER_2_AXE)
                .add(Items.DIAMOND_AXE)
                .add(VerseItems.SAPPHIRE_AXE.get())
                .add(VerseItems.GARNET_AXE.get());

        tag(VerseTags.Items.TIER_2_HOE)
                .add(Items.DIAMOND_HOE)
                .add(VerseItems.SAPPHIRE_HOE.get())
                .add(VerseItems.GARNET_HOE.get());

        tag(VerseTags.Items.TIER_2_HELMET)
                .add(Items.DIAMOND_HELMET)
                .add(VerseItems.SAPPHIRE_HELMET.get())
                .add(VerseItems.GARNET_HELMET.get());

        tag(VerseTags.Items.TIER_2_CHESTPLATE)
                .add(Items.DIAMOND_CHESTPLATE)
                .add(VerseItems.SAPPHIRE_CHESTPLATE.get())
                .add(VerseItems.GARNET_CHESTPLATE.get());

        tag(VerseTags.Items.TIER_2_LEGGINGS)
                .add(Items.DIAMOND_LEGGINGS)
                .add(VerseItems.SAPPHIRE_LEGGINGS.get())
                .add(VerseItems.GARNET_LEGGINGS.get());

        tag(VerseTags.Items.TIER_2_BOOTS)
                .add(Items.DIAMOND_BOOTS)
                .add(VerseItems.SAPPHIRE_BOOTS.get())
                .add(VerseItems.GARNET_BOOTS.get());

        tag(VerseTags.Items.TIER_2_BROADSWORD)
                .add(VerseItems.DIAMOND_BROADSWORD.get())
                .add(VerseItems.SAPPHIRE_BROADSWORD.get())
                .add(VerseItems.GARNET_BROADSWORD.get());

        //Tier 3 Armor and Tools
        tag(VerseTags.Items.TIER_3_SWORD)
                .add(Items.NETHERITE_SWORD)
                .add(VerseItems.EMERITE_SWORD.get());

        tag(VerseTags.Items.TIER_3_SHOVEL)
                .add(Items.NETHERITE_SHOVEL)
                .add(VerseItems.EMERITE_SHOVEL.get());

        tag(VerseTags.Items.TIER_3_PICKAXE)
                .add(Items.NETHERITE_PICKAXE)
                .add(VerseItems.EMERITE_PICKAXE.get());

        tag(VerseTags.Items.TIER_3_AXE)
                .add(Items.NETHERITE_AXE)
                .add(VerseItems.EMERITE_AXE.get());

        tag(VerseTags.Items.TIER_3_HOE)
                .add(Items.NETHERITE_HOE)
                .add(VerseItems.EMERITE_HOE.get());

        tag(VerseTags.Items.TIER_3_HELMET)
                .add(Items.NETHERITE_HELMET)
                .add(VerseItems.EMERITE_HELMET.get());

        tag(VerseTags.Items.TIER_3_CHESTPLATE)
                .add(Items.NETHERITE_CHESTPLATE)
                .add(VerseItems.EMERITE_CHESTPLATE.get());

        tag(VerseTags.Items.TIER_3_LEGGINGS)
                .add(Items.NETHERITE_LEGGINGS)
                .add(VerseItems.EMERITE_LEGGINGS.get());

        tag(VerseTags.Items.TIER_3_BOOTS)
                .add(Items.NETHERITE_BOOTS)
                .add(VerseItems.EMERITE_BOOTS.get());

        tag(VerseTags.Items.TIER_3_BROADSWORD)
                .add(VerseItems.NETHERITE_BROADSWORD.get())
                .add(VerseItems.EMERITE_BROADSWORD.get());

        //Weapons
        //Swords
        tag(ItemTags.SWORDS)
                .add(VerseItems.BOSKALT_SWORD.get())
                .add(VerseItems.GARNET_SWORD.get())
                .add(VerseItems.SAPPHIRE_SWORD.get())
                .add(VerseItems.DRAGONRITE_SWORD.get())
                .add(VerseItems.EMERITE_SWORD.get())
                .add(VerseItems.SCULK_STEEL_SWORD.get())
                .add(VerseItems.IRON_BROADSWORD.get())
                .add(VerseItems.BOSKALT_BROADSWORD.get())
                .add(VerseItems.GARNET_BROADSWORD.get())
                .add(VerseItems.SAPPHIRE_BROADSWORD.get())
                .add(VerseItems.DIAMOND_BROADSWORD.get())
                .add(VerseItems.NETHERITE_BROADSWORD.get())
                .add(VerseItems.DRAGONRITE_BROADSWORD.get())
                .add(VerseItems.EMERITE_BROADSWORD.get())
                .add(VerseItems.SCULK_STEEL_BROADSWORD.get());


        //Tools
        //Shovels
        tag(ItemTags.SHOVELS)
                .add(VerseItems.BOSKALT_SHOVEL.get())
                .add(VerseItems.GARNET_SHOVEL.get())
                .add(VerseItems.SAPPHIRE_SHOVEL.get())
                .add(VerseItems.DRAGONRITE_SHOVEL.get())
                .add(VerseItems.EMERITE_SHOVEL.get())
                .add(VerseItems.SCULK_STEEL_SHOVEL.get());

        //Pickaxes
        tag(ItemTags.PICKAXES)
                .add(VerseItems.BOSKALT_PICKAXE.get())
                .add(VerseItems.GARNET_PICKAXE.get())
                .add(VerseItems.SAPPHIRE_PICKAXE.get())
                .add(VerseItems.DRAGONRITE_PICKAXE.get())
                .add(VerseItems.EMERITE_PICKAXE.get())
                .add(VerseItems.SCULK_STEEL_PICKAXE.get());

        //Axes
        tag(ItemTags.AXES)
                .add(VerseItems.BOSKALT_AXE.get())
                .add(VerseItems.GARNET_AXE.get())
                .add(VerseItems.SAPPHIRE_AXE.get())
                .add(VerseItems.DRAGONRITE_AXE.get())
                .add(VerseItems.EMERITE_AXE.get())
                .add(VerseItems.SCULK_STEEL_AXE.get());

        //Hoes
        tag(ItemTags.HOES)
                .add(VerseItems.BOSKALT_HOE.get())
                .add(VerseItems.GARNET_HOE.get())
                .add(VerseItems.SAPPHIRE_HOE.get())
                .add(VerseItems.DRAGONRITE_HOE.get())
                .add(VerseItems.EMERITE_HOE.get())
                .add(VerseItems.SCULK_STEEL_HOE.get());

        //Armor
        //Trimmable Armor
        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(VerseItems.BOSKALT_HELMET.get())
                .add(VerseItems.BOSKALT_CHESTPLATE.get())
                .add(VerseItems.BOSKALT_LEGGINGS.get())
                .add(VerseItems.BOSKALT_BOOTS.get())
                .add(VerseItems.GARNET_HELMET.get())
                .add(VerseItems.GARNET_CHESTPLATE.get())
                .add(VerseItems.GARNET_LEGGINGS.get())
                .add(VerseItems.GARNET_BOOTS.get())
                .add(VerseItems.SAPPHIRE_HELMET.get())
                .add(VerseItems.SAPPHIRE_CHESTPLATE.get())
                .add(VerseItems.SAPPHIRE_LEGGINGS.get())
                .add(VerseItems.SAPPHIRE_BOOTS.get())
                .add(VerseItems.DRAGONRITE_HELMET.get())
                .add(VerseItems.DRAGONRITE_CHESTPLATE.get())
                .add(VerseItems.DRAGONRITE_LEGGINGS.get())
                .add(VerseItems.DRAGONRITE_BOOTS.get())
                .add(VerseItems.EMERITE_HELMET.get())
                .add(VerseItems.EMERITE_CHESTPLATE.get())
                .add(VerseItems.EMERITE_LEGGINGS.get())
                .add(VerseItems.EMERITE_BOOTS.get())
                .add(VerseItems.SCULK_STEEL_HELMET.get())
                .add(VerseItems.SCULK_STEEL_CHESTPLATE.get())
                .add(VerseItems.SCULK_STEEL_LEGGINGS.get())
                .add(VerseItems.SCULK_STEEL_BOOTS.get());

        //Make Armor Enchantable
        tag(ItemTags.ARMOR_ENCHANTABLE)
                .add(VerseItems.BOSKALT_HELMET.get())
                .add(VerseItems.BOSKALT_CHESTPLATE.get())
                .add(VerseItems.BOSKALT_LEGGINGS.get())
                .add(VerseItems.BOSKALT_BOOTS.get())
                .add(VerseItems.GARNET_HELMET.get())
                .add(VerseItems.GARNET_CHESTPLATE.get())
                .add(VerseItems.GARNET_LEGGINGS.get())
                .add(VerseItems.GARNET_BOOTS.get())
                .add(VerseItems.SAPPHIRE_HELMET.get())
                .add(VerseItems.SAPPHIRE_CHESTPLATE.get())
                .add(VerseItems.SAPPHIRE_CHESTPLATE.get())
                .add(VerseItems.SAPPHIRE_BOOTS.get())
                .add(VerseItems.DRAGONRITE_HELMET.get())
                .add(VerseItems.DRAGONRITE_CHESTPLATE.get())
                .add(VerseItems.DRAGONRITE_LEGGINGS.get())
                .add(VerseItems.DRAGONRITE_BOOTS.get())
                .add(VerseItems.EMERITE_HELMET.get())
                .add(VerseItems.EMERITE_CHESTPLATE.get())
                .add(VerseItems.EMERITE_LEGGINGS.get())
                .add(VerseItems.EMERITE_BOOTS.get())
                .add(VerseItems.SCULK_STEEL_HELMET.get())
                .add(VerseItems.SCULK_STEEL_CHESTPLATE.get())
                .add(VerseItems.SCULK_STEEL_LEGGINGS.get())
                .add(VerseItems.SCULK_STEEL_BOOTS.get());


        //Make Armor Durability Enchantable
        tag(ItemTags.DURABILITY_ENCHANTABLE)
                .add(VerseItems.BOSKALT_HELMET.get())
                .add(VerseItems.BOSKALT_CHESTPLATE.get())
                .add(VerseItems.BOSKALT_LEGGINGS.get())
                .add(VerseItems.BOSKALT_BOOTS.get())
                .add(VerseItems.GARNET_HELMET.get())
                .add(VerseItems.GARNET_CHESTPLATE.get())
                .add(VerseItems.GARNET_LEGGINGS.get())
                .add(VerseItems.GARNET_BOOTS.get())
                .add(VerseItems.SAPPHIRE_HELMET.get())
                .add(VerseItems.SAPPHIRE_CHESTPLATE.get())
                .add(VerseItems.SAPPHIRE_CHESTPLATE.get())
                .add(VerseItems.SAPPHIRE_BOOTS.get())
                .add(VerseItems.DRAGONRITE_HELMET.get())
                .add(VerseItems.DRAGONRITE_CHESTPLATE.get())
                .add(VerseItems.DRAGONRITE_LEGGINGS.get())
                .add(VerseItems.DRAGONRITE_BOOTS.get())
                .add(VerseItems.EMERITE_HELMET.get())
                .add(VerseItems.EMERITE_CHESTPLATE.get())
                .add(VerseItems.EMERITE_LEGGINGS.get())
                .add(VerseItems.EMERITE_BOOTS.get())
                .add(VerseItems.SCULK_STEEL_HELMET.get())
                .add(VerseItems.SCULK_STEEL_CHESTPLATE.get())
                .add(VerseItems.SCULK_STEEL_LEGGINGS.get())
                .add(VerseItems.SCULK_STEEL_BOOTS.get());
    }
}
