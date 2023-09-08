package com.barnakrum.duckland.item;

import com.barnakrum.duckland.Duckland;
import com.barnakrum.duckland.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item DUCK_FEATHER = registerItem("duck-feather", new Item(new FabricItemSettings()));

    public static final Item RAW_DUCK = registerItem("raw-duck", new Item(new FabricItemSettings().food(ModFoodComponents.RAW_DUCK)));
    public static final Item COOKED_DUCK = registerItem("cooked-duck", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_DUCK)));

    public static final Item CHIA_SEEDS = registerItem("chia-seeds", new AliasedBlockItem(ModBlocks.CHIA_CROP,new FabricItemSettings().maxCount(16)));


    private static void addItemsToIngridientItemGroup(FabricItemGroupEntries entries)
    {
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Duckland.MOD_ID, name),item);
    }

    public static void registerModItems() {
        Duckland.LOGGER.info("Registering Mod Items for"+Duckland.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngridientItemGroup);
    }
}
