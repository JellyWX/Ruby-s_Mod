package com.ruby.blocks;

import java.util.Random;

import com.ruby.rubymod.RubyMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class blockCopper extends Block {
	
	public blockCopper(int id, Material mat) {
			super(mat);
			this.setHarvestLevel("pickaxe", 2);

	}
	
	@Override
	  public void registerBlockIcons(IIconRegister p_149651_1_) {
		
		this.blockIcon = p_149651_1_.registerIcon("ruby:copperBlock");
		

	}
	
}
