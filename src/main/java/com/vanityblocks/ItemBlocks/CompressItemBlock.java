package com.vanityblocks.ItemBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class CompressItemBlock extends ItemBlock {

	private final static String[] subNames = { "9X Compressed CobblesStone",
			"81X Compressed CobblesStone", "729X Compressed CobblesStone",
			"9X Compressed Dirt", "81X Compressed Dirt",
			"729X Compressed Dirt", "9X Compressed Sand",
			"81X Compressed Sand", "729X Compressed Sand",
			"9X Compressed Gravel", "81X Compressed Gravel",
			"729X Compressed Gravel", "", "", "", "" };

	public CompressItemBlock(Block id) {
		super(id);
		setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int i) {
		return i;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		String name = "compressed";
		switch (itemstack.getItemDamage()) {
		case 0: {
			name = "9xcobble";
			break;
		}
		case 1: {
			name = "81xcobble";
			break;
		}
		case 2: {
			name = "729xcobble";
			break;
		}
		case 3: {
			name = "9xdirt";
			break;
		}
		case 4: {
			name = "81xdirt";
			break;
		}
		case 5: {
			name = "729xdirt";
			break;
		}
		case 6: {
			name = "9xsand";
			break;
		}
		case 7: {
			name = "81xsand";
			break;
		}
		case 8: {
			name = "729xsand";
			break;
		}
		case 9: {
			name = "9xgravel";
			break;
		}
		case 10: {
			name = "81xgravel";
			break;
		}
		case 11: {
			name = "729xgravel";
			break;
		}
		default:
			name = "Report_To_The_Author";
		}
		return getUnlocalizedName() + "." + name;
	}
}