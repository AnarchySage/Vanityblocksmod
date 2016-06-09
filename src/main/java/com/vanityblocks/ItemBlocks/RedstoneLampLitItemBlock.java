package com.vanityblocks.ItemBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class RedstoneLampLitItemBlock extends ItemBlock {

	public RedstoneLampLitItemBlock(Block id) {
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
			name = "blackLamp_Lit";
			break;
		}
		case 1: {
			name = "redLamp_Lit";
			break;
		}
		case 2: {
			name = "greenLamp_Lit";
			break;
		}
		case 3: {
			name = "brownLamp_Lit";
			break;
		}
		case 4: {
			name = "blueLamp_Lit";
			break;
		}
		case 5: {
			name = "purpleLamp_Lit";
			break;
		}
		case 6: {
			name = "pinkLamp_Lit";
			break;
		}
		case 7: {
			name = "lightBlueLamp_Lit";
			break;
		}
		case 8: {
			name = "magentaLamp_Lit";
			break;
		}
		default:
			name = "Report_To_The_Author";
		}
		return getUnlocalizedName() + "." + name;
	}
}