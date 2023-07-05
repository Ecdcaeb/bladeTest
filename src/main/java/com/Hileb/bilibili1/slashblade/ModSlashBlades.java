package com.Hileb.bilibili1.slashblade;

import com.Hileb.bilibili1.ModMain;
import com.Hileb.bilibili1.slashblade.blade.BladeRegister;
import com.Hileb.bilibili1.slashblade.blade.ModBlades;
import com.Hileb.bilibili1.slashblade.specialattack.ModSA;
import com.Hileb.bilibili1.slashblade.specialattack.SpecialAttackRegister;
import mods.flammpfeil.slashblade.item.ItemSlashBlade;

public class ModSlashBlades {

    public static void init(){
        //批量注册
        for(BladeRegister register: ModBlades.REGISTER){
            register.registerStack();
            ModMain.Log("register blade %s",register.getName());
        }
        for(SpecialAttackRegister register: ModSA.REGISTER){
            ItemSlashBlade.specialAttacks.put(register.getID(), register.getSpecialAttack());
            ModMain.Log("register sa %d",register.getID());
        }
    }
}
