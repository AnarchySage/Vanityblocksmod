package com.vanityblocks.Registrations;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.vanityblocks.Storageprops;
import com.vanityblocks.Blocks.ForestryBlock;
import com.vanityblocks.Blocks.StorageBlock;
import com.vanityblocks.Blocks.StorageBlockMod;
import com.vanityblocks.ItemBlocks.StorageItemBlock;
import com.vanityblocks.ItemBlocks.StorageItemForestryBlock;
import com.vanityblocks.ItemBlocks.StorageItemModBlock;

import cpw.mods.fml.common.registry.GameRegistry;

public class StorageBlocksRegistration {
	public static final String modid = "vanityblocks";

	public static void blockregistration() {
		StorageBlockId = Storageprops.storageblockconfig;
		StorageBlock = new StorageBlock(StorageBlockId);
		StorageBlockModId = Storageprops.storageblockmodconfig;
		StorageBlockMod = new StorageBlockMod(StorageBlockModId);
		ForestryBlockId = Storageprops.forestryblockconfig;
		ForestryBlock = new ForestryBlock(ForestryBlockId);

		/* ##### Vannila ##### */
		GameRegistry.registerBlock(StorageBlock, StorageItemBlock.class, modid
				+ (StorageBlock.getUnlocalizedName().substring(0)));
		/* ########### Modded #### */
		GameRegistry.registerBlock(StorageBlockMod, StorageItemModBlock.class,
				modid + (StorageBlockMod.getUnlocalizedName().substring(1)));
		;
	}

	public static void addVanillaRecipes() {
		/* ############### Vannila Storage blocking ####### */
		if (Storageprops.enablecharcoal) {
			GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 0), "xxx",
					"xxx", "xxx", 'x', new ItemStack(Items.coal, 1, 1));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 9, 1),
					new ItemStack(StorageBlock, 1, 0));
			if (Storageprops.gregtechcompat) {
				OreDictionary.registerOre("blockCharcoal", new ItemStack(
						StorageBlock, 1, 0));
			}
		}
		if (Storageprops.enableenderpearl) {
			GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 1), "xxx",
					"xxx", "xxx", 'x', new ItemStack(Items.ender_pearl));
			GameRegistry.addShapelessRecipe(
					new ItemStack(Items.ender_pearl, 9), new ItemStack(
							StorageBlock, 1, 1));
			if (Storageprops.gregtechcompat) {
				OreDictionary.registerOre("blockEnderpearl", new ItemStack(
						StorageBlock, 1, 1));
			}
		}
		if (Storageprops.enableenderpearl) {
			if (Storageprops.dragoneggrecipe) {
				GameRegistry.addRecipe(new ItemStack(Blocks.dragon_egg, 1),
						new Object[] { "xxx", "xyx", "xxx", 'x',
								new ItemStack(StorageBlock, 1, 1), 'y',
								Items.egg });
			}
		}
		if (Storageprops.enablesugar) {
			GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 2), "xxx",
					"xxx", "xxx", 'x', new ItemStack(Items.sugar));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.sugar, 9),
					new ItemStack(StorageBlock, 1, 2));
			if (Storageprops.gregtechcompat) {
				OreDictionary.registerOre("blockSugar", new ItemStack(
						StorageBlock, 1, 2));
			}
		}
		if (Storageprops.enablecocoa) {
			GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 3), "xxx",
					"xxx", "xxx", 'x', new ItemStack(Items.dye, 1, 3));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 9, 3),
					new ItemStack(StorageBlock, 1, 3));
			if (Storageprops.gregtechcompat) {
				OreDictionary.registerOre("blockCocoa", new ItemStack(
						StorageBlock, 1, 3));
			}
		}
		if (Storageprops.enablesugarcane) {
			GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 4), "xxx",
					"xxx", "xxx", 'x', new ItemStack(Items.reeds));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.reeds, 9),
					new ItemStack(StorageBlock, 1, 4));
			if (Storageprops.gregtechcompat) {
				OreDictionary.registerOre("blockSugarCane", new ItemStack(
						StorageBlock, 1, 4));
			}
		}
		if (Storageprops.enableleather) {
			GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 5),
					new Object[] { "xxx", "xxx", "xxx", 'x',
							new ItemStack(Items.leather) });
			GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 9),
					new ItemStack(StorageBlock, 1, 5));
			if (Storageprops.gregtechcompat) {
				OreDictionary.registerOre("blockLeather", new ItemStack(
						StorageBlock, 1, 5));
			}
		}
		if (Storageprops.enablebone) {
			GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 6),
					new Object[] { "xxx", "xxx", "xxx", 'x',
							new ItemStack(Items.bone) });
			GameRegistry.addShapelessRecipe(new ItemStack(Items.bone, 9),
					new ItemStack(StorageBlock, 1, 6));
			if (Storageprops.gregtechcompat) {
				OreDictionary.registerOre("blockBone", new ItemStack(
						StorageBlock, 1, 6));
			}
		}
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
		// if (Loader.isModLoaded("Forestry"))
		// {
		try {
			GameRegistry.registerBlock(ForestryBlock,
					StorageItemForestryBlock.class, "ForestryStorage Block");

			if (Storageprops.enableapatite) {
				if (!OreDictionary.getOres("gemApatite").isEmpty()) {
					GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(
							ForestryBlock, 1, 0), "xxx", "xxx", "xxx", 'x',
							"gemApatite"));
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
					GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(
							ForestryBlock, 1, 1), "xxx", "xxx", "xxx", 'x',
							"dropHoney"));
					ItemStack honeydrop;
					honeydrop = OreDictionary.getOres("dropHoney").get(0);
					ItemStack result = honeydrop.copy();
					result.stackSize = 9;
					GameRegistry.addShapelessRecipe(result, new ItemStack(
							ForestryBlock, 1, 1));
					if (Storageprops.gregtechcompat) {
						OreDictionary.registerOre("blockHoney", new ItemStack(
								ForestryBlock, 1, 1));
					}
				}
			}
			if (Storageprops.enablehoneydew) {
				if (!OreDictionary.getOres("dropHoneydew").isEmpty()) {
					GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(
							ForestryBlock, 1, 2), "xxx", "xxx", "xxx", 'x',
							"dropHoneydew"));
					ItemStack honeydewdrop;
					honeydewdrop = OreDictionary.getOres("dropHoneydew").get(0);
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
					GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(
							ForestryBlock, 1, 3), "xxx", "xxx", "xxx", 'x',
							"brickPeat"));
					ItemStack brickPeat;
					brickPeat = OreDictionary.getOres("brickPeat").get(0);
					ItemStack result = brickPeat.copy();
					result.stackSize = 9;
					GameRegistry.addShapelessRecipe(result, new ItemStack(
							ForestryBlock, 1, 3));
					if (Storageprops.gregtechcompat) {
						OreDictionary.registerOre("blockPeat", new ItemStack(
								ForestryBlock, 1, 3));
					}
				}
			}
		} catch (Exception e) {
			// pokemon!
		}
		// }
	}

	public static Block StorageBlock;
	public static Block StorageBlockMod;
	public static Block ForestryBlock;
	public static int StorageBlockId;
	public static int StorageBlockModId;
	public static int ForestryBlockId;
}