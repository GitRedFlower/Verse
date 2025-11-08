package net.redflower.verse.item.custom.itemType;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class EnchantedApple extends Item {

    public EnchantedApple(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }

}
