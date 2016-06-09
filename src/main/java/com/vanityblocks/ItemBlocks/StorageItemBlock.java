package com.vanityblocks.ItemBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class StorageItemBlock extends ItemBlock {
	public StorageItemBlock(Block block) {
		super(block);
		setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		String name = "";
		switch (itemstack.getItemDamage()) {
		case 0: {
			name = "charcoalblock";
			break;
		}
		case 1: {
			name = "enderpearlblock";
			break;
		}
		case 2: {
			name = "sugarblock";
			break;
		}
		case 3: {
			name = "cocoablock";
			break;
		}
		case 4: {
			name = "sugarcaneblock";
			break;
		}
		case 5: {
			name = "leatherblock";
			break;
		}
		case 6: {
			name = "boneblock";
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