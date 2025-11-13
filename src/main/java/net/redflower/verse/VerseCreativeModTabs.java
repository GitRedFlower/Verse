package net.redflower.verse;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redflower.verse.block.VerseBlocks;
import net.redflower.verse.item.VerseItems;

import java.util.function.Supplier;

public class VerseCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VERSE.MODID);

    public static final Supplier<CreativeModeTab> VERSE_BLOCKS_TAB = CREATIVE_MODE_TAB.register("verse_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(VerseBlocks.BOSKALT_ORE.get()))
                    .title(Component.translatable("creativetab.verse.blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Overworld Ores
                        output.accept(VerseBlocks.BOSKALT_ORE);
                        output.accept(VerseBlocks.DEEPSLATE_BOSKALT_ORE);
                        output.accept(VerseBlocks.QUARTZ_ORE);
                        output.accept(VerseBlocks.DEEPSLATE_QUARTZ_ORE);
                        output.accept(VerseBlocks.AMBER_ORE);
                        output.accept(VerseBlocks.DEEPSLATE_AMBER_ORE);
                        output.accept(VerseBlocks.GARNET_ORE);
                        output.accept(VerseBlocks.DEEPSLATE_GARNET_ORE);
                        output.accept(VerseBlocks.SAPPHIRE_ORE);
                        output.accept(VerseBlocks.DEEPSLATE_SAPPHIRE_ORE);

                        //Nether Ores

                        //End Ores
                        output.accept(VerseBlocks.ENDSTONE_DRAGONRITE_ORE);

                        //Raw Ore Blocks
                        output.accept(VerseBlocks.BLOCK_OF_RAW_BOSKALT);

                        //Material Blocks
                        output.accept(VerseBlocks.BLOCK_OF_BOSKALT);
                        output.accept(VerseBlocks.BLOCK_OF_AMBER);
                        output.accept(VerseBlocks.BLOCK_OF_GARNET);
                        output.accept(VerseBlocks.BLOCK_OF_SAPPHIRE);
                        output.accept(VerseBlocks.BLOCK_OF_DRAGONRITE);

                        //Functional Blocks
                        output.accept(VerseBlocks.ALTAR);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> VERSE_ITEMS_TAB = CREATIVE_MODE_TAB.register("verse_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(VerseItems.BOSKALT_INGOT.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(VERSE.MODID, "verse_blocks_tab"))
                    .title(Component.translatable("creativetab.verse.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Raw Items
                        output.accept(VerseItems.RAW_BOSKALT);
                        output.accept(VerseItems.DRAGONRITE_SCRAP);

                        //Other Items
                        output.accept(VerseItems.QUARTZ);
                        output.accept(VerseItems.AMBER);

                        //Tier 1 Materials
                        output.accept(VerseItems.BOSKALT_INGOT);

                        //Tier 2 Materials
                        output.accept(VerseItems.GARNET);
                        output.accept(VerseItems.SAPPHIRE);

                        //Tier 3 Materials

                        //Tier 4 Materials
                        output.accept(VerseItems.DRAGONRITE_INGOT);

                        //Tier 5 Materials

                        //Tools
                        output.accept(VerseItems.BOSKALT_SHOVEL);
                        output.accept(VerseItems.BOSKALT_PICKAXE);
                        output.accept(VerseItems.BOSKALT_AXE);
                        output.accept(VerseItems.BOSKALT_HOE);
                        output.accept(VerseItems.GARNET_SHOVEL);
                        output.accept(VerseItems.GARNET_PICKAXE);
                        output.accept(VerseItems.GARNET_AXE);
                        output.accept(VerseItems.GARNET_HOE);
                        output.accept(VerseItems.SAPPHIRE_SHOVEL);
                        output.accept(VerseItems.SAPPHIRE_PICKAXE);
                        output.accept(VerseItems.SAPPHIRE_AXE);
                        output.accept(VerseItems.SAPPHIRE_HOE);

                        //Swords
                        output.accept(VerseItems.BOSKALT_SWORD);
                        output.accept(VerseItems.GARNET_SWORD);
                        output.accept(VerseItems.SAPPHIRE_SWORD);

                        //Armor
                        output.accept(VerseItems.BOSKALT_HELMET);
                        output.accept(VerseItems.BOSKALT_CHESTPLATE);
                        output.accept(VerseItems.BOSKALT_LEGGINGS);
                        output.accept(VerseItems.BOSKALT_BOOTS);
                        output.accept(VerseItems.GARNET_HELMET);
                        output.accept(VerseItems.GARNET_CHESTPLATE);
                        output.accept(VerseItems.GARNET_LEGGINGS);
                        output.accept(VerseItems.GARNET_BOOTS);
                        output.accept(VerseItems.SAPPHIRE_HELMET);
                        output.accept(VerseItems.SAPPHIRE_CHESTPLATE);
                        output.accept(VerseItems.SAPPHIRE_LEGGINGS);
                        output.accept(VerseItems.SAPPHIRE_BOOTS);

                        //Crafting Items
                        output.accept(VerseItems.AMBER_LENS_CORE);

                        //Fuel Items
                        output.accept(VerseItems.AMBER_LENS);

                        //Food Items
                        //Ore Apples
                        output.accept(VerseItems.COAL_APPLE);
                        output.accept(VerseItems.COPPER_APPLE);
                        output.accept(VerseItems.IRON_APPLE);
                        output.accept(VerseItems.REDSTONE_APPLE);
                        output.accept(VerseItems.LAPIS_APPLE);
                        output.accept(VerseItems.EMERALD_APPLE);
                        output.accept(VerseItems.DIAMOND_APPLE);
                        output.accept(VerseItems.ENCHANTED_COAL_APPLE);
                        output.accept(VerseItems.ENCHANTED_COPPER_APPLE);
                        output.accept(VerseItems.ENCHANTED_IRON_APPLE);
                        output.accept(VerseItems.ENCHANTED_REDSTONE_APPLE);
                        output.accept(VerseItems.ENCHANTED_LAPIS_APPLE);
                        output.accept(VerseItems.ENCHANTED_EMERALD_APPLE);
                        output.accept(VerseItems.ENCHANTED_DIAMOND_APPLE);

                        //Enchanted Shards
                        output.accept(VerseItems.ENCHANTED_WEAK_SHARD);

                        //Enchanted Scrolls
                        output.accept(VerseItems.ENCHANTED_WEAK_SCROLL);
                    })
                    .build());




    public static void register(IEventBus eventBus) {CREATIVE_MODE_TAB.register(eventBus); }
}
