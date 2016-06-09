package com.vanityblocks.FuelHandler;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import com.vanityblocks.Storageprops;
import com.vanityblocks.Registrations.GeneralItemRegistration;
import com.vanityblocks.Registrations.StorageBlocksRegistration;

import cpw.mods.fml.common.IFuelHandler;

public class VanityvanFuelHandler implements IFuelHandler {
	@Override
	public int getBurnTime(ItemStack fuel) {
		// if (fuel.getItem() == new ItemStack(floraSapling).getItem()
		// || fuel.getItem() == new ItemStack(rareSapling).getItem())
		// Natura^

		// int var1 = fuel.itemID;
		if (Storageprops.enablestorageblocks) {
			Item item = fuel.getItem();
			if (item instanceof ItemBlock
					&& Block.getBlockFromItem(item) != Blocks.air) {
				Block block = Block.getBlockFromItem(item);
				if (block == StorageBlocksRegistration.StorageBlock) {
					if (fuel.getItemDamage() == (0)) {
						return 14400;
					}
					// if (fuel.getItemDamage() == (6)){
					// return 21600;
					// }
				}
			}
			if (Storageprops.enableblazestorageitem) {
				if (fuel.getItem() == GeneralItemRegistration.blazestorageitem) {
					return 21600;
				}
			}
			if (Storageprops.enablecoalstorageitem) {
				if (fuel.getItem() == GeneralItemRegistration.coalstorageitem) {
					return 12800;
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