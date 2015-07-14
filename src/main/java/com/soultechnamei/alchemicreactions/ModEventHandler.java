package com.soultechnamei.alchemicreactions;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class ModEventHandler {
	
	int LX;
	int LY;
	int LZ;
	
	@SubscribeEvent
	public void getCordsofRightClickedBlock(PlayerInteractEvent b) {
		int LX = b.x;
		int LY = b.y;
		int LZ = b.z;

	}

}
