package com.vanityblocks.ItemBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class DesignWorldGraniteItemBlock extends ItemBlock {

	private final static String[] subNames = { "Granite", "Polished Granite",
		"Polished Granite Brick", "Polished Granite Chiseled", "Polished Granite Pillar","Polished Granite Tile", "","", "","", "", "", "", };

	public DesignWorldGraniteItemBlock(Block id) {
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
			name = "granite";
			break;
		}
		case 1: {
			name = "polishedgranite";
			break;
		}
		case 2: {
			name = "polishedgranitebrick";
			break;
		}
		case 3: {
			name = "polishedgranitechisel";
			break;
		}
		case 4: {
			name = "polishedgranitepillar";
			break;
		}
		case 5: {
			name = "polishedgranitetile";
			break;
		}
		/*case 6: {
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
		} */
		default:
			name = "Report_To_The_Author";
		}
		return getUnlocalizedName() + "." + name;
	}
}