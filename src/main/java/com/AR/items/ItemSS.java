package com.AR.items;

import com.AR.References.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSS extends Item {
	public ItemSS() {
		setUnlocalizedName(Reference.MODID + "_" + "Stone Shards");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Reference.MODID + ":" + "Stone Shards");
	}

}