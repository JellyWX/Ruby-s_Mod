package com.rainbowmod.blocks;

import java.util.Random;

import com.rainbowmod.rainbowmod.rainbowmod;
import com.ruby.rubymod.RubyMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class oreRainbow extends Block {
	
	public oreRainbow(int id, Material mat) {
			super(mat);
			this.setHarvestLevel("pickaxe", 2);

	}
	
	@Override
	  public void registerBlockIcons(IIconRegister p_149651_1_) {
		
		this.blockIcon = p_149651_1_.registerIcon("rainbow:oreRainbow");
		

	}
	
	public Item getItemDropped(int par1, Random rand, int par2){
		return rainbowmod.gemRainbow;
	
	
    }
	
}
