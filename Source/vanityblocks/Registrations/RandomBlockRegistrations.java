package vanityblocks.Registrations;

import vanityblocks.VanityRandomBlocks;
import vanityblocks.VanityRandomItemBlock;
import vanityblocks.Storageprops;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class RandomBlockRegistrations {

	public static void randomblockregistration() {
		randomblocksconfig = Storageprops.randomblocksconfig;
		RandomBlocks = new VanityRandomBlocks(randomblocksconfig);

		// String[] vannilastorageBlockNames = { "Sugar Cane Block",
		// "", "Enderpearl Block", "Slime Block",
		// "", "", "", "Leather Block",
		// "", "", "", "" };
		/* ##### Vannila ##### */
		GameRegistry.registerBlock(RandomBlocks,
				vanityblocks.VanityRandomItemBlock.class, "Random Blocks");
		LanguageRegistry.addName(new ItemStack(RandomBlocks, 1, 0),
				"Clay Brick");
		LanguageRegistry.addName(new ItemStack(RandomBlocks, 1, 1),
				"White Soul Sand");
		LanguageRegistry.addName(new ItemStack(RandomBlocks, 1, 2),
				"Lapis Block - Old");
		LanguageRegistry.addName(new ItemStack(RandomBlocks, 1, 3),
				"Lapis Brick - Old");
	}

	public static void addRecipes() {
		System.out.println("Random Block Registration loaded");
		if (Storageprops.enableclaybrick) {
			GameRegistry.addRecipe(new ItemStack(RandomBlocks, 4, 0),
					new Object[] { "xx", "xx", 'x',
							new ItemStack(Block.blockClay) });
			GameRegistry.addShapelessRecipe(new ItemStack(Block.blockClay),
					new ItemStack(RandomBlocks, 1, 0));
			GameRegistry.addShapelessRecipe(new ItemStack(Item.clay, 4),
					new ItemStack(Block.blockClay));
			GameRegistry.addRecipe(new ItemStack(Item.clay, 16), new Object[] {
					"xx", "xx", 'x', new ItemStack(RandomBlocks, 1, 0) });
			if (Storageprops.gregtechcompat) {
				OreDictionary.registerOre("blockClayBrick", new ItemStack(
						RandomBlocks, 1, 0));
			}
		}
		if (Storageprops.enablewhitesoulsand) {
			GameRegistry.addShapelessRecipe(new ItemStack(RandomBlocks, 1, 1),
					new ItemStack(Block.slowSand, 1), new ItemStack(Item.sugar,
							1));
		}
		if (Storageprops.enableoldlapisblock) {
			GameRegistry.addRecipe(new ItemStack(RandomBlocks, 1, 2),
					new Object[] { "xx", "xx", 'x',
							new ItemStack(Item.dyePowder, 1, 4) });
			GameRegistry.addShapelessRecipe(
					new ItemStack(Item.dyePowder, 4, 4), new ItemStack(
							RandomBlocks, 1, 2));
			// ^old lapis block, \/ old lapis brick 
			GameRegistry.addRecipe(new ItemStack(RandomBlocks, 4, 3),
					new Object[] { "xx", "xx", 'x',
							new ItemStack(RandomBlocks, 1, 2) });
			GameRegistry.addShapelessRecipe(
					new ItemStack(RandomBlocks, 1, 2), new ItemStack(
							RandomBlocks, 1, 3));
		}

	}

	public static Block RandomBlocks;
	public static int randomblocksconfig;
}