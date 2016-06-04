package com.vanityblocks.ItemBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class PillarsStoneMiddleItemBlock extends ItemBlock {

	public PillarsStoneMiddleItemBlock(Block block) {
		super(block);
		setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		String name = "pillars";
		switch (itemstack.getItemDamage()) {
		case 0: {
			name = "pillarstone";
			break;
		}
		case 1: {
			name = "pillarcobble";
			break;
		}
		case 2: {
			name = "pillarsandstone";
			break;
		}
		case 3: {
			name = "pillarbrick";
			break;
		}
		case 4: {
			name = "pillarmossycobble";
			break;
		}
		case 5: {
			name = "pillarobsidian";
			break;
		}
		case 6: {
			name = "pillarnetherrack";
			break;
		}
		case 7: {
			name = "pillarstonebrick";
			break;
		}
		case 8: {
			name = "pillarmossybrick";
			break;
		}
		case 9: {
			name = "pillarcrackedbrick";
			break;
		}
		case 10: {
			name = "pillarchiseledbrick";
			break;
		}
		case 11: {
			name = "pillarnetherbrick";
			break;
		}
		case 12: {
			name = "pillarendstone";
			break;
		}
		default:
			name = "Report_To_The_Author";
		}
		return getUnlocalizedName() + "." + name;
	}

	@Override
	public int getMetadata(int par1) {
		return par1;
	}
}