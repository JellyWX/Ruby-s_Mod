package com.rubyconstruct.construct;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.ruby.rubymod.RubyMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = RubyConstruct.MODID, name = RubyConstruct.name, version = RubyConstruct.VERSION)
public class RubyConstruct
{

	
    public static final String MODID = "rubyconstruct";
    public static final String name = "Ruby's Construction";
    public static final String VERSION = "1.0";
 
    @Instance(MODID)
    public static RubyConstruct instance;
    
    public static Item brickSandstone;
    
    public int brickSandstoneID = 15000;
    
    public static Block blockBrickSandstone;
    
    public int brickBlockSandstoneID = 15001;
    		
    
    public static CreativeTabs constructTab = new CreativeTabs("construct"){
    	public Item getTabIconItem(){
    		return brickSandstone;
    	}
    };
    
    @Metadata
    public static ModMetadata meta;
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	blockBrickSandstone = new com.rubyconstruct.blocks.blockBrickSandstone(brickBlockSandstoneID, Material.rock).setHardness(2.5f).setBlockName("brickBlockSandstone").setCreativeTab(RubyConstruct.constructTab);
    
    	brickSandstone = new com.rubyconstruct.items.brickSandstone(brickSandstoneID).setUnlocalizedName("brickSandstone").setCreativeTab(RubyConstruct.constructTab);  
    		
    	RegistryManager.MainClass();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    
    {
	
		CraftingManager.MainClass();
    }
    
    
}
