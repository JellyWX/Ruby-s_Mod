package com.ruby.container;

import com.ruby.rubymod.RubyMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);

		

		if(ID == RubyMod.guiIDAlloyBench) {
			return ID == RubyMod.guiIDAlloyBench && world.getBlock(x, y, z) == RubyMod.AlloyBench ? new ContainerAlloyBench(player.inventory, world, x, y, z) : null;
		}

		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);

		

		if(ID == RubyMod.guiIDAlloyBench) {
			return ID == RubyMod.guiIDAlloyBench && world.getBlock(x, y, z) == RubyMod.AlloyBench ? new GuiAlloyBench(player.inventory, world, x, y, z) : null;
		}

		return null;
	}

}