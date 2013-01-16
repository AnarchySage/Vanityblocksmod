package vanityblocks;


import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class StorageBlockMod extends Block {
	public StorageBlockMod (int id) {
		super(id, Material.piston);
//        setHardness(3.0F);
		setCreativeTab(CreativeTabs.tabBlock);
	}
    public float getHardness(int md) {
    	switch(md) {
    	case 0: return 3F;
        case 1: return 3F; 
        case 2: return 3F;
        case 3: return 3F;
        case 4: return 3F;
        case 5: return 3F;
        case 6: return 3F;
        case 7: return 3F;
        case 8: return 3F;
        case 9: return 3F;
        case 10: return 3F;
//        case 12: return 1.5F; //Netherrack
//        case 13: return Block.sandStone.getBlockHardness(null, 0, 0, 0) * 2F;
//        case 14: return Block.stoneBrick.getBlockHardness(null, 0, 0, 0);
//        case 15: return Block.brick.getBlockHardness(null, 0, 0, 0);
        default: return 0;
    	}
    }
	@Override
	public int getBlockTextureFromSideAndMetadata (int side, int metadata) {
		return metadata + 0;
	}
	
	@Override
	public String getTextureFile () {
		return "/vanityblocks/modstorage.png";
	}
	@Override
	public int damageDropped (int metadata) {
		return metadata;
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs tab, List subItems) {
		for (int ix = 0; ix < 10; ix++) {
			//10 for current
			subItems.add(new ItemStack(this, 1, ix));
		}
	}
}