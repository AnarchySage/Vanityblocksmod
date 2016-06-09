package com.vanityblocks.ItemBlocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileItemBlock extends ItemBlock {

	private final static String[] subNames = { "Melting Core", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "" };

	public TileItemBlock(Block id) {
		super(id);
		setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int i) {
		return i;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list,
			boolean par4) {
		switch (stack.getItemDamage()) {
		case 0:
			list.add("Destroys Liquid and Items.");
			break;
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		String name = "tileentitys";
		switch (itemstack.getItemDamage()) {
		case 0: {
			name = "meltingcore";
			break;
		}
		default:
			name = "Report_To_The_Author";
		}
		return getUnlocalizedName() + "." + name;
	}
}