package vanityblocks.Blocks;

import java.util.List;

import vanityblocks.VanityBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class VanityDesignblock extends Block {
	public VanityDesignblock(int id) {
		super(id, Material.rock);
		setResistance(10.0F);
		setCreativeTab(vanityblocks.VanityBlocks.tabCustom);
	}

	// To get past the light value on all blocks, change it so meta 0 is not a
	// lighted block.
	@Override
	public int getLightValue(IBlockAccess world, int x, int y, int z) {
		if (world.getBlockMetadata(x, y, z) == 0) {
			return 15;
		} else if (world.getBlockMetadata(x, y, z) == 1) {
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

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	private Icon[] iconBuffer;

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		iconBuffer = new Icon[2];

		iconBuffer[0] = par1IconRegister
				.registerIcon("vanityblocks:lavalampcolors/lavaanim");
		iconBuffer[1] = par1IconRegister.registerIcon("vanityblocks:stoneglow");

	}

	@Override
	public Icon getIcon(int side, int metadata) {
		if (metadata == 0) {
			return iconBuffer[0];
		}
		if (metadata == 1) {
			return iconBuffer[1];
		}
		return blockIcon;
	}

	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs tab, List subItems) {
		for (int ix = 0; ix < 2; ix++) {
			subItems.add(new ItemStack(this, 1, ix));
		}
	}
}