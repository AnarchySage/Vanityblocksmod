package vanityblocks.Registrations;

import vanityblocks.Storageprops;
import vanityblocks.Blocks.ForestryBlock;
import vanityblocks.Blocks.StorageBlock;
import vanityblocks.Blocks.StorageBlockMod;
import vanityblocks.ItemBlocks.StorageItemBlock;
import vanityblocks.ItemBlocks.StorageItemForestryBlock;
import vanityblocks.ItemBlocks.StorageItemModBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class StorageBlocksRegistration {

	public static void blockregistration() {
		StorageBlockId = Storageprops.storageblockconfig;
		StorageBlock = new StorageBlock(StorageBlockId);
		StorageBlockModId = Storageprops.storageblockmodconfig;
		StorageBlockMod = new StorageBlockMod(StorageBlockModId);
		ForestryBlockId = Storageprops.forestryblockconfig;
		ForestryBlock = new ForestryBlock(ForestryBlockId);

		String[] vannilastorageBlockNames = { "Sugar Cane Block",
				"Charcoal Block", "Enderpearl Block", "Slime Block",
				"Sugar Block", "Cocoa Block", "", "Leather Block",
				"Bone Block", "", "", "" };
		String[] modstorageBlockNames = { "Tin Block", "Copper Block",
				"Silver Block", "Lead Block", "Nikolite Block", "Nickel Block",
				"Electrum Block", "Platinum Block", "Invar Block",
				"Brass Block", "Rubber Block", "", "" };
		String[] forestrystorageBlockNames = { "Apatite Block", "Honey Block",
				"Honeydew Block", "Peat Block", "", "", "", "", "", "", "", "" };
		/* ##### Vannila ##### */
		GameRegistry.registerBlock(StorageBlock,
				vanityblocks.ItemBlocks.StorageItemBlock.class, "Vannila Storage Block");
		LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 0),
				"Charcoal block");
		LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 1),
				"Ender pearl block");
		LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 2),
				"Slime block");
		LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 3),
				"Sugar Block");
		LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 4),
				"Cocoa chunk");
		LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 5),
				"Sugar Cane Block");
		LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 6),
				"Leather Block");
		LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 7),
				"Bone Block");
		/* ########### Modded #### */
		GameRegistry.registerBlock(StorageBlockMod,
				vanityblocks.ItemBlocks.StorageItemModBlock.class, "Modded Storage Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 0),
				"Tin Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 1),
				"Coppper Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 2),
				"Silver Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 3),
				"Lead Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 4),
				"Nikolite Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 5),
				"Nickel Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 6),
				"Electrum Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 7),
				"Platinum Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 8),
				"Invar Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 9),
				"Brass Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 10),
				"Rubber Block");
	}

	public static void addVanillaRecipes() {
		System.out.println("Block Registration loaded");
		/* ############### Vannila Storage blocking ####### */
		if (Storageprops.enablecharcoal) {
			GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 0), "xxx",
					"xxx", "xxx", 'x', new ItemStack(Item.coal, 1, 1));
			GameRegistry.addShapelessRecipe(new ItemStack(Item.coal, 9, 1),
					new ItemStack(StorageBlock, 1, 0));
			if (Storageprops.gregtechcompat) {
				OreDictionary.registerOre("blockCharcoal", new ItemStack(
						StorageBlock, 1, 0));
			}
		}
		if (Storageprops.enableenderpearl) {
			GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 1), "xxx",
					"xxx", "xxx", 'x', new ItemStack(Item.enderPearl));
			GameRegistry.addShapelessRecipe(new ItemStack(Item.enderPearl, 9),
					new ItemStack(StorageBlock, 1, 1));
			if (Storageprops.gregtechcompat) {
				OreDictionary.registerOre("blockEnderpearl", new ItemStack(
						StorageBlock, 1, 1));
			}
		}
		if (Storageprops.enableslime) {
			GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 2), "xxx",
					"xxx", "xxx", 'x', new ItemStack(Item.slimeBall));
			GameRegistry.addShapelessRecipe(new ItemStack(Item.slimeBall, 9),
					new ItemStack(StorageBlock, 1, 2));
			if (Storageprops.gregtechcompat) {
				OreDictionary.registerOre("blockSlime", new ItemStack(
						StorageBlock, 1, 2));
			}
		}
		if (Storageprops.enablesugar) {
			GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 3), "xxx",
					"xxx", "xxx", 'x', new ItemStack(Item.sugar));
			GameRegistry.addShapelessRecipe(new ItemStack(Item.sugar, 9),
					new ItemStack(StorageBlock, 1, 3));
			if (Storageprops.gregtechcompat) {
				OreDictionary.registerOre("blockSugar", new ItemStack(
						StorageBlock, 1, 3));
			}
		}
		if (Storageprops.enablecocoa) {
			GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 4), "xxx",
					"xxx", "xxx", 'x', new ItemStack(Item.dyePowder, 1, 3));
			GameRegistry.addShapelessRecipe(
					new ItemStack(Item.dyePowder, 9, 3), new ItemStack(
							StorageBlock, 1, 4));
			if (Storageprops.gregtechcompat) {
				OreDictionary.registerOre("blockCocoa", new ItemStack(
						StorageBlock, 1, 4));
			}
		}
		if (Storageprops.enablesugarcane) {
			GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 5), "xxx",
					"xxx", "xxx", 'x', new ItemStack(Item.reed));
			GameRegistry.addShapelessRecipe(new ItemStack(Item.reed, 9),
					new ItemStack(StorageBlock, 1, 5));
			if (Storageprops.gregtechcompat) {
				OreDictionary.registerOre("blockSugarCane", new ItemStack(
						StorageBlock, 1, 5));
			}
		}
		if (Storageprops.enableenderpearl) {
			if (Storageprops.dragoneggrecipe) {
				GameRegistry.addRecipe(new ItemStack(Block.dragonEgg, 1),
						new Object[] { "xxx", "xyx", "xxx", 'x',
								new ItemStack(StorageBlock, 1, 1), 'y',
								Item.egg });
			}
		}
		// if (Storageprops.enableblaze) {
		// GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 6), new Object
		// [] {"xxx", "xxx", "xxx", 'x', new ItemStack(Item.blazeRod)});
		// GameRegistry.addShapelessRecipe(new ItemStack(Item.blazeRod, 9), new
		// ItemStack(StorageBlock,1,6));
		// if (Storageprops.gregtechcompat) {
		// OreDictionary.registerOre("blockBlazerod", new
		// ItemStack(StorageBlock,1,6));
		// }
		// }
		if (Storageprops.enableleather) {
			GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 6),
					new Object[] { "xxx", "xxx", "xxx", 'x',
							new ItemStack(Item.leather) });
			GameRegistry.addShapelessRecipe(new ItemStack(Item.leather, 9),
					new ItemStack(StorageBlock, 1, 6));
			if (Storageprops.gregtechcompat) {
				OreDictionary.registerOre("blockLeather", new ItemStack(
						StorageBlock, 1, 7));
			}
		}
		if (Storageprops.enablebone) {
			GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 7),
					new Object[] { "xxx", "xxx", "xxx", 'x',
							new ItemStack(Item.bone) });
			GameRegistry.addShapelessRecipe(new ItemStack(Item.bone, 9),
					new ItemStack(StorageBlock, 1, 7));
			if (Storageprops.gregtechcompat) {
				OreDictionary.registerOre("blockBone", new ItemStack(
						StorageBlock, 1, 8));
			}
		}
		// if (Storageprops.enableclaybrick) {
		// GameRegistry.addRecipe(new ItemStack(StorageBlock, 4, 9), new Object
		// [] {"xx", "xx", 'x', new ItemStack(Block.blockClay)});
		// GameRegistry.addShapelessRecipe(new ItemStack(Block.blockClay), new
		// ItemStack(StorageBlock,1,9));
		// GameRegistry.addShapelessRecipe(new ItemStack(Item.clay,4), new
		// ItemStack(Block.blockClay));
		// GameRegistry.addRecipe(new ItemStack(Item.clay,16), new Object []
		// {"xx", "xx", 'x', new ItemStack(StorageBlock, 1, 9)});
		// if (Storageprops.gregtechcompat) {
		// OreDictionary.registerOre("blockClayBrick", new
		// ItemStack(StorageBlock,1,9));
		// }
		// }
	}

	public static void addModRecipes() {
		/* ############### Modded Storage blocks ############ */
		if (Storageprops.enabletin) {
			if (!OreDictionary.getOres("ingotTin").isEmpty()) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(
						StorageBlockMod, 1, 0), "xxx", "xxx", "xxx", 'x',
						"ingotTin"));
				ItemStack tiningot;
				tiningot = OreDictionary.getOres("ingotTin").get(0);
				ItemStack result = tiningot.copy();
				result.stackSize = 9;
				GameRegistry.addShapelessRecipe(result, new ItemStack(
						StorageBlockMod, 1, 0));
				if (Storageprops.gregtechcompat) {
					OreDictionary.registerOre("blockTin", new ItemStack(
							StorageBlockMod, 1, 0));
				}
			}
		}
		if (Storageprops.enablecopper) {
			if (!OreDictionary.getOres("ingotCopper").isEmpty()) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(
						StorageBlockMod, 1, 1), "xxx", "xxx", "xxx", 'x',
						"ingotCopper"));
				ItemStack copperingot;
				copperingot = OreDictionary.getOres("ingotCopper").get(0);
				ItemStack result = copperingot.copy();
				result.stackSize = 9;
				GameRegistry.addShapelessRecipe(result, new ItemStack(
						StorageBlockMod, 1, 1));
				if (Storageprops.gregtechcompat) {
					OreDictionary.registerOre("blockCopper", new ItemStack(
							StorageBlockMod, 1, 1));
				}
			}
		}
		if (Storageprops.enablesilver) {
			if (!OreDictionary.getOres("ingotSilver").isEmpty()) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(
						StorageBlockMod, 1, 2), "xxx", "xxx", "xxx", 'x',
						"ingotSilver"));
				ItemStack silveringot;
				silveringot = OreDictionary.getOres("ingotSilver").get(0);
				ItemStack result = silveringot.copy();
				result.stackSize = 9;
				GameRegistry.addShapelessRecipe(result, new ItemStack(
						StorageBlockMod, 1, 2));
				if (Storageprops.gregtechcompat) {
					OreDictionary.registerOre("blockSilver", new ItemStack(
							StorageBlockMod, 1, 2));
				}
			}
		}
		if (Storageprops.enablelead) {
			if (!OreDictionary.getOres("ingotLead").isEmpty()) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(
						StorageBlockMod, 1, 3), "xxx", "xxx", "xxx", 'x',
						"ingotLead"));
				ItemStack leadingot;
				leadingot = OreDictionary.getOres("ingotLead").get(0);
				ItemStack result = leadingot.copy();
				result.stackSize = 9;
				GameRegistry.addShapelessRecipe(result, new ItemStack(
						StorageBlockMod, 1, 3));
				if (Storageprops.gregtechcompat) {
					OreDictionary.registerOre("blockLead", new ItemStack(
							StorageBlockMod, 1, 3));
				}
			}
		}
		if (Storageprops.enablenikolite) {
			if (!OreDictionary.getOres("dustNikolite").isEmpty()) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(
						StorageBlockMod, 1, 4), "xxx", "xxx", "xxx", 'x',
						"dustNikolite"));
				ItemStack nikolite;
				nikolite = OreDictionary.getOres("dustNikolite").get(0);
				ItemStack result = nikolite.copy();
				result.stackSize = 9;
				GameRegistry.addShapelessRecipe(result, new ItemStack(
						StorageBlockMod, 1, 4));
				if (Storageprops.gregtechcompat) {
					OreDictionary.registerOre("blockNikolite", new ItemStack(
							StorageBlockMod, 1, 4));
				}
			}
		}
		if (Storageprops.enablenickel) {
			if (!OreDictionary.getOres("ingotNickel").isEmpty()) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(
						StorageBlockMod, 1, 5), "xxx", "xxx", "xxx", 'x',
						"ingotNickel"));
				ItemStack nickelingot;
				nickelingot = OreDictionary.getOres("ingotNickel").get(0);
				ItemStack result = nickelingot.copy();
				result.stackSize = 9;
				GameRegistry.addShapelessRecipe(result, new ItemStack(
						StorageBlockMod, 1, 5));
				if (Storageprops.gregtechcompat) {
					OreDictionary.registerOre("blockNickel", new ItemStack(
							StorageBlockMod, 1, 5));
				}
			}
		}
		if (Storageprops.enableelectrum) {
			if (!OreDictionary.getOres("ingotElectrum").isEmpty()) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(
						StorageBlockMod, 1, 6), "xxx", "xxx", "xxx", 'x',
						"ingotElectrum"));
				ItemStack electrumingot;
				electrumingot = OreDictionary.getOres("ingotElectrum").get(0);
				ItemStack result = electrumingot.copy();
				result.stackSize = 9;
				GameRegistry.addShapelessRecipe(result, new ItemStack(
						StorageBlockMod, 1, 6));
				if (Storageprops.gregtechcompat) {
					OreDictionary.registerOre("blockElectrum", new ItemStack(
							StorageBlockMod, 1, 6));
				}
			}
		}
		if (Storageprops.enableplatinum) {
			if (!OreDictionary.getOres("ingotPlatinum").isEmpty()) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(
						StorageBlockMod, 1, 7), "xxx", "xxx", "xxx", 'x',
						"ingotPlatinum"));
				ItemStack platinumingot;
				platinumingot = OreDictionary.getOres("ingotPlatinum").get(0);
				ItemStack result = platinumingot.copy();
				result.stackSize = 9;
				GameRegistry.addShapelessRecipe(result, new ItemStack(
						StorageBlockMod, 1, 7));
				if (Storageprops.gregtechcompat) {
					OreDictionary.registerOre("blockPlatinum", new ItemStack(
							StorageBlockMod, 1, 7));
				}
			}
		}
		if (Storageprops.enableinvar) {
			if (!OreDictionary.getOres("ingotInvar").isEmpty()) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(
						StorageBlockMod, 1, 8), "xxx", "xxx", "xxx", 'x',
						"ingotInvar"));
				ItemStack invaringot;
				invaringot = OreDictionary.getOres("ingotInvar").get(0);
				ItemStack result = invaringot.copy();
				result.stackSize = 9;
				GameRegistry.addShapelessRecipe(result, new ItemStack(
						StorageBlockMod, 1, 8));
				if (Storageprops.gregtechcompat) {
					OreDictionary.registerOre("blockInvar", new ItemStack(
							StorageBlockMod, 1, 8));
				}
			}
		}
		if (Storageprops.enablebrass) {
			if (!OreDictionary.getOres("ingotBrass").isEmpty()) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(
						StorageBlockMod, 1, 9), "xxx", "xxx", "xxx", 'x',
						"ingotBrass"));
				ItemStack brassingot;
				brassingot = OreDictionary.getOres("ingotBrass").get(0);
				ItemStack result = brassingot.copy();
				result.stackSize = 9;
				GameRegistry.addShapelessRecipe(result, new ItemStack(
						StorageBlockMod, 1, 9));
				if (Storageprops.gregtechcompat) {
					OreDictionary.registerOre("blockBrass", new ItemStack(
							StorageBlockMod, 1, 9));
				}
			}
		}
		if (Storageprops.enablerubber) {
			if (!OreDictionary.getOres("itemRubber").isEmpty()) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(
						StorageBlockMod, 1, 10), "xxx", "xxx", "xxx", 'x',
						"itemRubber"));
				ItemStack rubberitem;
				rubberitem = OreDictionary.getOres("itemRubber").get(0);
				ItemStack result = rubberitem.copy();
				result.stackSize = 9;
				GameRegistry.addShapelessRecipe(result, new ItemStack(
						StorageBlockMod, 1, 10));
				if (Storageprops.gregtechcompat) {
					OreDictionary.registerOre("blockRubber", new ItemStack(
							StorageBlockMod, 1, 10));
				}
			}
		}
	}

	public static void addForestryRecipes() {
		if (Loader.isModLoaded("Forestry")) {
			try {
				GameRegistry.registerBlock(ForestryBlock,
						vanityblocks.ItemBlocks.StorageItemForestryBlock.class,
						"ForestryStorage Block");
				LanguageRegistry.addName(new ItemStack(ForestryBlock, 1, 0),
						"Apatite Block");
				LanguageRegistry.addName(new ItemStack(ForestryBlock, 1, 1),
						"Honey Block");
				LanguageRegistry.addName(new ItemStack(ForestryBlock, 1, 2),
						"Honeydew Block");
				LanguageRegistry.addName(new ItemStack(ForestryBlock, 1, 3),
						"Peat Block");
				if (Storageprops.enableapatite) {
					if (!OreDictionary.getOres("gemApatite").isEmpty()) {
						GameRegistry.addRecipe(new ShapedOreRecipe(
								new ItemStack(ForestryBlock, 1, 0), "xxx",
								"xxx", "xxx", 'x', "gemApatite"));
						ItemStack gemapatite;
						gemapatite = OreDictionary.getOres("gemApatite").get(0);
						ItemStack result = gemapatite.copy();
						result.stackSize = 9;
						GameRegistry.addShapelessRecipe(result, new ItemStack(
								ForestryBlock, 1, 0));
						if (Storageprops.gregtechcompat) {
							OreDictionary.registerOre("blockApatite",
									new ItemStack(ForestryBlock, 1, 0));
						}
					}
				}
				if (Storageprops.enablehoneydrop) {
					if (!OreDictionary.getOres("dropHoney").isEmpty()) {
						GameRegistry.addRecipe(new ShapedOreRecipe(
								new ItemStack(ForestryBlock, 1, 1), "xxx",
								"xxx", "xxx", 'x', "dropHoney"));
						ItemStack honeydrop;
						honeydrop = OreDictionary.getOres("dropHoney").get(0);
						ItemStack result = honeydrop.copy();
						result.stackSize = 9;
						GameRegistry.addShapelessRecipe(result, new ItemStack(
								ForestryBlock, 1, 1));
						if (Storageprops.gregtechcompat) {
							OreDictionary.registerOre("blockHoney",
									new ItemStack(ForestryBlock, 1, 1));
						}
					}
				}
				if (Storageprops.enablehoneydew) {
					if (!OreDictionary.getOres("dropHoneydew").isEmpty()) {
						GameRegistry.addRecipe(new ShapedOreRecipe(
								new ItemStack(ForestryBlock, 1, 2), "xxx",
								"xxx", "xxx", 'x', "dropHoneydew"));
						ItemStack honeydewdrop;
						honeydewdrop = OreDictionary.getOres("dropHoneydew")
								.get(0);
						ItemStack result = honeydewdrop.copy();
						result.stackSize = 9;
						GameRegistry.addShapelessRecipe(result, new ItemStack(
								ForestryBlock, 1, 2));
						if (Storageprops.gregtechcompat) {
							OreDictionary.registerOre("blockHoneydew",
									new ItemStack(ForestryBlock, 1, 2));
						}
					}
				}
				if (Storageprops.enablepeat) {
					// OreDictionary.registerOre("brickPeat", new
					// ItemStack(Item.arrow));
					if (!OreDictionary.getOres("brickPeat").isEmpty()) {
						GameRegistry.addRecipe(new ShapedOreRecipe(
								new ItemStack(ForestryBlock, 1, 3), "xxx",
								"xxx", "xxx", 'x', "brickPeat"));
						ItemStack brickPeat;
						brickPeat = OreDictionary.getOres("brickPeat").get(0);
						ItemStack result = brickPeat.copy();
						result.stackSize = 9;
						GameRegistry.addShapelessRecipe(result, new ItemStack(
								ForestryBlock, 1, 3));
						if (Storageprops.gregtechcompat) {
							OreDictionary.registerOre("blockPeat",
									new ItemStack(ForestryBlock, 1, 3));
						}
					}
				}
			} catch (Exception e) {
				// pokemon!
			}
		}
	}

	public static Block StorageBlock;
	public static Block StorageBlockMod;
	public static Block ForestryBlock;
	public static int StorageBlockId;
	public static int StorageBlockModId;
	public static int ForestryBlockId;
}