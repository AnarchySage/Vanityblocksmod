package com.vanityblocks.ItemBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class RedstoneLampDimItemBlock extends ItemBlock {

	private final static String[] subNames = { "blackLamp", "redLamp",
			"greenLamp", "brownLamp", "blueLamp", "purpleLamp", "pinkLamp",
			"lightBlueLamp", "magentaLamp", "", "", "", "", "", "", "", "", "" };

	public RedstoneLampDimItemBlock(Block id) {
		super(id);
		setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int i) {
		return i;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		String name = "";
		switch (itemstack.getItemDamage()) {
		case 0: {
			name = "blackLamp";
			break;
		}
		case 1: {
			name = "redLamp";
			break;
		}
		case 2: {
			name = "greenLamp";
			break;
		}
		case 3: {
			name = "brownLamp";
			break;
		}
		case 4: {
			name = "blueLamp";
			break;
		}
		case 5: {
			name = "purpleLamp";
			break;
		}
		case 6: {
			name = "pinkLamp";
			break;
		}
		case 7: {
			name = "lightBlueLamp";
			break;
		}
		case 8: {
			name = "magentaLamp";
			break;
		}
		default:
			name = "Report_To_The_Author";
		}
		return getUnlocalizedName() + "." + name;
	}
}