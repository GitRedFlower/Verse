package net.redflower.verse.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.redflower.verse.block.VerseBlocks;
import net.redflower.verse.item.VerseItems;

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

        //smelting
        oreSmelting(recipeOutput, BOSKALT_SMELT, RecipeCategory.MISC, VerseItems.BOSKALT_INGOT, 0.25f, 200, "boskalt");
        oreSmelting(recipeOutput, GARNET_SMELT, RecipeCategory.MISC, VerseItems.GARNET, 0.25f, 200, "garnet");
        oreSmelting(recipeOutput, SAPPHIRE_SMELT, RecipeCategory.MISC, VerseItems.SAPPHIRE, 0.25f, 200, "sapphire");
        oreSmelting(recipeOutput, QUARTZ_SMELT, RecipeCategory.MISC, VerseItems.QUARTZ, 0.25f, 200, "quartz");

        //blasting
        oreBlasting(recipeOutput, BOSKALT_SMELT, RecipeCategory.MISC, VerseItems.BOSKALT_INGOT, 0.25f, 100, "boskalt");
        oreBlasting(recipeOutput, GARNET_SMELT, RecipeCategory.MISC, VerseItems.GARNET, 0.25f, 100, "garnet");
        oreBlasting(recipeOutput, SAPPHIRE_SMELT, RecipeCategory.MISC, VerseItems.SAPPHIRE, 0.25f, 100, "sapphire");
        oreBlasting(recipeOutput, QUARTZ_SMELT, RecipeCategory.MISC, VerseItems.QUARTZ, 0.25f, 100, "quartz");

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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.OBSERVER)
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
    }
}
