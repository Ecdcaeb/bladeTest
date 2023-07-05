package com.Hileb.bilibili1.slashblade.specialattack;

import mods.flammpfeil.slashblade.specialattack.SpecialAttackBase;

public abstract class SpecialAttackRegister {
    public abstract int getID();//int 通常使用配置文件

    public abstract SpecialAttackBase getSpecialAttack();

    //flammpfeil.slashblade.specialattack.name=xxx  固定格式


    public SpecialAttackRegister(){
        ModSA.REGISTER.add(this);
    }
}
