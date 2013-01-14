package vanityblocksstorage;


import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class StorageBlockMod extends Block {
	public StorageBlockMod (int id) {
		super(id, Material.ground);
        setHardness(3.0F);
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public int getBlockTextureFromSideAndMetadata (int side, int metadata) {
		return metadata + 0;
	}
	
	@Override
	public String getTextureFile () {
		return "/VanityBlocksStorage/modstorage.png";
	}
	@Override
	public int damageDropped (int metadata) {
		return metadata;
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs tab, List subItems) {
		for (int ix = 0; ix < 10; ix++) {
			subItems.add(new ItemStack(this, 1, ix));
		}
	}
}