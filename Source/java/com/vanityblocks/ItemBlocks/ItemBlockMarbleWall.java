package com.vanityblocks.ItemBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockMarbleWall extends ItemBlock {
	public ItemBlockMarbleWall(Block id) {
		super(id);
		setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int i) {
		return i;
	}

	// M = Marble, A = Ashford Black
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		String name = "marblewalls";
		switch (itemstack.getItemDamage()) {
		case 0: {
			name = "mwall";
			break;
		}
		case 1: {
			name = "mbrickwall";
			break;
		}
		case 2: {
			name = "mchiseledwall";
			break;
		}
		case 3: {
			name = "mpillarwall";
			break;
		}
		case 4: {
			name = "mtilewall";
			break;
		}
		case 5: {
			name = "amarblewall";
			break;
		}
		case 6: {
			name = "amarblebrickwall";
			break;
		}
		case 7: {
			name = "amarblechiseledwall";
			break;
		}
		case 8: {
			name = "amarblepillarwall";
			break;
		}
		case 9: {
			name = "amarbletilewall";
			break;
		}
		default:
			name = "Report_To_The_Author";
		}
		return getUnlocalizedName() + "." + name;
	}
}
