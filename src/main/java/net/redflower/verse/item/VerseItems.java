package net.redflower.verse.item;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redflower.verse.VERSE;
import net.redflower.verse.item.custom.VerseArmorMaterials;
import net.redflower.verse.item.custom.VerseToolTiers;

public class VerseItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(VERSE.MODID);

    //Raw Materials
    public static final DeferredItem<Item> RAW_BOSKALT = ITEMS.register("raw_boskalt",
            () -> new Item(new Item.Properties()));

    //Ingots
    public static final DeferredItem<Item> BOSKALT_INGOT = ITEMS.register("boskalt_ingot",
            () -> new Item(new Item.Properties()));

    //Nuggets

    //Armor
    //Boskalt
    public static final DeferredItem<ArmorItem> BOSKALT_HELMET = ITEMS.register("boskalt_helmet",
            () -> new ArmorItem(VerseArmorMaterials.BOSKALT_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(41))));

    public static final DeferredItem<ArmorItem> BOSKALT_CHESTPLATE = ITEMS.register("boskalt_chestplate",
            () -> new ArmorItem(VerseArmorMaterials.BOSKALT_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(41))));

    public static final DeferredItem<ArmorItem> BOSKALT_LEGGINGS = ITEMS.register("boskalt_leggings",
            () -> new ArmorItem(VerseArmorMaterials.BOSKALT_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(41))));

    public static final DeferredItem<ArmorItem> BOSKALT_BOOTS = ITEMS.register("boskalt_boots",
            () -> new ArmorItem(VerseArmorMaterials.BOSKALT_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(41))));

    //Weapons
    //Swords
    public static final DeferredItem<SwordItem> BOSKALT_SWORD = ITEMS.register("boskalt_sword",
            () -> new SwordItem(VerseToolTiers.BOSKALT, new Item.Properties()
                    .attributes(SwordItem.createAttributes(VerseToolTiers.BOSKALT, 5.0f, -2.4f))));

    //Tools
    //Boskalt
    public static final DeferredItem<PickaxeItem> BOSKALT_PICKAXE = ITEMS.register("boskalt_pickaxe",
            () -> new PickaxeItem(VerseToolTiers.BOSKALT, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(VerseToolTiers.BOSKALT, 3.0f, -2.8f))));

    public static final DeferredItem<AxeItem> BOSKALT_AXE = ITEMS.register("boskalt_axe",
            () -> new AxeItem(VerseToolTiers.BOSKALT, new Item.Properties()
                    .attributes(AxeItem.createAttributes(VerseToolTiers.BOSKALT, 8.0f, -3.0f))));

    public static final DeferredItem<ShovelItem> BOSKALT_SHOVEL = ITEMS.register("boskalt_shovel",
            () -> new ShovelItem(VerseToolTiers.BOSKALT, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(VerseToolTiers.BOSKALT, 3.5f, -3.0f))));

    public static final DeferredItem<HoeItem> BOSKALT_HOE = ITEMS.register("boskalt_hoe",
            () -> new HoeItem(VerseToolTiers.BOSKALT, new Item.Properties()
                    .attributes(HoeItem.createAttributes(VerseToolTiers.BOSKALT, 0f, -0.0f))));


    //Registers The Items. DO NOT TOUCH!!!
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
