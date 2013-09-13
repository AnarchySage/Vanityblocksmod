package vanityblocks.Blocks;

import java.util.List;

import vanityblocks.VanityBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class StorageBlockMod extends Block {
	public StorageBlockMod(int id) {
		super(id, Material.rock);
		// setHardness(3.0F);
		// setCreativeTab(CreativeTabs.tabBlock);
		setHardness(3.0F);
		setResistance(10.0F);
		setCreativeTab(vanityblocks.VanityBlocks.tabCustom);

	}
    public boolean isBeaconBase(World worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
		int metadata = worldObj.getBlockMetadata(x, y, z);
		if (metadata == 7) {
			return true;
		}
		return false;  	
    }
	private Icon[] iconBuffer;

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		iconBuffer = new Icon[12];

		iconBuffer[1] = par1IconRegister.registerIcon("vanityblocks:tinblock");
		iconBuffer[2] = par1IconRegister
				.registerIcon("vanityblocks:copperblock");
		iconBuffer[3] = par1IconRegister
				.registerIcon("vanityblocks:silverblock");
		iconBuffer[4] = par1IconRegister.registerIcon("vanityblocks:leadblock");
		iconBuffer[5] = par1IconRegister
				.registerIcon("vanityblocks:nikoliteblock");
		iconBuffer[6] = par1IconRegister
				.registerIcon("vanityblocks:nickelblock");
		iconBuffer[7] = par1IconRegister
				.registerIcon("vanityblocks:electrumblock");
		iconBuffer[8] = par1IconRegister
				.registerIcon("vanityblocks:platinumblock");
		iconBuffer[9] = par1IconRegister
				.registerIcon("vanityblocks:invarblock");
		iconBuffer[10] = par1IconRegister
				.registerIcon("vanityblocks:brassblock");
		iconBuffer[11] = par1IconRegister
				.registerIcon("vanityblocks:rubberblock");
	}

	@Override
	public Icon getIcon(int side, int metadata) {
		if (metadata == 0) {
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
		if (metadata == 6) {
			return iconBuffer[7];
		}
		if (metadata == 7) {
			return iconBuffer[8];
		}
		if (metadata == 8) {
			return iconBuffer[9];
		}
		if (metadata == 9) {
			return iconBuffer[10];
		}
		if (metadata == 10) {
			return iconBuffer[11];
		}
		return blockIcon;
	}

	@Override
	public float getBlockHardness(World par1World, int par2, int par3, int par4) {
		// return !isActive(par1World.getBlockMetadata(par2, par3, par4)) ? 0 :
		// 3;
		int metadata = par1World.getBlockMetadata(par2, par3, par4);
		// if (metadata == 0) return 2f;
		return 2f;
	}

	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}

	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z,
			Entity entity) {
		int meta = world.getBlockMetadata(x, y, z);
		if (meta == 10) {
			if (entity.motionY < 0)
				entity.motionY *= -1.2F;
			entity.fallDistance = 0;
		}
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x,
			int y, int z) {
		int meta = world.getBlockMetadata(x, y, z);
		if (meta == 10)
			return AxisAlignedBB.getBoundingBox(x, y, z, (double) x + 1.0D,
					(double) y + 0.625D, (double) z + 1.0D);
		return super.getCollisionBoundingBoxFromPool(world, x, y, z);
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs tab, List subItems) {
		for (int ix = 0; ix < 11; ix++) {
			// 13 for current
			subItems.add(new ItemStack(this, 1, ix));
		}
	}
}