package com.sidacious.customrpg.init;


import com.sidacious.customrpg.item.ItemBasicFoci;
import com.sidacious.customrpg.item.ItemManaSword;
import com.sidacious.customrpg.item.ItemCustomRPG;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemCustomRPG ItemManaSword = new ItemManaSword();
    public static final ItemCustomRPG ItemBasicFoci = new ItemBasicFoci();


    public static void init ()
    {
        GameRegistry.registerItem(ItemManaSword, "manasword");
        GameRegistry.registerItem(ItemBasicFoci, "basicfoci");


    }
}
