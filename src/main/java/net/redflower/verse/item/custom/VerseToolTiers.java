package net.redflower.verse.item.custom;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.redflower.verse.item.VerseItems;
import net.redflower.verse.util.VerseTags;

public class VerseToolTiers {

    public static final Tier BOSKALT = new SimpleTier(VerseTags.Blocks.INCORRECT_FOR_BOSKALT_TOOL,
            250, 6.0f, 0.0f,14, () -> Ingredient.of(VerseItems.BOSKALT_INGOT));

    public static final Tier GARNET = new SimpleTier(VerseTags.Blocks.INCORRECT_FOR_GARNET_TOOL,
            250, 6.0f, 0.0f,14, () -> Ingredient.of(VerseItems.GARNET));

    public static final Tier SAPPHIRE = new SimpleTier(VerseTags.Blocks.INCORRECT_FOR_SAPPHIRE_TOOL,
            250, 6.0f, 0.0f,14, () -> Ingredient.of(VerseItems.SAPPHIRE));

    public static final Tier DRAGONRITE = new SimpleTier(VerseTags.Blocks.INCORRECT_FOR_DRAGONRITE_TOOL,
            250, 6.0f, 0.0f,14, () -> Ingredient.of(VerseItems.DRAGONRITE_INGOT));
}
