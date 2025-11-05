package net.redflower.verse.item;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redflower.verse.VERSE;

public class VerseItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(VERSE.MODID);




    //Registers The Items. DO NOT TOUCH!!!
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
