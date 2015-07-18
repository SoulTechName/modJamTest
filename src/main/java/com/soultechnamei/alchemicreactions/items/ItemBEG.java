package com.soultechnamei.alchemicreactions.items;

import java.util.List;

import com.soultechnamei.alchemicreactions.ReactionsMain;
import com.soultechnamei.alchemicreactions.Reference;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemBEG extends Item {

	int StoredEssence = 0;
	int MaxEssence = 10;
	int MinEssence = 0;

	public ItemBEG() {
		setHasSubtypes(true);
		setUnlocalizedName(Reference.MODID + "_" + "Basic Essence Gem");
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(Reference.MODID + ":" + "Basic Essence Gem");
	}
	
	//public IIcon[] icons = new IIcon[4];

	//@Override
	//public void registerIcons(IIconRegister reg) {
		//for (int i = 0; i < 4; i++) {
			//this.icons[i] = reg.registerIcon(ReactionsMain.MODID + ":multitexture_" + i);
	 
	//@Override
	//public IIcon getIconFromDamage(int meta) {
		//if (meta > 5)
			//meta = 0;

		//return this.icons[meta];
	

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < 6; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}

}