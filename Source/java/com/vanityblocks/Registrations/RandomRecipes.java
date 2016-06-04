package com.vanityblocks.Registrations;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.vanityblocks.Storageprops;

import cpw.mods.fml.common.registry.GameRegistry;

public class RandomRecipes {
	public static void addRandomRecipes() {

		/* This is Random Recipes */
		if (Storageprops.arrowtofeather) {
			GameRegistry.addRecipe(new ItemStack(Items.feather, 1), "xx", "xx",
					'x', new ItemStack(Items.arrow, 1));
		}
		if (Storageprops.fleshtoleather) {
			GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(
					Items.leather, 1), 0.5F);
		}
		if (Storageprops.quartzblocktoquartz) {
			GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 4),
					new ItemStack(Blocks.quartz_block));
		}
		if (Storageprops.greendye) {
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 2),
					new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1,
							11));
		}
		if (Storageprops.wooltostring) {
			GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4),
					new ItemStack(Blocks.wool, 1, Short.MAX_VALUE));
			// Short.Maxvalue is required to use any meta in the block
		}
		if (Storageprops.magmacreamtoslime) {
			GameRegistry.addShapelessRecipe(new ItemStack(Items.slime_ball, 1),
					new ItemStack(Items.magma_cream, 1));
		}
		if (Storageprops.saddletoleather) {
			GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 5),
					new ItemStack(Items.saddle, 1));
		}
		if (Storageprops.nametag) {
			GameRegistry.addShapelessRecipe(new ItemStack(Items.name_tag, 1),
					new ItemStack(Items.sign), new ItemStack(Items.string));
		}
		if (Storageprops.ironhorsearmor) {
			GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor, 1),
					"xxx", "xxx", "x x", 'x', new ItemStack(Items.iron_ingot));
		}
		if (Storageprops.goldhorsearmor) {
			GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor, 1),
					"xxx", "xxx", "x x", 'x', new ItemStack(Items.gold_ingot));
		}
		if (Storageprops.diamondhorsearmor) {
			GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor, 1),
					"xxx", "xxx", "x x", 'x', new ItemStack(Items.diamond));
		}
	}
}