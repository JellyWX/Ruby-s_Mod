package com.rubyconstruct.blocks;

import java.util.Random;

import com.ruby.rubymod.RubyMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class blockBrickSandstone extends Block {
	
	public blockBrickSandstone(int id, Material mat) {
			super(mat);
			this.setHarvestLevel("pickaxe", 1);

	}
    	
	@Override
	  public void registerBlockIcons(IIconRegister p_149651_1_) {
		
		this.blockIcon = p_149651_1_.registerIcon("construct:blockBrickSandstone");
		

	}
	
}
