package com.soultechnamei.alchemicreactions.items;

import com.soultechnamei.alchemicreactions.Reference;
import com.soultechnamei.alchemicreactions.gui.BTMCGUI;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemC extends Item 
{
	public ItemC()
	{
		setUnlocalizedName(Reference.MODID + "_" + "Chalk");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Reference.MODID + ":" + "Chalk");
	}

	
}