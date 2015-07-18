package com.soultechnamei.alchemicreactions.items;

import com.soultechnamei.alchemicreactions.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSS extends Item {
	public ItemSS() {
		setUnlocalizedName(Reference.MODID + "_" + "Stone Shards");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Reference.MODID + ":" + "Stone Shards");
	}

}