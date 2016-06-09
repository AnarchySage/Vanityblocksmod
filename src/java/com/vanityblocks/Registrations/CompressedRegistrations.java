package com.vanityblocks.Registrations;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import com.vanityblocks.Storageprops;
import com.vanityblocks.Blocks.CompressBlocks;
import com.vanityblocks.ItemBlocks.CompressItemBlock;

import cpw.mods.fml.common.registry.GameRegistry;

public class CompressedRegistrations {
	public static final String modid = "vanityblocks";

	public static void compressblockregistration() {
		compressblocksconfig = Storageprops.compressblocksconfig;
		CompressBlocks = new CompressBlocks(compressblocksconfig);

		String[] randomblocknames = { "9X Compressed CobblesStone",
				"81X Compressed CobblesStone", "729X Compressed CobblesStone",
				"9X Compressed Dirt", "81X Compressed Dirt",
				"729X Compressed Dirt", "9X Compressed Sand",
				"81X Compressed Sand", "729X Compressed Sand",
				"9X Compressed Gravel", "81X Compressed Gravel",
				"729X Compressed Gravel", "", "", "", "" };
		/* ##### Vannila ##### */
		GameRegistry.registerBlock(CompressBlocks, CompressItemBlock.class,
				modid + (CompressBlocks.getUnlocalizedName().substring(2)));
	}

	public static void addRecipes() {
		// Cobble
		GameRegistry.addRecipe(new ItemStack(CompressBlocks, 1, 0),
				new Object[] { "xxx", "xxx", "xxx", 'x',
						new ItemStack(Blocks.cobblestone) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 9),
				new ItemStack(CompressBlocks, 1, 0));

		GameRegistry.addRecipe(new ItemStack(CompressBlocks, 1, 1),
				new Object[] { "xxx", "xxx", "xxx", 'x',
						new ItemStack(CompressBlocks, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(CompressBlocks, 9, 0),
				new ItemStack(CompressBlocks, 1, 1));

		GameRegistry.addRecipe(new ItemStack(CompressBlocks, 1, 2),
				new Object[] { "xxx", "xxx", "xxx", 'x',
						new ItemStack(CompressBlocks, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(CompressBlocks, 9, 1),
				new ItemStack(CompressBlocks, 1, 2));
		/* Dirt */
		GameRegistry.addRecipe(new ItemStack(CompressBlocks, 1, 3),
				new Object[] { "xxx", "xxx", "xxx", 'x',
						new ItemStack(Blocks.dirt) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.dirt, 9),
				new ItemStack(CompressBlocks, 1, 3));

		GameRegistry.addRecipe(new ItemStack(CompressBlocks, 1, 4),
				new Object[] { "xxx", "xxx", "xxx", 'x',
						new ItemStack(CompressBlocks, 1, 3) });
		GameRegistry.addShapelessRecipe(new ItemStack(CompressBlocks, 9, 3),
				new ItemStack(CompressBlocks, 1, 4));

		GameRegistry.addRecipe(new ItemStack(CompressBlocks, 1, 5),
				new Object[] { "xxx", "xxx", "xxx", 'x',
						new ItemStack(CompressBlocks, 1, 4) });
		GameRegistry.addShapelessRecipe(new ItemStack(CompressBlocks, 9, 4),
				new ItemStack(CompressBlocks, 1, 5));
		/* Sand */
		GameRegistry.addRecipe(new ItemStack(CompressBlocks, 1, 6),
				new Object[] { "xxx", "xxx", "xxx", 'x',
						new ItemStack(Blocks.sand) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sand, 9),
				new ItemStack(CompressBlocks, 1, 6));

		GameRegistry.addRecipe(new ItemStack(CompressBlocks, 1, 7),
				new Object[] { "xxx", "xxx", "xxx", 'x',
						new ItemStack(CompressBlocks, 1, 6) });
		GameRegistry.addShapelessRecipe(new ItemStack(CompressBlocks, 9, 6),
				new ItemStack(CompressBlocks, 1, 7));

		GameRegistry.addRecipe(new ItemStack(CompressBlocks, 1, 8),
				new Object[] { "xxx", "xxx", "xxx", 'x',
						new ItemStack(CompressBlocks, 1, 7) });
		GameRegistry.addShapelessRecipe(new ItemStack(CompressBlocks, 9, 7),
				new ItemStack(CompressBlocks, 1, 8));
		/* Gravel */
		GameRegistry.addRecipe(new ItemStack(CompressBlocks, 1, 9),
				new Object[] { "xxx", "xxx", "xxx", 'x',
						new ItemStack(Blocks.gravel) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.gravel, 9),
				new ItemStack(CompressBlocks, 1, 9));

		GameRegistry.addRecipe(new ItemStack(CompressBlocks, 1, 10),
				new Object[] { "xxx", "xxx", "xxx", 'x',
						new ItemStack(CompressBlocks, 1, 9) });
		GameRegistry.addShapelessRecipe(new ItemStack(CompressBlocks, 9, 9),
				new ItemStack(CompressBlocks, 1, 10));

		GameRegistry.addRecipe(new ItemStack(CompressBlocks, 1, 11),
				new Object[] { "xxx", "xxx", "xxx", 'x',
						new ItemStack(CompressBlocks, 1, 10) });
		GameRegistry.addShapelessRecipe(new ItemStack(CompressBlocks, 9, 10),
				new ItemStack(CompressBlocks, 1, 11));
	}

	public static Block CompressBlocks;
	public static int compressblocksconfig;
}