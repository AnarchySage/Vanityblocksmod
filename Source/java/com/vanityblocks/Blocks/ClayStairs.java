package com.vanityblocks.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

import com.vanityblocks.VanityBlocks;

public class ClayStairs extends BlockStairs
{
    public ClayStairs(Block par2Block, int par3)
    {
        super(par2Block, par3);
		setCreativeTab(VanityBlocks.tabvanityblocks);
        this.setLightOpacity(0);
    }

}