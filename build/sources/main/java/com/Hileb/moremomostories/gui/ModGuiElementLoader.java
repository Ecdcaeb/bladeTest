package com.Hileb.moremomostories.gui;

import com.Hileb.moremomostories.IdlFramework;
import com.Hileb.moremomostories.blocks.tileEntity.TileEntityBookShelf;
import com.Hileb.moremomostories.gui.BookShelf.ContainerBookShelf;
import com.Hileb.moremomostories.gui.BookShelf.GuiContainerBookShelf;
import com.Hileb.moremomostories.gui.EnchantmentGUI.ContainerEnchantmentTableHileb;
import com.Hileb.moremomostories.gui.EnchantmentGUI.GuiEnchantmentTableHileb;
import com.Hileb.moremomostories.gui.cardGUI.card.ContainerCard;
import com.Hileb.moremomostories.gui.cardGUI.card.GuiContainerCard;
import com.Hileb.moremomostories.gui.fakeChestGui.BookShelf.ContainerFakeChest;
import com.Hileb.moremomostories.gui.fakeChestGui.BookShelf.GuiContainerFakeChest;
import com.Hileb.moremomostories.gui.paper.paper1.ContainerPaper1;
import com.Hileb.moremomostories.gui.paper.paper1.GuiContainerPaper1;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import javax.annotation.Nullable;

//todo
//https://fmltutor.ustc-zzzz.net/3.4.3-GUI%E7%95%8C%E9%9D%A2%E4%B8%AD%E7%9A%84%E4%BA%A4%E4%BA%92.html
public class ModGuiElementLoader implements IGuiHandler {

    public static final int GUI_DEMO = 1;
    public static final int GUI_RESEARCH = 2;
    public static final int GUI_PAPER_1 = 1001;

    public static final int GUI_CHEST = 1011;

    public static final int GUI_ENCH = 101;
    public static final int GUI_CHEST_FAKE = 1012;

    public static final int GUI_CARD_CONTAINER = 1013;

    public ModGuiElementLoader()
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(IdlFramework.instance, this);
    }

    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID)
        {
            case GUI_PAPER_1:
                return new ContainerPaper1(player);
            case GUI_CHEST:
                TileEntity tile=world.getTileEntity(new BlockPos(x,y,z));
                if (tile!=null){
                    if (tile instanceof TileEntityBookShelf){
                        TileEntityBookShelf trueTile=(TileEntityBookShelf)tile;
                        return new ContainerBookShelf(player.inventory,trueTile,player,trueTile.getPos());
                    }
                }
                return null;
            case GUI_ENCH:
                return new ContainerEnchantmentTableHileb(player.inventory,world,new BlockPos(x,y,z));
            case GUI_CHEST_FAKE:
                return new ContainerFakeChest(player,world,new BlockPos(x,y,z));
            case GUI_CARD_CONTAINER:
                return new ContainerCard(player.inventory,x,player);
                default:
                    return null;
        }
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID)
        {
            case GUI_PAPER_1:
                return new GuiContainerPaper1(new ContainerPaper1(player));
            case GUI_CHEST:
                TileEntity tile=world.getTileEntity(new BlockPos(x,y,z));
                if (tile!=null){
                    if (tile instanceof TileEntityBookShelf){
                        TileEntityBookShelf trueTile=(TileEntityBookShelf)tile;
                        return new GuiContainerBookShelf(new ContainerBookShelf(player.inventory,trueTile,player,tile.getPos()));
                    }
                }

                return null;
            case GUI_ENCH:
                return new GuiEnchantmentTableHileb(new ContainerEnchantmentTableHileb(player.inventory,world,new BlockPos(x,y,z)),player.inventory,world,player.inventory);
            case GUI_CHEST_FAKE:
                return new GuiContainerFakeChest(new ContainerFakeChest(player,world,new BlockPos(x,y,z)));
            case GUI_CARD_CONTAINER:
                return new GuiContainerCard(new ContainerCard(player.inventory,x,player));
                default:
                return null;
        }
    }
}
