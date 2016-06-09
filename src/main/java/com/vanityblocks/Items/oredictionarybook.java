package com.vanityblocks.Items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.vanityblocks.VanityBlocks;

public class oredictionarybook extends Item {
	public String[] textureNames = new String[] { "oredictionarybook" };

	public oredictionarybook(int par1) {
		super();
		this.setUnlocalizedName("oredictionarybook");
		this.setTextureName("vanityblocks:orediction_book");
		//this.setNoRepair();
		this.setMaxStackSize(1);
		this.setCreativeTab(VanityBlocks.tabvanityblocks);
	}
	@Override
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack) {
		return false;
	}

	@Override
	public boolean getShareTag() {
		return true;
	}

	public boolean hasContainerItem(ItemStack itemStack) {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		ItemStack stack = itemStack.copy();
		//stack.setItemDamage(stack.getItemDamage() + 1);
		stack.stackSize = 1;
		return stack;
	}
}
