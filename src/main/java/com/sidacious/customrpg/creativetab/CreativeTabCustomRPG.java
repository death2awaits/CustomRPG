package com.sidacious.customrpg.creativetab;


import com.sidacious.customrpg.init.ModItems;
import com.sidacious.customrpg.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class CreativeTabCustomRPG
{
    public static final CreativeTabs CustomRPG = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.ItemManaSword;
        }

        @Override
        public String getTranslatedTabLabel ()
        {
            return "Custom RPG";
        }
    };


}
