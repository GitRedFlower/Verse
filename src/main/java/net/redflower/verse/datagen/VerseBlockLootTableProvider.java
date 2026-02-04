package net.redflower.verse.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
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
        dropSelf(VerseBlocks.ENDSTONE_DRAGONRITE_ORE.get());
        dropSelf(VerseBlocks.BLOCK_OF_DRAGONRITE.get());
        dropSelf(VerseBlocks.BLOCK_OF_EMERITE.get());
        dropSelf(VerseBlocks.BLOCK_OF_ECHO_SHARD.get());
        dropSelf(VerseBlocks.BLOCK_OF_SCULK_STEEL.get());
        dropSelf(VerseBlocks.REINFORCED_STONE.get());
        dropSelf(VerseBlocks.SILT.get());
        dropSelf(VerseBlocks.COBBLED_DARK_STONE.get());
        dropSelf(VerseBlocks.LIMESTONE.get());
        dropSelf(VerseBlocks.MARBLE.get());
        dropSelf(VerseBlocks.MILVI.get());
        dropSelf(VerseBlocks.MILVI_CRYSTAL.get());

        //Silk Touch Drops
        add(VerseBlocks.DARK_STONE.get(),
                block -> createSilkDrop(VerseBlocks.DARK_STONE.get(), VerseBlocks.COBBLED_DARK_STONE.get()));

        //Ores
        //Multiple
        add(VerseBlocks.COMPRESSED_COAL_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.COMPRESSED_COAL_ORE.get(), Items.COAL,4,7));
        add(VerseBlocks.COMPRESSED_DEEPSLATE_COAL_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.COMPRESSED_DEEPSLATE_COAL_ORE.get(), Items.COAL,4,7));
        add(VerseBlocks.COMPRESSED_IRON_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.COMPRESSED_IRON_ORE.get(), Items.RAW_IRON,4,7));
        add(VerseBlocks.COMPRESSED_DEEPSLATE_IRON_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.COMPRESSED_DEEPSLATE_IRON_ORE.get(), Items.RAW_IRON,4,7));
        add(VerseBlocks.COMPRESSED_COPPER_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.COMPRESSED_COPPER_ORE.get(), Items.RAW_COPPER,4,7));
        add(VerseBlocks.COMPRESSED_DEEPSLATE_COPPER_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.COMPRESSED_DEEPSLATE_COPPER_ORE.get(), Items.RAW_COPPER,4,7));
        add(VerseBlocks.COMPRESSED_GOLD_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.COMPRESSED_GOLD_ORE.get(), Items.RAW_GOLD,4,7));
        add(VerseBlocks.COMPRESSED_DEEPSLATE_GOLD_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.COMPRESSED_DEEPSLATE_GOLD_ORE.get(), Items.RAW_GOLD,4,7));
        add(VerseBlocks.COMPRESSED_REDSTONE_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.COMPRESSED_REDSTONE_ORE.get(), Items.REDSTONE,4,7));
        add(VerseBlocks.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.COMPRESSED_DEEPSLATE_REDSTONE_ORE.get(), Items.REDSTONE,4,7));
        add(VerseBlocks.COMPRESSED_EMERALD_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.COMPRESSED_EMERALD_ORE.get(), Items.EMERALD,4,7));
        add(VerseBlocks.COMPRESSED_DEEPSLATE_EMERALD_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.COMPRESSED_DEEPSLATE_EMERALD_ORE.get(), Items.EMERALD,4,7));
        add(VerseBlocks.COMPRESSED_LAPIS_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.COMPRESSED_LAPIS_ORE.get(), Items.LAPIS_LAZULI,4,7));
        add(VerseBlocks.COMPRESSED_DEEPSLATE_LAPIS_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.COMPRESSED_DEEPSLATE_LAPIS_ORE.get(), Items.LAPIS_LAZULI,4,7));
        add(VerseBlocks.COMPRESSED_DIAMOND_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.COMPRESSED_DIAMOND_ORE.get(), Items.DIAMOND,4,7));
        add(VerseBlocks.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.COMPRESSED_DEEPSLATE_DIAMOND_ORE.get(), Items.DIAMOND,4,7));

        add(VerseBlocks.DARK_STONE_COPPER_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.DARK_STONE_COPPER_ORE.get(), Items.RAW_COPPER,2,5));
        add(VerseBlocks.DARK_STONE_REDSTONE_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.DARK_STONE_REDSTONE_ORE.get(), Items.RAW_COPPER,4,5));
        add(VerseBlocks.DARK_STONE_LAPIS_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.DARK_STONE_LAPIS_ORE.get(), Items.RAW_COPPER,4,9));
        add(VerseBlocks.LIMESTONE_COPPER_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.LIMESTONE_COPPER_ORE.get(), Items.RAW_COPPER,2,5));
        add(VerseBlocks.LIMESTONE_REDSTONE_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.LIMESTONE_REDSTONE_ORE.get(), Items.RAW_COPPER,4,5));
        add(VerseBlocks.LIMESTONE_LAPIS_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.LIMESTONE_LAPIS_ORE.get(), Items.RAW_COPPER,4,9));
        add(VerseBlocks.MARBLE_COPPER_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.MARBLE_COPPER_ORE.get(), Items.RAW_COPPER,2,5));
        add(VerseBlocks.MARBLE_REDSTONE_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.MARBLE_REDSTONE_ORE.get(), Items.RAW_COPPER,4,5));
        add(VerseBlocks.MARBLE_LAPIS_ORE.get(),
                block -> createMultipleOreDrops(VerseBlocks.MARBLE_LAPIS_ORE.get(), Items.RAW_COPPER,4,9));

        //Single Drops
        add(VerseBlocks.BOSKALT_ORE.get(),
                block -> createOreDrop(VerseBlocks.BOSKALT_ORE.get(), VerseItems.RAW_BOSKALT.get()));
        add(VerseBlocks.DEEPSLATE_BOSKALT_ORE.get(),
                block -> createOreDrop(VerseBlocks.DEEPSLATE_BOSKALT_ORE.get(), VerseItems.RAW_BOSKALT.get()));
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

        add(VerseBlocks.DARK_STONE_BOSKALT_ORE.get(),
                block -> createOreDrop(VerseBlocks.DARK_STONE_BOSKALT_ORE.get(), VerseItems.RAW_BOSKALT.get()));
        add(VerseBlocks.DARK_STONE_AMBER_ORE.get(),
                block -> createOreDrop(VerseBlocks.DARK_STONE_AMBER_ORE.get(), VerseItems.AMBER.get()));
        add(VerseBlocks.DARK_STONE_GARNET_ORE.get(),
                block -> createOreDrop(VerseBlocks.DARK_STONE_GARNET_ORE.get(), VerseItems.GARNET.get()));
        add(VerseBlocks.DARK_STONE_SAPPHIRE_ORE.get(),
                block -> createOreDrop(VerseBlocks.DARK_STONE_AMBER_ORE.get(), VerseItems.SAPPHIRE.get()));
        add(VerseBlocks.LIMESTONE_BOSKALT_ORE.get(),
                block -> createOreDrop(VerseBlocks.LIMESTONE_BOSKALT_ORE.get(), VerseItems.RAW_BOSKALT.get()));
        add(VerseBlocks.LIMESTONE_AMBER_ORE.get(),
                block -> createOreDrop(VerseBlocks.LIMESTONE_AMBER_ORE.get(), VerseItems.AMBER.get()));
        add(VerseBlocks.LIMESTONE_GARNET_ORE.get(),
                block -> createOreDrop(VerseBlocks.LIMESTONE_GARNET_ORE.get(), VerseItems.GARNET.get()));
        add(VerseBlocks.LIMESTONE_SAPPHIRE_ORE.get(),
                block -> createOreDrop(VerseBlocks.LIMESTONE_AMBER_ORE.get(), VerseItems.SAPPHIRE.get()));
        add(VerseBlocks.MARBLE_BOSKALT_ORE.get(),
                block -> createOreDrop(VerseBlocks.MARBLE_BOSKALT_ORE.get(), VerseItems.RAW_BOSKALT.get()));
        add(VerseBlocks.MARBLE_AMBER_ORE.get(),
                block -> createOreDrop(VerseBlocks.MARBLE_AMBER_ORE.get(), VerseItems.AMBER.get()));
        add(VerseBlocks.MARBLE_GARNET_ORE.get(),
                block -> createOreDrop(VerseBlocks.MARBLE_GARNET_ORE.get(), VerseItems.GARNET.get()));
        add(VerseBlocks.MARBLE_SAPPHIRE_ORE.get(),
                block -> createOreDrop(VerseBlocks.MARBLE_AMBER_ORE.get(), VerseItems.SAPPHIRE.get()));

        add(VerseBlocks.DARK_STONE_COAL_ORE.get(),
                block -> createOreDrop(VerseBlocks.DARK_STONE_COAL_ORE.get(), Items.COAL));
        add(VerseBlocks.DARK_STONE_IRON_ORE.get(),
                block -> createOreDrop(VerseBlocks.DARK_STONE_IRON_ORE.get(), Items.RAW_IRON));
        add(VerseBlocks.DARK_STONE_QUARTZ_ORE.get(),
                block -> createOreDrop(VerseBlocks.DARK_STONE_QUARTZ_ORE.get(), VerseItems.QUARTZ.get()));
        add(VerseBlocks.DARK_STONE_GOLD_ORE.get(),
                block -> createOreDrop(VerseBlocks.DARK_STONE_GOLD_ORE.get(), Items.RAW_GOLD_BLOCK));
        add(VerseBlocks.DARK_STONE_EMERALD_ORE.get(),
                block -> createOreDrop(VerseBlocks.DARK_STONE_EMERALD_ORE.get(), Items.EMERALD));
        add(VerseBlocks.DARK_STONE_DIAMOND_ORE.get(),
                block -> createOreDrop(VerseBlocks.DARK_STONE_DIAMOND_ORE.get(), Items.DIAMOND));
        add(VerseBlocks.LIMESTONE_COAL_ORE.get(),
                block -> createOreDrop(VerseBlocks.LIMESTONE_COAL_ORE.get(), Items.COAL));
        add(VerseBlocks.LIMESTONE_IRON_ORE.get(),
                block -> createOreDrop(VerseBlocks.LIMESTONE_IRON_ORE.get(), Items.RAW_IRON));
        add(VerseBlocks.LIMESTONE_QUARTZ_ORE.get(),
                block -> createOreDrop(VerseBlocks.LIMESTONE_QUARTZ_ORE.get(), VerseItems.QUARTZ.get()));
        add(VerseBlocks.LIMESTONE_GOLD_ORE.get(),
                block -> createOreDrop(VerseBlocks.LIMESTONE_GOLD_ORE.get(), Items.RAW_GOLD_BLOCK));
        add(VerseBlocks.LIMESTONE_EMERALD_ORE.get(),
                block -> createOreDrop(VerseBlocks.LIMESTONE_EMERALD_ORE.get(), Items.EMERALD));
        add(VerseBlocks.LIMESTONE_DIAMOND_ORE.get(),
                block -> createOreDrop(VerseBlocks.LIMESTONE_DIAMOND_ORE.get(), Items.DIAMOND));
        add(VerseBlocks.MARBLE_COAL_ORE.get(),
                block -> createOreDrop(VerseBlocks.MARBLE_COAL_ORE.get(), Items.COAL));
        add(VerseBlocks.MARBLE_IRON_ORE.get(),
                block -> createOreDrop(VerseBlocks.MARBLE_IRON_ORE.get(), Items.RAW_IRON));
        add(VerseBlocks.MARBLE_QUARTZ_ORE.get(),
                block -> createOreDrop(VerseBlocks.MARBLE_QUARTZ_ORE.get(), VerseItems.QUARTZ.get()));
        add(VerseBlocks.MARBLE_GOLD_ORE.get(),
                block -> createOreDrop(VerseBlocks.MARBLE_GOLD_ORE.get(), Items.RAW_GOLD_BLOCK));
        add(VerseBlocks.MARBLE_EMERALD_ORE.get(),
                block -> createOreDrop(VerseBlocks.MARBLE_EMERALD_ORE.get(), Items.EMERALD));
        add(VerseBlocks.MARBLE_DIAMOND_ORE.get(),
                block -> createOreDrop(VerseBlocks.MARBLE_DIAMOND_ORE.get(), Items.DIAMOND));
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops,maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    protected LootTable.Builder createSilkDrop(Block normal, Block other) {
        return this.createSilkTouchDispatchTable(normal,this.applyExplosionDecay(normal, LootItem.lootTableItem(other)));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return VerseBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
