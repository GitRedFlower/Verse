package net.redflower.verse.item.custom.itemType;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class EnchantedShards extends Item {

    public EnchantedShards(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
