package com.vanityblocks.Items;

import net.minecraft.item.Item;

import com.vanityblocks.VanityBlocks;

public class bigredrupee extends Item {
	public String[] textureNames = new String[] { "bigredrupee200" };

	public bigredrupee(int par1) {
		super();
		setUnlocalizedName("bigredrupee200");
		this.setTextureName("vanityblocks:bigredrupee200");
		setCreativeTab(VanityBlocks.tabvanityblocks);
	}
}
