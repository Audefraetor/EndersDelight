package com.axedgaming.endersdelight.item;

import com.axedgaming.endersdelight.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties CRISPY_SKEWER = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).build();
    public static final FoodProperties ENDER_PAELLA = (new FoodProperties.Builder().nutrition(4).saturationMod(0.5F)).build();
    public static final FoodProperties CHORUS_JUICE = (new FoodProperties.Builder().nutrition(1).saturationMod(0.2F)).build();
    public static final FoodProperties CRAWLING_SANDWICH = (new FoodProperties.Builder().nutrition(3).saturationMod(0.2F).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1800, 0), 1F).effect(new MobEffectInstance(MobEffects.CONFUSION, 400, 0), 1F)).build();
    public static final FoodProperties TWISTED_CEREAL = (new FoodProperties.Builder().nutrition(4).saturationMod(0.5F)).effect(() -> new MobEffectInstance(ModEffects.PHASING.get(), 1800, 0), 1F).build();
    public static final FoodProperties CHORUS_STEW = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.5F).effect(() -> new MobEffectInstance(ModEffects.PHASING.get(), 200, 0), 1F).build();
    public static final FoodProperties STRANGE_ECLAIR = (new FoodProperties.Builder().nutrition(5).saturationMod(0.6F).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 600, 0), 1F)).build();
    public static final FoodProperties UNCANNY_COOKIES = (new FoodProperties.Builder().nutrition(5).saturationMod(0.6F).effect(new MobEffectInstance(MobEffects.CONFUSION, 600, 0), 1F)).build();
    public static final FoodProperties STUFFED_SHULKER = (new FoodProperties.Builder().nutrition(7).saturationMod(0.9F).effect(new MobEffectInstance(MobEffects.LEVITATION, 400, 2), 1F).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1800, 0), 1F)).build();

}
