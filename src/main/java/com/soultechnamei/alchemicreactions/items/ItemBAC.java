package com.soultechnamei.alchemicreactions.items;

import com.soultechnamei.alchemicreactions.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBAC extends Item {
	public ItemBAC() {
		setUnlocalizedName(Reference.MODID + "_" + "Basic Alchemy Circle");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Reference.MODID + ":" + "Basic Alchemy Circle");
	}

}