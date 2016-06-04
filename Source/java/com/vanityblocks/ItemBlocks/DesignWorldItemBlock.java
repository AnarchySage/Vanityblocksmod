package com.vanityblocks.ItemBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class DesignWorldItemBlock extends ItemBlock {

	private final static String[] subNames = { "Marble", "Marble Brick",
			"Chiseled Marble", "Marble Pillar", "Marble Tile",
			"Ashford Black Marble", "Ashford Black Marble Brick",
			"Chiseled Ashford Black Marble", "Ashford Black Marble Pillar",
			"Ashford Black Marble Tile", "", "", "", };

	public DesignWorldItemBlock(Block id) {
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
		String name = "worldblocks";
		switch (itemstack.getItemDamage()) {
		case 0: {
			name = "marble";
			break;
		}
		case 1: {
			name = "mbrick";
			break;
		}
		case 2: {
			name = "mchiseled";
			break;
		}
		case 3: {
			name = "mpillar";
			break;
		}
		case 4: {
			name = "mtile";
			break;
		}
		case 5: {
			name = "amarble";
			break;
		}
		case 6: {
			name = "amarblebrick";
			break;
		}
		case 7: {
			name = "amarblechiseled";
			break;
		}
		case 8: {
			name = "amarblepillar";
			break;
		}
		case 9: {
			name = "amarbletile";
			break;
		}
		default:
			name = "Report_To_The_Author";
		}
		return getUnlocalizedName() + "." + name;
	}
}