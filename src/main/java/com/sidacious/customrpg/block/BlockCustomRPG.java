package com.sidacious.customrpg.block;


import com.sidacious.customrpg.creativetab.CreativeTabCustomRPG;
import com.sidacious.customrpg.reference.Reference;
import com.sidacious.customrpg.utility.NameUtility;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class BlockCustomRPG extends Block
{
    protected BlockCustomRPG(Material material)
    {
       super(material);
        this.setCreativeTab(CreativeTabCustomRPG.CustomRPG);
    }

    protected BlockCustomRPG()
    {
        this(Material.rock );
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", NameUtility.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

    }

    @Override
    public TileEntity createTileEntity(World world, int metadata)
    {
        return null;
    }

    @Override
    public boolean canDropFromExplosion(Explosion explosion)
    {
        return false;
        //wont be destroyed from creeper etc
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister_)
    {
        blockIcon = iconRegister_.registerIcon(String.format( "%s", NameUtility.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }



}
