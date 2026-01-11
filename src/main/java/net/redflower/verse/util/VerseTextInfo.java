package net.redflower.verse.util;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.redflower.verse.VERSE;

public class VerseTextInfo {

    public static MutableComponent getInformation(String key, Object... args) {
        return Component.translatable(VERSE.MODID + "." + key, args);
    }
}
