package com.vanityblocks.Items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.vanityblocks.VanityBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class stonepolishitem extends Item {
	public String[] textureNames = new String[] { "stonepolishitem" };

	public stonepolishitem(int par1) {
		super();
		setUnlocalizedName("stonepolishitem");
		setMaxStackSize(1);
		this.setTextureName("vanityblocks:stonepolishitem");
		setNoRepair();
		setMaxDamage(60); // how often is it usable? now 128
		setCreativeTab(VanityBlocks.tabvanityblocks);
	}
	@Override
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack) {
		return false;
	}

	@Override
	public boolean getShareTag() {
		return true;
	}

	public boolean hasContainerItem(ItemStack itemStack) {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		ItemStack stack = itemStack.copy();
		stack.setItemDamage(stack.getItemDamage() + 1);
		stack.stackSize = 1;
		return stack;
	}

	/*
	 * @SideOnly(Side.CLIENT)
	private IIcon[] icons;

	//@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		icons = new IIcon[2];

		for (int i = 0; i < icons.length; i++) {
			icons[i] = par1IconRegister
					.registerIcon("vanityblocks:stonepolishitem");
		}
	}
	/*If i use this, 
	 * @Override
	public IIcon getIconFromDamage(int par1) {
		return icons[par1];
	}*/
}
