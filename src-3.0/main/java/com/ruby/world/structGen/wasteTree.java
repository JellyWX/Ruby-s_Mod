package com.ruby.world.structGen;

import java.util.Random;

import com.ruby.rubymod.RubyMod;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class wasteTree {
	
	public void generate(World world, Random random, int x, int y, int z){
		
		int rand = random.nextInt(6);
		
		int j = y;
		
		for(int i = 0; i < rand; i++) {
		
			world.setBlock(x, j, z, RubyMod.logCharred);
			
			j++;
		
		}
	}

}
