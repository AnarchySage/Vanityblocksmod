package vanityblocks.Blocks;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneLight;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import vanityblocks.VanityBlocks;
import vanityblocks.Registrations.*;

public class RedstonelitLamps extends BlockRedstoneLight {
	private final boolean powered;

	public RedstonelitLamps(int par1, boolean par2) {
		super(par1, par2);
		this.powered = par2;
		setCreativeTab(vanityblocks.VanityBlocks.tabCustom);
		this.setLightValue(1.0F);
	}

	private Icon[] iconBuffer;

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		iconBuffer = new Icon[9];

		iconBuffer[0] = par1IconRegister
				.registerIcon("vanityblocks:redstonelamps/blackLamp_lit");
		iconBuffer[1] = par1IconRegister
				.registerIcon("vanityblocks:redstonelamps/redLamp_lit");
		iconBuffer[2] = par1IconRegister
				.registerIcon("vanityblocks:redstonelamps/greenLamp_lit");
		iconBuffer[3] = par1IconRegister
				.registerIcon("vanityblocks:redstonelamps/brownLamp_lit");
		iconBuffer[4] = par1IconRegister
				.registerIcon("vanityblocks:redstonelamps/blueLamp_lit");
		iconBuffer[5] = par1IconRegister
				.registerIcon("vanityblocks:redstonelamps/purpleLamp_lit");
		iconBuffer[6] = par1IconRegister
				.registerIcon("vanityblocks:redstonelamps/pinkLamp_lit");
		iconBuffer[7] = par1IconRegister
				.registerIcon("vanityblocks:redstonelamps/lightBlueLamp_lit");
		iconBuffer[8] = par1IconRegister
				.registerIcon("vanityblocks:redstonelamps/magentaLamp_lit");
	}

	@Override
	public Icon getIcon(int side, int metadata) {

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
		return blockIcon;
	}

	@Override
	public void onBlockAdded(World par1World, int x, int y, int z) {
		int metadata = par1World.getBlockMetadata(x, y, z);

		if (!par1World.isRemote) {
			if (this.powered
					&& !par1World.isBlockIndirectlyGettingPowered(x, y, z)) {
				par1World.scheduleBlockUpdate(x, y, z, blockID, metadata);
			} else if (!this.powered
					&& par1World.isBlockIndirectlyGettingPowered(x, y, z)) {
				par1World.setBlock(x, y, z, metadata);
			}
		}
	}

	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which
	 * neighbor changed (coordinates passed are their own) Args: x, y, z,
	 * neighbor blockID
	 */
	@Override
	public void onNeighborBlockChange(World par1World, int x, int y, int z,
			int par5) {
		int metadata = par1World.getBlockMetadata(x, y, z);

		if (!par1World.isRemote) {
			if (this.powered
					&& !par1World.isBlockIndirectlyGettingPowered(x, y, z)) {
				par1World.scheduleBlockUpdate(x, y, z, blockID, metadata);
			} else if (!this.powered
					&& par1World.isBlockIndirectlyGettingPowered(x, y, z)) {
				par1World.setBlock(x, y, z, metadata);
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

		if (!par1World.isRemote && this.powered
				&& !par1World.isBlockIndirectlyGettingPowered(x, y, z)) {
			par1World.setBlock(x, y, z,
					RedstoneLampRegistrations.RedstoneLampDim.blockID,
					metadata, 3);
		}
	}

	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}

	@Override
	public int idPicked(World par1World, int x, int y, int z) {
		return blockID;
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs tab, List subItems) {
		for (int ix = 0; ix < 9; ix++) {
			subItems.add(new ItemStack(this, 1, ix));
		}
	}
}