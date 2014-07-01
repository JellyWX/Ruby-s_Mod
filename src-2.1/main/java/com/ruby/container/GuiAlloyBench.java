package com.ruby.container;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class GuiAlloyBench extends GuiContainer{
	
	private ResourceLocation texture = new ResourceLocation("ruby:textures/gui/automailGui.png");
	public GuiAlloyBench(InventoryPlayer invPlayer, World world, int x, int y, int z) {
		super(new ContainerAlloyBench(invPlayer, world, x, y, z));
		// TODO Auto-generated constructor stub
		
		this.xSize = 176;
		this.ySize = 166;
	}

	public void onGuiClosed() {
		super.onGuiClosed();
	}
	
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		
		this.fontRendererObj.drawString(StatCollector.translateToLocal("Automail Bench"), 100, 5, 0x000000);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		
		GL11.glColor4f(1f, 1f, 1f, 1f);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
		
	}

}
