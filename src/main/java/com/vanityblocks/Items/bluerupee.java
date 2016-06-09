package com.vanityblocks.Items;

import net.minecraft.item.Item;

import com.vanityblocks.VanityBlocks;

public class bluerupee extends Item {
	public String[] textureNames = new String[] { "bluerupee5" };

	public bluerupee(int par1) {
		super();
		setUnlocalizedName("bluerupee5");
		this.setTextureName("vanityblocks:bluerupee5");
		setCreativeTab(VanityBlocks.tabvanityblocks);
	}
}
