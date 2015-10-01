package com.AR.Blocks;

import com.AR.ReactionsMain;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class TRANS_BLOCK_CORE extends Block {

	public TRANS_BLOCK_CORE(Material Mat, String Texture, String Name, CreativeTabs Tab) {
		super(Mat);
		setBlockTextureName(ReactionsMain.MODID+":"+Texture);
		setBlockName(Name);
		setCreativeTab(Tab);
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer Entity, int p_149727_6_,
			float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		System.out.println("Working");
		return false;
	}
}
