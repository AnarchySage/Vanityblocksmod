package com.vanityblocks.ItemBlocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class StorageItemModBlock extends ItemBlock {
	public StorageItemModBlock(Block block) {
		super(block);
		setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		String name = "modded blocks";
		switch (itemstack.getItemDamage()) {
		case 0: {
			name = "tinblock";
			break;
		}
		case 1: {
			name = "copperblock";
			break;
		}
		case 2: {
			name = "silverblock";
			break;
		}
		case 3: {
			name = "leadblock";
			break;
		}
		case 4: {
			name = "nikoliteblock";
			break;
		}
		case 5: {
			name = "nickelblock";
			break;
		}
		case 6: {
			name = "electrumblock";
			break;
		}
		case 7: {
			name = "platinumblock";
			break;
		}
		case 8: {
			name = "invarblock";
			break;
		}
		case 9: {
			name = "brassblock";
			break;
		}
		case 10: {
			name = "rubberblock";
			break;
		}
		default:
			name = "Report_To_The_Author";
		}
		return getUnlocalizedName() + "." + name;
	}

	@Override
	public int getMetadata(int par1) {
		return par1;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list,
			boolean par4) {
		switch (stack.getItemDamage()) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			list.add("Some mods call it Ferrous");
			break;
		case 6:
			break;
		case 7:
			list.add("Some mods call it Shiny");
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
		/*
		 * case 13: list.add("Some mods call it Shiny"); break; case 14:
		 * list.add("Some mods call it Shiny"); break; case 15:
		 * list.add("Some mods call it Shiny"); break; case 16:
		 * list.add("Some mods call it Shiny"); break;
		 */
		}
	}
}
