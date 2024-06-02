package com.yyzy.mc_test.registry;

import com.yyzy.mc_test.MC_test;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    private static final ItemGroup MOD_CITRINE_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.CITRINE))
            .displayName(Text.translatable("itemGroup.mc_test.citrine"))
            .entries(((displayContext, entries) -> {
                entries.add(ModItems.CITRINE);
                entries.add(ModItems.RAW_CITRINE);
            }))
            .build();

    public static void registerModItemGroups() {
        MC_test.LOGGER.debug("Registering mod itemGroups for " + MC_test.MOD_ID);
        Registry.register(Registries.ITEM_GROUP, new Identifier(MC_test.MOD_ID, "citrine"), MOD_CITRINE_GROUP);
    }
}
