package com.Hileb.moremomostories.init;

import com.Hileb.moremomostories.world.dimension.DimensionEdge;
import com.Hileb.moremomostories.world.dimension.DimensionOne;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.DimensionManager;

public class InitDimension {

    public static void registerDimensions() {

        //DimensionManager.registerDimension(ModConfig.dimension.WORLD_GEN_CONF, DIM_UNIV);
        DimensionManager.registerDimension(ModConfig.dimension.WORLD_GEN_CONF, DimensionOne.DIM_ONE);
        DimensionManager.registerDimension(ModConfig.dimension.WORLD_GEN_ZFP, DimensionEdge.DIM_TYPE);
    }

    public static NBTTagCompound getDimensionData(World world) {
        return world.getWorldInfo().getDimensionData(ModConfig.dimension.WORLD_GEN_ZFP);
    }

    public void init() {

    }
}
