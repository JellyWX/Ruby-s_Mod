package com.ruby.rubymod;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.crafting.*;

public class CraftingManager {
	

	
	public static void MainClass(){
		addCraftingRecipes();
		addSmeltingRecipes();
		
		
	}

	
	public static void addCraftingRecipes(){
		
		GameRegistry.addShapedRecipe(new ItemStack(RubyMod.mixSilicon, 2) , "SSS", "SOS", "SSS", 'S', Blocks.sand, 'O', Blocks.stone);
		GameRegistry.addShapedRecipe(new ItemStack(Items.bucket) , "XXX", "SXS", "XSX", 'S', RubyMod.ingotTin);
		        
        GameRegistry.addShapedRecipe(new ItemStack(RubyMod.pickaxeObsidian), "OOO", " S ", " S ", 'O', Blocks.obsidian, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(RubyMod.swordObsidian) , "O", "O", "S", 'O', Blocks.obsidian, 'S', Items.stick);
	    GameRegistry.addShapedRecipe(new ItemStack(RubyMod.axeObsidian) , "OO", "OS", " S", 'O', Blocks.obsidian, 'S', Items.stick);
	    GameRegistry.addShapedRecipe(new ItemStack(RubyMod.hoeObsidian), "OO", " S", " S", 'O', Blocks.obsidian, 'S', Items.stick);
	    GameRegistry.addShapedRecipe(new ItemStack(RubyMod.shovelObsidian) , "O", "S", "S", 'O', Blocks.obsidian, 'S', Items.stick);
	    
	    GameRegistry.addShapedRecipe(new ItemStack(RubyMod.pickaxeEmerald), "OOO", " S ", " S ", 'O', Items.emerald, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(RubyMod.swordEmerald) , "O", "O", "S", 'O', Items.emerald, 'S', Items.stick);
	    GameRegistry.addShapedRecipe(new ItemStack(RubyMod.axeEmerald) , "OO", "OS", " S", 'O', Items.emerald, 'S', Items.stick);
	    GameRegistry.addShapedRecipe(new ItemStack(RubyMod.hoeEmerald), "OO", " S", " S", 'O', Items.emerald, 'S', Items.stick);
	    GameRegistry.addShapedRecipe(new ItemStack(RubyMod.shovelEmerald) , "O", "S", "S", 'O', Items.emerald, 'S', Items.stick);

	    GameRegistry.addShapedRecipe(new ItemStack(RubyMod.pickaxeSteel), "OOO", " S ", " S ", 'O', RubyMod.ingotSteel, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(RubyMod.swordSteel) , "O", "O", "S", 'O', RubyMod.ingotSteel, 'S', Items.stick);
	    GameRegistry.addShapedRecipe(new ItemStack(RubyMod.axeSteel) , "OO", "OS", " S", 'O', RubyMod.ingotSteel, 'S', Items.stick);
	    GameRegistry.addShapedRecipe(new ItemStack(RubyMod.hoeSteel), "OO", " S", " S", 'O', RubyMod.ingotSteel, 'S', Items.stick);
	    GameRegistry.addShapedRecipe(new ItemStack(RubyMod.shovelSteel) , "O", "S", "S", 'O', RubyMod.ingotSteel, 'S', Items.stick);

	    GameRegistry.addShapedRecipe(new ItemStack(RubyMod.pickaxeFlint), "OOO", " S ", " S ", 'O', Items.flint, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(RubyMod.swordFlint) , "O", "O", "S", 'O', Items.flint, 'S', Items.stick);
	    GameRegistry.addShapedRecipe(new ItemStack(RubyMod.axeFlint) , "OO", "OS", " S", 'O', Items.flint, 'S', Items.stick);
        
		GameRegistry.addShapedRecipe(new ItemStack(RubyMod.blockRuby) , "SSS", "SSS", "SSS", 'S', RubyMod.gemRuby);
		GameRegistry.addShapedRecipe(new ItemStack(RubyMod.blockTin) , "SSS", "SSS", "SSS", 'S', RubyMod.ingotTin);
		GameRegistry.addShapedRecipe(new ItemStack(RubyMod.blockSteel) , "SSS", "SSS", "SSS", 'S', RubyMod.ingotSteel);
		GameRegistry.addShapedRecipe(new ItemStack(RubyMod.blockCopper) , "SSS", "SSS", "SSS", 'S', RubyMod.ingotCopper);
		
		GameRegistry.addShapedRecipe(new ItemStack(RubyMod.CopperChest, 1),  "CCC", "CSC", "CCC", 'C', RubyMod.ingotCopper, 'S', Blocks.chest);
		GameRegistry.addShapedRecipe(new ItemStack(RubyMod.IronChest, 1),  "CCC", "CSC", "CCC", 'C', Items.iron_ingot, 'S', RubyMod.CopperChest);
		GameRegistry.addShapedRecipe(new ItemStack(RubyMod.IronChest, 1),  "CRC", "CSC", "CCC", 'C', Items.iron_ingot, 'S', Blocks.chest, 'R', Blocks.iron_block);
		
		GameRegistry.addShapedRecipe(new ItemStack(RubyMod.pickaxeBronze), "OOO", " S ", " S ", 'O', RubyMod.ingotBronze, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(RubyMod.swordBronze) , "O", "O", "S", 'O', RubyMod.ingotBronze, 'S', Items.stick);
	    GameRegistry.addShapedRecipe(new ItemStack(RubyMod.axeBronze) , "OO", "OS", " S", 'O', RubyMod.ingotBronze, 'S', Items.stick);
	    GameRegistry.addShapedRecipe(new ItemStack(RubyMod.hoeBronze), "OO", " S", " S", 'O', RubyMod.ingotBronze, 'S', Items.stick);
	    GameRegistry.addShapedRecipe(new ItemStack(RubyMod.shovelBronze) , "O", "S", "S", 'O', RubyMod.ingotBronze, 'S', Items.stick);
		
	    GameRegistry.addShapelessRecipe(new ItemStack(RubyMod.gemRuby, 9), new ItemStack(RubyMod.blockRuby));
	    GameRegistry.addShapelessRecipe(new ItemStack(RubyMod.ingotTin, 9), new ItemStack(RubyMod.blockTin));
	    GameRegistry.addShapelessRecipe(new ItemStack(RubyMod.ingotCopper, 9), new ItemStack(RubyMod.blockCopper));
	    GameRegistry.addShapelessRecipe(new ItemStack(RubyMod.ingotSteel, 9), new ItemStack(RubyMod.blockSteel));
	    GameRegistry.addShapelessRecipe(new ItemStack(RubyMod.mixBronze), new ItemStack(RubyMod.ingotTin), new ItemStack(RubyMod.ingotCopper), new ItemStack(RubyMod.ingotCopper));
	    GameRegistry.addShapelessRecipe(new ItemStack(RubyMod.mixSteel, 2), new ItemStack(Items.iron_ingot), new ItemStack(Items.iron_ingot), new ItemStack(Items.iron_ingot), new ItemStack(Items.iron_ingot), new ItemStack(Items.coal));	    
	    GameRegistry.addShapelessRecipe(new ItemStack(RubyMod.pigIron, 2), new ItemStack(Items.iron_ingot), new ItemStack(Items.coal), new ItemStack(RubyMod.Silicon));

	}
	
	
  public static void addSmeltingRecipes(){
	  
	  GameRegistry.addSmelting(new ItemStack(RubyMod.mixSteel), new ItemStack(RubyMod.ingotSteel), 3);	  
	  GameRegistry.addSmelting(new ItemStack(RubyMod.mixSilicon), new ItemStack(RubyMod.Silicon), 3);
	  GameRegistry.addSmelting(new ItemStack(RubyMod.pigIron), new ItemStack(Items.iron_ingot), 3);
	  GameRegistry.addSmelting(new ItemStack(RubyMod.mixBronze), new ItemStack(RubyMod.ingotBronze), 3);
	  GameRegistry.addSmelting(RubyMod.oreTin, new ItemStack(RubyMod.ingotTin), 3);
	  GameRegistry.addSmelting(RubyMod.oreCopper, new ItemStack(RubyMod.ingotCopper), 3);
	  GameRegistry.addSmelting(RubyMod.oreAluminium, new ItemStack(RubyMod.ingotAluminium), 3);



    }
  	  
}
