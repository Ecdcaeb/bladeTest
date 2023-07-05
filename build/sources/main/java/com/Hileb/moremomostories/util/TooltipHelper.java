package com.Hileb.moremomostories.util;

import net.minecraft.client.resources.I18n;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class TooltipHelper {
    public static boolean isShiftDown(){
        return Keyboard.isKeyDown(Keyboard.KEY_LSHIFT);
    }
    public static void onTooltip(List<String> list,String key,Object... args){
        String value= I18n.format(key,args);
        list.addAll(StringUtil.spiltStringLn(value));
    }
    public static void onTooltip(List<String> list,String keyOfShiftUp,String keyOfShiftDown,Object... args){
        if (isShiftDown())onTooltip(list,keyOfShiftDown,args);
        else onTooltip(list,keyOfShiftUp,args);
    }
}
