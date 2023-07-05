package com.Hileb.bilibili1.slashblade.specialattack;

import mods.flammpfeil.slashblade.specialattack.SpecialAttackBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentString;

public class SAText extends SpecialAttackRegister {
    public SAText(){
        super();
    }

    @Override
    public int getID() {
        return 91;
    }

    @Override
    public SpecialAttackBase getSpecialAttack() {
        return new SpecialAttackBase() {
            @Override
            public String toString() {
                return "sa_text";
            }

            @Override
            public void doSpacialAttack(ItemStack itemStack, EntityPlayer entityPlayer) {//操作
                if (!entityPlayer.world.isRemote){//仅后端执行一次
                    entityPlayer.sendMessage(new TextComponentString("SA!!!"));//玩家对话框信息
                    entityPlayer.addExperienceLevel(5);//+五级
                    entityPlayer.addPotionEffect(new PotionEffect(MobEffects.POISON,200));//+中毒效果
                }
            }
        };
    }
}
