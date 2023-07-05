package com.Hileb.moremomostories.util.NBTStrDef;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import java.util.UUID;

public class IDFBasicNBTUtil {
    public static class NBTType{
        public static final int NBTTagEnd=0;
        public static final int NBTTagByte=1;
        public static final int NBTTagShort=2;
        public static final int NBTTagInt=3;
        public static final int NBTTagLong=4;
        public static final int NBTTagFloat=5;
        public static final int NBTTagDouble=6;
        public static final int NBTTagByteArray=7;
        public static final int NBTTagString=8;
        public static final int NBTTagList=9;

        public static final int NBTTagCompound=10;

        public static final int NBTTagIntArray=11;
        public static final int NBTTagLongArray=12;
    }
    public static boolean getBoolean(NBTTagCompound tagCompound, String key, boolean defaultVal)
    {
        if (tagCompound!=null)
        {
            if (tagCompound.hasKey(key)){
                return tagCompound.getBoolean(key);
            }
        }
        return defaultVal;
    }
    public static int getInt(NBTTagCompound tagCompound, String key, int defaultVal)
    {
        if (tagCompound!=null)
        {
            if (tagCompound.hasKey(key)){
                return tagCompound.getInteger(key);
            }
        }
        return defaultVal;
    }
    public static int[] getIntArray(NBTTagCompound tagCompound, String key, int[] defaultVal)
    {
        if (tagCompound!=null)
        {
            if (tagCompound.hasKey(key)){
                return tagCompound.getIntArray(key);
            }
        }
        return defaultVal;
    }
    public static double getDouble(NBTTagCompound tagCompound, String key, double defaultVal)
    {
        if (tagCompound!=null)
        {
            if (tagCompound.hasKey(key)){
                return tagCompound.getDouble(key);
            }
        }
        return defaultVal;
    }
    public static float getFloat(NBTTagCompound tagCompound, String key, float defaultVal)
    {
        if (tagCompound!=null)
        {
            if (tagCompound.hasKey(key)){
                return tagCompound.getFloat(key);
            }
        }
        return defaultVal;
    }
    public static UUID getUUID(NBTTagCompound tagCompound, String key, UUID defaultVal)
    {
        if (tagCompound!=null)
        {
            if (tagCompound.hasKey(key)){
                return tagCompound.getUniqueId(key);
            }
        }
        return defaultVal;
    }
    public static  NBTTagCompound getNBTTagCompound(NBTTagCompound tagCompound, String key, NBTTagCompound defaultVal){
        if (tagCompound!=null)
        {
            if (tagCompound.hasKey(key)){
                return tagCompound.getCompoundTag(key);
            }
        }
        return defaultVal;
    }

    public static void setBoolean(NBTTagCompound tagCompound, String key, boolean var)
    {
        if (tagCompound!=null)
        {
            tagCompound.setBoolean(key,var);
        }
    }
    public static void setInt(NBTTagCompound tagCompound, String key, int var)
    {
        if (tagCompound!=null)
        {
            tagCompound.setInteger(key,var);
        }
    }
    public static void setIntArray(NBTTagCompound tagCompound, String key, int[] var)
    {
        if (tagCompound!=null)
        {
            tagCompound.setIntArray(key,var);
        }
    }
    public static void setDouble(NBTTagCompound tagCompound, String key, double var)
    {
        if (tagCompound!=null)
        {
            tagCompound.setDouble(key,var);
        }
    }
    public static void setFloat(NBTTagCompound tagCompound, String key, float var)
    {
        if (tagCompound!=null)
        {
            tagCompound.setFloat(key,var);
        }
    }
    public static void setUUID(NBTTagCompound tagCompound, String key, UUID var)
    {
        if (tagCompound!=null)
        {
            tagCompound.setUniqueId(key,var);
        }
    }
    public static void setUUID(NBTTagCompound tagCompound, String key, NBTTagCompound var)
    {
        if (tagCompound!=null)
        {
            tagCompound.setTag(key,var);
        }
    }

    public static  NBTTagCompound getNBTTagCompound(ItemStack stack){
        return stack.getTagCompound();
    }
    public static  NBTTagCompound getNBTTagCompound(Entity entity){
        return entity.getEntityData();
        /**
         * 实体的NBT数据并不总是前后端同步*/
    }
    public static  NBTTagCompound getNBTTagCompound(World world){
        return world.getWorldInfo().getDimensionData(world.provider.getDimension());
    }
}
