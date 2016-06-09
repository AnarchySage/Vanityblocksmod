/*
 *     public static final Block redstoneLampIdle = (new BlockRedstoneLight(123, false)).setHardness(0.3F).setStepSound(soundGlassFootstep).setUnlocalizedName("redstoneLight").setCreativeTab(CreativeTabs.tabRedstone).func_111022_d("redstone_lamp_off");
    public static final Block redstoneLampActive = (new BlockRedstoneLight(124, true)).setHardness(0.3F).setStepSound(soundGlassFootstep).setUnlocalizedName("redstoneLight").func_111022_d("redstone_lamp_on");
 */
package com.vanityblocks.Registrations;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.vanityblocks.Storageprops;
import com.vanityblocks.Blocks.RedstonedimLamps;
import com.vanityblocks.Blocks.RedstonelitLamps;
import com.vanityblocks.ItemBlocks.RedstoneLampDimItemBlock;
import com.vanityblocks.ItemBlocks.RedstoneLampLitItemBlock;

import cpw.mods.fml.common.registry.GameRegistry;

public class RedstoneLampRegistrations {

	public static void redstonelampregistration() {
		redstonelampdimconfig = Storageprops.redstonelampdimconfig;
		RedstoneLampDim = new RedstonedimLamps(redstonelampdimconfig, false);

		redstonelamplitconfig = Storageprops.redstonelamplitconfig;
		RedstoneLampLit = new RedstonelitLamps(redstonelamplitconfig, true);

		/* ##### Dim Lamps ##### */
		GameRegistry.registerBlock(RedstoneLampDim,
				RedstoneLampDimItemBlock.class, "Redstone Lamp Dim");
		GameRegistry.registerBlock(RedstoneLampLit,
				RedstoneLampLitItemBlock.class, "Redstone Lamp Lit");
	}

	public static void addRecipes() {
		// Recipes for Black Lamp
		GameRegistry.addShapelessRecipe(new ItemStack(RedstoneLampDim, 1, 0),
				new ItemStack(Blocks.redstone_lamp, 0), new ItemStack(
						Items.dye, 1, 0));
		// Recipes for Red Lamp
		GameRegistry.addShapelessRecipe(new ItemStack(RedstoneLampDim, 1, 1),
				new ItemStack(Blocks.redstone_lamp, 0), new ItemStack(
						Items.dye, 1, 1));
		// Recipes For Green Lamp
		GameRegistry.addShapelessRecipe(new ItemStack(RedstoneLampDim, 1, 2),
				new ItemStack(Blocks.redstone_lamp, 0), new ItemStack(
						Items.dye, 1, 2));
		// Recipes for Brown Lamp
		GameRegistry.addShapelessRecipe(new ItemStack(RedstoneLampDim, 1, 3),
				new ItemStack(Blocks.redstone_lamp, 0), new ItemStack(
						Items.dye, 1, 3));
		// Recipes for Blue Lamp
		GameRegistry.addShapelessRecipe(new ItemStack(RedstoneLampDim, 1, 4),
				new ItemStack(Blocks.redstone_lamp, 0), new ItemStack(
						Items.dye, 1, 4));
		// Recipes for Purple Lamp
		GameRegistry.addShapelessRecipe(new ItemStack(RedstoneLampDim, 1, 5),
				new ItemStack(Blocks.redstone_lamp, 0), new ItemStack(
						Items.dye, 1, 5));
		// Recipes for Pink Lamp
		GameRegistry.addShapelessRecipe(new ItemStack(RedstoneLampDim, 1, 6),
				new ItemStack(Blocks.redstone_lamp, 0), new ItemStack(
						Items.dye, 1, 9));
		// Recipes for Light Blue Lamp
		GameRegistry.addShapelessRecipe(new ItemStack(RedstoneLampDim, 1, 7),
				new ItemStack(Blocks.redstone_lamp, 0), new ItemStack(
						Items.dye, 1, 12));
		// Recipes for Magenta Lamp
		GameRegistry.addShapelessRecipe(new ItemStack(RedstoneLampDim, 1, 8),
				new ItemStack(Blocks.redstone_lamp, 0), new ItemStack(
						Items.dye, 1, 13));
	}

	public static Block RedstoneLampDim;
	public static int redstonelampdimconfig;
	public static Block RedstoneLampLit;
	public static int redstonelamplitconfig;
}
