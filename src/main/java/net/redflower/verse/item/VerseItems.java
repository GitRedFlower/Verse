package net.redflower.verse.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.redflower.verse.VERSE;
import net.redflower.verse.item.custom.VerseArmorMaterials;
import net.redflower.verse.item.custom.VerseFoodProperties;
import net.redflower.verse.item.custom.VerseFuelItem;
import net.redflower.verse.item.custom.VerseToolTiers;
import net.redflower.verse.item.custom.itemType.CustomSmithingTemplates;
import net.redflower.verse.item.custom.itemType.EnchantedApple;
import net.redflower.verse.item.custom.itemType.EnchantedScrolls;
import net.redflower.verse.item.custom.itemType.EnchantedShards;

import java.util.List;

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

    public static final DeferredItem<Item> EMERITE_INGOT = ITEMS.register("emerite_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SCULK_STEEL_INGOT = ITEMS.register("sculk_steel_ingot",
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
    public static final DeferredItem<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SAPPHIRE_NUGGET = ITEMS.register("sapphire_nugget",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GARNET_NUGGET = ITEMS.register("garnet_nugget",
            () -> new Item(new Item.Properties()));

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

    //Dragonrite
    public static final DeferredItem<ArmorItem> DRAGONRITE_HELMET = ITEMS.register("dragonrite_helmet",
            () -> new ArmorItem(VerseArmorMaterials.DRAGONRITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(41))));

    public static final DeferredItem<ArmorItem> DRAGONRITE_CHESTPLATE = ITEMS.register("dragonrite_chestplate",
            () -> new ArmorItem(VerseArmorMaterials.DRAGONRITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(41))));

    public static final DeferredItem<ArmorItem> DRAGONRITE_LEGGINGS = ITEMS.register("dragonrite_leggings",
            () -> new ArmorItem(VerseArmorMaterials.DRAGONRITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(41))));

    public static final DeferredItem<ArmorItem> DRAGONRITE_BOOTS = ITEMS.register("dragonrite_boots",
            () -> new ArmorItem(VerseArmorMaterials.DRAGONRITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(41))));

    //Emerite
    public static final DeferredItem<ArmorItem> EMERITE_HELMET = ITEMS.register("emerite_helmet",
            () -> new ArmorItem(VerseArmorMaterials.EMERITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(41))));

    public static final DeferredItem<ArmorItem> EMERITE_CHESTPLATE = ITEMS.register("emerite_chestplate",
            () -> new ArmorItem(VerseArmorMaterials.EMERITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(41))));

    public static final DeferredItem<ArmorItem> EMERITE_LEGGINGS = ITEMS.register("emerite_leggings",
            () -> new ArmorItem(VerseArmorMaterials.EMERITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(41))));

    public static final DeferredItem<ArmorItem> EMERITE_BOOTS = ITEMS.register("emerite_boots",
            () -> new ArmorItem(VerseArmorMaterials.EMERITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(41))));

    //Sculk Steel
    public static final DeferredItem<ArmorItem> SCULK_STEEL_HELMET = ITEMS.register("sculk_steel_helmet",
            () -> new ArmorItem(VerseArmorMaterials.SCULK_STEEL_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(41))));

    public static final DeferredItem<ArmorItem> SCULK_STEEL_CHESTPLATE = ITEMS.register("sculk_steel_chestplate",
            () -> new ArmorItem(VerseArmorMaterials.SCULK_STEEL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(41))));

    public static final DeferredItem<ArmorItem> SCULK_STEEL_LEGGINGS = ITEMS.register("sculk_steel_leggings",
            () -> new ArmorItem(VerseArmorMaterials.SCULK_STEEL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(41))));

    public static final DeferredItem<ArmorItem> SCULK_STEEL_BOOTS = ITEMS.register("sculk_steel_boots",
            () -> new ArmorItem(VerseArmorMaterials.DRAGONRITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
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

    public static final DeferredItem<SwordItem> DRAGONRITE_SWORD = ITEMS.register("dragonrite_sword",
            () -> new SwordItem(VerseToolTiers.DRAGONRITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(VerseToolTiers.DRAGONRITE, 10.0f, -2.4f))));

    public static final DeferredItem<SwordItem> EMERITE_SWORD = ITEMS.register("emerite_sword",
            () -> new SwordItem(VerseToolTiers.EMERITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(VerseToolTiers.EMERITE, 7.0f, -2.4f))));

    public static final DeferredItem<SwordItem> SCULK_STEEL_SWORD = ITEMS.register("sculk_steel_sword",
            () -> new SwordItem(VerseToolTiers.SCULK_STEEL, new Item.Properties()
                    .attributes(SwordItem.createAttributes(VerseToolTiers.SCULK_STEEL, 10.0f, -2.4f))));

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

    public static final DeferredItem<PickaxeItem> DRAGONRITE_PICKAXE = ITEMS.register("dragonrite_pickaxe",
            () -> new PickaxeItem(VerseToolTiers.DRAGONRITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(VerseToolTiers.DRAGONRITE, 8.0f, -2.8f))));

    public static final DeferredItem<AxeItem> DRAGONRITE_AXE = ITEMS.register("dragonrite_axe",
            () -> new AxeItem(VerseToolTiers.DRAGONRITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(VerseToolTiers.DRAGONRITE, 12.0f, -3.0f))));

    public static final DeferredItem<ShovelItem> DRAGONRITE_SHOVEL = ITEMS.register("dragonrite_shovel",
            () -> new ShovelItem(VerseToolTiers.DRAGONRITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(VerseToolTiers.DRAGONRITE, 8.5f, -3.0f))));

    public static final DeferredItem<HoeItem> DRAGONRITE_HOE = ITEMS.register("dragonrite_hoe",
            () -> new HoeItem(VerseToolTiers.DRAGONRITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(VerseToolTiers.DRAGONRITE, 0f, -0.0f))));

    public static final DeferredItem<PickaxeItem> EMERITE_PICKAXE = ITEMS.register("emerite_pickaxe",
            () -> new PickaxeItem(VerseToolTiers.EMERITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(VerseToolTiers.EMERITE, 5.0f, -2.8f))));

    public static final DeferredItem<AxeItem> EMERITE_AXE = ITEMS.register("emerite_axe",
            () -> new AxeItem(VerseToolTiers.EMERITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(VerseToolTiers.EMERITE, 9.0f, -3.0f))));

    public static final DeferredItem<ShovelItem> EMERITE_SHOVEL = ITEMS.register("emerite_shovel",
            () -> new ShovelItem(VerseToolTiers.EMERITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(VerseToolTiers.EMERITE, 5.5f, -3.0f))));

    public static final DeferredItem<HoeItem> EMERITE_HOE = ITEMS.register("emerite_hoe",
            () -> new HoeItem(VerseToolTiers.EMERITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(VerseToolTiers.EMERITE, 0f, -0.0f))));

    public static final DeferredItem<PickaxeItem> SCULK_STEEL_PICKAXE = ITEMS.register("sculk_steel_pickaxe",
            () -> new PickaxeItem(VerseToolTiers.SCULK_STEEL, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(VerseToolTiers.SCULK_STEEL, 8.0f, -2.8f))));

    public static final DeferredItem<AxeItem> SCULK_STEEL_AXE = ITEMS.register("sculk_steel_axe",
            () -> new AxeItem(VerseToolTiers.SCULK_STEEL, new Item.Properties()
                    .attributes(AxeItem.createAttributes(VerseToolTiers.SCULK_STEEL, 12.0f, -3.0f))));

    public static final DeferredItem<ShovelItem> SCULK_STEEL_SHOVEL = ITEMS.register("sculk_steel_shovel",
            () -> new ShovelItem(VerseToolTiers.SCULK_STEEL, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(VerseToolTiers.SCULK_STEEL, 8.5f, -3.0f))));

    public static final DeferredItem<HoeItem> SCULK_STEEL_HOE = ITEMS.register("sculk_steel_hoe",
            () -> new HoeItem(VerseToolTiers.SCULK_STEEL, new Item.Properties()
                    .attributes(HoeItem.createAttributes(VerseToolTiers.SCULK_STEEL, 0f, -0.0f))));

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
    public static final DeferredItem<Item> DRAGONRITE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("dragonrite_upgrade_smithing_template", () -> new CustomSmithingTemplates(
            Component.translatable("item." + VERSE.MODID + ".smithing_template.dragonrite_upgrade.applies_to").withStyle(ChatFormatting.BLUE),
            Component.translatable("item." + VERSE.MODID + ".smithing_template.dragonrite_upgrade.ingredients").withStyle(ChatFormatting.BLUE),
            Component.translatable("item." + VERSE.MODID + ".smithing_template.dragonrite_upgrade.name").withStyle(ChatFormatting.GRAY),
            Component.translatable("item." + VERSE.MODID + ".smithing_template.dragonrite_upgrade.base_slot_description"),
            Component.translatable("item." + VERSE.MODID + ".smithing_template.dragonrite_upgrade.additions_slot_description"),
            CustomSmithingTemplates.createTrimmableMaterialIconList(), List.of(VERSE.location("item/empty_slot_ingot"))
    ));

    public static final DeferredItem<Item> EMERITE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("emerite_upgrade_smithing_template", () -> new CustomSmithingTemplates(
            Component.translatable("item." + VERSE.MODID + ".smithing_template.emerite_upgrade.applies_to").withStyle(ChatFormatting.BLUE),
            Component.translatable("item." + VERSE.MODID + ".smithing_template.emerite_upgrade.ingredients").withStyle(ChatFormatting.BLUE),
            Component.translatable("item." + VERSE.MODID + ".smithing_template.emerite_upgrade.name").withStyle(ChatFormatting.GRAY),
            Component.translatable("item." + VERSE.MODID + ".smithing_template.emerite_upgrade.base_slot_description"),
            Component.translatable("item." + VERSE.MODID + ".smithing_template.emerite_upgrade.additions_slot_description"),
            CustomSmithingTemplates.createTrimmableMaterialIconList(), List.of(VERSE.location("item/empty_slot_ingot"))
    ));

    public static final DeferredItem<Item> SCULK_STEEL_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("sculk_steel_upgrade_smithing_template", () -> new CustomSmithingTemplates(
            Component.translatable("item." + VERSE.MODID + ".smithing_template.sculk_steel_upgrade.applies_to").withStyle(ChatFormatting.BLUE),
            Component.translatable("item." + VERSE.MODID + ".smithing_template.sculk_steel_upgrade.ingredients").withStyle(ChatFormatting.BLUE),
            Component.translatable("item." + VERSE.MODID + ".smithing_template.sculk_steel_upgrade.name").withStyle(ChatFormatting.GRAY),
            Component.translatable("item." + VERSE.MODID + ".smithing_template.sculk_steel_upgrade.base_slot_description"),
            Component.translatable("item." + VERSE.MODID + ".smithing_template.sculk_steel_upgrade.additions_slot_description"),
            CustomSmithingTemplates.createTrimmableMaterialIconList(), List.of(VERSE.location("item/empty_slot_ingot"))
    ));

    //Registers The Items. DO NOT TOUCH!!!
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
