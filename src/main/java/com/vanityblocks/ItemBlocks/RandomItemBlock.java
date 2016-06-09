package com.vanityblocks.ItemBlocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RandomItemBlock extends ItemBlock {

	public RandomItemBlock(Block id) {
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
			break;
		case 1:
			list.add("Has a speedboost if enabled in config.");
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		String name = "randomblock";
		switch (itemstack.getItemDamage()) {
		case 0: {
			name = "claybrick";
			break;
		}
		case 1: {
			name = "whitesoulsand";
			break;
		}
		case 2: {
			name = "lapisblockold";
			break;
		}
		case 3: {
			name = "lapisbrickold";
			break;
		}
		case 4: {
			name = "lapisbrickcurrent";
			break;
		}
		default:
			name = "Report_To_The_Author";
		}
		return getUnlocalizedName() + "." + name;
	}
}