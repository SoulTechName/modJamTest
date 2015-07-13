package com.soultechnamei.alchemicreactions.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BBAC extends Block {

	public BBAC(Material material) {
		super(material);

	}

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f, float g,
			float t) {
		if (!world.isRemote && player.isSneaking()) {
			System.out.println("THIS BETTER WORK OR I GIVE UP");
		} else {

		}
		return true;
	}
}
