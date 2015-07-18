package com.soultechnamei.alchemicreactions;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

import com.soultechnamei.alchemicreactions.blocks.BBAC;
import com.soultechnamei.alchemicreactions.blocks.BTMC;
import com.soultechnamei.alchemicreactions.entity.BBACEntity;
import com.soultechnamei.alchemicreactions.items.ItemBAC;
import com.soultechnamei.alchemicreactions.items.ItemBEG;
import com.soultechnamei.alchemicreactions.items.ItemC;
import com.soultechnamei.alchemicreactions.items.ItemSS;
import com.soultechnamei.alchemicreactions.proxies.ClientProxy;
import com.soultechnamei.alchemicreactions.proxies.CommonProxy;
import com.soultechnamei.alchemicreactions.ModEventHandler;
import com.soultechnamei.alchemicreactions.blocks.BFTC;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ReactionsMain.MODID, version = ReactionsMain.VERSION)
public class ReactionsMain {
	public static final String MODID = "Alchemic Reactions";
	public static final String VERSION = "1.0";
	
	//Items
	public static Item BEG; //Basic Essence Gem 
	public static Item C; //Chalk
	public static Item SS; //Stone Shards
	
	
	//Blocks
	public static Block BBAC; //Basic Transmutation circle
	public static Block FTC; //Fix Transmutation Circle
	public static Block BTMC; //Transmutation Crafting Table
	
	
	
	//CreativeTab
	public static CreativeTabs tabAlchemyCircles = new CreativeTabsAlchemyCircles ("Alchemic Reactions: Circles"); 
	
	ModEventHandler e = new ModEventHandler();
    
	@SidedProxy(clientSide="com.soultechnamei.alchemicreactions.proxies.ClientProxy", serverSide="com.soultechnamei.alchemicreactionstions.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
        
		FMLCommonHandler.instance().bus().register(e);
        MinecraftForge.EVENT_BUS.register(e);

		
		// Blocks
		BBAC = new BBAC(Material.rock).setHardness(1.5F).setStepSound(Block.soundTypeStone).setBlockName("BBAC")
				.setCreativeTab(ReactionsMain.tabAlchemyCircles);
		
		BTMC = new BTMC(Material.rock).setHardness(1.5F).setStepSound(Block.soundTypeStone).setBlockName("BTMC")
				.setCreativeTab(ReactionsMain.tabAlchemyCircles);
		FTC = new BFTC(Material.rock).setHardness(1.5F).setStepSound(Block.soundTypeStone).setBlockName("BFTC")
				.setCreativeTab(ReactionsMain.tabAlchemyCircles);
		
		// Items
		C = new ItemC(); 
        BEG = new ItemBEG();
        SS = new ItemSS();
        
		// Game Registry
		
        
       		//Items
        GameRegistry.registerItem(BEG, "Basic Essence Gem");
        GameRegistry.registerItem(C, "Chalk");
        GameRegistry.registerItem(SS, "Stone Shards");
       	
			//Blocks
       	GameRegistry.registerBlock(BBAC, "BBAC");
       	GameRegistry.registerBlock(BTMC, "BTMC");
       	
       		//Misc
		ClientProxy.registerRenderThings();
		GameRegistry.registerTileEntity(BBACEntity.class, "tileBasicAlchemyCircle");
		
			//Crafting
		//GameRegistry.addShapelessRecipe(new ItemStack(ReactionsMain.SS), new Object[] {"T","C",'C',Items.wooden_pickaxe,'T',Blocks.stone});
		GameRegistry.addRecipe(new ItemStack(ReactionsMain.BTMC), new Object[] {"T", "C", "T", 'C', ReactionsMain.C, 'T', Blocks.crafting_table});
		GameRegistry.addSmelting(ReactionsMain.SS, new ItemStack(ReactionsMain.C), 1);
		GameRegistry.addShapelessRecipe( new ItemStack( ReactionsMain.SS, 1, 1), Items.wooden_pickaxe, Blocks.stone);
	}
}

