package com.vanityblocks.Items;

import net.minecraft.item.Item;

import com.vanityblocks.VanityBlocks;

public class greenrupee extends Item {
	public String[] textureNames = new String[] { "greenrupee1" };

	public greenrupee(int par1) {
		super();
		setUnlocalizedName("greenrupee1");
		this.setTextureName("vanityblocks:greenrupee1");
		this.setHasSubtypes(true);
		setCreativeTab(VanityBlocks.tabvanityblocks);
	}
}
