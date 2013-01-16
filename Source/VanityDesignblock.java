package vanityblocks;


import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;

public class VanityDesignblock extends Block {
	public VanityDesignblock (int id) {
		super(id, Material.ground);
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