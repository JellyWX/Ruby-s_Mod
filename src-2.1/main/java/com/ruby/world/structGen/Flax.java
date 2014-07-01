package com.ruby.world.structGen;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class Flax {
	
	public static void RubyMod(){
		initWorldGen();
	}
	
	public static void initWorldGen(){
		registerWorldGen(new FlaxGenerator(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
	}

}
