package com.sidacious.customrpg.init;


import com.sidacious.customrpg.block.Block01;
import com.sidacious.customrpg.block.BlockCustomRPG;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final BlockCustomRPG Block01 = new Block01();


    public static void init ()
    {
        GameRegistry.registerBlock(Block01, "CustomBlock01");

    }
}
