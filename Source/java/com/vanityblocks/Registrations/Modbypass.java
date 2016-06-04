package com.vanityblocks.Registrations;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Modbypass {
	public static void bypassrecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 8, 0),
				new ItemStack(Blocks.log, 1, 0),
				new ItemStack(Blocks.log, 1, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 8, 1),
				new ItemStack(Blocks.log, 1, 0),
				new ItemStack(Blocks.log, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 8, 2),
				new ItemStack(Blocks.log, 1, 0),
				new ItemStack(Blocks.log, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 8, 3),
				new ItemStack(Blocks.log, 1, 0),
				new ItemStack(Blocks.log, 1, 3));
	}
}
