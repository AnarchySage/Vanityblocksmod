package vanityblocks;


import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class VanityDesignblock extends Block {
	public VanityDesignblock (int id) {
		super(id, Material.rock);
//		setBlockName("storageblock");
		setCreativeTab(CreativeTabs.tabBlock);
	}
//    public float getLightValue(int md) {
//    	switch(md) {
//    	case 0: return 15F;
//       default: return 0;
//    	}
//    }
	public int getLightValue (IBlockAccess world, int x, int y, int z)
	{
		return !isActive(world.getBlockMetadata(x, y, z)) ? 0 : 15;
	}
	private boolean isActive(int blockMetadata) {
		return true;
	}
	@Override
	public float getBlockHardness (World par1World, int par2, int par3, int par4)
	{
//		return !isActive(par1World.getBlockMetadata(par2, par3, par4)) ? 0 : 3;
		int metadata = par1World.getBlockMetadata(par2, par3, par4);
		if (metadata == 0) return 1.5f;
		return 2f;
	}
	@Override
	public int getBlockTextureFromSideAndMetadata (int side, int metadata) {
		return metadata + 0;
	}
	
	@Override
	public String getTextureFile () {
		return "/vanityblocks/vanity.png";
	}
	@Override
	public int damageDropped (int metadata) {
		return metadata;
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs tab, List subItems) {
		for (int ix = 0; ix < 1; ix++) {
			subItems.add(new ItemStack(this, 1, ix));
		}
	}
}