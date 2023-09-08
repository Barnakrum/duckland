package com.barnakrum.duckland.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent COOKED_DUCK = new FoodComponent.Builder().hunger(7).saturationModifier(0.67f).build();
    public static final FoodComponent RAW_DUCK = new FoodComponent.Builder().hunger(3).saturationModifier(0.37f).build();

}
