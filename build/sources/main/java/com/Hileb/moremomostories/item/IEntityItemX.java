package com.Hileb.moremomostories.item;

import com.Hileb.moremomostories.entity.entity.EntityItemX;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public interface IEntityItemX {
    @Nullable
    public default Entity createEntityItem(World world, Entity location, ItemStack itemstack) {
        EntityItemX x=new EntityItemX((EntityItem)location);
        x.setNoPickupDelay();
        return x;
    }
}
