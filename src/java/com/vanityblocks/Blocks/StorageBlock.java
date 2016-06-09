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
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import com.vanityblocks.VanityBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class StorageBlock extends Block {
	private static boolean effect = true;

	public StorageBlock(int id) {
		super(Material.rock);
		setResistance(10.0F);
		setCreativeTab(VanityBlocks.tabvanityblocks);
	}

	@Override
	public boolean isFlammable(IBlockAccess world, int x, int y, int z,
			ForgeDirection face) {

		return effect && face.ordinal() > ForgeDirection.UP.ordinal()
				&& world.getBlock(x, y - 1, z) != this;
	}

	@Override
	public boolean isFireSource(World world, int x, int y, int z,
			ForgeDirection side) {

		return effect;
	}

	@Override
	public float getBlockHardness(World par1World, int par2, int par3, int par4) {
		// return !isActive(par1World.getBlockMetadata(par2, par3, par4)) ? 0 :
		// 3;
		int metadata = par1World.getBlockMetadata(par2, par3, par4);
		if (metadata == 0)
			return 1.8f;
		if (metadata == 1)
			return 1.8f;
		if (metadata == 2)
			return .8f;
		if (metadata == 3)
			return .8f;
		if (metadata == 4)
			return .8f;
		if (metadata == 5)
			return .8f;
		if (metadata == 6)
			return .8f;
		if (metadata == 7)
			return .8f;
		if (metadata == 8)
			return .8f;

		return 2f;
	}

	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z,
			Entity entity) {
		int meta = world.getBlockMetadata(x, y, z);
		if (meta == 2) {
			if (entity.motionY < 0)
				entity.motionY *= -1.2F;
			entity.fallDistance = 0;
		}
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x,
			int y, int z) {
		int meta = world.getBlockMetadata(x, y, z);
		if (meta == 2)
			return AxisAlignedBB.getBoundingBox(x, y, z, (double) x + 1.0D,
					(double) y + 0.625D, (double) z + 1.0D);
		return super.getCollisionBoundingBoxFromPool(world, x, y, z);
	}

	@SideOnly(Side.CLIENT)
	public IIcon[] icons;

	@SideOnly(Side.CLIENT)
	// @Override
	public void registerBlockIcons(IIconRegister par1IconRegister) {
		icons = new IIcon[9];

		icons[0] = par1IconRegister.registerIcon("vanityblocks:charcoalblock");
		icons[1] = par1IconRegister
				.registerIcon("vanityblocks:enderpearlblock");
		icons[2] = par1IconRegister.registerIcon("vanityblocks:sugarblock");
		icons[3] = par1IconRegister.registerIcon("vanityblocks:cocoablock");
		icons[4] = par1IconRegister.registerIcon("vanityblocks:leatherblock");
		icons[5] = par1IconRegister.registerIcon("vanityblocks:boneblock");
		icons[7] = par1IconRegister.registerIcon("vanityblocks:reedtop");
		icons[8] = par1IconRegister.registerIcon("vanityblocks:reedside");
	}

	@Override
	// public Icon getBlockTextureFromSideAndMetadata (int side, int metadata) {
	public IIcon getIcon(int side, int metadata) {

		if (metadata == 0) {
			return icons[0];
		}
		if (metadata == 1) {
			return icons[1];
		}
		if (metadata == 2) {
			return icons[2];
		}
		if (metadata == 2) {
			return icons[2];
		}
		if (metadata == 3) {
			return icons[3];
		}
		if (metadata == 4) {
			switch (side) {
			case 0:
				return icons[7];
			case 1:
				return icons[7];
			default:
				return icons[8];
			}
		}
		if (metadata == 5) {
			return icons[4];
		}
		if (metadata == 6) {
			return icons[5];
		}
		return blockIcon;
	}

	@Override
	public int damageDropped(int metadata) {
		return metadata;
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
	}
}