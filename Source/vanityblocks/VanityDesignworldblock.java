package vanityblocks;


import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class VanityDesignworldblock extends Block {
	public VanityDesignworldblock (int id) {
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
    private Icon[] iconBuffer;
   @Override
   public void registerIcons(IconRegister par1IconRegister)
	    {
	        iconBuffer = new Icon[7]; 
	        
	        iconBuffer[1] = par1IconRegister.registerIcon("vanityblocks:marble"); 
	        iconBuffer[2] = par1IconRegister.registerIcon("vanityblocks:marblebrick");
	        iconBuffer[3] = par1IconRegister.registerIcon("vanityblocks:marblechisel");
	        iconBuffer[4] = par1IconRegister.registerIcon("vanityblocks:blackmarble");
	        iconBuffer[5] = par1IconRegister.registerIcon("vanityblocks:blackmarblebrick");
	        iconBuffer[6] = par1IconRegister.registerIcon("vanityblocks:blackmarblechisel");
	    }
	@Override
	public Icon getBlockTextureFromSideAndMetadata (int side, int metadata) {
		if (metadata == 0){
			return iconBuffer[1];
		}
		if (metadata == 1) {
			return iconBuffer[2];
		}
		if (metadata == 2) {
			return iconBuffer[3];
		}
		if (metadata == 3) {
			return iconBuffer[4];
		}
		if (metadata == 4) {
			return iconBuffer[5];
		}
		if (metadata == 5) {
			return iconBuffer[6];
		}
		return blockIcon;
	}
	@Override
	public int damageDropped (int metadata) {
		return metadata;
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs tab, List subItems) {
		for (int ix = 0; ix < 6; ix++) {
			subItems.add(new ItemStack(this, 1, ix));
		}
	}
}