package com.ruby.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class logCharred extends Block
{


    public logCharred(int id, Material mat){    
        super(mat);
        this.setHarvestLevel("axe", 0);
        
    }
	
	@SideOnly(Side.CLIENT)
	public IIcon iconTop;



	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon("ruby:logCharred");
	    this.iconTop = iconRegister.registerIcon("ruby:logCharred_top");
	}
	
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata){
		return side == 1 ? this.iconTop : (side == 0 ? this.iconTop : (side != metadata ? this.blockIcon : this.iconTop));
	}
    
    @Override
    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z)
    {
        return true;
    }

    
    /*
    @Override
	  public void registerBlockIcons(IIconRegister p_149651_1_) {
		
		this.blockIcon = p_149651_1_.registerIcon("ruby:logCharred");
		

	}
    */
    
}

