package com.ruby.world.oreGen;

import java.util.Random;

import com.ruby.rubymod.RubyMod;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenTin implements IWorldGenerator{
	
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
		for(int i = 0; i < 75; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			//randPosY is the highest level of spawning
			int randPosY = rand.nextInt(80);
			int randPosZ = chunkZ + rand.nextInt(16);
			//The number after defining the block is the vein size
			(new WorldGenMinable(RubyMod.oreTin, 6)).generate(world, rand,  randPosX, randPosY, randPosZ);
		}

		
	}

	private void generateNether(World world, Random rand, int i, int j) {

		
	}

}
