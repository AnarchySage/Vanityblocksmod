package com.vanityblocks.Blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.vanityblocks.Storageprops;
import com.vanityblocks.VanityBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RandomBlocks extends Block {
	public RandomBlocks(int id) {
		super(Material.rock);
		setHardness(3.0F);
		setResistance(5.0F);
		setCreativeTab(VanityBlocks.tabvanityblocks);
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

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	@SideOnly(Side.CLIENT)
	// @Override
	public void registerBlockIcons(IIconRegister par1IconRegister) {
		icons = new IIcon[5];

		icons[0] = par1IconRegister.registerIcon("vanityblocks:claybrick");
		icons[1] = par1IconRegister.registerIcon("vanityblocks:whitesoulsand");
		icons[2] = par1IconRegister.registerIcon("vanityblocks:oldlapisblock");
		icons[3] = par1IconRegister.registerIcon("vanityblocks:oldlapisbrick");
		icons[4] = par1IconRegister.registerIcon("vanityblocks:lapisbrick");
	}

	@Override
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
		if (metadata == 3) {
			return icons[3];
		}
		if (metadata == 4) {
			return icons[4];
		}
		return blockIcon;
	}

	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_,
			List p_149666_3_) {
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 1));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 2));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 3));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 4));
	}
}