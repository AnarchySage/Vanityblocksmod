package vanityblocks;


import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class StorageBlock extends Block {
	public StorageBlock (int id) {
		super(id, Material.rock);
//		setBlockName("storageblock");
		setCreativeTab(CreativeTabs.tabBlock);
	}
	@Override
	public float getBlockHardness (World par1World, int par2, int par3, int par4)
	{
//		return !isActive(par1World.getBlockMetadata(par2, par3, par4)) ? 0 : 3;
		int metadata = par1World.getBlockMetadata(par2, par3, par4);
		if (metadata == 0) return 1.8f;
		if (metadata == 1) return 1.8f;
		if (metadata == 2) return 1.8f;
		if (metadata == 3) return .8f;
		if (metadata == 4) return .8f;
		if (metadata == 5) return .8f;
		if (metadata == 6) return .8f;
		if (metadata == 7) return 1.8f;
		return 2f;
	}
	@Override
	public int getBlockTextureFromSideAndMetadata (int side, int metadata) {
		if (metadata == 4) {
	        switch (side) {
        case 0:
            return 32;
        case 1:
            return 32;
        default:
            return 33;
		}
		}else
		return metadata + 0;
	}
	
	@Override
	public String getTextureFile () {
		return "/vanityblocks/vanstorage.png";
	}
	@Override
	public int damageDropped (int metadata) {
		return metadata;
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs tab, List subItems) {
		for (int ix = 0; ix < 8; ix++) {
			subItems.add(new ItemStack(this, 1, ix));
		}
	}
}