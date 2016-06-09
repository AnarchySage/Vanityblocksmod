package com.vanityblocks.Items;

import net.minecraft.item.Item;

import com.vanityblocks.VanityBlocks;

public class redrupee extends Item {
	public String[] textureNames = new String[] { "redrupee20" };

	public redrupee(int par1) {
		super();
		this.setHasSubtypes(true);
		setUnlocalizedName("redrupee20");
		this.setTextureName("vanityblocks:redrupee20");
		setCreativeTab(VanityBlocks.tabvanityblocks);
	}
}
