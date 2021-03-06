package com.vanityblocks.FuelHandler;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class VanitymodFuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		// TODO Auto-generated method stub
		return 0;
	}
}
	/*@Override
	public int getBurnTime(ItemStack fuel) {
		Item item = fuel.getItem();
		if (item instanceof ItemBlock
				&& Block.getBlockFromItem(item) != Blocks.air) {
			Block block = Block.getBlockFromItem(item);
			if (block == StorageBlocksRegistration.StorageBlockMod) {
				if (fuel.getItemDamage() == (9)) {
					return 57600; // 288 items?
				}
			}
		}
		return 0;
	}
}
/*
 * You might have noticed items return nothing. This is pretty simple to fix,
 * you just need to change the return statement of the body of the If
 * Statements. Note that this is tick for which the fuel lasts. To obtain how
 * much you need in here, multiply the seconds you want by 20. So if I want
 * books to last for 15 seconds, I would change the return after the
 * Item.book.shiftedIndex to be 300. If I want my fuel item to last for 10
 * minutes (seriously) I would put 12000. To help you, here's a chart containing
 * the values of vanilla items: Wooden Slabs - 150 Anything made out of wood -
 * 300 Wooden Tools - 200 Sticks - 100 Coal - 1600 Lava Bucket - 20000 Sapling -
 * 100 Blaze Rod - 2400
 */