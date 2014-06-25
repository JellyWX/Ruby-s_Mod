package com.ruby.world.oreGen;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class AlumGen {
	
	public static void RubyMod(){
		initWorldGen();
	}
	
	public static void initWorldGen(){
		registerWorldGen(new WorldGenAlum(), 2);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
	}

}
