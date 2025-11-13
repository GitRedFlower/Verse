package net.redflower.verse.item;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redflower.verse.VERSE;
import net.redflower.verse.item.custom.VerseArmorMaterials;
import net.redflower.verse.item.custom.VerseFoodProperties;
import net.redflower.verse.item.custom.VerseFuelItem;
import net.redflower.verse.item.custom.VerseToolTiers;
import net.redflower.verse.item.custom.itemType.EnchantedApple;
import net.redflower.verse.item.custom.itemType.EnchantedScrolls;
import net.redflower.verse.item.custom.itemType.EnchantedShards;

public class VerseItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(VERSE.MODID);

    //Raw Materials
    public static final DeferredItem<Item> RAW_BOSKALT = ITEMS.register("raw_boskalt",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DRAGONRITE_SCRAP = ITEMS.register("dragonrite_scrap",
            () -> new Item(new Item.Properties()));

    //Ingots
    public static final DeferredItem<Item> BOSKALT_INGOT = ITEMS.register("boskalt_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DRAGONRITE_INGOT = ITEMS.register("dragonrite_ingot",
            () -> new Item(new Item.Properties()));

    //Gems
    public static final DeferredItem<Item> GARNET = ITEMS.register("garnet",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> QUARTZ = ITEMS.register("quartz",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> AMBER = ITEMS.register("amber",
            () -> new Item(new Item.Properties()));

    //Food Items
    //Ore Apples
    public static final DeferredItem<Item> COAL_APPLE = ITEMS.register("coal_apple",
            () -> new Item(new Item.Properties().food(VerseFoodProperties.COAL_APPLE)));

    public static final DeferredItem<Item> COPPER_APPLE = ITEMS.register("copper_apple",
            () -> new Item(new Item.Properties().food(VerseFoodProperties.COPPER_APPLE)));

    public static final DeferredItem<Item> IRON_APPLE = ITEMS.register("iron_apple",
            () -> new Item(new Item.Properties().food(VerseFoodProperties.IRON_APPLE)));

    public static final DeferredItem<Item> REDSTONE_APPLE = ITEMS.register("redstone_apple",
            () -> new Item(new Item.Properties().food(VerseFoodProperties.REDSTONE_APPLE)));

    public static final DeferredItem<Item> LAPIS_APPLE = ITEMS.register("lapis_apple",
            () -> new Item(new Item.Properties().food(VerseFoodProperties.LAPIS_APPLE)));

    public static final DeferredItem<Item> EMERALD_APPLE = ITEMS.register("emerald_apple",
            () -> new Item(new Item.Properties().food(VerseFoodProperties.EMERALD_APPLE)));

    public static final DeferredItem<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple",
            () -> new Item(new Item.Properties().food(VerseFoodProperties.DIAMOND_APPLE)));

    //Enchanted Ore Apples
    public static final DeferredItem<Item> ENCHANTED_COAL_APPLE = ITEMS.register("enchanted_coal_apple",
            () -> new EnchantedApple(new Item.Properties().food(VerseFoodProperties.ENCHANTED_COAL_APPLE)));

    public static final DeferredItem<Item> ENCHANTED_COPPER_APPLE = ITEMS.register("enchanted_copper_apple",
            () -> new EnchantedApple(new Item.Properties().food(VerseFoodProperties.ENCHANTED_COPPER_APPLE)));

    public static final DeferredItem<Item> ENCHANTED_IRON_APPLE = ITEMS.register("enchanted_iron_apple",
            () -> new EnchantedApple(new Item.Properties().food(VerseFoodProperties.ENCHANTED_IRON_APPLE)));

    public static final DeferredItem<Item> ENCHANTED_REDSTONE_APPLE = ITEMS.register("enchanted_redstone_apple",
            () -> new EnchantedApple(new Item.Properties().food(VerseFoodProperties.ENCHANTED_REDSTONE_APPLE)));

    public static final DeferredItem<Item> ENCHANTED_LAPIS_APPLE = ITEMS.register("enchanted_lapis_apple",
            () -> new EnchantedApple(new Item.Properties().food(VerseFoodProperties.ENCHANTED_LAPIS_APPLE)));

    public static final DeferredItem<Item> ENCHANTED_EMERALD_APPLE = ITEMS.register("enchanted_emerald_apple",
            () -> new EnchantedApple(new Item.Properties().food(VerseFoodProperties.ENCHANTED_EMERALD_APPLE)));

    public static final DeferredItem<Item> ENCHANTED_DIAMOND_APPLE = ITEMS.register("enchanted_diamond_apple",
            () -> new EnchantedApple(new Item.Properties().food(VerseFoodProperties.ENCHANTED_DIAMOND_APPLE)));

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

    //Garnet
    public static final DeferredItem<ArmorItem> GARNET_HELMET = ITEMS.register("garnet_helmet",
            () -> new ArmorItem(VerseArmorMaterials.GARNET_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(41))));

    public static final DeferredItem<ArmorItem> GARNET_CHESTPLATE = ITEMS.register("garnet_chestplate",
            () -> new ArmorItem(VerseArmorMaterials.GARNET_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(41))));

    public static final DeferredItem<ArmorItem> GARNET_LEGGINGS = ITEMS.register("garnet_leggings",
            () -> new ArmorItem(VerseArmorMaterials.GARNET_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(41))));

    public static final DeferredItem<ArmorItem> GARNET_BOOTS = ITEMS.register("garnet_boots",
            () -> new ArmorItem(VerseArmorMaterials.GARNET_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(41))));

    //Sapphire
    public static final DeferredItem<ArmorItem> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new ArmorItem(VerseArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(41))));

    public static final DeferredItem<ArmorItem> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new ArmorItem(VerseArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(41))));

    public static final DeferredItem<ArmorItem> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new ArmorItem(VerseArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(41))));

    public static final DeferredItem<ArmorItem> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new ArmorItem(VerseArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(41))));

    //Weapons
    //Swords
    public static final DeferredItem<SwordItem> BOSKALT_SWORD = ITEMS.register("boskalt_sword",
            () -> new SwordItem(VerseToolTiers.BOSKALT, new Item.Properties()
                    .attributes(SwordItem.createAttributes(VerseToolTiers.BOSKALT, 5.0f, -2.4f))));

    public static final DeferredItem<SwordItem> GARNET_SWORD = ITEMS.register("garnet_sword",
            () -> new SwordItem(VerseToolTiers.GARNET, new Item.Properties()
                    .attributes(SwordItem.createAttributes(VerseToolTiers.GARNET, 6.0f, -2.4f))));

    public static final DeferredItem<SwordItem> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(VerseToolTiers.SAPPHIRE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(VerseToolTiers.SAPPHIRE, 6.0f, -2.4f))));

    //Tools
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

    public static final DeferredItem<PickaxeItem> GARNET_PICKAXE = ITEMS.register("garnet_pickaxe",
            () -> new PickaxeItem(VerseToolTiers.GARNET, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(VerseToolTiers.GARNET, 4.0f, -2.8f))));

    public static final DeferredItem<AxeItem> GARNET_AXE = ITEMS.register("garnet_axe",
            () -> new AxeItem(VerseToolTiers.GARNET, new Item.Properties()
                    .attributes(AxeItem.createAttributes(VerseToolTiers.GARNET, 8.0f, -3.0f))));

    public static final DeferredItem<ShovelItem> GARNET_SHOVEL = ITEMS.register("garnet_shovel",
            () -> new ShovelItem(VerseToolTiers.GARNET, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(VerseToolTiers.GARNET, 4.5f, -3.0f))));

    public static final DeferredItem<HoeItem> GARNET_HOE = ITEMS.register("garnet_hoe",
            () -> new HoeItem(VerseToolTiers.GARNET, new Item.Properties()
                    .attributes(HoeItem.createAttributes(VerseToolTiers.GARNET, 0f, -0.0f))));

    public static final DeferredItem<PickaxeItem> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(VerseToolTiers.SAPPHIRE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(VerseToolTiers.SAPPHIRE, 4.0f, -2.8f))));

    public static final DeferredItem<AxeItem> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(VerseToolTiers.SAPPHIRE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(VerseToolTiers.SAPPHIRE, 8.0f, -3.0f))));

    public static final DeferredItem<ShovelItem> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(VerseToolTiers.SAPPHIRE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(VerseToolTiers.SAPPHIRE, 4.5f, -3.0f))));

    public static final DeferredItem<HoeItem> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(VerseToolTiers.SAPPHIRE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(VerseToolTiers.SAPPHIRE, 0f, -0.0f))));

    //Crafting Items
    public static final DeferredItem<Item> AMBER_LENS_CORE = ITEMS.register("amber_lens_core",
            () -> new Item(new Item.Properties()));

    //Fuel Items
    public static final DeferredItem<Item> AMBER_LENS = ITEMS.register("amber_lens",
            () -> new VerseFuelItem(new Item.Properties(), 20000));

    //Enchanted Shards
    public static final DeferredItem<Item> ENCHANTED_WEAK_SHARD = ITEMS.register("enchanted_weak_shard",
            () -> new EnchantedShards(new Item.Properties()));

    //Enchanted Scrolls
    public static final DeferredItem<Item> ENCHANTED_WEAK_SCROLL = ITEMS.register("enchanted_weak_scroll",
            () -> new EnchantedScrolls(new Item.Properties()));

    //Upgrade Templates


    //Registers The Items. DO NOT TOUCH!!!
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
