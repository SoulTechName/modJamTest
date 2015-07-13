package com.soultechnamei.alchemicreactions;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import com.soultechnamei.alchemicreactions.blocks.BBAC;
import com.soultechnamei.alchemicreactions.items.ItemBAC;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ReactionsMain.MODID, version = ReactionsMain.VERSION)
public class ReactionsMain {
	public static final String MODID = "Alchemic Reactions";
	public static final String VERSION = "1.0";

	public static Item BAC; // Basic Alchemy Circle
	public static Block BBAC;

	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		BBAC = new BBAC(Material.rock).setHardness(1.5F).setStepSound(Block.soundTypeStone).setBlockName("BBAC").setCreativeTab(CreativeTabs.tabBlock);
		BAC = new ItemBAC();

		// Game Registry
		GameRegistry.registerItem(BAC, "Basic Alchemy Circle");
		GameRegistry.registerBlock(BBAC, "BBAC");
	}

	public void init(FMLInitializationEvent event) {

	}

}
