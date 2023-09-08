package com.barnakrum.duckland;

import com.barnakrum.duckland.block.ModBlocks;
import com.barnakrum.duckland.item.ModItemGroups;
import com.barnakrum.duckland.item.ModItems;
import com.barnakrum.duckland.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class Duckland implements ModInitializer {
    public static final String MOD_ID = "duckland";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModLootTableModifiers.modifyLootTable();

        GeckoLib.initialize();
    }
}