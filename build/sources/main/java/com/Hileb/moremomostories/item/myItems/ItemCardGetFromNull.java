package com.Hileb.moremomostories.item.myItems;

import com.Hileb.moremomostories.command.ModCommands;
import com.Hileb.moremomostories.item.ItemBase;
import com.Hileb.moremomostories.item.ItemInformationAdder;
import com.Hileb.moremomostories.item.ModItems;
import com.Hileb.moremomostories.meta.MetaUtil;
import com.Hileb.moremomostories.util.MoMo.MoMoCards;
import com.Hileb.moremomostories.util.TooltipHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Random;

public class ItemCardGetFromNull extends ItemBase {

    //private final ItemInformationAdder ItemDesc=new ItemInformationAdder("item.item_card_get_from_null.desc1","item.item_card_get_from_null.desc2");
    public ItemCardGetFromNull(){
        super("item_card_get_from_null");
        MoMoCards.registerCard(this);
    }

    @Nonnull
    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, @Nonnull EnumHand hand) {
        if(!world.isRemote){
            if(player.getHeldItemMainhand().getItem()==this){
                if (MetaUtil.isLoaded_Momostories) {
                    Item card=MoMoCards.getCard(new Random().nextInt(MoMoCards.getCount()));
                    if (card!=null){
                        ItemStack stack=new ItemStack(card);
                        ModCommands.give(player,stack.copy());
                    }
                    else give(player);
                }
                else{
                    give(player);
                }
                if (!player.isCreative()){
                    player.getHeldItemMainhand().shrink(1);
                }
            }
        }
        return super.onItemRightClick(world,player,hand);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flag) {
        super.addInformation(stack, world, tooltip, flag);
        TooltipHelper.onTooltip(tooltip,"item.item_card_get_from_null.desc2","item.item_card_get_from_null.desc1");
    }
    private void give(EntityPlayer player){
        ModCommands.give(player,new ItemStack(ModItems.ITEM_CARD_NULL));
        ModCommands.give(player,new ItemStack(ModItems.ITEM_MAIN_TR));
        ModCommands.give(player,new ItemStack(ModItems.ITEM_MAIN_XK));
    }
}
