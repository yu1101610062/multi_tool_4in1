package com.yyzy.mc_test.registry;

import com.yyzy.mc_test.MC_test;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item CITRINE = registerItem("citrine", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);
    public static final Item RAW_CITRINE = registerItem("raw_citrine", new Item(new Item.Settings()), ItemGroups.INGREDIENTS);

    public static Item registerItem(String name, Item item, RegistryKey<ItemGroup>... itemGroups) {
        Item registerItem = Registry.register(Registries.ITEM, new Identifier(MC_test.MOD_ID, name), item);
        for (RegistryKey<ItemGroup> itemGroup : itemGroups) {
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> content.add(registerItem));
        }
        return registerItem;
    }

    public static void registerModItems() {
        MC_test.LOGGER.debug("Registering mod items for " + MC_test.MOD_ID);
    }
}
