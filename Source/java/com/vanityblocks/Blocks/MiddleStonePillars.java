package com.vanityblocks.Blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.vanityblocks.Storageprops;
import com.vanityblocks.VanityBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MiddleStonePillars extends Block {
	public MiddleStonePillars(int id) {
		super(Material.rock);
		setResistance(2.0F);
		setCreativeTab(VanityBlocks.tabvanityblocks);
		this.setBlockBounds(0.250F, 0.0F, 0.250F, 0.750F, 1.0F, 0.750F);
		// this.setBlockBounds(0.250F, 0.125F, 0.250F, 0.750F, 0.550F, 0.750F);
		// minx, miny,minz, max x, max y, max z
		/*
		 * 0.0F - Higher it is, goes farther on x+ to x- - right side0.75F -
		 * higher it is, higher it is on the y axis from top down0.0F - higher
		 * it is, farther right it is on the z axis positive1.0F - higher,
		 * longer it is going negative on left side1.0F - higher it is, higher
		 * from bottom up on y axis1.0F - negative to postive on z axis minX,
		 * minY, minZ, maxX, maxY, maxZ
		 */
	}

	/**
	 * Is this block (a) opaque and (b) a full 1m cube? This determines whether
	 * or not to render the shared face of two adjacent blocks and also whether
	 * the player can attach torches, redstone wire, etc to this block.
	 */
	public boolean isOpaqueCube() {
		return false;
	}

	/**
	 * Returns true if the given side of this block type should be rendered, if
	 * the adjacent block is at the given coordinates. Args: blockAccess, x, y,
	 * z, side
	 */
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess p_149646_1_,
			int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_) {
		return true;
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False
	 * (examples: signs, buttons, stairs, etc)
	 */
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public float getBlockHardness(World par1World, int par2, int par3, int par4) {
		int metadata = par1World.getBlockMetadata(par2, par3, par4);
		if (metadata == 5)
			return 50f;
		return 2f;
	}

	// Stone 0, cobblestone 1, sandstone 2, brick 3, mossy cobble 4, obsidian 5,
	// Netherrack 6,
	// * stone brick 7, mossy brick 8, cracked brick 9, circle brick 10, nether
	// brick 11, end stone 12,
	private IIcon[] iconBuffer;

	public void registerBlockIcons(IIconRegister par1IconRegister) {
		iconBuffer = new IIcon[13];

		iconBuffer[0] = par1IconRegister.registerIcon("minecraft:stone");
		iconBuffer[1] = par1IconRegister.registerIcon("minecraft:cobblestone");
		iconBuffer[2] = par1IconRegister
				.registerIcon(Storageprops.sandstonetexture);
		iconBuffer[3] = par1IconRegister.registerIcon("minecraft:brick");
		iconBuffer[4] = par1IconRegister
				.registerIcon("minecraft:cobblestone_mossy");
		iconBuffer[5] = par1IconRegister.registerIcon("minecraft:obsidian");
		iconBuffer[6] = par1IconRegister.registerIcon("minecraft:netherrack");
		iconBuffer[7] = par1IconRegister.registerIcon("minecraft:stonebrick");
		iconBuffer[8] = par1IconRegister
				.registerIcon("minecraft:stonebrick_mossy");
		iconBuffer[9] = par1IconRegister
				.registerIcon("minecraft:stonebrick_cracked");
		iconBuffer[10] = par1IconRegister
				.registerIcon("minecraft:stonebrick_carved");
		iconBuffer[11] = par1IconRegister
				.registerIcon("minecraft:nether_brick");
		iconBuffer[12] = par1IconRegister.registerIcon("minecraft:end_stone");
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
		if (metadata == 12) {
			return iconBuffer[12];
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
		p_149666_3_.add(new ItemStack(p_149666_1_, 1, 12));
	}
}