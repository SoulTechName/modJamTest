package com.soultechnamei.alchemicreactions;

import com.soultechnamei.alchemicreactions.entity.BBACEntity;
import com.soultechnamei.alchemicreactions.entity.render.BBACEntityRender;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	 
	public void registerRenderThings() {
         ClientRegistry.bindTileEntitySpecialRenderer(BBACEntity.class, new BBACEntityRender());
 }

}
