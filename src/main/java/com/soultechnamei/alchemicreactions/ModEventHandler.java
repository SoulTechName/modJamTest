package com.soultechnamei.alchemicreactions;

import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class ModEventHandler {

	@SubscribeEvent
	public void onClicked(PlayerInteractEvent RIGHT_CLICK_BLOCK) {
		System.out.println("this worked");

	}

}
