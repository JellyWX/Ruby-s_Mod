package com.ruby.tools.ruby;

import com.ruby.rubymod.RubyMod;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DaggerRuby extends ItemSword {
	
	public DaggerRuby(int id, Item.ToolMaterial mat) {
		super(mat);
		
	}
    
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon("ruby:DaggerRuby");
	}
	
	/***
	@Override
	public void PlayerTickEvent(World world, EntityPlayer player, ItemStack stack) {
		if(stack.getItem() == RubyMod.DaggerRuby) {
			int j = EnchantmentHelper.getEnchantmentLevel(RubyMod.Withering.effectId, stack);
		}
		
	}
	***/
	
 }
