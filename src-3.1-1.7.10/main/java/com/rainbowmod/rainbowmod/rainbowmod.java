package com.rainbowmod.rainbowmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = rainbowmod.MODID, name = rainbowmod.name, version = rainbowmod.VERSION)
public class rainbowmod
{

	
    public static final String MODID = "rainbowmod";
    public static final String name = "Rainbow Ores";
    public static final String VERSION = "1.0";
 
    @Instance(MODID)
    public static rainbowmod instance;
    public static Block oreRainbow;
    
    int oreRainbowID = 17001;
    public static Item gemRainbow;
    
    int gemRainbowID = 17002;
    
    public static CreativeTabs rainbow = new CreativeTabs("rainbow"){
    	public Item getTabIconItem(){
    		return gemRainbow;
    	}
	
    };		
    
    
    @Metadata
    public static ModMetadata meta;
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	
    	oreRainbow = new com.rainbowmod.blocks.oreRainbow(oreRainbowID, Material.rock).setHardness(4F).setBlockName("oreRainbow").setCreativeTab(rainbowmod.rainbow);

    	gemRainbow = new com.rainbowmod.items.gemRainbow(gemRainbowID).setUnlocalizedName("gemRainbow").setCreativeTab(rainbowmod.rainbow);  

    	
    	RegistryManager.MainClass();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    
    {
	
		CraftingManager.MainClass();
    }
    
    
}
