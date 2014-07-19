package com.rubyconstruct.blocks;

import java.util.Random;

import com.ruby.rubymod.RubyMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class blockSteelPanel extends Block {
	
	public blockSteelPanel(int id, Material mat) {
			super(mat);
			this.setHarvestLevel("pickaxe", 2);
			this.setResistance(9999.9f);

	}
	
	public int getRenderType()
    {
        return 7;
    }
	
	public boolean isOpaqueCube() 
	{
		return false;
	}
	
    public boolean renderAsNormalBlock()
    {
        return false;
    }
	
	@Override
	  public void registerBlockIcons(IIconRegister p_149651_1_) {
		
		this.blockIcon = p_149651_1_.registerIcon("construct:blockSteelPanel");
		

	}
	
}
