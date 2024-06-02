package com.yyzy.mc_test.registry;

import com.yyzy.mc_test.MC_test;
import com.yyzy.mc_test.items.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final ToolItem DIAMOND_UNIVERSAL_TOOL = registerItem("diamond_universal_tool", new CustomToolItem(DiamondUniversalTool.INSTANCE, new Item.Settings()), ItemGroups.TOOLS);
    public static final ToolItem WOODEN_UNIVERSAL_TOOL = registerItem("wooden_universal_tool", new CustomToolItem(WoodenUniversalTool.INSTANCE, new Item.Settings()), ItemGroups.TOOLS);
    public static final ToolItem STONE_UNIVERSAL_TOOL = registerItem("stone_universal_tool", new CustomToolItem(StoneUniversalTool.INSTANCE, new Item.Settings()), ItemGroups.TOOLS);
    public static final ToolItem IRON_UNIVERSAL_TOOL = registerItem("iron_universal_tool", new CustomToolItem(IronUniversalTool.INSTANCE, new Item.Settings()), ItemGroups.TOOLS);
    public static final ToolItem GOLDEN_UNIVERSAL_TOOL = registerItem("golden_universal_tool", new CustomToolItem(GoldenUniversalTool.INSTANCE, new Item.Settings()), ItemGroups.TOOLS);
    public static final ToolItem NETHERITE_UNIVERSAL_TOOL = registerItem("netherite_universal_tool", new CustomToolItem(NetheriteUniversalTool.INSTANCE, new Item.Settings()), ItemGroups.TOOLS);


    public static ToolItem registerItem(String name, ToolItem item, RegistryKey<ItemGroup>... itemGroups) {
        ToolItem registerItem = Registry.register(Registries.ITEM, new Identifier(MC_test.MOD_ID, name), item);
        for (RegistryKey<ItemGroup> itemGroup : itemGroups) {
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> content.add(registerItem));
        }
        return registerItem;
    }

    public static void registerModItems() {
        MC_test.LOGGER.debug("Registering mod items for " + MC_test.MOD_ID);
    }
}
