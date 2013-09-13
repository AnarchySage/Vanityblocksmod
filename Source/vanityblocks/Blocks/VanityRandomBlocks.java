package vanityblocks.Blocks;

import java.util.List;

import vanityblocks.Storageprops;
import vanityblocks.VanityBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class VanityRandomBlocks extends Block {
	public VanityRandomBlocks(int id) {
		super(id, Material.rock);
		setHardness(3.0F);
		setResistance(5.0F);
		setCreativeTab(vanityblocks.VanityBlocks.tabCustom);
	}

	@Override
	public void onEntityWalking(World world, int x, int y, int z, Entity entity) {
		if (Storageprops.enablewhitesoulsandspeed) {
			double boost = 2.2D;
			int metadata = world.getBlockMetadata(x, y, z);
			if (metadata == 1)
				boost = 4D;

			double mX = Math.abs(entity.motionX);
			double mZ = Math.abs(entity.motionZ);
			if (mX < 0.5D) {
				entity.motionX *= boost;
			}
			if (mZ < 0.5D) {
				entity.motionZ *= boost;
			}
		}
	}

	@Override
	public float getBlockHardness(World par1World, int par2, int par3, int par4) {
		int metadata = par1World.getBlockMetadata(par2, par3, par4);
		if (metadata == 0) {
			return 1f;
		}
		if (metadata == 1) {
			return 1f;
		}
		return 3f;
	}

	@Override
	public int getMobilityFlag() {
		return 0;
	}

	private Icon[] iconBuffer;

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		iconBuffer = new Icon[6];

		iconBuffer[0] = par1IconRegister.registerIcon("vanityblocks:claybrick");
		iconBuffer[1] = par1IconRegister
				.registerIcon("vanityblocks:whitesoulsand");
		iconBuffer[2] = par1IconRegister
				.registerIcon("vanityblocks:oldlapisblock");
		iconBuffer[3] = par1IconRegister
				.registerIcon("vanityblocks:oldlapisbrick");
		iconBuffer[4] = par1IconRegister
				.registerIcon("vanityblocks:lapisbrick");
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
			return iconBuffer[3];
		}
		if (metadata == 4) {
			return iconBuffer[4];
		}
		return blockIcon;
	}

	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs tab, List subItems) {
		for (int ix = 0; ix < 5; ix++) {
			subItems.add(new ItemStack(this, 1, ix));
		}
	}
}