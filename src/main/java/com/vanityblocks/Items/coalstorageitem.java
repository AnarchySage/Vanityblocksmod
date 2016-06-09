package com.vanityblocks.Items;

import net.minecraft.item.Item;

import com.vanityblocks.VanityBlocks;

public class coalstorageitem extends Item {
	public String[] textureNames = new String[] { "coalstorageitem" };

	public coalstorageitem(int par1) {
		super();
		setUnlocalizedName("coalstorageitem");
		this.setTextureName("vanityblocks:coalstorageitem");
		setCreativeTab(VanityBlocks.tabvanityblocks);
	}
}
