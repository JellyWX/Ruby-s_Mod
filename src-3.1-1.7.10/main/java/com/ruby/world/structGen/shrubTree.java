package com.ruby.world.structGen;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class shrubTree {
	
	public void generate(World world, Random random, int x, int y, int z){
		
		world.setBlock(x, y + 1, z, Blocks.log);
		world.setBlock(x, y + 2, z, Blocks.leaves);
		
	}

}
