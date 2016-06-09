package com.vanityblocks.Items;

import net.minecraft.item.Item;

import com.vanityblocks.VanityBlocks;

public class arrowstorageitem extends Item {
	public String[] textureNames = new String[] { "arrowstorageitem" };

	public arrowstorageitem(int par1) {
		super();
		setUnlocalizedName("arrowstorageitem");
		this.setTextureName("vanityblocks:arrowstorageitem");
		setCreativeTab(VanityBlocks.tabvanityblocks);
	}
}
