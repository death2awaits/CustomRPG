package com.sidacious.customrpg;


import com.sidacious.customrpg.configuration.ConfigurationHandler;
import com.sidacious.customrpg.init.ModBlocks;
import com.sidacious.customrpg.init.ModItems;
import com.sidacious.customrpg.proxy.IProxy;
import com.sidacious.customrpg.reference.Reference;
import com.sidacious.customrpg.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class CustomRPG
{

    @Mod.Instance(Reference.MOD_ID)
    public static CustomRPG instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit (FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("**************Pre Initialization complete*********************");


        ModItems.init();
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {


    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {


    }





}













