package com.vanityblocks.Items;

import net.minecraft.item.Item;

import com.vanityblocks.VanityBlocks;

public class blazestorageitem extends Item {
	public String[] textureNames = new String[] { "blazestorageitem" };

	public blazestorageitem(int par1) {
		super();
		setUnlocalizedName("blazestorageitem");
		this.setTextureName("vanityblocks:blazestorageitem");
		setCreativeTab(VanityBlocks.tabvanityblocks);
	}
}