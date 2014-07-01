package com.ruby.rubymod;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.crafting.*;
import com.ruby.rubymod.RubyMod;

public class RegistryManager {
	

	
	public static void MainClass(){
		registerBlock();
		registerItem();
		registerOther();
				
	}
	
	public static void registerBlock(){
		
		   GameRegistry.registerBlock(RubyMod.oreRuby, "oreRuby");
		   GameRegistry.registerBlock(RubyMod.oreAluminium, "oreAluminium");
	       GameRegistry.registerBlock(RubyMod.oreCopper, "oreCopper");
	       GameRegistry.registerBlock(RubyMod.oreTin, "oreTin");

	       GameRegistry.registerBlock(RubyMod.blockTin, "blockTin");
	       GameRegistry.registerBlock(RubyMod.blockSteel, "blockSteel");
	       GameRegistry.registerBlock(RubyMod.blockCopper, "blockCopper");
	       GameRegistry.registerBlock(RubyMod.blockRuby, "blockRuby");

	       GameRegistry.registerBlock(RubyMod.blockEnder, "blockEnder");

	       GameRegistry.registerBlock(RubyMod.CopperChest, "CopperChest");
	       GameRegistry.registerBlock(RubyMod.IronChest, "IronChest");
	       GameRegistry.registerBlock(RubyMod.AlloyBench, "AlloyBench");
	       
	       GameRegistry.registerBlock(RubyMod.plantFlax, "plantFlax");

		
	}
	
	public static void registerItem(){
		
		   GameRegistry.registerItem(RubyMod.gemRuby, "gemRuby");
	       GameRegistry.registerItem(RubyMod.ingotSteel, "ingotSteel");
	       GameRegistry.registerItem(RubyMod.ingotTin, "ingotTin");
	       GameRegistry.registerItem(RubyMod.ingotCopper, "ingotCopper"); 
	       GameRegistry.registerItem(RubyMod.ingotBronze, "ingotBronze");
	       GameRegistry.registerItem(RubyMod.ingotAluminium, "ingotAluminium");
	       
	       GameRegistry.registerItem(RubyMod.mixSteel, "mixSteel");
	       GameRegistry.registerItem(RubyMod.mixSilicon, "mixSilicon");
	       GameRegistry.registerItem(RubyMod.pigIron, "pigIron");
	       GameRegistry.registerItem(RubyMod.mixBronze, "mixBronze");
	       
	       GameRegistry.registerItem(RubyMod.flax, "flax");
	       GameRegistry.registerItem(RubyMod.Silicon, "Silicon");

	       
	       GameRegistry.registerItem(RubyMod.swordEmerald, "swordEmerald");
	       GameRegistry.registerItem(RubyMod.pickaxeEmerald, "pickaxeEmerald");
	       GameRegistry.registerItem(RubyMod.axeEmerald, "axeEmerald");
	       GameRegistry.registerItem(RubyMod.shovelEmerald, "shovelEmerald");
	       GameRegistry.registerItem(RubyMod.hoeEmerald, "hoeEmerald");
	       
	       GameRegistry.registerItem(RubyMod.swordBronze, "swordBronze");
	       GameRegistry.registerItem(RubyMod.pickaxeBronze, "pickaxeBronze");
	       GameRegistry.registerItem(RubyMod.axeBronze, "axeBronze");
	       GameRegistry.registerItem(RubyMod.shovelBronze, "shovelBronze");
	       GameRegistry.registerItem(RubyMod.hoeBronze, "hoeBronze");
	       
	       GameRegistry.registerItem(RubyMod.swordObsidian, "swordObsidian");
	       GameRegistry.registerItem(RubyMod.pickaxeObsidian, "pickaxeObsidian");
	       GameRegistry.registerItem(RubyMod.axeObsidian, "axeObsidian");
	       GameRegistry.registerItem(RubyMod.shovelObsidian, "shovelObsidian");
	       GameRegistry.registerItem(RubyMod.hoeObsidian, "hoeObsidian");
	       
	       GameRegistry.registerItem(RubyMod.swordSteel, "swordSteel");
	       GameRegistry.registerItem(RubyMod.pickaxeSteel, "pickaxeSteel");
	       GameRegistry.registerItem(RubyMod.axeSteel, "axeSteel");
	       GameRegistry.registerItem(RubyMod.shovelSteel, "shovelSteel");
	       GameRegistry.registerItem(RubyMod.hoeSteel, "hoeSteel");
	       
	       GameRegistry.registerItem(RubyMod.swordFlint, "swordFlint");
	       GameRegistry.registerItem(RubyMod.pickaxeFlint, "pickaxeFlint");
	       GameRegistry.registerItem(RubyMod.axeFlint, "axeFlint");
		
	}  
	
	public static void registerOther(){

	}
	
	
}