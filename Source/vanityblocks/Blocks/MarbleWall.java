package vanityblocks.Blocks;

import java.util.List;

import vanityblocks.VanityBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MarbleWall extends BlockWall {
	public MarbleWall(int par1, Block par2Block) {
		super(par1, par2Block);
		this.setHardness(par2Block.blockHardness);
		this.setResistance(par2Block.blockResistance / 3.0F);
		this.setStepSound(par2Block.stepSound);
		setCreativeTab(vanityblocks.VanityBlocks.tabCustom);
	}

	@Override
	public boolean isBlockSolidOnSide(World world, int x, int y, int z,
			ForgeDirection side) {
		return side == ForgeDirection.UP;
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
			return iconBuffer[2];
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
			return iconBuffer[7];
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

	@SideOnly(Side.CLIENT)
	@Override
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs,
			List par3List) {
		par3List.add(new ItemStack(par1, 1, 0));
		par3List.add(new ItemStack(par1, 1, 1));
		par3List.add(new ItemStack(par1, 1, 2));
		par3List.add(new ItemStack(par1, 1, 3));
		par3List.add(new ItemStack(par1, 1, 4));
		par3List.add(new ItemStack(par1, 1, 5));
		par3List.add(new ItemStack(par1, 1, 6));
		par3List.add(new ItemStack(par1, 1, 7));
		par3List.add(new ItemStack(par1, 1, 8));
		par3List.add(new ItemStack(par1, 1, 9));
	}
}