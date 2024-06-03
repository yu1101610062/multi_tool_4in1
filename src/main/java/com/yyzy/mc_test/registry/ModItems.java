package com.yyzy.mc_test.registry;

import com.yyzy.mc_test.MC_test;
import com.yyzy.mc_test.items.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final ToolItem DIAMOND_UNIVERSAL_TOOL = registerItem("diamond_universal_tool", new CustomToolItem(MyToolMaterials.DIAMOND, (new Item.Settings()).attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.DIAMOND, 5.0F, -3.0F))), ItemGroups.TOOLS);
    public static final ToolItem WOODEN_UNIVERSAL_TOOL = registerItem("wooden_universal_tool", new CustomToolItem(MyToolMaterials.WOOD, (new Item.Settings()).attributeModifiers(AxeItem.createAttributeModifiers(MyToolMaterials.WOOD, 6.0F, -3.2F))), ItemGroups.TOOLS);
    public static final ToolItem STONE_UNIVERSAL_TOOL = registerItem("stone_universal_tool", new CustomToolItem(MyToolMaterials.STONE, (new Item.Settings()).attributeModifiers(AxeItem.createAttributeModifiers(MyToolMaterials.STONE, 7.0F, -3.2F))), ItemGroups.TOOLS);
    public static final ToolItem IRON_UNIVERSAL_TOOL = registerItem("iron_universal_tool", new CustomToolItem(MyToolMaterials.IRON, (new Item.Settings()).attributeModifiers(AxeItem.createAttributeModifiers(MyToolMaterials.IRON, 6.0F, -3.1F))), ItemGroups.TOOLS);
    public static final ToolItem GOLDEN_UNIVERSAL_TOOL = registerItem("golden_universal_tool", new CustomToolItem(MyToolMaterials.GOLD, (new Item.Settings()).attributeModifiers(AxeItem.createAttributeModifiers(MyToolMaterials.GOLD, 6.0F, -3.0F))), ItemGroups.TOOLS);
    public static final ToolItem NETHERITE_UNIVERSAL_TOOL = registerItem("netherite_universal_tool", new CustomToolItem(MyToolMaterials.NETHERITE, (new Item.Settings()).attributeModifiers(AxeItem.createAttributeModifiers(MyToolMaterials.NETHERITE, 5.0F, -3.0F))), ItemGroups.TOOLS);

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
