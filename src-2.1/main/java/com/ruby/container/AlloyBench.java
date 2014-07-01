package com.ruby.container;

import com.ruby.rubymod.RubyMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class AlloyBench extends Block {
	
	@SideOnly(Side.CLIENT)
	private IIcon WinryBenchTop;
	
	public AlloyBench() {
			super(Material.wood);

	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon (int side, int metadata){
		return side == 1 ? this.WinryBenchTop : this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon("ruby:WinrySide");
		this.WinryBenchTop = iconRegister.registerIcon("ruby:WinryTop");
	}
	
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int q, float a, float b, float c){
		if(!player.isSneaking()) {
			player.openGui(RubyMod.instance, RubyMod.guiIDAlloyBench, world, x, y, z);
			return true;
		}
		
		else {
			return false;
		}
	}
	
	
}
