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

public class DesignWorldGraniteblock extends Block {
	public DesignWorldGraniteblock(int id) {
		super(Material.rock);
		setResistance(10.0F);
		setCreativeTab(VanityBlocks.tabvanityblocks);
	}
	
	private IIcon[] iconBuffer;

	public void registerBlockIcons(IIconRegister par1IconRegister) {
		iconBuffer = new IIcon[7];
// c p t
		iconBuffer[0] = par1IconRegister.registerIcon("vanityblocks:stone_granite");
		iconBuffer[1] = par1IconRegister.registerIcon("vanityblocks:stone_granite_smooth");
		iconBuffer[2] = par1IconRegister.registerIcon("vanityblocks:stone_granite_smooth_brick");
		iconBuffer[3] = par1IconRegister.registerIcon("vanityblocks:stone_granite_smooth_chisel");
		iconBuffer[4] = par1IconRegister.registerIcon("vanityblocks:stone_granite_smooth_pillarside");
		iconBuffer[5] = par1IconRegister.registerIcon("vanityblocks:stone_granite_smooth_pillartop");
		iconBuffer[6] = par1IconRegister.registerIcon("vanityblocks:stone_granite_smooth_tile");

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
		if (metadata == 2) {
			return iconBuffer[2];
		}	
		if (metadata == 3) {
			return iconBuffer[3];
		}
		if (metadata == 4) {
			switch (side) {
			case 0:
				return iconBuffer[5];
			case 1:
				return iconBuffer[5];
			default:
				return iconBuffer[4];
			}
		}
		if (metadata == 5) {
			return iconBuffer[6];
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

	}
}