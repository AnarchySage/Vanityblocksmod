package com.vanityblocks.Items;

import net.minecraft.item.Item;

import com.vanityblocks.VanityBlocks;

public class flintitem extends Item {
	public String[] textureNames = new String[] { "flintitem" };

	public flintitem(int par1) {
		super();
		setUnlocalizedName("flintitem");
		this.setTextureName("vanityblocks:flintitem");
		setCreativeTab(VanityBlocks.tabvanityblocks);
	}
}
