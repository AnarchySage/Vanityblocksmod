package com.vanityblocks.Blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockRedstoneLight;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.vanityblocks.VanityBlocks;
import com.vanityblocks.Registrations.RedstoneLampRegistrations;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RedstonelitLamps extends BlockRedstoneLight {
	private final boolean field_150171_a;

	public RedstonelitLamps(int redstonelamplitconfig, boolean p_i45421_1_) {
		super(p_i45421_1_); // super(Material.redstoneLight);
		setCreativeTab(VanityBlocks.tabvanityblocks);
		this.field_150171_a = p_i45421_1_;

		if (p_i45421_1_) {
			this.setLightLevel(1.0F);
		}
	}

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	@SideOnly(Side.CLIENT)
	// @Override
	public void registerBlockIcons(IIconRegister par1IconRegister) {
		icons = new IIcon[9];

		icons[0] = par1IconRegister
				.registerIcon("vanityblocks:redstonelamps/blackLamp_lit");
		icons[1] = par1IconRegister
				.registerIcon("vanityblocks:redstonelamps/redLamp_lit");
		icons[2] = par1IconRegister
				.registerIcon("vanityblocks:redstonelamps/greenLamp_lit");
		icons[3] = par1IconRegister
				.registerIcon("vanityblocks:redstonelamps/brownLamp_lit");
		icons[4] = par1IconRegister
				.registerIcon("vanityblocks:redstonelamps/blueLamp_lit");
		icons[5] = par1IconRegister
				.registerIcon("vanityblocks:redstonelamps/purpleLamp_lit");
		icons[6] = par1IconRegister
				.registerIcon("vanityblocks:redstonelamps/pinkLamp_lit");
		icons[7] = par1IconRegister
				.registerIcon("vanityblocks:redstonelamps/lightBlueLamp_lit");
		icons[8] = par1IconRegister
				.registerIcon("vanityblocks:redstonelamps/magentaLamp_lit");
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
			return icons[8];
		}
		return blockIcon;
	}

	@Override
	public void onBlockAdded(World par1World, int x, int y, int z) {
		int metadata = par1World.getBlockMetadata(x, y, z);

		if (!par1World.isRemote) {
			if (this.field_150171_a
					&& !par1World.isBlockIndirectlyGettingPowered(x, y, z)) {
				par1World.scheduleBlockUpdate(x, y, z,
						RedstoneLampRegistrations.RedstoneLampDim, metadata);
			} else if (!this.field_150171_a
					&& par1World.isBlockIndirectlyGettingPowered(x, y, z)) {
				par1World.setBlock(x, y, z,
						RedstoneLampRegistrations.RedstoneLampLit, 0, metadata);
			}
		}
	}

	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which
	 * neighbor changed (coordinates passed are their own) Args: x, y, z,
	 * neighbor blockID
	 */
	// @Override
	public void onNeighborBlockChange(World par1World, int x, int y, int z,
			int par5) {
		int metadata = par1World.getBlockMetadata(x, y, z);

		if (!par1World.isRemote) {
			if (this.field_150171_a
					&& !par1World.isBlockIndirectlyGettingPowered(x, y, z)) {
				par1World.scheduleBlockUpdate(x, y, z,
						RedstoneLampRegistrations.RedstoneLampLit, metadata);
			} else if (!this.field_150171_a
					&& par1World.isBlockIndirectlyGettingPowered(x, y, z)) {
				par1World.setBlock(x, y, z,
						RedstoneLampRegistrations.RedstoneLampLit, 0, metadata);
			}
		}
	}

	/**
	 * Ticks the block if it's been scheduled
	 */
	@Override
	public void updateTick(World par1World, int x, int y, int z,
			Random par5Random) {
		int metadata = par1World.getBlockMetadata(x, y, z);

		if (!par1World.isRemote && this.field_150171_a
				&& !par1World.isBlockIndirectlyGettingPowered(x, y, z)) {
			par1World.setBlock(x, y, z,
					RedstoneLampRegistrations.RedstoneLampDim, metadata, 3);
		}
	}

	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}

	public int idPicked(World par1World, int x, int y, int z) {
		int metadata = par1World.getBlockMetadata(x, y, z);
		return metadata;
	}
	public int idDropped(int meta, Random random)
    {
        return (meta);
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
	}
}