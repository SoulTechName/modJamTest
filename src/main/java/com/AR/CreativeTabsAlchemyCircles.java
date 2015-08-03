package com.AR;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabsAlchemyCircles extends CreativeTabs {

	public CreativeTabsAlchemyCircles(String tabLabel)
	{
		super (tabLabel); 
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		
		return Item.getItemFromBlock(ReactionsMain.GEMO); 
	}

}
