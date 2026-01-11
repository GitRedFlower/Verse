package net.redflower.verse.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.redflower.verse.VERSE;
import net.redflower.verse.block.VerseBlocks;
import net.redflower.verse.item.VerseItems;
import net.redflower.verse.util.VerseTags;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class VerseRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public VerseRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> BOSKALT_SMELT = List.of(VerseItems.RAW_BOSKALT, VerseBlocks.BOSKALT_ORE, VerseBlocks.DEEPSLATE_BOSKALT_ORE);
        List<ItemLike> GARNET_SMELT = List.of(VerseBlocks.GARNET_ORE, VerseBlocks.DEEPSLATE_GARNET_ORE);
        List<ItemLike> SAPPHIRE_SMELT = List.of(VerseBlocks.SAPPHIRE_ORE, VerseBlocks.DEEPSLATE_SAPPHIRE_ORE);
        List<ItemLike> QUARTZ_SMELT = List.of(VerseBlocks.QUARTZ_ORE, VerseBlocks.DEEPSLATE_QUARTZ_ORE);
        List<ItemLike> AMBER_SMELT = List.of(VerseBlocks.AMBER_ORE, VerseBlocks.DEEPSLATE_AMBER_ORE);
        List<ItemLike> DRAGONRITE_SMELT = List.of(VerseBlocks.ENDSTONE_DRAGONRITE_ORE);
        List<ItemLike> COMPRESSED_COAL = List.of(VerseBlocks.COMPRESSED_COAL_ORE, VerseBlocks.COMPRESSED_DEEPSLATE_COAL_ORE);
        List<ItemLike> COMPRESSED_COPPER = List.of(VerseBlocks.COMPRESSED_COPPER_ORE, VerseBlocks.COMPRESSED_DEEPSLATE_COPPER_ORE);
        List<ItemLike> COMPRESSED_IRON = List.of(VerseBlocks.COMPRESSED_IRON_ORE, VerseBlocks.COMPRESSED_DEEPSLATE_IRON_ORE);
        List<ItemLike> COMPRESSED_GOLD = List.of(VerseBlocks.COMPRESSED_GOLD_ORE, VerseBlocks.COMPRESSED_DEEPSLATE_GOLD_ORE);
        List<ItemLike> COMPRESSED_LAPIS = List.of(VerseBlocks.COMPRESSED_LAPIS_ORE, VerseBlocks.COMPRESSED_DEEPSLATE_LAPIS_ORE);
        List<ItemLike> COMPRESSED_REDSTONE = List.of(VerseBlocks.COMPRESSED_REDSTONE_ORE, VerseBlocks.COMPRESSED_DEEPSLATE_REDSTONE_ORE);
        List<ItemLike> COMPRESSED_EMERALD = List.of(VerseBlocks.COMPRESSED_EMERALD_ORE, VerseBlocks.COMPRESSED_DEEPSLATE_EMERALD_ORE);
        List<ItemLike> COMPRESSED_DIAMOND = List.of(VerseBlocks.COMPRESSED_DIAMOND_ORE, VerseBlocks.COMPRESSED_DEEPSLATE_DIAMOND_ORE);

        //Shaped
        //Blocks
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseBlocks.BLOCK_OF_RAW_BOSKALT)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', VerseItems.RAW_BOSKALT.get())
                .unlockedBy("has_raw_boskalt", has(VerseItems.RAW_BOSKALT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseBlocks.BLOCK_OF_BOSKALT)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', VerseItems.BOSKALT_INGOT.get())
                .unlockedBy("has_boskalt_ingot", has(VerseItems.BOSKALT_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseBlocks.BLOCK_OF_GARNET)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', VerseItems.GARNET.get())
                .unlockedBy("has_garnet", has(VerseItems.GARNET))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseBlocks.BLOCK_OF_SAPPHIRE)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', VerseItems.SAPPHIRE.get())
                .unlockedBy("has_sapphire", has(VerseItems.SAPPHIRE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseBlocks.BLOCK_OF_AMBER)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', VerseItems.AMBER.get())
                .unlockedBy("has_amber", has(VerseItems.AMBER))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseBlocks.BLOCK_OF_DRAGONRITE)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', VerseItems.DRAGONRITE_INGOT.get())
                .unlockedBy("has_dragonrite_ingot", has(VerseItems.DRAGONRITE_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseBlocks.BLOCK_OF_EMERITE)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', VerseItems.EMERITE_INGOT.get())
                .unlockedBy("has_emerite_ingot", has(VerseItems.EMERITE_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseBlocks.BLOCK_OF_ECHO_SHARD)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.ECHO_SHARD)
                .unlockedBy("has_echo_shard", has(Items.ECHO_SHARD))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.SCULK_STEEL_INGOT)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', VerseBlocks.BLOCK_OF_ECHO_SHARD)
                .define('B', VerseItems.BOSKALT_INGOT)
                .unlockedBy("has_block_of_echo_shard", has(VerseBlocks.BLOCK_OF_ECHO_SHARD))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseBlocks.BLOCK_OF_SCULK_STEEL)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', VerseItems.SCULK_STEEL_INGOT.get())
                .unlockedBy("has_sculk_steel_ingot", has(VerseItems.SCULK_STEEL_INGOT))
                .save(recipeOutput);

        //Armor
        //Boskalt
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.BOSKALT_HELMET)
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .define('A', VerseItems.BOSKALT_INGOT.get())
                .unlockedBy("has_boskalt_ingot", has(VerseItems.BOSKALT_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.BOSKALT_CHESTPLATE)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', VerseItems.BOSKALT_INGOT.get())
                .unlockedBy("has_boskalt_ingot", has(VerseItems.BOSKALT_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.BOSKALT_LEGGINGS)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', VerseItems.BOSKALT_INGOT.get())
                .unlockedBy("has_boskalt_ingot", has(VerseItems.BOSKALT_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.BOSKALT_BOOTS)
                .pattern("   ")
                .pattern("A A")
                .pattern("A A")
                .define('A', VerseItems.BOSKALT_INGOT.get())
                .unlockedBy("has_boskalt_ingot", has(VerseItems.BOSKALT_INGOT))
                .save(recipeOutput);

        //Garnet
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.GARNET_HELMET)
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .define('A', VerseItems.GARNET.get())
                .unlockedBy("has_garnet", has(VerseItems.GARNET))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.GARNET_CHESTPLATE)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', VerseItems.GARNET.get())
                .unlockedBy("has_garnet", has(VerseItems.GARNET))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.GARNET_LEGGINGS)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', VerseItems.GARNET.get())
                .unlockedBy("has_garnet", has(VerseItems.GARNET))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.GARNET_BOOTS)
                .pattern("   ")
                .pattern("A A")
                .pattern("A A")
                .define('A', VerseItems.GARNET.get())
                .unlockedBy("has_garnet", has(VerseItems.GARNET))
                .save(recipeOutput);

        //Sapphire
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.SAPPHIRE_HELMET)
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .define('A', VerseItems.SAPPHIRE.get())
                .unlockedBy("has_sapphire", has(VerseItems.SAPPHIRE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.SAPPHIRE_CHESTPLATE)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', VerseItems.SAPPHIRE.get())
                .unlockedBy("has_sapphire", has(VerseItems.SAPPHIRE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.SAPPHIRE_LEGGINGS)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', VerseItems.SAPPHIRE.get())
                .unlockedBy("has_sapphire", has(VerseItems.SAPPHIRE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.SAPPHIRE_BOOTS)
                .pattern("   ")
                .pattern("A A")
                .pattern("A A")
                .define('A', VerseItems.SAPPHIRE.get())
                .unlockedBy("has_sapphire", has(VerseItems.SAPPHIRE))
                .save(recipeOutput);

        //Tools
        //Boskalt
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.BOSKALT_SHOVEL)
                .pattern(" A ")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', VerseItems.BOSKALT_INGOT.get())
                .define('B', Items.STICK)
                .unlockedBy("has_boskalt_ingot", has(VerseItems.BOSKALT_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.BOSKALT_PICKAXE)
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', VerseItems.BOSKALT_INGOT.get())
                .define('B', Items.STICK)
                .unlockedBy("has_boskalt_ingot", has(VerseItems.BOSKALT_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.BOSKALT_AXE)
                .pattern(" AA")
                .pattern(" BA")
                .pattern(" B ")
                .define('A', VerseItems.BOSKALT_INGOT.get())
                .define('B', Items.STICK)
                .unlockedBy("has_boskalt_ingot", has(VerseItems.BOSKALT_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.BOSKALT_HOE)
                .pattern(" AA")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', VerseItems.BOSKALT_INGOT.get())
                .define('B', Items.STICK)
                .unlockedBy("has_boskalt_ingot", has(VerseItems.BOSKALT_INGOT))
                .save(recipeOutput);

        //Garnet
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.GARNET_SHOVEL)
                .pattern(" A ")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', VerseItems.GARNET.get())
                .define('B', Items.STICK)
                .unlockedBy("has_garnet", has(VerseItems.GARNET))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.GARNET_PICKAXE)
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', VerseItems.GARNET.get())
                .define('B', Items.STICK)
                .unlockedBy("has_garnet", has(VerseItems.GARNET))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.GARNET_AXE)
                .pattern(" AA")
                .pattern(" BA")
                .pattern(" B ")
                .define('A', VerseItems.GARNET.get())
                .define('B', Items.STICK)
                .unlockedBy("has_garnet", has(VerseItems.GARNET))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.GARNET_HOE)
                .pattern(" AA")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', VerseItems.GARNET.get())
                .define('B', Items.STICK)
                .unlockedBy("has_garnet", has(VerseItems.GARNET))
                .save(recipeOutput);

        //Sapphire
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.SAPPHIRE_SHOVEL)
                .pattern(" A ")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', VerseItems.SAPPHIRE.get())
                .define('B', Items.STICK)
                .unlockedBy("has_garnet", has(VerseItems.SAPPHIRE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.SAPPHIRE_PICKAXE)
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', VerseItems.SAPPHIRE.get())
                .define('B', Items.STICK)
                .unlockedBy("has_garnet", has(VerseItems.SAPPHIRE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.SAPPHIRE_AXE)
                .pattern(" AA")
                .pattern(" BA")
                .pattern(" B ")
                .define('A', VerseItems.SAPPHIRE.get())
                .define('B', Items.STICK)
                .unlockedBy("has_garnet", has(VerseItems.SAPPHIRE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.SAPPHIRE_HOE)
                .pattern(" AA")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', VerseItems.SAPPHIRE.get())
                .define('B', Items.STICK)
                .unlockedBy("has_garnet", has(VerseItems.SAPPHIRE))
                .save(recipeOutput);

        //Weapons
        //Swords
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.BOSKALT_SWORD)
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" B ")
                .define('A', VerseItems.BOSKALT_INGOT.get())
                .define('B', Items.STICK)
                .unlockedBy("has_boskalt_ingot", has(VerseItems.BOSKALT_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.GARNET_SWORD)
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" B ")
                .define('A', VerseItems.GARNET.get())
                .define('B', Items.STICK)
                .unlockedBy("has_garnet", has(VerseItems.GARNET))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.SAPPHIRE_SWORD)
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" B ")
                .define('A', VerseItems.SAPPHIRE.get())
                .define('B', Items.STICK)
                .unlockedBy("has_garnet", has(VerseItems.SAPPHIRE))
                .save(recipeOutput);

        //Broadswords
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.IRON_BROADSWORD)
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" B ")
                .define('A', Items.IRON_BLOCK)
                .define('B', Items.STICK)
                .unlockedBy("has_iron_block", has(Items.IRON_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.BOSKALT_BROADSWORD)
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" B ")
                .define('A', VerseBlocks.BLOCK_OF_BOSKALT.get())
                .define('B', Items.STICK)
                .unlockedBy("has_block_of_boskalt", has(VerseBlocks.BLOCK_OF_BOSKALT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.DIAMOND_BROADSWORD)
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" B ")
                .define('A', Items.DIAMOND_BLOCK)
                .define('B', Items.STICK)
                .unlockedBy("has_diamond_block", has(Items.DIAMOND_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.GARNET_BROADSWORD)
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" B ")
                .define('A', VerseBlocks.BLOCK_OF_GARNET.get())
                .define('B', Items.STICK)
                .unlockedBy("has_block_of_garnet", has(VerseBlocks.BLOCK_OF_GARNET))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.SAPPHIRE_BROADSWORD)
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" B ")
                .define('A', VerseBlocks.BLOCK_OF_SAPPHIRE.get())
                .define('B', Items.STICK)
                .unlockedBy("has_block_of_sapphire", has(VerseBlocks.BLOCK_OF_SAPPHIRE))
                .save(recipeOutput);

        //Knifes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.IRON_KNIFE)
                .pattern("   ")
                .pattern(" A ")
                .pattern("B  ")
                .define('A', Items.IRON_INGOT)
                .define('B', Items.STICK)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.BOSKALT_KNIFE)
                .pattern("   ")
                .pattern(" A ")
                .pattern("B  ")
                .define('A', VerseItems.BOSKALT_INGOT.get())
                .define('B', Items.STICK)
                .unlockedBy("has_boskalt_ingot", has(VerseItems.BOSKALT_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.DIAMOND_KNIFE)
                .pattern("   ")
                .pattern(" A ")
                .pattern("B  ")
                .define('A', Items.DIAMOND)
                .define('B', Items.STICK)
                .unlockedBy("has_diamond", has(Items.DIAMOND))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.GARNET_KNIFE)
                .pattern("   ")
                .pattern(" A ")
                .pattern("B  ")
                .define('A', VerseItems.GARNET.get())
                .define('B', Items.STICK)
                .unlockedBy("has_garnet", has(VerseItems.GARNET))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.SAPPHIRE_KNIFE)
                .pattern("   ")
                .pattern(" A ")
                .pattern("B  ")
                .define('A', VerseItems.SAPPHIRE.get())
                .define('B', Items.STICK)
                .unlockedBy("has_sapphire", has(VerseItems.SAPPHIRE))
                .save(recipeOutput);

        //Food
        //Ore Apples
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.COAL_APPLE)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.COAL)
                .define('B', Items.APPLE)
                .unlockedBy("has_coal", has(Items.COAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.COPPER_APPLE)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.COPPER_INGOT)
                .define('B', Items.APPLE)
                .unlockedBy("has_copper", has(Items.COPPER_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.IRON_APPLE)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.IRON_INGOT)
                .define('B', Items.APPLE)
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.REDSTONE_APPLE)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.REDSTONE)
                .define('B', Items.APPLE)
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.LAPIS_APPLE)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.LAPIS_LAZULI)
                .define('B', Items.APPLE)
                .unlockedBy("has_lapis", has(Items.LAPIS_LAZULI))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.EMERALD_APPLE)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.EMERALD)
                .define('B', Items.APPLE)
                .unlockedBy("has_emerald", has(Items.EMERALD))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.DIAMOND_APPLE)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.DIAMOND)
                .define('B', Items.APPLE)
                .unlockedBy("has_diamond", has(Items.DIAMOND))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DIAMOND)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', VerseItems.DIAMOND_NUGGET)
                .unlockedBy("has_diamond_nugget", has(VerseItems.DIAMOND_NUGGET))
                .save(recipeOutput, "diamond_from_diamond_nugget");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.SAPPHIRE)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', VerseItems.SAPPHIRE_NUGGET)
                .unlockedBy("has_sapphire_nugget", has(VerseItems.SAPPHIRE_NUGGET))
                .save(recipeOutput, "sapphire_from_sapphire_nugget");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.GARNET)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', VerseItems.GARNET_NUGGET)
                .unlockedBy("has_garnet_nugget", has(VerseItems.GARNET_NUGGET))
                .save(recipeOutput, "garnet_from_garnet_nugget");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.DRAGONRITE_INGOT)
                .pattern("AAA")
                .pattern("ABB")
                .pattern("BB ")
                .define('A', VerseItems.DRAGONRITE_SCRAP)
                .define('B', VerseItems.DIAMOND_NUGGET)
                .unlockedBy("has_dragonrite_scrap", has(VerseItems.DRAGONRITE_SCRAP))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.EMERITE_INGOT)
                .pattern("AAA")
                .pattern("BCD")
                .pattern("BCD")
                .define('A', Items.EMERALD)
                .define('B', VerseItems.DIAMOND_NUGGET)
                .define('C', VerseItems.SAPPHIRE_NUGGET)
                .define('D', VerseItems.GARNET_NUGGET)
                .unlockedBy("has_emerite_ingot", has(VerseItems.EMERITE_INGOT))
                .save(recipeOutput);

        //Enchanted Shards
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.ENCHANTED_WEAK_SHARD, 2)
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A', Items.AMETHYST_SHARD)
                .define('B', Items.EXPERIENCE_BOTTLE)
                .unlockedBy("has_amethyst_shard", has(Items.AMETHYST_SHARD))
                .save(recipeOutput);

        //Enchanted Scrolls
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.ENCHANTED_WEAK_SCROLL)
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A', VerseItems.ENCHANTED_WEAK_SHARD)
                .define('B', Items.PAPER)
                .unlockedBy("has_enchanted_weak_shard", has(VerseItems.ENCHANTED_WEAK_SHARD))
                .save(recipeOutput);

        //Functional Blocks
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseBlocks.ALTAR)
                .pattern("A A")
                .pattern(" A ")
                .pattern("ABA")
                .define('A', Items.STONE)
                .define('B', VerseItems.ENCHANTED_WEAK_SCROLL)
                .unlockedBy("has_enchanted_weak_shard", has(VerseItems.ENCHANTED_WEAK_SHARD))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseBlocks.REINFORCED_STONE)
                .pattern("BAB")
                .pattern("ABA")
                .pattern("BAB")
                .define('A', Items.STONE)
                .define('B', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                .save(recipeOutput);

        //Crafting Items
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.AMBER_LENS_CORE.get())
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', VerseItems.AMBER.get())
                .define('B', Items.GLASS_PANE)
                .unlockedBy("has_amber", has(VerseItems.AMBER))
                .save(recipeOutput);

        //Fuel Items
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.AMBER_LENS.get())
                .pattern("ACA")
                .pattern("ABA")
                .pattern("ACA")
                .define('A', VerseItems.AMBER.get())
                .define('B', VerseItems.AMBER_LENS_CORE.get())
                .define('C', VerseBlocks.BLOCK_OF_AMBER.get())
                .unlockedBy("has_amber_lens_core", has(VerseItems.AMBER_LENS_CORE))
                .save(recipeOutput);

        //Smithing Templates Crafting
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.UPGRADE_TEMPLATE_BASE.get())
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', VerseItems.BOSKALT_INGOT.get())
                .define('B', Items.STONE)
                .unlockedBy("has_boskalt_ingot", has(VerseItems.BOSKALT_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                .pattern("BAB")
                .pattern("DCD")
                .pattern("BAB")
                .define('A', Items.NETHERITE_SCRAP)
                .define('B', Items.NETHERRACK)
                .define('C', VerseItems.UPGRADE_TEMPLATE_BASE.get())
                .define('D', Items.GOLD_INGOT)
                .unlockedBy("has_netherite_ingot", has(Items.NETHERITE_INGOT))
                .save(recipeOutput, "netherite_upgrade_template_from_template");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.EMERITE_UPGRADE_SMITHING_TEMPLATE.get())
                .pattern("BAB")
                .pattern("ACA")
                .pattern("BAB")
                .define('A', VerseItems.EMERITE_INGOT.get())
                .define('B', Items.STONE)
                .define('C', VerseItems.UPGRADE_TEMPLATE_BASE.get())
                .unlockedBy("has_emerite_ingot", has(VerseItems.EMERITE_INGOT))
                .save(recipeOutput, "emerite_upgrade_template_from_template");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.DRAGONRITE_UPGRADE_SMITHING_TEMPLATE.get())
                .pattern("BAB")
                .pattern("ACA")
                .pattern("BAB")
                .define('A', VerseItems.DRAGONRITE_SCRAP.get())
                .define('B', Items.END_STONE)
                .define('C', VerseTags.Items.TIER_3_UPGRADE)
                .unlockedBy("has_dragonrite_ingot", has(VerseItems.DRAGONRITE_INGOT))
                .save(recipeOutput, "dragonrite_upgrade_template_from_template");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, VerseItems.SCULK_STEEL_UPGRADE_SMITHING_TEMPLATE.get())
                .pattern("BAB")
                .pattern("ACA")
                .pattern("BAB")
                .define('A', Items.ECHO_SHARD)
                .define('B', Items.SCULK)
                .define('C', VerseTags.Items.TIER_3_UPGRADE)
                .unlockedBy("has_sculk_steel_ingot", has(VerseItems.SCULK_STEEL_INGOT))
                .save(recipeOutput, "sculk_steel_upgrade_template_from_template");

        //Shapeless
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VerseItems.RAW_BOSKALT.get(), 9)
                .requires(VerseBlocks.BLOCK_OF_RAW_BOSKALT)
                .unlockedBy("has_block_of_raw_boskalt", has(VerseBlocks.BLOCK_OF_RAW_BOSKALT))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VerseItems.BOSKALT_INGOT.get(), 9)
                .requires(VerseBlocks.BLOCK_OF_BOSKALT)
                .unlockedBy("has_block_of_boskalt", has(VerseBlocks.BLOCK_OF_BOSKALT))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VerseItems.GARNET.get(), 9)
                .requires(VerseBlocks.BLOCK_OF_GARNET)
                .unlockedBy("has_block_of_garnet", has(VerseBlocks.BLOCK_OF_GARNET))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VerseItems.SAPPHIRE.get(), 9)
                .requires(VerseBlocks.BLOCK_OF_SAPPHIRE)
                .unlockedBy("has_block_of_sapphire", has(VerseBlocks.BLOCK_OF_SAPPHIRE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VerseItems.AMBER.get(), 9)
                .requires(VerseBlocks.BLOCK_OF_AMBER)
                .unlockedBy("has_block_of_amber", has(VerseBlocks.BLOCK_OF_AMBER))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VerseItems.DIAMOND_NUGGET.get(), 9)
                .requires(Items.DIAMOND)
                .unlockedBy("has_diamond", has(Items.DIAMOND))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VerseItems.SAPPHIRE_NUGGET.get(), 9)
                .requires(VerseItems.SAPPHIRE)
                .unlockedBy("has_sapphire", has(VerseItems.SAPPHIRE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, VerseItems.GARNET_NUGGET.get(), 9)
                .requires(VerseItems.GARNET)
                .unlockedBy("has_garnet", has(VerseItems.GARNET))
                .save(recipeOutput);

        //Smithing Template Duplication
        copySmithingTemplate(recipeOutput, VerseItems.DRAGONRITE_UPGRADE_SMITHING_TEMPLATE.get(), Items.END_STONE);
        copySmithingTemplate(recipeOutput, VerseItems.EMERITE_UPGRADE_SMITHING_TEMPLATE.get(), Items.STONE);
        copySmithingTemplate(recipeOutput, VerseItems.SCULK_STEEL_UPGRADE_SMITHING_TEMPLATE.get(), Items.SCULK);

        //Ore Smelting
        oreSmelting(recipeOutput, BOSKALT_SMELT, RecipeCategory.MISC, VerseItems.BOSKALT_INGOT, 0.25f, 200, "boskalt");
        oreSmelting(recipeOutput, GARNET_SMELT, RecipeCategory.MISC, VerseItems.GARNET, 0.25f, 200, "garnet");
        oreSmelting(recipeOutput, SAPPHIRE_SMELT, RecipeCategory.MISC, VerseItems.SAPPHIRE, 0.25f, 200, "sapphire");
        oreSmelting(recipeOutput, QUARTZ_SMELT, RecipeCategory.MISC, VerseItems.QUARTZ, 0.25f, 200, "quartz");
        oreSmelting(recipeOutput, AMBER_SMELT, RecipeCategory.MISC, VerseItems.AMBER, 0.25f, 200, "amber");
        oreSmelting(recipeOutput, DRAGONRITE_SMELT, RecipeCategory.MISC, VerseItems.DRAGONRITE_SCRAP, 0.25f, 200, "dragonrite");
        oreSmelting(recipeOutput, COMPRESSED_COAL, RecipeCategory.MISC, Items.COAL_BLOCK, 0.25f, 200, "coal");
        oreSmelting(recipeOutput, COMPRESSED_COPPER, RecipeCategory.MISC, Items.IRON_BLOCK, 0.25f, 200, "copper");
        oreSmelting(recipeOutput, COMPRESSED_IRON, RecipeCategory.MISC, Items.COPPER_BLOCK, 0.25f, 200, "iron");
        oreSmelting(recipeOutput, COMPRESSED_GOLD, RecipeCategory.MISC, Items.GOLD_BLOCK, 0.25f, 200, "gold");
        oreSmelting(recipeOutput, COMPRESSED_LAPIS, RecipeCategory.MISC, Items.LAPIS_BLOCK, 0.25f, 200, "lapis");
        oreSmelting(recipeOutput, COMPRESSED_REDSTONE, RecipeCategory.MISC, Items.REDSTONE_BLOCK, 0.25f, 200, "redstone");
        oreSmelting(recipeOutput, COMPRESSED_EMERALD, RecipeCategory.MISC, Items.EMERALD_BLOCK, 0.25f, 200, "emerald");
        oreSmelting(recipeOutput, COMPRESSED_DIAMOND, RecipeCategory.MISC, Items.DIAMOND_BLOCK, 0.25f, 200, "diamond");

        //Ore Blasting
        oreBlasting(recipeOutput, BOSKALT_SMELT, RecipeCategory.MISC, VerseItems.BOSKALT_INGOT, 0.25f, 100, "boskalt");
        oreBlasting(recipeOutput, GARNET_SMELT, RecipeCategory.MISC, VerseItems.GARNET, 0.25f, 100, "garnet");
        oreBlasting(recipeOutput, SAPPHIRE_SMELT, RecipeCategory.MISC, VerseItems.SAPPHIRE, 0.25f, 100, "sapphire");
        oreBlasting(recipeOutput, QUARTZ_SMELT, RecipeCategory.MISC, VerseItems.QUARTZ, 0.25f, 100, "quartz");
        oreBlasting(recipeOutput, AMBER_SMELT, RecipeCategory.MISC, VerseItems.AMBER, 0.25f, 100, "amber");
        oreBlasting(recipeOutput, DRAGONRITE_SMELT, RecipeCategory.MISC, VerseItems.DRAGONRITE_SCRAP, 0.25f, 100, "dragonrite");
        oreBlasting(recipeOutput, COMPRESSED_COAL, RecipeCategory.MISC, Items.COAL_BLOCK, 0.25f, 100, "coal");
        oreBlasting(recipeOutput, COMPRESSED_COPPER, RecipeCategory.MISC, Items.IRON_BLOCK, 0.25f, 200, "copper");
        oreBlasting(recipeOutput, COMPRESSED_IRON, RecipeCategory.MISC, Items.COPPER_BLOCK, 0.25f, 100, "iron");
        oreBlasting(recipeOutput, COMPRESSED_GOLD, RecipeCategory.MISC, Items.GOLD_BLOCK, 0.25f, 100, "gold");
        oreBlasting(recipeOutput, COMPRESSED_LAPIS, RecipeCategory.MISC, Items.LAPIS_BLOCK, 0.25f, 100, "lapis");
        oreBlasting(recipeOutput, COMPRESSED_REDSTONE, RecipeCategory.MISC, Items.REDSTONE_BLOCK, 0.25f, 100, "redstone");
        oreBlasting(recipeOutput, COMPRESSED_EMERALD, RecipeCategory.MISC, Items.EMERALD_BLOCK, 0.25f, 100, "emerald");
        oreBlasting(recipeOutput, COMPRESSED_DIAMOND, RecipeCategory.MISC, Items.DIAMOND_BLOCK, 0.25f, 100, "diamond");

        //Smithing
        //Emerite
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_SWORD, RecipeCategory.MISC, VerseItems.EMERITE_SWORD.get(),
                VerseItems.EMERITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.EMERITE_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_SHOVEL, RecipeCategory.MISC, VerseItems.EMERITE_SHOVEL.get(),
                VerseItems.EMERITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.EMERITE_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_PICKAXE, RecipeCategory.MISC, VerseItems.EMERITE_PICKAXE.get(),
                VerseItems.EMERITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.EMERITE_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_AXE, RecipeCategory.MISC, VerseItems.EMERITE_AXE.get(),
                VerseItems.EMERITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.EMERITE_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_HOE, RecipeCategory.MISC, VerseItems.EMERITE_HOE.get(),
                VerseItems.EMERITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.EMERITE_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_HELMET, RecipeCategory.MISC, VerseItems.EMERITE_HELMET.get(),
                VerseItems.EMERITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.EMERITE_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_CHESTPLATE, RecipeCategory.MISC, VerseItems.EMERITE_CHESTPLATE.get(),
                VerseItems.EMERITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.EMERITE_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_LEGGINGS, RecipeCategory.MISC, VerseItems.EMERITE_LEGGINGS.get(),
                VerseItems.EMERITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.EMERITE_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_BOOTS, RecipeCategory.MISC, VerseItems.EMERITE_BOOTS.get(),
                VerseItems.EMERITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.EMERITE_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_BROADSWORD, RecipeCategory.MISC, VerseItems.EMERITE_BROADSWORD.get(),
                VerseItems.EMERITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseBlocks.BLOCK_OF_EMERITE.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_KNIFE, RecipeCategory.MISC, VerseItems.EMERITE_KNIFE.get(),
                VerseItems.EMERITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.EMERITE_INGOT.get());

        //Dragonrite
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_SWORD, RecipeCategory.MISC, VerseItems.DRAGONRITE_SWORD.get(),
                VerseItems.DRAGONRITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.DRAGONRITE_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_SHOVEL, RecipeCategory.MISC, VerseItems.DRAGONRITE_SHOVEL.get(),
                VerseItems.DRAGONRITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.DRAGONRITE_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_PICKAXE, RecipeCategory.MISC, VerseItems.DRAGONRITE_PICKAXE.get(),
                VerseItems.DRAGONRITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.DRAGONRITE_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_AXE, RecipeCategory.MISC, VerseItems.DRAGONRITE_AXE.get(),
                VerseItems.DRAGONRITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.DRAGONRITE_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_HOE, RecipeCategory.MISC, VerseItems.DRAGONRITE_HOE.get(),
                VerseItems.DRAGONRITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.DRAGONRITE_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_HELMET, RecipeCategory.MISC, VerseItems.DRAGONRITE_HELMET.get(),
                VerseItems.DRAGONRITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.DRAGONRITE_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_CHESTPLATE, RecipeCategory.MISC, VerseItems.DRAGONRITE_CHESTPLATE.get(),
                VerseItems.DRAGONRITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.DRAGONRITE_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_LEGGINGS, RecipeCategory.MISC, VerseItems.DRAGONRITE_LEGGINGS.get(),
                VerseItems.DRAGONRITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.DRAGONRITE_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_BOOTS, RecipeCategory.MISC, VerseItems.DRAGONRITE_BOOTS.get(),
                VerseItems.DRAGONRITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.DRAGONRITE_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_BROADSWORD, RecipeCategory.MISC, VerseItems.DRAGONRITE_BROADSWORD.get(),
                VerseItems.DRAGONRITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseBlocks.BLOCK_OF_DRAGONRITE.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_KNIFE, RecipeCategory.MISC, VerseItems.DRAGONRITE_KNIFE.get(),
                VerseItems.DRAGONRITE_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.DRAGONRITE_INGOT.get());

        //Sculk Steel
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_SWORD, RecipeCategory.MISC, VerseItems.SCULK_STEEL_SWORD.get(),
                VerseItems.SCULK_STEEL_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.SCULK_STEEL_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_SHOVEL, RecipeCategory.MISC, VerseItems.SCULK_STEEL_SHOVEL.get(),
                VerseItems.SCULK_STEEL_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.SCULK_STEEL_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_PICKAXE, RecipeCategory.MISC, VerseItems.SCULK_STEEL_PICKAXE.get(),
                VerseItems.SCULK_STEEL_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.SCULK_STEEL_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_AXE, RecipeCategory.MISC, VerseItems.SCULK_STEEL_AXE.get(),
                VerseItems.SCULK_STEEL_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.SCULK_STEEL_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_HOE, RecipeCategory.MISC, VerseItems.SCULK_STEEL_HOE.get(),
                VerseItems.SCULK_STEEL_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.SCULK_STEEL_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_HELMET, RecipeCategory.MISC, VerseItems.SCULK_STEEL_HELMET.get(),
                VerseItems.SCULK_STEEL_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.SCULK_STEEL_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_CHESTPLATE, RecipeCategory.MISC, VerseItems.SCULK_STEEL_CHESTPLATE.get(),
                VerseItems.SCULK_STEEL_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.SCULK_STEEL_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_LEGGINGS, RecipeCategory.MISC, VerseItems.SCULK_STEEL_LEGGINGS.get(),
                VerseItems.SCULK_STEEL_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.SCULK_STEEL_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_BOOTS, RecipeCategory.MISC, VerseItems.SCULK_STEEL_BOOTS.get(),
                VerseItems.SCULK_STEEL_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.SCULK_STEEL_INGOT.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_BROADSWORD, RecipeCategory.MISC, VerseItems.SCULK_STEEL_BROADSWORD.get(),
                VerseItems.SCULK_STEEL_UPGRADE_SMITHING_TEMPLATE.get(), VerseBlocks.BLOCK_OF_SCULK_STEEL.get());
        customSmithing(recipeOutput, VerseTags.Items.TIER_3_KNIFE, RecipeCategory.MISC, VerseItems.SCULK_STEEL_KNIFE.get(),
                VerseItems.SCULK_STEEL_UPGRADE_SMITHING_TEMPLATE.get(), VerseItems.SCULK_STEEL_INGOT.get());



        //Vanilla Override Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.QUARTZ_BLOCK)
                .pattern("AA ")
                .pattern("AA ")
                .pattern("   ")
                .define('A', Tags.Items.GEMS_QUARTZ)
                .unlockedBy("has_quartz_gems", has(Tags.Items.GEMS_QUARTZ))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DAYLIGHT_DETECTOR)
                .pattern("BBB")
                .pattern("AAA")
                .pattern("CCC")
                .define('A', Tags.Items.GEMS_QUARTZ)
                .define('B', Items.GLASS)
                .define('C', ItemTags.WOODEN_SLABS)
                .unlockedBy("has_quartz_gems", has(Tags.Items.GEMS_QUARTZ))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DIORITE, 2)
                .pattern("BA ")
                .pattern("AB ")
                .pattern("   ")
                .define('A', Tags.Items.GEMS_QUARTZ)
                .define('B', Items.COBBLESTONE)
                .unlockedBy("has_quartz_gems", has(Tags.Items.GEMS_QUARTZ))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.GRANITE)
                .pattern("   ")
                .pattern("BA ")
                .pattern("   ")
                .define('A', Tags.Items.GEMS_QUARTZ)
                .define('B', Items.DIORITE)
                .unlockedBy("has_quartz_gems", has(Tags.Items.GEMS_QUARTZ))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Items.OBSERVER)
                .pattern("BBB")
                .pattern("CCA")
                .pattern("BBB")
                .define('A', Tags.Items.GEMS_QUARTZ)
                .define('B', Items.COBBLESTONE)
                .define('C', Items.REDSTONE)
                .unlockedBy("has_quartz_gems", has(Tags.Items.GEMS_QUARTZ))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COMPARATOR)
                .pattern(" C ")
                .pattern("CAC")
                .pattern("BBB")
                .define('A', Tags.Items.GEMS_QUARTZ)
                .define('B', Items.STONE)
                .define('C', Items.REDSTONE_TORCH)
                .unlockedBy("has_quartz_gems", has(Tags.Items.GEMS_QUARTZ))
                .save(recipeOutput);

        //Netherite
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_SWORD, RecipeCategory.MISC, Items.NETHERITE_SWORD,
                Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.NETHERITE_INGOT);
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_SHOVEL, RecipeCategory.MISC, Items.NETHERITE_SHOVEL,
                Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.NETHERITE_INGOT);
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_PICKAXE, RecipeCategory.MISC, Items.NETHERITE_PICKAXE,
                Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.NETHERITE_INGOT);
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_AXE, RecipeCategory.MISC, Items.NETHERITE_AXE,
                Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.NETHERITE_INGOT);
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_HOE, RecipeCategory.MISC, Items.NETHERITE_HOE,
                Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.NETHERITE_INGOT);
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_HELMET, RecipeCategory.MISC, Items.NETHERITE_HELMET,
                Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.NETHERITE_INGOT);
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_CHESTPLATE, RecipeCategory.MISC, Items.NETHERITE_CHESTPLATE,
                Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.NETHERITE_INGOT);
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_LEGGINGS, RecipeCategory.MISC, Items.NETHERITE_LEGGINGS,
                Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.NETHERITE_INGOT);
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_BOOTS, RecipeCategory.MISC, Items.NETHERITE_BOOTS,
                Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.NETHERITE_INGOT);
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_BROADSWORD, RecipeCategory.MISC, VerseItems.NETHERITE_BROADSWORD.get(),
                Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.NETHERITE_BLOCK);
        customSmithing(recipeOutput, VerseTags.Items.TIER_2_KNIFE, RecipeCategory.MISC, VerseItems.NETHERITE_KNIFE.get(),
                Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.NETHERITE_INGOT);
    }

    //Custom Recipe Methods / override minecraft namespace for furnaces and blast furnaces
    //Smithing Recipe without tag for input item
    protected static void customSmithing(RecipeOutput recipeOutput, Item inputItem, RecipeCategory category, ItemLike resultItem, Item template, Item upgradeMaterial) {
        SmithingTransformRecipeBuilder.smithing(
                Ingredient.of(template), Ingredient.of(inputItem),
                Ingredient.of(upgradeMaterial), category, (Item) resultItem
        )
                .unlocks("has_" + upgradeMaterial, has(upgradeMaterial))
                .save(recipeOutput, VERSE.MODID + ":" + getItemName(resultItem));
    }

    //Smithing Recipe with tag for input item
    protected static void customSmithing(RecipeOutput recipeOutput, TagKey<Item> inputItem, RecipeCategory category, Item resultItem, Item template, Item upgradeMaterial) {
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(template), Ingredient.of(inputItem),
                        Ingredient.of(upgradeMaterial), category, (Item) resultItem
                )
                .unlocks("has_" + upgradeMaterial, has(upgradeMaterial))
                .save(recipeOutput, VERSE.MODID + ":" + getItemName(resultItem));
    }

    //Smithing Recipe with tag for broadswords, since they use a block instead of an item
    protected static void customSmithing(RecipeOutput recipeOutput, TagKey<Item> inputItem, RecipeCategory category, Item resultItem, Item template, Block upgradeMaterial) {
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(template), Ingredient.of(inputItem),
                        Ingredient.of(upgradeMaterial), category, (Item) resultItem
                )
                .unlocks("has_" + upgradeMaterial, has(upgradeMaterial))
                .save(recipeOutput, VERSE.MODID + ":" + getItemName(resultItem));
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> ingredients, RecipeCategory category, ItemLike result, float experience, int cookingTime, String group) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, ingredients, category, result, experience, cookingTime, group, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> ingredients, RecipeCategory category, ItemLike result, float experience, int cookingTime, String group) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, ingredients, category, result, experience, cookingTime, group, "_from_blasting");
    }

    //Changes the minecraft namespace to the verse namespace
    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, VERSE.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
