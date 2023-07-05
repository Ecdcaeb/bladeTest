package com.Hileb.bilibili1.slashblade.blade.myBlades;

import com.Hileb.bilibili1.slashblade.blade.BladeRegister;
import com.Hileb.bilibili1.slashblade.specialattack.ModSA;
import com.Hileb.bilibili1.slashblade.specialattack.SpecialAttackRegister;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;

public class BladeTest extends BladeRegister {

    public BladeTest(){
        super();
    }
    @Override
    public String getName() {
        return "test114514";
    }

    @Override
    public int getKillCount() {
        return 114514;
    }

    @Override
    public int getProudSoul() {
        return 1919810;
    }

    @Override
    public int getRefine() {
        return 255;
    }

    @Override
    public String getModel() {
        return "named/sange/sange";
    }//+.obj
    //复用散华模型

    @Override
    public String getTexture() {
        return "momo/named/yaohushen";
    }//+.png
    //无需后缀

    @Override
    public SpecialAttackRegister getSA() {
        return ModSA.SA_TEXT;
    }

    @Override
    public float getAttackAmplifier() {
        return 2;
    }

    @Override
    public boolean isBroken() {
        return false;
    }

    @Override
    public int getStandbyRenderType() {
        return 4;
    }

    @Override
    public float getBaseAttackModifier() {
        return 4;
    }


    @Override
    public int getMaxDamage() {
        return 42;
    }

    @Override
    public boolean isDefaultBewitched() {
        return true;
    }

    @Override
    public ItemStack newItemStackInstance() {
        ItemStack stack=super.newItemStackInstance();

        stack.addEnchantment(Enchantments.PROTECTION,100);//额外添加附魔
        return stack;
    }
}
