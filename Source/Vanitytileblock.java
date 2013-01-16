package vanityblocks;


import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Vanitytileblock extends Block {
	public Vanitytileblock (int id) {
		super(id, Material.ground);
//		setBlockName("storageblock");
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public int getBlockTextureFromSideAndMetadata (int side, int metadata) {
		return metadata + 0;
	}
	
	@Override
	public String getTextureFile () {
		return "/vanityblocks/te.png";
	}
	@Override
	public int damageDropped (int metadata) {
		return metadata;
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs tab, List subItems) {
		for (int ix = 0; ix < 1; ix++) {
			subItems.add(new ItemStack(this, 1, ix));
		}
	}
	public TileEntity createNewTileEntity(World var1) {
		return new TileMeltingcore();
	}
}