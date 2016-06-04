package com.vanityblocks.ItemBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockMarbleSlab extends ItemBlock {
	private final static String[] subNames = { "Marble Slab",
			"Marble Brick Slab", "Chiseled Marble Slab", "Marble Pillar Slab",
			"Marble Tile Slab", "Ashford Black Marble Slab",
			"Ashford Black Marble Brick Slab",
			"Chiseled Ashford Black Marble Slab",
			"Ashford Black Marble Pillar Slab",
			"Ashford Black Marble Tile Slab", "", "", "", "", "", "" };

	public ItemBlockMarbleSlab(Block id) {
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
		String name = "marbleslab";
		switch (itemstack.getItemDamage()) {
		case 0: {
			name = "mslab";
			break;
		}
		case 1: {
			name = "mbrickslab";
			break;
		}
		case 2: {
			name = "mchiseledslab";
			break;
		}
		case 3: {
			name = "mpillarslab";
			break;
		}
		case 4: {
			name = "mtileslab";
			break;
		}
		case 5: {
			name = "amarbleslab";
			break;
		}
		case 6: {
			name = "amarblebrickslab";
			break;
		}
		case 7: {
			name = "amarblechiseledslab";
			break;
		}
		case 8: {
			name = "amarblepillarslab";
			break;
		}
		case 9: {
			name = "amarbletileslab";
			break;
		}
		default:
			name = "Report_To_The_Author";
		}
		return getUnlocalizedName() + "." + name;
	}
}
