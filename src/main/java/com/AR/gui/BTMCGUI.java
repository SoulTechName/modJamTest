package com.AR.gui;

import org.lwjgl.opengl.GL11;

import com.AR.References.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class BTMCGUI extends GuiScreen {

	int guiW = 176; // Width
	int guiH = 166; // Height

	GuiButton FirstButton;
	GuiButton SecondButton;
	GuiButton ThirdButton;
	GuiButton FourthButton;
	GuiButton FifthButton;

	@Override
	public void drawScreen(int x, int y, float ticks) {

		int guiX = (width - guiW) / 2;
		int guiY = (height - guiH) / 2;

		GL11.glColor4f(1, 1, 1, 1 /* Transparency */);
		drawDefaultBackground();
		mc.renderEngine.bindTexture(new ResourceLocation(Reference.MODID, "textures/guis/CirclesCrafting.png"));
		drawTexturedModalRect(guiX, guiY, 42, 47, guiW, guiH);
		fontRendererObj.drawString("White Board", guiX + 10, guiY + 5, 0x1234);
		super.drawScreen(x, y, ticks);
	}

	@Override
	public void initGui() {

		int guiX = (width - guiW) / 2;
		int guiY = (height - guiH) / 2;

		buttonList.clear();

		buttonList.add(FirstButton = new GuiButton(0, guiX + 13, guiY + 89, 18, 18, ""));
		buttonList.add(SecondButton = new GuiButton(0, guiX + 23, guiY + 124, 18, 18, ""));
		buttonList.add(ThirdButton = new GuiButton(0, guiX + 139, guiY + 89, 18, 18, ""));
		buttonList.add(FourthButton = new GuiButton(0, guiX + 130, guiY + 124, 18, 18, ""));
		buttonList.add(FifthButton = new GuiButton(0, guiX + 77, guiY + 06, 18, 18, ""));

		super.initGui();

	}

	protected void actionPreformed(GuiButton button) {
		switch (button.id) {
		case 0:
		}

		super.actionPerformed(button);
	}
}
