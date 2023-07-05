package com.Hileb.moremomostories.mixin.momostories.mixin.cardMixins;

import com.Hileb.moremomostories.mixin.momostories.event.CardFunction;
import com.gq2529.momostories.item.ModItemStoryboards.OhamHeavyCavalryRegiment;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(OhamHeavyCavalryRegiment.class)
public class MixinOhamHeavyCavalryRegiment extends Item {

    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        CardFunction.OhamHeavyCavalryRegiment.onUpdate(stack,worldIn,entityIn,itemSlot,isSelected);
    }
}
