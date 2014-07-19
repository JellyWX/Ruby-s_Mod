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

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;

public class BiomeScrub extends BiomeGenBase {

	public BiomeScrub(int p_i1971_1_) {
		
		super(p_i1971_1_);
		this.topBlock = Blocks.sand;
		this.fillerBlock = Blocks.stone;
		this.theBiomeDecorator.cactiPerChunk = 3;
		this.theBiomeDecorator.treesPerChunk = 1;
		this.theBiomeDecorator.deadBushPerChunk = 100;
        this.theBiomeDecorator.grassPerChunk = 10;
		this.theBiomeDecorator.generateLakes = false;
		this.getBiomeGrassColor(r, g, b);
		System.out.println("RubyWorld: Biome Scrub found");
		
	}
	
	protected int r = 240;
	
	protected int g = 170;
	
	protected int b = 60;
	
}
