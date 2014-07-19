package com.ruby.world.structGen;

import java.util.Random;

import com.ruby.rubymod.RubyMod;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class FlaxGen {
	
	public void generate(World world, Random random, int x, int y, int z){
	
	world.setBlock(x, y, z, RubyMod.plantFlax);
	
	
	}
}
