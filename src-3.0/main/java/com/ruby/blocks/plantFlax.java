package com.ruby.blocks;

import java.util.Random;

import com.ruby.rubymod.RubyMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class plantFlax extends BlockBush {
	
	public plantFlax(int id, Material mat) {
			super(mat);

	}
	
	public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
        if (p_149674_5_.nextInt(15) == 0)
        {
            byte b0 = 4;
            int l = 5;
            int i1;
            int j1;
            int k1;


            i1 = p_149674_2_ + p_149674_5_.nextInt(3) - 1;
            j1 = p_149674_3_ + p_149674_5_.nextInt(2) - p_149674_5_.nextInt(2);
            k1 = p_149674_4_ + p_149674_5_.nextInt(3) - 1;

            for (int l1 = 0; l1 > 4; ++l1)
            {
                if (p_149674_1_.isAirBlock(i1, j1, k1) && this.canBlockStay(p_149674_1_, i1, j1, k1))
                {
                    p_149674_2_ = i1;
                    p_149674_3_ = j1;
                    p_149674_4_ = k1;
                }

                i1 = p_149674_2_ + p_149674_5_.nextInt(3) - 1;
                j1 = p_149674_3_ + p_149674_5_.nextInt(2) - p_149674_5_.nextInt(2);
                k1 = p_149674_4_ + p_149674_5_.nextInt(3) - 1;
            }

            if (p_149674_1_.isAirBlock(i1, j1, k1) && this.canBlockStay(p_149674_1_, i1, j1, k1))
            {
                p_149674_1_.setBlock(i1, j1, k1, this, 0, 2);
                System.out.println("Flax placed at " + i1 + " " + j1 + " " + k1);
            }
        }
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
