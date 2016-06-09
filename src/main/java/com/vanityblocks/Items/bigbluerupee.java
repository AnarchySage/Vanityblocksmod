package com.vanityblocks.Items;

import net.minecraft.item.Item;

import com.vanityblocks.VanityBlocks;

public class bigbluerupee extends Item {
	public String[] textureNames = new String[] { "bigbluerupee100" };

	public bigbluerupee(int par1) {
		super();
		setUnlocalizedName("bigbluerupee100");
		this.setTextureName("vanityblocks:bigbluerupee100");
		setCreativeTab(VanityBlocks.tabvanityblocks);
	}
}
