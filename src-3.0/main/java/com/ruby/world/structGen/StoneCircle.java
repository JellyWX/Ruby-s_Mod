package com.ruby.world.structGen;

import java.util.Random;

import com.ruby.rubymod.RubyMod;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class StoneCircle {
	
	public void generate(World world, Random random, int x, int y, int z){
	
	world.setBlock(x, y, z, Blocks.cobblestone);
	
	world.setBlock(x - 1, y, z + 2, Blocks.mossy_cobblestone);
	world.setBlock(x - 3, y, z + 3, Blocks.cobblestone);
	world.setBlock(x - 5, y, z + 2, Blocks.mossy_cobblestone);
	world.setBlock(x - 6, y, z, Blocks.mossy_cobblestone);
	
	world.setBlock(x - 1, y, z - 2, Blocks.mossy_cobblestone);
	world.setBlock(x - 3, y, z - 3, Blocks.cobblestone);
	world.setBlock(x - 5, y, z - 2, Blocks.mossy_cobblestone);
	world.setBlock(x - 6, y, z, Blocks.cobblestone);
	
	
	
    world.setBlock(x, y - 1, z, Blocks.cobblestone);
	
	world.setBlock(x - 1, y - 1, z + 2, Blocks.mossy_cobblestone);
	world.setBlock(x - 3, y - 1, z + 3, Blocks.cobblestone);
	world.setBlock(x - 5, y - 1, z + 2, Blocks.mossy_cobblestone);
	world.setBlock(x - 6, y - 1, z, Blocks.mossy_cobblestone);
	
	world.setBlock(x - 1, y - 1, z - 2, Blocks.mossy_cobblestone);
	world.setBlock(x - 3, y - 1, z - 3, Blocks.cobblestone);
	world.setBlock(x - 5, y - 1, z - 2, Blocks.mossy_cobblestone);
	world.setBlock(x - 6, y - 1, z, Blocks.cobblestone);
	
	
	
    world.setBlock(x, y + 1, z, Blocks.cobblestone);
	
	world.setBlock(x - 1, y + 1, z + 2, Blocks.mossy_cobblestone);
	world.setBlock(x - 3, y + 1, z + 3, Blocks.cobblestone);
	world.setBlock(x - 5, y + 1, z + 2, Blocks.cobblestone);
	world.setBlock(x - 6, y + 1, z, Blocks.mossy_cobblestone);
	
	world.setBlock(x - 1, y + 1, z - 2, Blocks.mossy_cobblestone);
	world.setBlock(x - 3, y + 1, z - 3, Blocks.mossy_cobblestone);
	world.setBlock(x - 5, y + 1, z - 2, Blocks.mossy_cobblestone);
	world.setBlock(x - 6, y + 1, z, Blocks.cobblestone);
	
	
	}
}
