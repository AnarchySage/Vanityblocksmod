package vanityblocks.Blocks;

import static net.minecraftforge.common.ForgeDirection.UP;

import java.util.List;
import java.util.Random;

import vanityblocks.VanityBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Facing;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//public class MarbleSlab extends BlockHalfSlab {

public class Marbleslab extends Block {
	public Marbleslab(int id) {
		super(id, Material.rock);
		setHardness(2.0F);
		setResistance(10.0F);
		setCreativeTab(vanityblocks.VanityBlocks.tabCustom);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
	}

	@Override
	public float getBlockHardness(World par1World, int par2, int par3, int par4) {
		int metadata = par1World.getBlockMetadata(par2, par3, par4);
		return 2f;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	private Icon[] iconBuffer;

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		iconBuffer = new Icon[12];

		iconBuffer[0] = par1IconRegister.registerIcon("vanityblocks:marble");
		iconBuffer[1] = par1IconRegister
				.registerIcon("vanityblocks:marblebrick");
		iconBuffer[2] = par1IconRegister
				.registerIcon("vanityblocks:marblechisel");
		iconBuffer[3] = par1IconRegister
				.registerIcon("vanityblocks:marblepillarside");
		iconBuffer[4] = par1IconRegister
				.registerIcon("vanityblocks:marbletile");
		iconBuffer[5] = par1IconRegister
				.registerIcon("vanityblocks:blackmarble");
		iconBuffer[6] = par1IconRegister
				.registerIcon("vanityblocks:blackmarblebrick");
		iconBuffer[7] = par1IconRegister
				.registerIcon("vanityblocks:blackmarblechisel");
		iconBuffer[8] = par1IconRegister
				.registerIcon("vanityblocks:blackmarblepillarside");
		iconBuffer[9] = par1IconRegister
				.registerIcon("vanityblocks:blackmarbletile");
		iconBuffer[10] = par1IconRegister
				.registerIcon("vanityblocks:marblepillartop");
		iconBuffer[11] = par1IconRegister
				.registerIcon("vanityblocks:blackmarblepillartop");
	}

	@Override
	public Icon getIcon(int side, int metadata) {
		if (metadata == 0) {
			return iconBuffer[0];
		}
		if (metadata == 1) {
			return iconBuffer[1];
		}
		if (metadata == 2) {
			switch (side) {
			case 0:
				return iconBuffer[2];
			case 1:
				return iconBuffer[2];
			default:
				return iconBuffer[0];
			}
		}
		if (metadata == 3) {
			switch (side) {
			case 0:
				return iconBuffer[10];
			case 1:
				return iconBuffer[10];
			default:
				return iconBuffer[3];
			}
			// return iconBuffer[3];
		}
		if (metadata == 4) {
			return iconBuffer[4];
		}
		if (metadata == 5) {
			return iconBuffer[5];
		}
		if (metadata == 6) {
			return iconBuffer[6];
		}
		if (metadata == 7) {
			switch (side) {
			case 0:
				return iconBuffer[7];
			case 1:
				return iconBuffer[7];
			default:
				return iconBuffer[5];
			}
		}
		if (metadata == 8) {
			switch (side) {
			case 0:
				return iconBuffer[11];
			case 1:
				return iconBuffer[11];
			default:
				return iconBuffer[8];
			}
			// return iconBuffer[8];
		}
		if (metadata == 9) {
			return iconBuffer[9];
		}
		return blockIcon;
	}

	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs tab, List subItems) {
		for (int ix = 0; ix < 10; ix++) {
			subItems.add(new ItemStack(this, 1, ix));
		}
	}
}