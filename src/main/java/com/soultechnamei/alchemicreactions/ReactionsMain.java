package com.soultechnamei.alchemicreactions;


import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ReactionsMain.MODID, version = ReactionsMain.VERSION)
public class ReactionsMain 
{
	public static final String MODID = "Alchemic Reactions";
	public static final String VERSION ="1.0";
	
	public static Item BAC; //Basic Alchemy Circle 	
	
	@EventHandler
	
	public void preinit(FMLPreInitializationEvent event)
	{
		BAC = new ItemBAC();
		
		
		
		
		//Game Registry 
		GameRegistry.registerItem(BAC, "Basic Alchemy Circle");
	}
	
	
	public void init(FMLInitializationEvent event)
	{
		
	}
	
}
