package com.yyzy.mc_test.items;

import net.minecraft.block.Block;
import net.minecraft.component.type.ToolComponent;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.List;

public class WoodenUniversalTool implements ToolMaterial {

    public static final WoodenUniversalTool INSTANCE = new WoodenUniversalTool();

    @Override
    public int getDurability() {
        return ToolMaterials.WOOD.getDurability() * 4;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return ToolMaterials.WOOD.getMiningSpeedMultiplier();
    }

    @Override
    public float getAttackDamage() {
        return ToolMaterials.WOOD.getAttackDamage();
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return ToolMaterials.WOOD.getInverseTag();
    }

    @Override
    public int getEnchantability() {
        return ToolMaterials.WOOD.getEnchantability();
    }

    @Override
    public Ingredient getRepairIngredient() {
        return ToolMaterials.WOOD.getRepairIngredient();
    }

    @Override
    public ToolComponent createComponent(TagKey<Block> tag) {
        return new ToolComponent(List.of(ToolComponent.Rule.ofNeverDropping(this.getInverseTag()), ToolComponent.Rule.ofAlwaysDropping(BlockTags.AXE_MINEABLE, this.getMiningSpeedMultiplier()), ToolComponent.Rule.ofAlwaysDropping(BlockTags.HOE_MINEABLE, this.getMiningSpeedMultiplier()), ToolComponent.Rule.ofAlwaysDropping(BlockTags.PICKAXE_MINEABLE, this.getMiningSpeedMultiplier()), ToolComponent.Rule.ofAlwaysDropping(BlockTags.SHOVEL_MINEABLE, this.getMiningSpeedMultiplier())), 1.0F, 1);
    }
}
