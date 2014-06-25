package com.ruby.furnace.block;

import net.minecraft.tileentity.TileEntity;

public class TileEntityRefinery extends TileEntity {
	
	private String LocalizedName;

	public void setGuiDisplayName(String displayName) {
		this.LocalizedName = displayName;
		
	}

}
