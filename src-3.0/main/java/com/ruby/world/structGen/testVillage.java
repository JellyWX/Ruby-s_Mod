package com.ruby.world.structGen;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;

import com.ruby.rubymod.RubyMod;

public class testVillage {
	
	
	public void generate(World world, Random rand, int x, int y, int z){
		
		int houseNo = rand.nextInt(6);
		
		int i2 = x;
		int j2 = y;
		int k2 = z;
		
		for(int i = 0; i < houseNo; i++) {
		
			int houseType = rand.nextInt(3);
		
			if(houseType == 1){
				int incr = rand.nextInt(7);
				incr += 3;
				
				int incr1 = rand.nextInt(7);
				incr1 += 3;
				
				world.setBlock(i2, j2, k2, Blocks.stonebrick);
				world.setBlock(i2 + 1, j2, k2, Blocks.stonebrick);
				world.setBlock(i2, j2, k2 + 1, Blocks.stonebrick);
				world.setBlock(i2 - 1, j2, k2, Blocks.stonebrick);
				world.setBlock(i2, j2, k2 - 1, Blocks.stonebrick);
				world.setBlock(i2 + 1, j2, k2 - 1, Blocks.stonebrick);
				world.setBlock(i2 + 1, j2, k2 + 1, Blocks.stonebrick);
				world.setBlock(i2 - 1, j2, k2 - 1, Blocks.stonebrick);
				world.setBlock(i2 - 1, j2, k2 + 1, Blocks.stonebrick);
				
				
				world.setBlock(i2, j2 + 4, k2, Blocks.stonebrick);
				world.setBlock(i2 + 1, j2 + 4, k2, Blocks.stonebrick);
				world.setBlock(i2, j2 + 4, k2 + 1, Blocks.stonebrick);
				world.setBlock(i2 - 1, j2 + 4, k2, Blocks.stonebrick);
				world.setBlock(i2, j2 + 4, k2 - 1, Blocks.stonebrick);
				world.setBlock(i2 + 1, j2 + 4, k2 - 1, Blocks.stonebrick);
				world.setBlock(i2 + 1, j2 + 4, k2 + 1, Blocks.stonebrick);
				world.setBlock(i2 - 1, j2 + 4, k2 - 1, Blocks.stonebrick);
				world.setBlock(i2 - 1, j2 + 4, k2 + 1, Blocks.stonebrick);
				
				i2 += incr;
				k2 += incr1;
				
			}
		
			if(houseType == 2){
				int incr = rand.nextInt(7);
				incr += 3;
				
				int incr1 = rand.nextInt(7);
				incr1 += 3;
				
				world.setBlock(i2, j2, k2, Blocks.cobblestone);
				world.setBlock(i2 + 1, j2, k2, Blocks.cobblestone);
				world.setBlock(i2, j2, k2 + 1, Blocks.cobblestone);
				world.setBlock(i2 - 1, j2, k2, Blocks.cobblestone);
				world.setBlock(i2, j2, k2 - 1, Blocks.cobblestone);
				world.setBlock(i2 + 1, j2, k2 - 1, Blocks.cobblestone);
				world.setBlock(i2 + 1, j2, k2 + 1, Blocks.cobblestone);
				world.setBlock(i2 - 1, j2, k2 - 1, Blocks.cobblestone);
				world.setBlock(i2 - 1, j2, k2 + 1, Blocks.cobblestone);
				
				
				world.setBlock(i2, j2 + 4, k2, Blocks.cobblestone);
				world.setBlock(i2 + 1, j2 + 4, k2, Blocks.cobblestone);
				world.setBlock(i2, j2 + 4, k2 + 1, Blocks.cobblestone);
				world.setBlock(i2 - 1, j2 + 4, k2, Blocks.cobblestone);
				world.setBlock(i2, j2 + 4, k2 - 1, Blocks.cobblestone);
				world.setBlock(i2 + 1, j2 + 4, k2 - 1, Blocks.cobblestone);
				world.setBlock(i2 + 1, j2 + 4, k2 + 1, Blocks.cobblestone);
				world.setBlock(i2 - 1, j2 + 4, k2 - 1, Blocks.cobblestone);
				world.setBlock(i2 - 1, j2 + 4, k2 + 1, Blocks.cobblestone);
				
				i2 += incr;
				k2 += incr1;
				
			}

			if(houseType == 3){
				int incr = rand.nextInt(7);
				incr += 3;
				
				int incr1 = rand.nextInt(7);
				incr1 += 3;
				
				
				world.setBlock(i2, j2, k2, Blocks.stone);
				world.setBlock(i2 + 1, j2, k2, Blocks.stone);
				world.setBlock(i2, j2, k2 + 1, Blocks.stone);
				world.setBlock(i2 - 1, j2, k2, Blocks.stone);
				world.setBlock(i2, j2, k2 - 1, Blocks.stone);
				world.setBlock(i2 + 1, j2, k2 - 1, Blocks.stone);
				world.setBlock(i2 + 1, j2, k2 + 1, Blocks.stone);
				world.setBlock(i2 - 1, j2, k2 - 1, Blocks.stone);
				world.setBlock(i2 - 1, j2, k2 + 1, Blocks.stone);
				
				
				world.setBlock(i2, j2 + 4, k2, Blocks.stone);
				world.setBlock(i2 + 1, j2 + 4, k2, Blocks.stone);
				world.setBlock(i2, j2 + 4, k2 + 1, Blocks.stone);
				world.setBlock(i2 - 1, j2 + 4, k2, Blocks.stone);
				world.setBlock(i2, j2 + 4, k2 - 1, Blocks.stone);
				world.setBlock(i2 + 1, j2 + 4, k2 - 1, Blocks.stone);
				world.setBlock(i2 + 1, j2 + 4, k2 + 1, Blocks.stone);
				world.setBlock(i2 - 1, j2 + 4, k2 - 1, Blocks.stone);
				world.setBlock(i2 - 1, j2 + 4, k2 + 1, Blocks.stone);
				
				i2 += incr;
				k2 += incr1;
				
			}		
		}
	}
}
