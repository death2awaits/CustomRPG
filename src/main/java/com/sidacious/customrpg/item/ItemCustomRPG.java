package com.sidacious.customrpg.item;

import com.sidacious.customrpg.creativetab.CreativeTabCustomRPG;
import com.sidacious.customrpg.reference.Textures;
import com.sidacious.customrpg.utility.NameUtility;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class ItemCustomRPG extends Item
{
    public ItemCustomRPG()
    {
        super();
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabCustomRPG.CustomRPG);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, NameUtility.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

    }

    @Override
    public String getUnlocalizedName(ItemStack itmeStack)
    {
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, NameUtility.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
        //this is the texture, register the texture, client side only
    }


}
