package net.redflower.verse.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;
import net.redflower.verse.VERSE;
import net.redflower.verse.item.VerseItems;

import java.util.LinkedHashMap;

public class VerseItemModelProvider extends ItemModelProvider {

    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public VerseItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, VERSE.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Raw Material
        basicItem(VerseItems.RAW_BOSKALT.get());
        basicItem(VerseItems.DRAGONRITE_SCRAP.get());

        //Ingots
        basicItem(VerseItems.BOSKALT_INGOT.get());
        basicItem(VerseItems.DRAGONRITE_INGOT.get());
        basicItem(VerseItems.EMERITE_INGOT.get());
        basicItem(VerseItems.SCULK_STEEL_INGOT.get());

        //Gems
        basicItem(VerseItems.GARNET.get());
        basicItem(VerseItems.SAPPHIRE.get());
        basicItem(VerseItems.QUARTZ.get());
        basicItem(VerseItems.AMBER.get());

        //Nuggets
        basicItem(VerseItems.DIAMOND_NUGGET.get());
        basicItem(VerseItems.SAPPHIRE_NUGGET.get());
        basicItem(VerseItems.GARNET_NUGGET.get());

        //Crafting Items
        basicItem(VerseItems.AMBER_LENS_CORE.get());

        //Fuels
        basicItem(VerseItems.AMBER_LENS.get());

        //Food
        //Ore Apples
        basicItem(VerseItems.COAL_APPLE.get());
        basicItem(VerseItems.COPPER_APPLE.get());
        basicItem(VerseItems.IRON_APPLE.get());
        basicItem(VerseItems.REDSTONE_APPLE.get());
        basicItem(VerseItems.LAPIS_APPLE.get());
        basicItem(VerseItems.EMERALD_APPLE.get());
        basicItem(VerseItems.DIAMOND_APPLE.get());

        //Enchanted Ore Apples
        basicItem(VerseItems.ENCHANTED_COAL_APPLE.get());
        basicItem(VerseItems.ENCHANTED_COPPER_APPLE.get());
        basicItem(VerseItems.ENCHANTED_IRON_APPLE.get());
        basicItem(VerseItems.ENCHANTED_REDSTONE_APPLE.get());
        basicItem(VerseItems.ENCHANTED_LAPIS_APPLE.get());
        basicItem(VerseItems.ENCHANTED_EMERALD_APPLE.get());
        basicItem(VerseItems.ENCHANTED_DIAMOND_APPLE.get());

        //Enchanted Shards
        basicItem(VerseItems.ENCHANTED_WEAK_SHARD.get());

        //Enchanted Scrolls
        basicItem(VerseItems.ENCHANTED_WEAK_SCROLL.get());

        //Smithing Templates
        basicItem(VerseItems.DRAGONRITE_UPGRADE_SMITHING_TEMPLATE.get());
        basicItem(VerseItems.EMERITE_UPGRADE_SMITHING_TEMPLATE.get());
        basicItem(VerseItems.SCULK_STEEL_UPGRADE_SMITHING_TEMPLATE.get());


        //Weapons
        //Swords
        handheldItem(VerseItems.BOSKALT_SWORD);
        handheldItem(VerseItems.GARNET_SWORD);
        handheldItem(VerseItems.SAPPHIRE_SWORD);
        handheldItem(VerseItems.DRAGONRITE_SWORD);
        handheldItem(VerseItems.EMERITE_SWORD);
        handheldItem(VerseItems.SCULK_STEEL_SWORD);

        //Tools
        handheldItem(VerseItems.BOSKALT_SHOVEL);
        handheldItem(VerseItems.BOSKALT_PICKAXE);
        handheldItem(VerseItems.BOSKALT_AXE);
        handheldItem(VerseItems.BOSKALT_HOE);
        handheldItem(VerseItems.GARNET_SHOVEL);
        handheldItem(VerseItems.GARNET_PICKAXE);
        handheldItem(VerseItems.GARNET_AXE);
        handheldItem(VerseItems.GARNET_HOE);
        handheldItem(VerseItems.SAPPHIRE_SHOVEL);
        handheldItem(VerseItems.SAPPHIRE_PICKAXE);
        handheldItem(VerseItems.SAPPHIRE_AXE);
        handheldItem(VerseItems.SAPPHIRE_HOE);
        handheldItem(VerseItems.DRAGONRITE_SHOVEL);
        handheldItem(VerseItems.DRAGONRITE_PICKAXE);
        handheldItem(VerseItems.DRAGONRITE_AXE);
        handheldItem(VerseItems.DRAGONRITE_HOE);
        handheldItem(VerseItems.EMERITE_SHOVEL);
        handheldItem(VerseItems.EMERITE_PICKAXE);
        handheldItem(VerseItems.EMERITE_AXE);
        handheldItem(VerseItems.EMERITE_HOE);
        handheldItem(VerseItems.SCULK_STEEL_SHOVEL);
        handheldItem(VerseItems.SCULK_STEEL_PICKAXE);
        handheldItem(VerseItems.SCULK_STEEL_AXE);
        handheldItem(VerseItems.SCULK_STEEL_HOE);

        //Armor
        //Boskalt
        trimmedArmorItem(VerseItems.BOSKALT_HELMET);
        trimmedArmorItem(VerseItems.BOSKALT_CHESTPLATE);
        trimmedArmorItem(VerseItems.BOSKALT_LEGGINGS);
        trimmedArmorItem(VerseItems.BOSKALT_BOOTS);

        //Garnet
        trimmedArmorItem(VerseItems.GARNET_HELMET);
        trimmedArmorItem(VerseItems.GARNET_CHESTPLATE);
        trimmedArmorItem(VerseItems.GARNET_LEGGINGS);
        trimmedArmorItem(VerseItems.GARNET_BOOTS);

        //Sapphire
        trimmedArmorItem(VerseItems.SAPPHIRE_HELMET);
        trimmedArmorItem(VerseItems.SAPPHIRE_CHESTPLATE);
        trimmedArmorItem(VerseItems.SAPPHIRE_LEGGINGS);
        trimmedArmorItem(VerseItems.SAPPHIRE_BOOTS);

        //Dragonrite
        trimmedArmorItem(VerseItems.DRAGONRITE_HELMET);
        trimmedArmorItem(VerseItems.DRAGONRITE_CHESTPLATE);
        trimmedArmorItem(VerseItems.DRAGONRITE_LEGGINGS);
        trimmedArmorItem(VerseItems.DRAGONRITE_BOOTS);

        //Emerite
        trimmedArmorItem(VerseItems.EMERITE_HELMET);
        trimmedArmorItem(VerseItems.EMERITE_CHESTPLATE);
        trimmedArmorItem(VerseItems.EMERITE_LEGGINGS);
        trimmedArmorItem(VerseItems.EMERITE_BOOTS);

        //Sculk Steel
        trimmedArmorItem(VerseItems.SCULK_STEEL_HELMET);
        trimmedArmorItem(VerseItems.SCULK_STEEL_CHESTPLATE);
        trimmedArmorItem(VerseItems.SCULK_STEEL_LEGGINGS);
        trimmedArmorItem(VerseItems.SCULK_STEEL_BOOTS);
    }

    // Created by El_Redstoniano, Obtained from Modding by Kaupenjoe
    private void trimmedArmorItem(DeferredItem<ArmorItem> itemDeferredItem) {
        final String MOD_ID = VERSE.MODID;

        if(itemDeferredItem.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemDeferredItem.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace()  + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemDeferredItem.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(VERSE.MODID, "item/" + item.getId().getPath()));
    }
}