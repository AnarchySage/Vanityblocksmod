package com.vanityblocks.Registrations;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.vanityblocks.Storageprops;
import com.vanityblocks.Blocks.HiddenTrapdoor;
import com.vanityblocks.Blocks.RandomBlocks;
import com.vanityblocks.ItemBlocks.RandomItemBlock;

import cpw.mods.fml.common.registry.GameRegistry;

public class RandomBlockRegistrations {

	public static void randomblockregistration() {
		randomblocksconfig = Storageprops.randomblocksconfig;
		RandomBlocks = new RandomBlocks(randomblocksconfig);

		/* ##### Vannila ##### */
		GameRegistry.registerBlock(RandomBlocks, RandomItemBlock.class,
				"Random Blocks");
	}

	public static void trapdoorregistration() {
		// Trapdoors = new VanityTrapDoors(trapdoorconfigs, Material.wood,
		// "textureName");
		hiddentrapdoor = new HiddenTrapdoor(Storageprops.trapdoorconfigs);
		hiddentrapdoor.setHardness(3.0F).setStepSound(Block.soundTypeWood)
				.setBlockName("trapdoor.hidden");
		GameRegistry.registerBlock(hiddentrapdoor, "hiddentrapdoor");
		GameRegistry.addShapelessRecipe(new ItemStack(hiddentrapdoor),
				new ItemStack(Blocks.trapdoor));
	}

	public static void addRecipes() {
		if (Storageprops.enableclaybrick) {
			GameRegistry
					.addRecipe(new ItemStack(RandomBlocks, 4, 0), new Object[] {
							"xx", "xx", 'x', new ItemStack(Blocks.clay) });
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.clay),
					new ItemStack(RandomBlocks, 1, 0));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.clay_ball, 4),
					new ItemStack(Blocks.clay));
			GameRegistry.addRecipe(new ItemStack(Items.clay_ball, 16),
					new Object[] { "xx", "xx", 'x',
							new ItemStack(RandomBlocks, 1, 0) });
			if (Storageprops.gregtechcompat) {
				OreDictionary.registerOre("blockClayBrick", new ItemStack(
						RandomBlocks, 1, 0));
			}
		}
		if (Storageprops.enablewhitesoulsand) {
			//GameRegistry.addShapelessRecipe(new ItemStack(RandomBlocks, 1, 1),
			//		new ItemStack(Blocks.soul_sand, 1), new ItemStack(
			//				Items.sugar, 1));
			GameRegistry.addRecipe(new ItemStack(RandomBlocks, 2, 1),
					new Object[] { " x ", "xyx", " x ", 'x', new ItemStack(Items.sugar), 
				'y', new ItemStack(Blocks.soul_sand)});
			}
		if (Storageprops.enableoldlapisblock) {
			GameRegistry.addRecipe(new ItemStack(RandomBlocks, 1, 2),
					new Object[] { "xx", "xx", 'x',
							new ItemStack(Items.dye, 1, 4) });
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 4, 4),
					new ItemStack(RandomBlocks, 1, 2));
			// ^old lapis block, \/ old lapis brick
			GameRegistry.addRecipe(new ItemStack(RandomBlocks, 4, 3),
					new Object[] { "xx", "xx", 'x',
							new ItemStack(RandomBlocks, 1, 2) });
			GameRegistry.addShapelessRecipe(new ItemStack(RandomBlocks, 1, 2),
					new ItemStack(RandomBlocks, 1, 3));
			// lapis brick current
			GameRegistry.addRecipe(new ItemStack(RandomBlocks, 1, 4),
					new Object[] { "xx", "xx", 'x',
							new ItemStack(Blocks.lapis_block) });
		}

	}

	public static Block RandomBlocks;
	public static Block hiddentrapdoor;
	public static int randomblocksconfig;
}