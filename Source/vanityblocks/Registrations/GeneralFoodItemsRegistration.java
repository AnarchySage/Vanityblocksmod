package vanityblocks.Registrations;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.potion.Potion;
import net.minecraftforge.oredict.OreDictionary;
import vanityblocks.Storageprops;
import vanityblocks.Items.Mugitems.*;
//import vanityblocks.Items.Mugitems.emptymug;
//import vanityblocks.Items.ClayMugItem;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class GeneralFoodItemsRegistration {
	public static Item unfiredmug;
	public static Item emptymug;
	public static Item mugwater;
	public static Item mugwaterhot;
	public static Item mugwaterhotchoco;
	public static Item mugwaterhotchocosugar;
	public static Item mugmilk;
	public static Item mugmilkhot;
	public static Item mugmilkhotchoco;
	public static Item mugmilkhotchocosugar;

	/*
	 * Potion.waterBreathing.id for fish item
	 */
	public static void generalitemregistration() {
		if (Storageprops.enableclaymugstuff) {
			// For info, 1.25s per heart with regen
			unfiredmug = new unfiredmug(Storageprops.mugunfired - 256)
					.setUnlocalizedName("unfiremug");
			LanguageRegistry.addName(unfiredmug, "Unfired Mug");
			emptymug = new emptymug(Storageprops.emptymug - 256)
					.setUnlocalizedName("emptymug");
			LanguageRegistry.addName(emptymug, "Empty Mug");
			mugwater = new mugwater(Storageprops.mugwater - 256, 2)
					.setUnlocalizedName("mugwater");
			LanguageRegistry.addName(mugwater, "Mug with water");
			mugwaterhot = new mugwaterhot(Storageprops.mugwaterhot - 256, 2)
					.setUnlocalizedName("mugwaterhot");
			LanguageRegistry.addName(mugwaterhot, "Mug with hot water");
			mugwaterhotchoco = new mugwaterhotchoco(
					Storageprops.mugwaterhotchoco - 256, 2)
					.setUnlocalizedName("mugwaterchoco");
			LanguageRegistry.addName(mugwaterhotchoco,
					"Hot Chocolate with water");
			mugwaterhotchocosugar = new mugwaterhotchocosugar(
					Storageprops.mugwaterhotchocosugar - 256, 2)
					.setUnlocalizedName("mugwaterchocosugar");
			LanguageRegistry.addName(mugwaterhotchocosugar,
					"Sweetend Hot Chocolate with water");
			mugmilk = new mugmilk(Storageprops.mugmilk - 256, 2)
					.setUnlocalizedName("mugmilk");
			LanguageRegistry.addName(mugmilk, "Mug with milk");
			mugmilkhot = new mugmilkhot(Storageprops.mugmilkhot - 256, 2)
					.setUnlocalizedName("mugmilkhot");
			LanguageRegistry.addName(mugmilkhot, "Mug with hot milk");
			mugmilkhotchoco = new mugmilkhotchoco(
					Storageprops.mugmilkhotchoco - 256, 2)
					.setUnlocalizedName("mugmilkchoco");
			LanguageRegistry
					.addName(mugmilkhotchoco, "Hot Chocolate with milk");
			mugmilkhotchocosugar = new mugmilkhotchocosugar(
					Storageprops.mugmilkhotchocosugar - 256, 2)
					.setUnlocalizedName("mugmilkchocosugar");
			LanguageRegistry.addName(mugmilkhotchocosugar,
					"Sweetend Hot Chocolate with milk");
		}
	}

	public static void additemrecipes() {
		if (Storageprops.enableclaymugstuff) {
			GameRegistry.addRecipe(new ItemStack(unfiredmug), "x x", " x ",
					'x', new ItemStack(Item.clay, 1)); // Basic mug unfired
			FurnaceRecipes.smelting().addSmelting(unfiredmug.itemID, 0,
					new ItemStack(emptymug, 1), 0.0f); // to cook unfired into
														// Empty mug

			/*
			 * This is the code that turns empty mug into water based items
			 */
			GameRegistry.addShapelessRecipe(new ItemStack(mugwater),
					new ItemStack(emptymug), new ItemStack(Item.bucketWater));
			FurnaceRecipes.smelting().addSmelting(mugwater.itemID, 0,
					new ItemStack(mugwaterhot, 1), 0.0f);
			GameRegistry.addShapelessRecipe(new ItemStack(mugwaterhotchoco),
					new ItemStack(mugwaterhot), new ItemStack(Item.dyePowder,
							1, 3));
			GameRegistry.addShapelessRecipe(
					new ItemStack(mugwaterhotchocosugar), new ItemStack(
							mugwaterhotchoco), new ItemStack(Item.sugar));
			GameRegistry.addShapelessRecipe(
					new ItemStack(mugwaterhotchocosugar), new ItemStack(
							mugwaterhot), new ItemStack(Item.sugar),
					new ItemStack(Item.dyePowder, 1, 3));

			/*
			 * This is the code that turns empty mug into milk based items
			 */
			GameRegistry.addShapelessRecipe(new ItemStack(mugmilk),
					new ItemStack(emptymug), new ItemStack(Item.bucketMilk));
			FurnaceRecipes.smelting().addSmelting(mugmilk.itemID, 0,
					new ItemStack(mugmilkhot, 1), 0.0f);
			GameRegistry.addShapelessRecipe(new ItemStack(mugmilkhotchoco),
					new ItemStack(mugmilkhot), new ItemStack(Item.dyePowder, 1,
							3));
			GameRegistry.addShapelessRecipe(
					new ItemStack(mugmilkhotchocosugar), new ItemStack(
							mugmilkhotchoco), new ItemStack(Item.sugar));
			GameRegistry.addShapelessRecipe(
					new ItemStack(mugmilkhotchocosugar), new ItemStack(
							mugmilkhot), new ItemStack(Item.sugar),
					new ItemStack(Item.dyePowder, 1, 3));
		}
	}
}