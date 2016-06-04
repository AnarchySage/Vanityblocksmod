package com.vanityblocks.ItemBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class DesignItemBlock extends ItemBlock {

	public DesignItemBlock(Block id) {
		super(id);
		setHasSubtypes(true);
		// setItemName("vanitydesignblocks");
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		String name = "pillars";
		switch (itemstack.getItemDamage()) {
		case 0: {
			name = "lavalamp";
			break;
		}
		case 1: {
			name = "stonetrimmedglowstone";
			break;
		}
		default:
			name = "Report_To_The_Author";
		}
		return getUnlocalizedName() + "." + name;
	}

	@Override
	public int getMetadata(int i) {
		return i;
	}
}