package Vanityblocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Blockwheat extends net.minecraft.block.Block {

	public static boolean enable;


	public Blockwheat (int id, int texture) {
		super(id, Material.cloth);
		//setLightValue(1.0F);
        setCreativeTab(CreativeTabs.tabDecorations);
        blockIndexInTexture = 11;
        //setHardness(5.0F);
        // setResistance(3.0F);
        //setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
        //setLightOpacity(0);
        //setCreativeTab(net.minecraft.creativetab.CreativeTabs.tabDecorations);
        //this.setCreativeTab(CreativeTabs.tabBlock);
	}
    public int getBlockTextureFromSide(int side) {

        switch (side) {
        case 0:
            return 16;
        case 1:
            return 16;
        default:
            return 17;
        }
    }


	//@Override
	public String getTextureFile () {
		return "/Vanityblocks/textures/block.png";
	}
}