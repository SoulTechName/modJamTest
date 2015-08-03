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

import com.AR.References.NameReference;
import com.AR.References.Reference;
import com.AR.References.TextureReference;
import com.AR.api.circle.BBAC;
import com.AR.api.circle.BBACEntity;
import com.AR.blocks.BBACD;
import com.AR.blocks.BFTC;
import com.AR.blocks.BGC;
import com.AR.blocks.BGemOre;
import com.AR.blocks.BTMC;
import com.AR.items.ItemBEG;
import com.AR.items.ItemC;
import com.AR.items.ItemCBEG;
import com.AR.items.ItemSS;
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
	public static final String MODID = "Alchemic Reactions";
	public static final String VERSION = "0.1.2A";

	public static Item BEG, C, SS, GEMC;
	public static Block FTC, BTMC, GEMO, BGC, BBACD;
	// ITEMS: B Essence Gem, Chalk, Stone Shards, Charged Gem
	// BLOCKS: Fix Trans. Circle, Trans. Crafting Table, GemOre

	// CreativeTab
	public static CreativeTabs tabAlchemyCircles = new CreativeTabsAlchemyCircles("Alchemic Reactions: Circles");
	public static CreativeTabs tabAlchemyblock = new CreativeTabsAlchemyCircles("Alchemic Reactions: Blocks");

	@SidedProxy(clientSide = "com.AR.proxies.ClientProxy", serverSide = "com.AR.proxies.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {

		// Blocks
		BTMC = new BTMC(Material.rock).setHardness(0.5F).setStepSound(Block.soundTypeStone).setBlockName("BTMC")
				.setCreativeTab(ReactionsMain.tabAlchemyCircles);
		FTC = new BFTC(Material.rock).setHardness(1.5F).setStepSound(Block.soundTypeStone).setBlockName("BFTC")
				.setCreativeTab(ReactionsMain.tabAlchemyCircles);
		GEMO = new BGemOre(Material.rock, TextureReference.Text2).setHardness(2.0F).setStepSound(Block.soundTypeStone)
				.setBlockName("GEMO").setCreativeTab(ReactionsMain.tabAlchemyCircles);
		BGC = new BGC(Material.rock).setHardness(2.0F).setBlockName("BGC").setCreativeTab(tabAlchemyCircles)
				.setBlockTextureName(Reference.MODID + ":" + "BGC");
		BBACD = new BBACD(Material.rock, TextureReference.Text1, NameReference.TAC).setBlockName("BBACD")
				.setCreativeTab(tabAlchemyCircles);
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
		GameRegistry.registerBlock(BTMC, "BTMC");
		GameRegistry.registerBlock(GEMO, "GEMO");
		GameRegistry.registerBlock(BGC, "BGC");
		GameRegistry.registerBlock(BBACD, "BBACD");

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
