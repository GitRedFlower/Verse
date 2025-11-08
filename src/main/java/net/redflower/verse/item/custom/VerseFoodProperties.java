package net.redflower.verse.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class VerseFoodProperties {

    //Ore Apples
    public static final FoodProperties COAL_APPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.75f)
            .effect( () -> new MobEffectInstance(MobEffects.NIGHT_VISION, 2400, 0), 1.0f).build();

    public static final FoodProperties COPPER_APPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.75f)
            .effect( () -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 0), 1.0f).build();

    public static final FoodProperties IRON_APPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.75f)
            .effect( () -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 0), 1.0f).build();

    public static final FoodProperties REDSTONE_APPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.75f)
            .effect( () -> new MobEffectInstance(MobEffects.DIG_SPEED, 2400, 0), 1.0f).build();

    public static final FoodProperties LAPIS_APPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.75f)
            .effect( () -> new MobEffectInstance(MobEffects.WATER_BREATHING, 2400, 0), 1.0f).build();

    public static final FoodProperties EMERALD_APPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.75f)
            .effect( () -> new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 2400, 1), 1.0f).build();

    public static final FoodProperties DIAMOND_APPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.75f)
            .effect( () -> new MobEffectInstance(MobEffects.REGENERATION, 2400, 0), 1.0f).build();

    //Enchanted Ore Apple
    public static final FoodProperties ENCHANTED_COAL_APPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.75f)
            .effect( () -> new MobEffectInstance(MobEffects.NIGHT_VISION, 2400, 2), 1.0f).build();

    public static final FoodProperties ENCHANTED_COPPER_APPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.75f)
            .effect( () -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 2), 1.0f).build();

    public static final FoodProperties ENCHANTED_IRON_APPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.75f)
            .effect( () -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 2), 1.0f).build();

    public static final FoodProperties ENCHANTED_REDSTONE_APPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.75f)
            .effect( () -> new MobEffectInstance(MobEffects.DIG_SPEED, 2400, 2), 1.0f).build();

    public static final FoodProperties ENCHANTED_LAPIS_APPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.75f)
            .effect( () -> new MobEffectInstance(MobEffects.WATER_BREATHING, 2400, 2), 1.0f).build();

    public static final FoodProperties ENCHANTED_EMERALD_APPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.75f)
            .effect( () -> new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 2400, 3), 1.0f).build();

    public static final FoodProperties ENCHANTED_DIAMOND_APPLE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.75f)
            .effect( () -> new MobEffectInstance(MobEffects.REGENERATION, 2400, 2), 1.0f).build();
}
