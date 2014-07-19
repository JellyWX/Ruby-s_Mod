package com.rubyconstruct.construct;

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
		GameRegistry.registerItem(RubyConstruct.brickSandstone, "brickSandstone");
	
	}

	private static void registerBlock() {
		GameRegistry.registerBlock(RubyConstruct.blockBrickSandstone, "blockBrickSandstone");

		
	}

}
