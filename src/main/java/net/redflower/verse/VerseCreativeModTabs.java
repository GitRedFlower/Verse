package net.redflower.verse;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class VerseCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VERSE.MODID);

    public static final Supplier<CreativeModeTab> VERSE_BLOCKS_TAB = CREATIVE_MODE_TAB.register("verse_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Blocks.BLACK_CONCRETE))
                    .title(Component.translatable("creativetab.verse.blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Blocks.DIAMOND_BLOCK);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> VERSE_ITEMS_TAB = CREATIVE_MODE_TAB.register("verse_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Items.DIAMOND))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(VERSE.MODID, "verse_blocks_tab"))
                    .title(Component.translatable("creativetab.verse.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Items.DIAMOND);
                    })
                    .build());




    public static void register(IEventBus eventBus) {CREATIVE_MODE_TAB.register(eventBus); }
}
