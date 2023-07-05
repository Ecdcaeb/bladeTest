package com.Hileb.moremomostories.entity.render;

import com.Hileb.moremomostories.entity.entity.living.EntityMobChest;
import com.Hileb.moremomostories.entity.model.ModelMobChest;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderMobChest extends RenderLiving<EntityMobChest>
{
    private static final ResourceLocation Entity_TEXTURES = new ResourceLocation("moremomostories:textures/entity/entitymobchest.png");

    public RenderMobChest(RenderManager renderManagerIn)
    {
        super(renderManagerIn, new ModelMobChest(), 0.5F);
    }
    protected ResourceLocation getEntityTexture(EntityMobChest entity)
    {
        return Entity_TEXTURES;
    }
}