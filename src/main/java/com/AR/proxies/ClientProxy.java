package com.AR.proxies;

import com.AR.api.circle.BBACEntity;
import com.AR.api.circle.BBACEntityRender;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	 
	public static void registerRenderThings() {
         ClientRegistry.bindTileEntitySpecialRenderer(BBACEntity.class, new BBACEntityRender());
 }

}
