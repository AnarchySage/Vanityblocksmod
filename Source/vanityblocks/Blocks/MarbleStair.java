package vanityblocks.Blocks;

import vanityblocks.VanityBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class MarbleStair extends BlockStairs {
	public MarbleStair(int par1, Block par2Block, int par3) {
		super(par1, par2Block, par3);
		setCreativeTab(vanityblocks.VanityBlocks.tabCustom);
		this.setLightOpacity(0);
	}
}