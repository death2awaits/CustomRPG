package com.sidacious.customrpg.utility;


public class NameUtility
{
    public static String getUnwrappedUnlocalizedName (String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
