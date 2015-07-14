package com.soultechnamei.alchemicreactions.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.soultechnamei.alchemicreactions.ModEventHandler;

public class BBAC extends BlockContainer  {

	public BBAC(Material material) {
		super(material);

	}

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f, float g,
			float t) {
		if (!world.isRemote) {
			Block B = world.getBlock(x, y - 1, z);
			if (B == Blocks.grass) {
				world.setBlock(x, y - 1, z, Blocks.sand);
			} else if (B == Blocks.dirt) {
				world.setBlock(x, y - 1, z, Blocks.sand);
			} else {

			}

		} else {

		}
		return true;
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		
		return null;
	}

}
