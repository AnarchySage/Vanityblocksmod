package com.vanityblocks.Blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.vanityblocks.VanityBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ForestryBlock extends Block {
	public ForestryBlock(int id) {
		super(Material.rock);
		setHardness(3.0F);
		setResistance(10.0F);
		setCreativeTab(VanityBlocks.tabvanityblocks);

	}

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	@SideOnly(Side.CLIENT)
	// @Override
	public void registerBlockIcons(IIconRegister par1IconRegister) {
		icons = new IIcon[4];

		icons[0] = par1IconRegister.registerIcon("vanityblocks:apatiteblock");
		icons[1] = par1IconRegister.registerIcon("vanityblocks:honeyblocktemp");
		icons[2] = par1IconRegister
				.registerIcon("vanityblocks:honeydewblocktemp");
		icons[3] = par1IconRegister.registerIcon("vanityblocks:peatblocktemp");
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

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_,
			List p_149666_3_) {
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 1));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 2));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 3));
	}
}