package com.yyzy.mc_test.items;

import net.minecraft.client.item.TooltipType;
import net.minecraft.item.*;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class CustomToolItem extends MiningToolItem {
    public CustomToolItem(ToolMaterial material, Settings settings) {

//        new Identifier("mineable/axe") 是没用的我直接重写了上层的createComponent方法

        super(material, TagKey.of(RegistryKeys.BLOCK, new Identifier("mineable/axe")), settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("item.mc_test.universal_tool"));
    }
}
