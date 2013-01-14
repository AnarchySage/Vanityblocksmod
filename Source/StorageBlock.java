package vanityblocksstorage;


import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class StorageBlock extends Block {
	public StorageBlock (int id) {
		super(id, Material.ground);
//		setBlockName("storageblock");
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public int getBlockTextureFromSideAndMetadata (int side, int metadata) {
		if (metadata == 4) {
	        switch (side) {
        case 0:
            return 32;
        case 1:
            return 32;
        default:
            return 33;
		}
		}else
		return metadata + 0;
	}
	
	@Override
	public String getTextureFile () {
		return "/VanityBlocksStorage/vanstorage.png";
	}
	@Override
	public int damageDropped (int metadata) {
		return metadata;
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs tab, List subItems) {
		for (int ix = 0; ix < 7; ix++) {
			subItems.add(new ItemStack(this, 1, ix));
		}
	}
}