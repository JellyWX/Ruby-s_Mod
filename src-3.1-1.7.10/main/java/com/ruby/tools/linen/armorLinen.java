package com.ruby.tools.linen;

import com.ruby.rubymod.RubyMod;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class armorLinen extends ItemArmor{
		private String [] armourTypes = new String [] {"helmetLinen", "chestplateLinen", "legsLinen", "bootsLinen"};

		public armorLinen(ArmorMaterial armorMaterial, int renderIndex, int armourType){
			super(armorMaterial, renderIndex, armourType);
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer){
			if(stack.getItem().equals(RubyMod.helmLinen)|| stack.getItem().equals(RubyMod.chestplateLinen)|| stack.getItem().equals(RubyMod.bootsLinen)){
				return "ruby:textures/armor/linen_1.png";
			}

			if(stack.getItem().equals(RubyMod.legsLinen)){
				return "ruby:textures/armor/linen_2.png";
			}

			else return null;
		}

		@Override
		public void registerIcons(IIconRegister reg){
			if(this == RubyMod.helmLinen)
				this.itemIcon = reg.registerIcon("ruby:helmetLinen");
			if(this == RubyMod.chestplateLinen)
				this.itemIcon = reg.registerIcon("ruby:chestplateLinen");
			if(this == RubyMod.legsLinen)
				this.itemIcon = reg.registerIcon("ruby:legsLinen");
			if(this == RubyMod.bootsLinen)
				this.itemIcon = reg.registerIcon("ruby:bootsLinen");
		}

}
