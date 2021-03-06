package com.vanityblocks.Items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.vanityblocks.VanityBlocks;

public class stonepolishitem extends Item {
	public String[] textureNames = new String[] { "stonepolishitem" };

	public stonepolishitem(int par1) {
		super();
		setUnlocalizedName("stonepolishitem");
		setMaxStackSize(1);
		this.setTextureName("vanityblocks:stonepolishitem");
		setNoRepair();
		setMaxDamage(60); // how often is it usable? now 128
		setCreativeTab(VanityBlocks.tabvanityblocks);
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
		stack.setItemDamage(stack.getItemDamage() + 1);
		stack.stackSize = 1;
		return stack;
	}
}
