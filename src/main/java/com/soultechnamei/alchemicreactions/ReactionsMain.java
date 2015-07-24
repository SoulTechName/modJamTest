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
import com.soultechnamei.alchemicreactions.items.ItemCBEG;
import com.soultechnamei.alchemicreactions.items.ItemSS;
import com.soultechnamei.alchemicreactions.proxies.ClientProxy;
import com.soultechnamei.alchemicreactions.proxies.CommonProxy;
import com.soultechnamei.alchemicreactions.blocks.BFTC;
import com.soultechnamei.alchemicreactions.blocks.BGemOre;
import com.soultechnamei.alchemicreactions.blocks.BGC;

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
	public static final String VERSION = "0.1.1D";

	public static Item BEG, C, SS, GEMC;
	public static Block BBAC, FTC, BTMC, GEMO, BGC;
	// ITEMS: B Essence Gem, Chalk, Stone Shards, Charged Gem
	// BLOCKS: B Trans. Circle, Fix Trans. Circle, Trans. Crafting Table, GemOre

	// CreativeTab
	public static CreativeTabs tabAlchemyCircles = new CreativeTabsAlchemyCircles("Alchemic Reactions: Circles");

	@SidedProxy(clientSide = "com.soultechnamei.alchemicreactions.proxies.ClientProxy", serverSide = "com.soultechnamei.alchemicreactionstions.proxies.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {

		// Blocks
		BBAC = new BBAC(Material.rock).setHardness(0.5F).setStepSound(Block.soundTypeStone).setBlockName("BBAC")
				.setCreativeTab(ReactionsMain.tabAlchemyCircles).setBlockTextureName(Reference.MODID + ":" + "Basic Alchemy Circle");
		BTMC = new BTMC(Material.rock).setHardness(0.5F).setStepSound(Block.soundTypeStone).setBlockName("BTMC")
				.setCreativeTab(ReactionsMain.tabAlchemyCircles);
		FTC = new BFTC(Material.rock).setHardness(1.5F).setStepSound(Block.soundTypeStone).setBlockName("BFTC")
				.setCreativeTab(ReactionsMain.tabAlchemyCircles);
		GEMO = new BGemOre(Material.rock).setHardness(2.0F).setStepSound(Block.soundTypeStone).setBlockName("GEMO")
				.setCreativeTab(ReactionsMain.tabAlchemyCircles).setBlockTextureName(Reference.MODID + ":" + "GemOre");
		BGC = new BGC(Material.rock).setHardness(2.0F).setBlockName("BGC").setCreativeTab(tabAlchemyCircles)
				.setBlockTextureName(Reference.MODID + ":" + "BGC");
		// Items
		GEMC = new ItemCBEG();
		C = new ItemC();
		BEG = new ItemBEG();
		SS = new ItemSS();

		// Game Registry

		// Items
		GameRegistry.registerItem(BEG, "Basic Essence Gem");
		GameRegistry.registerItem(C, "Chalk");
		GameRegistry.registerItem(SS, "Stone Shards");
		GameRegistry.registerItem(GEMC, "Charged Gem");
		// Blocks
		GameRegistry.registerBlock(BBAC, "BBAC");
		GameRegistry.registerBlock(BTMC, "BTMC");
		GameRegistry.registerBlock(GEMO, "GEMO");
		GameRegistry.registerBlock(BGC, "BGC");
		// Misc
		ClientProxy.registerRenderThings();
		GameRegistry.registerTileEntity(BBACEntity.class, "tileBasicAlchemyCircle");

		// Crafting
		// GameRegistry.addShapelessRecipe(new ItemStack(ReactionsMain.SS), new
		// Object[] {"T","C",'C',Items.wooden_pickaxe,'T',Blocks.stone});
		GameRegistry.addRecipe(new ItemStack(ReactionsMain.BTMC),
				new Object[] { "T", "C", "T", 'C', ReactionsMain.C, 'T', Blocks.crafting_table });
		GameRegistry.addSmelting(ReactionsMain.SS, new ItemStack(ReactionsMain.C), 1);
		GameRegistry.addShapelessRecipe(new ItemStack(ReactionsMain.SS, 1, 1), Items.wooden_pickaxe, Blocks.stone);
	}
}
