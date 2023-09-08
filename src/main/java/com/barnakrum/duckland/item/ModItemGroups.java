package com.barnakrum.duckland.item;

import com.barnakrum.duckland.Duckland;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DUCKLAND = Registry.register(Registries.ITEM_GROUP, new Identifier(Duckland.MOD_ID,"duckland"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.duckland")).icon(()->new ItemStack(ModItems.DUCK_FEATHER)).entries((displayContext, entries) -> {
        entries.add(ModItems.DUCK_FEATHER);

        entries.add(ModItems.RAW_DUCK);
        entries.add(ModItems.COOKED_DUCK);

        entries.add(ModItems.CHIA_SEEDS);
    }).build());

    public static void registerItemGroups()
    {
        Duckland.LOGGER.info("Registering item groups for "+Duckland.MOD_ID);
    }
}
