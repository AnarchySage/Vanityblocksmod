package com.vanityblocks.Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.vanityblocks.VanityBlocks;
import com.vanityblocks.WorldGen.VillageMine;

public class villagemineitem extends Item {
	public String[] textureNames = new String[] { "blazestorageitem" };

	public villagemineitem(int par1) {
		super();
		this.setHasSubtypes(true);
		this.setTextureName("vanityblocks:blazestorageitem");
		setCreativeTab(VanityBlocks.tabvanityblocks);
	}

	public boolean onItemUse(ItemStack par1ItemStack,
			EntityPlayer par2EntityPlayer, World par3World, int i, int j,
			int k, int par7, float par8, float par9, float par10) {
		return new VillageMine().generate(par3World, null, i, j - 13, k);

	}
}
