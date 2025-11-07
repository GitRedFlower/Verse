package net.redflower.verse.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.redflower.verse.VERSE;
import net.redflower.verse.item.VerseItems;
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
                .add(VerseItems.SAPPHIRE.get());

        //Weapons
        //Swords
        tag(ItemTags.SWORDS)
                .add(VerseItems.BOSKALT_SWORD.get())
                .add(VerseItems.GARNET_SWORD.get())
                .add(VerseItems.SAPPHIRE_SWORD.get());

        //Tools
        //Shovels
        tag(ItemTags.SHOVELS)
                .add(VerseItems.BOSKALT_SHOVEL.get())
                .add(VerseItems.GARNET_SHOVEL.get())
                .add(VerseItems.SAPPHIRE_SHOVEL.get());

        //Pickaxes
        tag(ItemTags.PICKAXES)
                .add(VerseItems.BOSKALT_PICKAXE.get())
                .add(VerseItems.GARNET_PICKAXE.get())
                .add(VerseItems.SAPPHIRE_PICKAXE.get());

        //Axes
        tag(ItemTags.AXES)
                .add(VerseItems.BOSKALT_AXE.get())
                .add(VerseItems.GARNET_AXE.get())
                .add(VerseItems.SAPPHIRE_AXE.get());

        //Hoes
        tag(ItemTags.HOES)
                .add(VerseItems.BOSKALT_HOE.get())
                .add(VerseItems.GARNET_HOE.get())
                .add(VerseItems.SAPPHIRE_HOE.get());

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
                .add(VerseItems.SAPPHIRE_CHESTPLATE.get())
                .add(VerseItems.SAPPHIRE_BOOTS.get());

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
                .add(VerseItems.SAPPHIRE_BOOTS.get());


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
                .add(VerseItems.SAPPHIRE_BOOTS.get());
    }
}
