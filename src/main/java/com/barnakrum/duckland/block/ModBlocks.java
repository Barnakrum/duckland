package com.barnakrum.duckland.block;

import com.barnakrum.duckland.Duckland;
import com.barnakrum.duckland.item.ModItems;
import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CHIA_CROP = registerBlock("chia-crop", new ChiaCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    private static void addBlocksToBuildingItemGroup(FabricItemGroupEntries entries)
    {
    }

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Duckland.MOD_ID, name),block);
    }

    public static void registerModBlocks() {
        Duckland.LOGGER.info("Registering Mod Blocks for"+Duckland.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addBlocksToBuildingItemGroup);
    }
}
