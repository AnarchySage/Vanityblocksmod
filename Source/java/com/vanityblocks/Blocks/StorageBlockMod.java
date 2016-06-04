package com.vanityblocks.Blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.vanityblocks.VanityBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class StorageBlockMod extends Block {
	public StorageBlockMod(int id) {
		super(Material.rock);
		// setHardness(3.0F);
		// setCreativeTab(CreativeTabs.tabBlock);
		setHardness(3.0F);
		setResistance(10.0F);
		setCreativeTab(VanityBlocks.tabvanityblocks);

	}

	public boolean isBeaconBase(World worldObj, int x, int y, int z,
			int beaconX, int beaconY, int beaconZ) {
		int metadata = worldObj.getBlockMetadata(x, y, z);
		if (metadata == 7) {
			return true;
		}
		return false;
	}

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	@SideOnly(Side.CLIENT)
	// @Override
	public void registerBlockIcons(IIconRegister par1IconRegister) {
		icons = new IIcon[12];

		icons[1] = par1IconRegister.registerIcon("vanityblocks:tinblock");
		icons[2] = par1IconRegister.registerIcon("vanityblocks:copperblock");
		icons[3] = par1IconRegister.registerIcon("vanityblocks:silverblock");
		icons[4] = par1IconRegister.registerIcon("vanityblocks:leadblock");
		icons[5] = par1IconRegister.registerIcon("vanityblocks:nikoliteblock");
		icons[6] = par1IconRegister.registerIcon("vanityblocks:nickelblock");
		icons[7] = par1IconRegister.registerIcon("vanityblocks:electrumblock");
		icons[8] = par1IconRegister.registerIcon("vanityblocks:platinumblock");
		icons[9] = par1IconRegister.registerIcon("vanityblocks:invarblock");
		icons[10] = par1IconRegister.registerIcon("vanityblocks:brassblock");
		icons[11] = par1IconRegister.registerIcon("vanityblocks:rubberblock");
	}

	@Override
	public IIcon getIcon(int side, int metadata) {
		if (metadata == 0) {
			return icons[1];
		}
		if (metadata == 1) {
			return icons[2];
		}
		if (metadata == 2) {
			return icons[3];
		}
		if (metadata == 3) {
			return icons[4];
		}
		if (metadata == 4) {
			return icons[5];
		}
		if (metadata == 5) {
			return icons[6];
		}
		if (metadata == 6) {
			return icons[7];
		}
		if (metadata == 7) {
			return icons[8];
		}
		if (metadata == 8) {
			return icons[9];
		}
		if (metadata == 9) {
			return icons[10];
		}
		if (metadata == 10) {
			return icons[11];
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

	public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_,
			List p_149666_3_) {
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 1));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 2));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 3));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 4));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 5));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 6));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 7));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 8));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 9));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 10));
	}
}