package net.redflower.verse.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.redflower.verse.VERSE;
import net.redflower.verse.block.VerseBlocks;
import net.redflower.verse.item.VerseItems;
import net.redflower.verse.util.VerseTextInfo;

@JeiPlugin
public class JEIVersePlugin implements IModPlugin {

    private static final ResourceLocation ID = ResourceLocation.fromNamespaceAndPath(VERSE.MODID, "jei_plugin");

    @Override
    public ResourceLocation getPluginUid() {
        return ID;
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        registration.addIngredientInfo(new ItemStack(VerseItems.DRAGON_SCALE.get()), VanillaTypes.ITEM_STACK, VerseTextInfo.getInformation("jei.info.dragon_scale"));
        registration.addIngredientInfo(new ItemStack(VerseBlocks.REINFORCED_STONE.get()), VanillaTypes.ITEM_STACK, VerseTextInfo.getInformation("jei.info.reinforced_stone"));
        registration.addIngredientInfo(new ItemStack(VerseItems.FLINT_AND_BOSKALT.get()), VanillaTypes.ITEM_STACK, VerseTextInfo.getInformation("jei.info.flint_and_boskalt"));
        registration.addIngredientInfo(new ItemStack(VerseBlocks.ALTAR.get()), VanillaTypes.ITEM_STACK, VerseTextInfo.getInformation("jei.info.altar"));
    }
}