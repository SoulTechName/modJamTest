package com.AR;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

import com.AR.Blocks.DEV_BLOCK;
import com.AR.References.NameReference;
import com.AR.References.TextureReference;
import com.AR.proxies.ClientProxy;
import com.AR.proxies.CommonProxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ReactionsMain.MODID, version = ReactionsMain.VERSION)
public class ReactionsMain {
	public static final String MODID = "alchemic reactions";
	public static final String VERSION = "0.1";

	@SidedProxy(clientSide = "com.AR.proxies.ClientProxy", serverSide = "com.AR.proxies.CommonProxy")
	public static CommonProxy proxy;

	Block Dev_Block_Blue = new DEV_BLOCK(Material.rock, TextureReference.Texture1, NameReference.Name1, CreativeTabs.tabBlock);
	Block Dev_Block_Orange = new DEV_BLOCK(Material.rock, TextureReference.Texture2, NameReference.Name2, CreativeTabs.tabBlock);

	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		GameRegistry.registerBlock(Dev_Block_Blue, "DevBlockBlue");
		GameRegistry.registerBlock(Dev_Block_Orange, "DevBlockOrange");

	}
}
