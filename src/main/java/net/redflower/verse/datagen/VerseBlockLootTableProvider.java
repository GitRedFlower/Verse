package net.redflower.verse.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.redflower.verse.block.VerseBlocks;
import net.redflower.verse.item.VerseItems;

import java.util.Set;

public class VerseBlockLootTableProvider extends BlockLootSubProvider {

    protected VerseBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        //Drops Nothing Special
        dropSelf(VerseBlocks.BLOCK_OF_RAW_BOSKALT.get());
        dropSelf(VerseBlocks.BLOCK_OF_BOSKALT.get());
        dropSelf(VerseBlocks.BLOCK_OF_GARNET.get());
        dropSelf(VerseBlocks.BLOCK_OF_SAPPHIRE.get());
        dropSelf(VerseBlocks.BLOCK_OF_AMBER.get());
        dropSelf(VerseBlocks.ALTAR.get());

        //Ore Drops
        //Multiple Drops
        add(VerseBlocks.BOSKALT_ORE.get(),
               block -> createMultipleOreDrops(VerseBlocks.BOSKALT_ORE.get(), VerseItems.RAW_BOSKALT.get(), 2, 5));
        add(VerseBlocks.DEEPSLATE_BOSKALT_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.DEEPSLATE_BOSKALT_ORE.get(), VerseItems.RAW_BOSKALT.get(), 2, 5));

        //Single Drops
        add(VerseBlocks.GARNET_ORE.get(),
                block -> createOreDrop(VerseBlocks.GARNET_ORE.get(), VerseItems.GARNET.get()));
        add(VerseBlocks.DEEPSLATE_GARNET_ORE.get(),
                block -> createOreDrop(VerseBlocks.DEEPSLATE_GARNET_ORE.get(), VerseItems.GARNET.get()));
        add(VerseBlocks.SAPPHIRE_ORE.get(),
                block -> createOreDrop(VerseBlocks.SAPPHIRE_ORE.get(), VerseItems.SAPPHIRE.get()));
        add(VerseBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                block -> createOreDrop(VerseBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), VerseItems.SAPPHIRE.get()));
        add(VerseBlocks.QUARTZ_ORE.get(),
                block -> createOreDrop(VerseBlocks.QUARTZ_ORE.get(), VerseItems.QUARTZ.get()));
        add(VerseBlocks.DEEPSLATE_QUARTZ_ORE.get(),
                block -> createOreDrop(VerseBlocks.DEEPSLATE_QUARTZ_ORE.get(), VerseItems.QUARTZ.get()));
        add(VerseBlocks.AMBER_ORE.get(),
                block -> createOreDrop(VerseBlocks.AMBER_ORE.get(), VerseItems.AMBER.get()));
        add(VerseBlocks.DEEPSLATE_AMBER_ORE.get(),
                block -> createOreDrop(VerseBlocks.DEEPSLATE_AMBER_ORE.get(), VerseItems.AMBER.get()));
    }

    //Creates Multiple Ore Drops. Created By Modding by Kaupenjoe. DO NOT TOUCH!!!!
    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops,maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return VerseBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
