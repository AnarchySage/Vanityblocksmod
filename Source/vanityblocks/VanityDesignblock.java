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

public class VanityDesignblock extends Block {
	public VanityDesignblock(int id) {
		super(id, Material.rock);
		setCreativeTab(vanityblocks.VanityBlocks.tabCustom);
	}

	/*
	 * public boolean shouldConnectToBlock (IBlockAccess par1IBlockAccess, int
	 * par2, int par3, int par4, int par5, int par6) { return par5 ==
	 * this.blockID; }
	 * 
	 * @Override public Icon getBlockTexture (IBlockAccess par1IBlockAccess, int
	 * par2, int par3, int par4, int par5) { return
	 * getConnectedBlockTexture(par1IBlockAccess, par2, par3, par4, par5,
	 * iconBuffer); }
	 * 
	 * public Icon getConnectedBlockTexture (IBlockAccess par1IBlockAccess, int
	 * par2, int par3, int par4, int par5, Icon[] icons) { boolean isOpenUp =
	 * false, isOpenDown = false, isOpenLeft = false, isOpenRight = false;
	 * 
	 * switch (par5) { case 0: if (shouldConnectToBlock(par1IBlockAccess, par2,
	 * par3, par4, par1IBlockAccess.getBlockId(par2 - 1, par3, par4),
	 * par1IBlockAccess.getBlockMetadata(par2 - 1, par3, par4))) { isOpenDown =
	 * true; }
	 * 
	 * if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4,
	 * par1IBlockAccess.getBlockId(par2 + 1, par3, par4),
	 * par1IBlockAccess.getBlockMetadata(par2 + 1, par3, par4))) { isOpenUp =
	 * true; }
	 * 
	 * if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4,
	 * par1IBlockAccess.getBlockId(par2, par3, par4 - 1),
	 * par1IBlockAccess.getBlockMetadata(par2, par3, par4 - 1))) { isOpenLeft =
	 * true; }
	 * 
	 * if (shouldConnectToBlock(par1IBlockAccess, par2, par3, par4,
	 * par1IBlockAccess.getBlockId(par2, par3, par4 + 1),
	 * par1IBlockAccess.getBlockMetadata(par2, par3, par4 + 1))) { isOpenRight =
	 * true; }
	 * 
	 * if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight) { return
	 * icons[0]; } else if (isOpenUp && isOpenDown && isOpenLeft) { return
	 * icons[0]; } else if (isOpenUp && isOpenDown && isOpenRight) { return
	 * icons[0]; } else if (isOpenUp && isOpenLeft && isOpenRight) { return
	 * icons[0]; } else if (isOpenDown && isOpenLeft && isOpenRight) { return
	 * icons[0]; } else if (isOpenDown && isOpenUp) { return icons[0]; } else if
	 * (isOpenLeft && isOpenRight) { return icons[0]; } else if (isOpenDown &&
	 * isOpenLeft) { return icons[0]; } else if (isOpenDown && isOpenRight) {
	 * return icons[0]; } else if (isOpenUp && isOpenLeft) { return icons[0]; }
	 * else if (isOpenUp && isOpenRight) { return icons[0]; } else if
	 * (isOpenDown) { return icons[0]; } else if (isOpenUp) { return icons[0]; }
	 * else if (isOpenLeft) { return icons[0]; } else if (isOpenRight) { return
	 * icons[0]; } break; }
	 * 
	 * return icons[0]; } /* public int getLightValue(IBlockAccess world, int x,
	 * int y, int z, int metadata) { if (metadata == 0) { return
	 * !isActive(world.getBlockMetadata(x, y, z)) ? 1 : 15; } return 0; }
	 * 
	 * private boolean isActive(int blockMetadata) { return true; } old way ^
	 */
	/*
	 * @Override public int getLightValue (IBlockAccess world, int x, int y, int
	 * z) { if (world.getBlockMetadata(x, y, z) == 0) { return lightValue[15]; }
	 * return super.getLightValue(world, x, y, z); }
	 */
	/*
	 * @Override public int getLightValue(IBlockAccess iba, int x, int y, int z)
	 * { int meta = iba.getBlockMetadata(x, y, z); if (meta == 0) { return 15; }
	 * if (meta == 1) { return 0; } return 0; }
	 */
	@Override
	public int getLightValue(IBlockAccess world, int x, int y, int z) {
		if (world.getBlockMetadata(x, y, z) == 0) {
			return 15;
		} else {
			return 0;
		}
	}

	@Override
	public float getBlockHardness(World par1World, int par2, int par3, int par4) {
		int metadata = par1World.getBlockMetadata(par2, par3, par4);
		if (metadata == 0) {
			return 1.5f;
		}
		return 2f;
	}

	private Icon[] iconBuffer;

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		iconBuffer = new Icon[1];

		iconBuffer[0] = par1IconRegister
				.registerIcon("vanityblocks:lavalampcolors/lavaanim");
		// iconBuffer[1] =
		// par1IconRegister.registerIcon("vanityblocks:lavalampcolors/lavaanimblue");

	}

	@Override
	public Icon getIcon(int side, int metadata) {
		if (metadata == 0) {
			return iconBuffer[0];
		}
		// if (metadata == 1) {
		// return iconBuffer[1];
		// }
		return blockIcon;
	}

	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs tab, List subItems) {
		for (int ix = 0; ix < 1; ix++) {
			subItems.add(new ItemStack(this, 1, ix));
		}
	}
}