package com.ruby.tools.bronze;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;

public class shovelBronze extends ItemSpade{
	public shovelBronze(int id, Item.ToolMaterial mat) {
		super(mat);
		
	}
    
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon("ruby:BronzeShovel");
	}
 }



