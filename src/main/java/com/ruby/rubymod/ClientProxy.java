package com.ruby.rubymod;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.ruby.tileEntity.chest.copper.CopperChestRenderer;
import com.ruby.tileEntity.chest.copper.ItemRendererCopperChest;
import com.ruby.tileEntity.chest.copper.TileEntityCopperChest;
import com.ruby.tileEntity.chest.iron.IronChestRenderer;
import com.ruby.tileEntity.chest.iron.ItemRendererIronChest;
import com.ruby.tileEntity.chest.iron.TileEntityIronChest;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends ServerProxy{
	public void registerRenderThings() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCopperChest.class, new CopperChestRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(RubyMod.CopperChest), new ItemRendererCopperChest());
	
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIronChest.class, new IronChestRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(RubyMod.IronChest), new ItemRendererIronChest());
	
	
	}

}
