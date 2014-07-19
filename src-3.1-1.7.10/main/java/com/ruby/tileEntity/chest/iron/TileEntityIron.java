package com.ruby.tileEntity.chest.iron;

import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntityIron {
	
	public static void RubyMod(){
		registerTileEntities();
	}
	
	private static void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityIronChest.class, "IronChest");
	}

}
