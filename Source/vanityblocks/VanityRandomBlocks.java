package vanityblocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class VanityRandomBlocks extends Block {
	public VanityRandomBlocks(int id) {
		super(id, Material.rock);
		setCreativeTab(vanityblocks.VanityBlocks.tabCustom);
	}

	@Override
	public void onEntityWalking(World world, int x, int y, int z, Entity entity) {
		if (Storageprops.enablewhitesoulsandspeed) {
			double boost = 2.2D;
			int metadata = world.getBlockMetadata(x, y, z);
			if (metadata == 2)
				boost = 5D;

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
		if (metadata == 1){
			return 1f;
		}
		return 3f;
	}

	private Icon[] iconBuffer;

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		iconBuffer = new Icon[3];

		iconBuffer[0] = par1IconRegister.registerIcon("vanityblocks:claybrick");
		iconBuffer[1] = par1IconRegister
				.registerIcon("vanityblocks:oldlapisblock");
		iconBuffer[2] = par1IconRegister
				.registerIcon("vanityblocks:whitesoulsand");

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
		return blockIcon;
	}

	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs tab, List subItems) {
		for (int ix = 0; ix < 4; ix++) {
			subItems.add(new ItemStack(this, 1, ix));
		}
	}
}