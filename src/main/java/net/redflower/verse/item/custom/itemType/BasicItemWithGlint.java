package net.redflower.verse.item.custom.itemType;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class BasicItemWithGlint extends Item {

    public BasicItemWithGlint(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }

}
