package com.AR.blocks;

import com.AR.gui.BTMCGUI;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BTMC extends BlockContainer  {

	public BTMC(Material material) {
		
	
		super(material);
	}
	

public boolean onBlockRightClick(World world, int x, int y, int z, EntityPlayer player, int i, float f, float g,
		float t) {
	if (!world.isRemote) {
		
		
		}
	return true;
	}


@Override
public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
	// TODO Auto-generated method stub
	return null;
	}
}
