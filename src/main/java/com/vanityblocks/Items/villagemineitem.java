package com.vanityblocks.Items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.vanityblocks.VanityBlocks;
import com.vanityblocks.WorldGen.VillageMineItem;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class villagemineitem extends Item {
	public String[] textureNames = new String[] { "blazestorageitem" };

	public villagemineitem(int par1) {
		super();
		this.setHasSubtypes(true);
		setCreativeTab(VanityBlocks.tabvanityblocks);
	}

	public boolean onItemUse(ItemStack par1ItemStack,
			EntityPlayer par2EntityPlayer, World par3World, int i, int j,
			int k, int par7, float par8, float par9, float par10) {
		return new VillageMineItem().generate(par3World, null, i, j - 13, k);

	}

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		icons = new IIcon[2];

		for (int i = 0; i < icons.length; i++) {
			icons[i] = par1IconRegister
					.registerIcon("vanityblocks:blazestorageitem");
		}
	}
}
