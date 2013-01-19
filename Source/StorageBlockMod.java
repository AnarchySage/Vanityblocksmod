package vanityblocks;


import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class StorageBlockMod extends Block {
	public StorageBlockMod (int id) {
		super(id, Material.rock);
//        setHardness(3.0F);
		setCreativeTab(CreativeTabs.tabBlock);
	}
	@Override
	public int getBlockTextureFromSideAndMetadata (int side, int metadata) {
		return metadata + 0;
	}
	@Override
	public float getBlockHardness (World par1World, int par2, int par3, int par4)
	{
//		return !isActive(par1World.getBlockMetadata(par2, par3, par4)) ? 0 : 3;
		int metadata = par1World.getBlockMetadata(par2, par3, par4);
//				if (metadata == 0) return 2f;
		return 2f;
	}
	@Override
	public String getTextureFile () {
		return "/vanityblocks/modstorage.png";
	}
	@Override
	public int damageDropped (int metadata) {
		return metadata;
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs tab, List subItems) {
		for (int ix = 0; ix < 10; ix++) {
			//10 for current
			subItems.add(new ItemStack(this, 1, ix));
		}
	}
}