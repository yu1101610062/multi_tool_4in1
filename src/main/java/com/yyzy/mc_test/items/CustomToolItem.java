package com.yyzy.mc_test.items;

import net.minecraft.client.item.TooltipType;
import net.minecraft.item.*;
import net.minecraft.text.Text;

import java.util.List;

public class CustomToolItem extends HoeItem {
    public CustomToolItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("item.multi_tool_4in1.universal_tool"));
    }
}
