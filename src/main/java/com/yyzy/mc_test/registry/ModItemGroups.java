package com.yyzy.mc_test.registry;

import com.yyzy.mc_test.MC_test;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    private static final ItemGroup MOD_CITRINE_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Items.STONE_HOE))
            .displayName(Text.translatable("itemGroup.mc_test.tools"))
            .entries(((displayContext, entries) -> {
                entries.add(ModItems.DIAMOND_UNIVERSAL_TOOL);
                entries.add(ModItems.GOLDEN_UNIVERSAL_TOOL);
                entries.add(ModItems.IRON_UNIVERSAL_TOOL);
                entries.add(ModItems.NETHERITE_UNIVERSAL_TOOL);
                entries.add(ModItems.STONE_UNIVERSAL_TOOL);
                entries.add(ModItems.WOODEN_UNIVERSAL_TOOL);
            }))
            .build();

    public static void registerModItemGroups() {
        MC_test.LOGGER.debug("Registering mod itemGroups for " + MC_test.MOD_ID);
        Registry.register(Registries.ITEM_GROUP, new Identifier(MC_test.MOD_ID, "tools"), MOD_CITRINE_GROUP);
    }
}
