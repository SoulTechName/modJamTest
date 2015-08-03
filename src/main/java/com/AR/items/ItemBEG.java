package com.AR.items;

import java.util.List;

import com.AR.ReactionsMain;
import com.AR.References.Reference;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemBEG extends Item {


	public ItemBEG() {
		setUnlocalizedName(Reference.MODID + "_" + "Basic Essence Gem");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Reference.MODID + ":" + "BEGNC");
	}
	
}	
