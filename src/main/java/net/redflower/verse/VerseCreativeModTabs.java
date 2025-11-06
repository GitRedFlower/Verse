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
                        //Ores
                        output.accept(VerseBlocks.BOSKALT_ORE);
                        output.accept(VerseBlocks.DEEPSLATE_BOSKALT_ORE);

                        //Raw Ore Blocks
                        output.accept(VerseBlocks.BLOCK_OF_RAW_BOSKALT);

                        //Material Blocks
                        output.accept(VerseBlocks.BLOCK_OF_BOSKALT);
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

                        //Ingots
                        output.accept(VerseItems.BOSKALT_INGOT);

                        //Tools
                        output.accept(VerseItems.BOSKALT_SHOVEL);
                        output.accept(VerseItems.BOSKALT_PICKAXE);
                        output.accept(VerseItems.BOSKALT_AXE);
                        output.accept(VerseItems.BOSKALT_HOE);

                        //Swords
                        output.accept(VerseItems.BOSKALT_SWORD);

                        //Armor
                        output.accept(VerseItems.BOSKALT_HELMET);
                        output.accept(VerseItems.BOSKALT_CHESTPLATE);
                        output.accept(VerseItems.BOSKALT_LEGGINGS);
                        output.accept(VerseItems.BOSKALT_BOOTS);
                    })
                    .build());




    public static void register(IEventBus eventBus) {CREATIVE_MODE_TAB.register(eventBus); }
}
