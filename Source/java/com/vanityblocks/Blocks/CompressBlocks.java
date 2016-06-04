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

public class CompressBlocks extends Block {
	public CompressBlocks(int id) {
		super(Material.rock);
		setResistance(2.0F);
		setCreativeTab(VanityBlocks.tabvanityblocks);
	}

	@Override
	public float getBlockHardness(World par1World, int par2, int par3, int par4) {
		int metadata = par1World.getBlockMetadata(par2, par3, par4);
		if (metadata == 0)
			return 2f;
		if (metadata == 1)
			return 2f;
		if (metadata == 2)
			return 2f;
		if (metadata == 3)
			return .5f;
		if (metadata == 4)
			return .5f;
		if (metadata == 5)
			return .5f;
		if (metadata == 6)
			return .5f;
		if (metadata == 7)
			return .5f;
		if (metadata == 8)
			return .5f;
		if (metadata == 9)
			return .5f;
		if (metadata == 10)
			return .5f;
		if (metadata == 11)
			return .5f;

		return 2f;
	}

	private IIcon[] iconBuffer;

	public void registerBlockIcons(IIconRegister par1IconRegister) {
		iconBuffer = new IIcon[12];

		iconBuffer[0] = par1IconRegister.registerIcon("vanityblocks:cobble9x");
		iconBuffer[1] = par1IconRegister.registerIcon("vanityblocks:cobble81x");
		iconBuffer[2] = par1IconRegister
				.registerIcon("vanityblocks:cobble729x");
		iconBuffer[3] = par1IconRegister.registerIcon("vanityblocks:dirt9x");
		iconBuffer[4] = par1IconRegister.registerIcon("vanityblocks:dirt81x");
		iconBuffer[5] = par1IconRegister.registerIcon("vanityblocks:dirt729x");
		iconBuffer[6] = par1IconRegister.registerIcon("vanityblocks:sand9x");
		iconBuffer[7] = par1IconRegister.registerIcon("vanityblocks:sand81x");
		iconBuffer[8] = par1IconRegister.registerIcon("vanityblocks:sand729x");
		iconBuffer[9] = par1IconRegister.registerIcon("vanityblocks:gravel9x");
		iconBuffer[10] = par1IconRegister
				.registerIcon("vanityblocks:gravel81x");
		iconBuffer[11] = par1IconRegister
				.registerIcon("vanityblocks:gravel729x");
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
			return iconBuffer[8];
		}
		if (metadata == 8) {
			return iconBuffer[8];
		}
		if (metadata == 9) {
			return iconBuffer[9];
		}
		if (metadata == 10) {
			return iconBuffer[10];
		}
		if (metadata == 11) {
			return iconBuffer[11];
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
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 7));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 8));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 9));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 10));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 11));
	}
}