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

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DesignWorldblock extends Block {
	public DesignWorldblock(int id) {
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
		icons = new IIcon[12];

		icons[0] = par1IconRegister.registerIcon("vanityblocks:marble");
		icons[1] = par1IconRegister.registerIcon("vanityblocks:marblebrick");
		icons[2] = par1IconRegister.registerIcon("vanityblocks:marblechisel");
		icons[3] = par1IconRegister
				.registerIcon("vanityblocks:marblepillarside");
		icons[10] = par1IconRegister
				.registerIcon("vanityblocks:marblepillartop");
		icons[4] = par1IconRegister.registerIcon("vanityblocks:marbletile");
		icons[5] = par1IconRegister.registerIcon("vanityblocks:blackmarble");
		icons[6] = par1IconRegister
				.registerIcon("vanityblocks:blackmarblebrick");
		icons[7] = par1IconRegister
				.registerIcon("vanityblocks:blackmarblechisel");
		icons[8] = par1IconRegister
				.registerIcon("vanityblocks:blackmarblepillarside");
		icons[11] = par1IconRegister
				.registerIcon("vanityblocks:blackmarblepillartop");
		icons[9] = par1IconRegister
				.registerIcon("vanityblocks:blackmarbletile");
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
			switch (side) {
			case 0:
				return icons[10];
			case 1:
				return icons[10];
			default:
				return icons[3];
				// return iconBuffer[3];
			}
		}
		if (metadata == 4) {
			return icons[4];
		}
		if (metadata == 5) {
			return icons[5];
		}
		if (metadata == 6) {
			return icons[6];
		}
		if (metadata == 7) {
			return icons[7];
		}
		if (metadata == 8) {
			switch (side) {
			case 0:
				return icons[11];
			case 1:
				return icons[11];
			default:
				return icons[8];
				// return iconBuffer[8];
			}
		}
		if (metadata == 9) {
			return icons[9];
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
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 5));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 6));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 7));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 8));
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 9));
	}
}