package com.ruby.world.structGen;

import java.util.Random;

import com.ruby.rubymod.RubyMod;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class FlaxGenerator implements IWorldGenerator{
	
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
		switch(world.provider.dimensionId){
		case -1:
			generateNether(world, rand, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, rand, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
		//How much ore per chunk (i < [n])
		for(int i = 0; i < 20; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			//randPosY is the highest level of spawning
			int randPosY = rand.nextInt(130);
			int randPosZ = chunkZ + rand.nextInt(16);
			//Tells it to only generate on grass, in air
			if(world.getBlock(randPosX, randPosY, randPosZ) == Blocks.air){
				if(world.getBlock(randPosX, randPosY - 1, randPosZ) == Blocks.grass){
					//Tells it to only generate in extreme hills
					if(world.getBiomeGenForCoords(randPosX, randPosZ) == BiomeGenBase.extremeHills){
				        new FlaxGen().generate(world, rand,  randPosX, randPosY, randPosZ);
				}
				
				}
			}
		}

		
	}

	private void generateNether(World world, Random rand, int i, int j) {

		
	}

}