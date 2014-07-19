package com.ruby.tileEntity.chest.copper;

import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntityCopper {
	
	public static void RubyMod(){
		registerTileEntities();
	}
	
	private static void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityCopperChest.class, "CopperChest");
	}

}
