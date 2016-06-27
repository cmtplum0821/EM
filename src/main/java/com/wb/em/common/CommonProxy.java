package com.wb.em.common;

import com.wb.em.EM;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

public class CommonProxy{
	
	public void preInit(FMLPreInitializationEvent e){
		
	}
	
	public void init(FMLInitializationEvent e){
		NetworkRegistry.INSTANCE.registerGuiHandler(EM.instance,new ModGuiHandler());
	}
	
	public void postInit(FMLPostInitializationEvent e){
		
	}

}
