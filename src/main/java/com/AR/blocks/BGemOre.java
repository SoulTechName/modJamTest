package com.AR.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BGemOre extends Block {

	public BGemOre(Material material, String texture) {

		super(material);
		setBlockTextureName(texture);
	}
}
