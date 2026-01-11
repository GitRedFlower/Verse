package net.redflower.verse.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;
import net.redflower.verse.VERSE;
import net.redflower.verse.item.VerseItems;
import net.redflower.verse.loot.AddItemModifier;

import java.util.concurrent.CompletableFuture;

public class VerseGlobalLootModifierProvider extends GlobalLootModifierProvider {

    public VerseGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, VERSE.MODID);
    }

    @Override
    protected void start() {
        this.add("dragon_scale_from_end_city",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/end_city_treasure")).build(),
                        LootItemRandomChanceCondition.randomChance(0.65f).build()
                }, VerseItems.DRAGON_SCALE.get()));

        this.add("dragonrite_upgrade_from_end_city",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/end_city_treasure")).build(),
                        LootItemRandomChanceCondition.randomChance(0.35f).build()
                }, VerseItems.DRAGONRITE_UPGRADE_SMITHING_TEMPLATE.get()));
    }
}
