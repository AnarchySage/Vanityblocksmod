package com.vanityblocks.Blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.vanityblocks.VanityBlocks;

public class DesignWorldAndesiteblock extends Block {
	public DesignWorldAndesiteblock(int id) {
		super(Material.rock);
		setResistance(10.0F);
		setCreativeTab(VanityBlocks.tabvanityblocks);
	}

	private IIcon[] iconBuffer;

	public void registerBlockIcons(IIconRegister par1IconRegister) {
		iconBuffer = new IIcon[3];

		iconBuffer[0] = par1IconRegister.registerIcon("vanityblocks:stone_andesite");
		iconBuffer[1] = par1IconRegister.registerIcon("vanityblocks:stone_andesite_smooth");
	}

	@Override
	// public Icon getBlockTextureFromSideAndMetadata (int side, int metadata) {
	public IIcon getIcon(int side, int metadata) {

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

	public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_,
			List p_149666_3_) {
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 1));
	}
}