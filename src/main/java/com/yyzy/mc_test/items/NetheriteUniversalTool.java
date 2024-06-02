package com.yyzy.mc_test.items;

import net.minecraft.block.Block;
import net.minecraft.component.type.ToolComponent;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.List;

public class NetheriteUniversalTool implements ToolMaterial {

    public static final NetheriteUniversalTool INSTANCE = new NetheriteUniversalTool();

    @Override
    public int getDurability() {
        return ToolMaterials.NETHERITE.getDurability() * 4;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return ToolMaterials.NETHERITE.getMiningSpeedMultiplier();
    }

    @Override
    public float getAttackDamage() {
        return ToolMaterials.NETHERITE.getAttackDamage();
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return ToolMaterials.NETHERITE.getInverseTag();
    }

    @Override
    public int getEnchantability() {
        return ToolMaterials.NETHERITE.getEnchantability();
    }

    @Override
    public Ingredient getRepairIngredient() {
        return ToolMaterials.NETHERITE.getRepairIngredient();
    }

    @Override
    public ToolComponent createComponent(TagKey<Block> tag) {
        return new ToolComponent(List.of(ToolComponent.Rule.ofNeverDropping(this.getInverseTag()), ToolComponent.Rule.ofAlwaysDropping(BlockTags.AXE_MINEABLE, this.getMiningSpeedMultiplier()), ToolComponent.Rule.ofAlwaysDropping(BlockTags.HOE_MINEABLE, this.getMiningSpeedMultiplier()), ToolComponent.Rule.ofAlwaysDropping(BlockTags.PICKAXE_MINEABLE, this.getMiningSpeedMultiplier()), ToolComponent.Rule.ofAlwaysDropping(BlockTags.SHOVEL_MINEABLE, this.getMiningSpeedMultiplier())), 1.0F, 1);
    }
}
