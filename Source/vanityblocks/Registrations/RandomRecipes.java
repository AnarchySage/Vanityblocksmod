package vanityblocks.Registrations;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import vanityblocks.Storageprops;
import cpw.mods.fml.common.registry.GameRegistry;

public class RandomRecipes {
	public static void addRandomRecipes() {

		/* This is Random Recipes */
		if (Storageprops.arrowtofeather) {
			GameRegistry.addRecipe(new ItemStack(Item.feather, 1), "xx", "xx",
					'x', new ItemStack(Item.arrow, 1));
		}
		if (Storageprops.fleshtoleather) {
			GameRegistry.addSmelting(Item.rottenFlesh.itemID, new ItemStack(
					Item.leather, 1), 0.5F);
		}
		if (Storageprops.quartzblocktoquartz) {
			GameRegistry.addShapelessRecipe(
					new ItemStack(Item.netherQuartz, 4), new ItemStack(
							Block.blockNetherQuartz));
		}
		if (Storageprops.greendye) {
			GameRegistry.addShapelessRecipe(
					new ItemStack(Item.dyePowder, 1, 2), new ItemStack(
							Item.dyePowder, 1, 4), new ItemStack(
							Item.dyePowder, 1, 11));
		}
		if (Storageprops.wooltostring) {
			GameRegistry.addShapelessRecipe(new ItemStack(Item.silk, 4),
					new ItemStack(Block.cloth, 1, Short.MAX_VALUE));
			// Short.Maxvalue is required to use any meta in the block
		}
		if (Storageprops.magmacreamtoslime) {
			GameRegistry.addShapelessRecipe(new ItemStack(Item.slimeBall, 1),
					new ItemStack(Item.magmaCream, 1));
		}
		if (Storageprops.saddletoleather) {
			GameRegistry.addShapelessRecipe(new ItemStack(Item.leather, 5),
					new ItemStack(Item.saddle, 1));
		}
		if (Storageprops.nametag) {
			GameRegistry.addShapelessRecipe(
			// This is the nametag, update field when they add it
					new ItemStack(Item.field_111212_ci, 1), new ItemStack(
							Item.sign), new ItemStack(Item.silk));
		}
		if (Storageprops.ironhorsearmor) {
			// This is the iron horse armor, change feild when they update
			GameRegistry.addRecipe(new ItemStack(Item.field_111215_ce, 1),
					"xxx", "xxx", "x x", 'x', new ItemStack(Item.ingotIron));
		}
		if (Storageprops.goldhorsearmor) {
			//this is gold horse armor, change when they update it
			GameRegistry.addRecipe(new ItemStack(Item.field_111216_cf, 1),
					"xxx", "xxx", "x x", 'x', new ItemStack(Item.ingotGold));
		}
		if (Storageprops.diamondhorsearmor) {
			//this is gold horse armor, change when they update it
			GameRegistry.addRecipe(new ItemStack(Item.field_111213_cg, 1),
					"xxx", "xxx", "x x", 'x', new ItemStack(Item.diamond));
		}
	}
}