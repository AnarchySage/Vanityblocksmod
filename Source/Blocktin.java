package vanityblocksstorage;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Blocktin extends net.minecraft.block.Block {

	public static boolean enable;


	public Blocktin (int id, int texture) {
		super(id, Material.rock);
		//setLightValue(1.0F);
        setCreativeTab(CreativeTabs.tabDecorations);
        blockIndexInTexture = 5;
        setHardness(3.0F);
        // setResistance(3.0F);
        //setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
        //setLightOpacity(0);
        //setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabDecorations);
        //this.setCreativeTab(CreativeTabs.tabBlock);
	}


	//@Override
	public String getTextureFile () {
		return "/VanityBlocksStorage/storage.png";
	}
}