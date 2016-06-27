package com.wb.em;

import com.wb.em.common.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "EM",name = "EM")
public class EM{
	
	@SidedProxy(clientSide = "com.wb.em.common.ClientProxy", serverSide = "com.wb.em.common.ServerProxy")
    public static CommonProxy proxy;
	@Instance
	public static EM instance = new EM();
	public static String MODID = "EM";
	public static String Name = "EM";
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent e){
		proxy.preInit(e);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e){
		proxy.init(e);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e){
		proxy.postInit(e);
	}

}
