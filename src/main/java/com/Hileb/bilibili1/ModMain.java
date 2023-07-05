package com.Hileb.bilibili1;


import com.Hileb.bilibili1.proxy.ProxyBase;
import com.Hileb.bilibili1.slashblade.ModSlashBlades;
import mods.flammpfeil.slashblade.SlashBlade;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModMain.MODID, name = ModMain.NAME, version = ModMain.VERSION,dependencies=ModMain.DEPENDENCIES)
public class ModMain {
    public static final String MODID = "bilibili1";
    public static final String NAME = "Hileb Blade";
    public static final String VERSION = "1.0";
    public static final String DEPENDENCIES="after:flammpfeil.slashblade";//在拔刀剑后加载
    public static Logger logger;


    @Mod.Instance
    public static ModMain instance;

    @SidedProxy(clientSide ="com.Hileb.bilibili1.proxy.ProxyBase", serverSide = "com.Hileb.bilibili1.proxy.ProxyBase")
    public static ProxyBase proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event) {//在init时，我们开始
        if(Loader.isModLoaded(SlashBlade.modid)){
            ModSlashBlades.init();
        }
		LogWarning("%s has finished its initializations", MODID);

	}


    public static void LogWarning(String str, Object... args) {
            logger.warn(String.format(str, args));
    }

    public static void LogWarning(String str) {
            logger.warn(str);
    }

    public static void Log(String str) {
        logger.info(str);
    }

    public static void Log(String str, Object... args) {
        logger.info(String.format(str, args));
    }

}