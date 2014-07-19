package com.rainbowmod.rainbowmod;

import cpw.mods.fml.common.registry.GameRegistry;

public class RegistryManager {
	
	public static void MainClass(){
		registerBlock();
		registerItem();
		registerOther();
				
	}

	private static void registerOther() {
		
	}

	private static void registerItem() {
		GameRegistry.registerItem(rainbowmod.gemRainbow, "gemRainbow");
	
	}

	private static void registerBlock() {
		GameRegistry.registerBlock(rainbowmod.oreRainbow, "oreRainbow");

		
	}

}
