package com.soultechnamei.alchemicreactions.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

import com.soultechnamei.alchemicreactions.ModEventHandler;

public class BBAC extends Block {

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

}
