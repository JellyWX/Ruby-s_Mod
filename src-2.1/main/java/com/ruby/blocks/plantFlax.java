package com.ruby.blocks;

import java.util.Random;

import com.ruby.rubymod.RubyMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class plantFlax extends Block {
	
	public plantFlax(int id, Material mat) {
			super(mat);

	}
	
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public int getRenderType()
    {
        return 1;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return RubyMod.flax;
    }
    
    protected boolean canSilkHarvest()
    {
        return false;
    }

	
	@Override
	  public void registerBlockIcons(IIconRegister p_149651_1_) {
		
		this.blockIcon = p_149651_1_.registerIcon("ruby:flax");
		

	}
	
}
