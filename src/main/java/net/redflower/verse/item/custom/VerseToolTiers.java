package net.redflower.verse.item.custom;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.redflower.verse.item.VerseItems;
import net.redflower.verse.util.VerseTags;

public class VerseToolTiers {

    public static final Tier BOSKALT = new SimpleTier(VerseTags.Blocks.INCORRECT_FOR_BOSKALT_TOOL,
            250, 6.0f, 0.0f,14, () -> Ingredient.of(VerseItems.BOSKALT_INGOT));
}
