package net.redflower.verse.item.custom.itemType;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class EnchantedScrolls extends Item {

    public EnchantedScrolls(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
