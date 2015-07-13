package com.soultechnamei.alchemicreactions;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class ModEventHandler {
	@SubscribeEvent
	public void onRightClicked(PlayerInteractEvent block) {
		int LX = block.x;
		int LY = block.y;
		int LZ = block.z;

	}

}
