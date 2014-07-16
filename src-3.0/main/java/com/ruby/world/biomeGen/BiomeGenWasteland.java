package com.ruby.world.biomeGen;

import static net.minecraft.world.biome.BiomeGenBase.forest;
import static net.minecraft.world.biome.BiomeGenBase.forestHills;
import static net.minecraft.world.biome.BiomeGenBase.jungle;
import static net.minecraft.world.biome.BiomeGenBase.jungleHills;
import static net.minecraft.world.biome.BiomeGenBase.plains;
import static net.minecraft.world.biome.BiomeGenBase.taiga;
import static net.minecraft.world.biome.BiomeGenBase.taigaHills;

import java.util.ArrayList;
import java.util.Arrays;

import com.ruby.rubymod.RubyMod;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;

public class BiomeGenWasteland extends BiomeGenBase {

	public BiomeGenWasteland(int p_i1971_1_) {
		
		super(p_i1971_1_);
		this.topBlock = Blocks.cobblestone;
		this.fillerBlock = Blocks.cobblestone;
		this.theBiomeDecorator.flowersPerChunk = 0;
		this.theBiomeDecorator.generateLakes = true;
		this.spawnableCreatureList.clear();
		System.out.println("RubyWorld: Biome Wilderness found");
		
	}
	
	public int deadBushPerChunk = 2;
		
	public int grassPerChunk = 0;
	
	public int flowersPerChunk = 0;
	
	public float getSpawningChance() {
		return 0.5f;
	}
	
	

}
