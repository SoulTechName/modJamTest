package com.AR.blocks;

import com.AR.api.circle.BBAC;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class BBACD extends BBAC {

	public BBACD(Material material, String texture, String Name) {
		super(material, texture, Name);

	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f, float g,
			float t) {
		if (!world.isRemote) {
			Block a = world.getBlock(x, y - 1, z);
			Block b = world.getBlock(x + 1, y - 1, z);
			Block c = world.getBlock(x + 2, y - 1, z);
			Block d = world.getBlock(x + 3, y - 1, z);
			Block e = world.getBlock(x + 4, y - 1, z);
			Block HF = world.getBlock(x - 1, y + 1, z);
			
			if (a == Blocks.air && b == Blocks.crafting_table && c == Blocks.air && d == Blocks.cobblestone
					&& e == Blocks.unlit_redstone_torch) {
				world.setBlock(x, y - 1, z, Blocks.diamond_block);
				world.setBlock(x + 1, y - 1, z, Blocks.diamond_block);
				world.setBlock(x + 2, y - 1, z, Blocks.diamond_block);
				world.setBlock(x + 3, y - 1, z, Blocks.diamond_block);
				world.setBlock(x + 4, y - 1, z, Blocks.diamond_block);
			}  else {

				if (a == Blocks.sand) {
					world.setBlock(x, y - 1, z, Blocks.tnt);
					world.setBlock(x, y - 2, z, Blocks.redstone_block);
				}
				if (b == Blocks.sand) {
					world.setBlock(x + 1, y - 1, z, Blocks.tnt);
					world.setBlock(x + 1, y - 2, z, Blocks.redstone_block);
				}
				if (c == Blocks.sand) {
					world.setBlock(x + 2, y - 1, z, Blocks.tnt);
					world.setBlock(x + 2, y - 2, z, Blocks.redstone_block);
				}
				if (d == Blocks.sand) {
					world.setBlock(x + 3, y - 1, z, Blocks.tnt);
					world.setBlock(x + 3, y - 2, z, Blocks.redstone_block);
				}
				if (e == Blocks.sand) {
					world.setBlock(x + 4, y - 1, z, Blocks.tnt);
					world.setBlock(x + 4, y - 2, z, Blocks.redstone_block);
				}
			}
		}

	return true;
}}
