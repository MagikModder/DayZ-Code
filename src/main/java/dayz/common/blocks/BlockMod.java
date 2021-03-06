package dayz.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import dayz.DayZ;

public class BlockMod extends Block
{
    public BlockMod(int blockId, Material material)
    {
        super(material);
        setCreativeTab(DayZ.creativeTab);
    }

    public void registerIcons(IIconRegister register)
    {
        blockIcon = register.registerIcon(DayZ.meta.modId + ":" + getUnlocalizedName().substring(getUnlocalizedName().indexOf(".") + 1));
    }
}
