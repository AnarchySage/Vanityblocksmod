package vanityblocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.liquids.LiquidDictionary;
import net.minecraftforge.liquids.LiquidStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockRegistration { 

	public static void blockregistration() {
	StorageBlockId = Storageprops.storageblockconfig;
	StorageBlock = new StorageBlock(StorageBlockId);
	StorageBlockModId = Storageprops.storageblockmodconfig;
	StorageBlockMod = new StorageBlockMod(StorageBlockModId);
	ForestryBlockId = Storageprops.forestryblockconfig;
	ForestryBlock = new ForestryBlock(ForestryBlockId);

	String[] vannilastorageBlockNames = { 
		"Sugar Cane Block", "Coal Block", "Charcoal Block", "Enderpearl Block", "Slime Block",
		"Bale of Wheat", "Sugar Block", "Cocoa Block", "Blaze Block", "Leather Block", "Bone Block", "Clay Brick"
	};
	String[] modstorageBlockNames = { 
		"Tin Block", "Copper Block", "Silver Block",
		"Lead Block", "Nikolite Block", "Nickel Block", "Electrum Block",
		"Platinum Block", "Invar Block", "Brass Block", "Coal Coke Block", "Osmium Block", "Rubber Block"
	};
	String[] forestrystorageBlockNames = { 
			"Apatite Block", "Honey Block", "Honeydew Block",
			"Peat Block", "", "", "",
			"", "", "", "", ""
	};
/*##### Vannila ##### */
	GameRegistry.registerBlock(StorageBlock, vanityblocks.StorageItemBlock.class, "Vannila Storage Block");
	LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 0), "Coal block");
	LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 1), "Charcoal block");
	LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 2), "Ender pearl block");
	LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 3), "Slime block");
	LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 4), "Bale of wheat");
	LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 5), "Sugar Block");
	LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 6), "Cocoa chunk");	
	LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 7), "Sugar Cane Block");
	LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 8), "Blaze Block");
	LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 9), "Leather Block");
	LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 10), "Bone Block");
	LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 11), "Clay Brick");
/* ########### Modded #### */ 
	GameRegistry.registerBlock(StorageBlockMod, vanityblocks.StorageItemModBlock.class, "Modded Storage Block");
	LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 0), "Tin Block");
	LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 1), "Coppper Block");
	LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 2), "Silver Block");
	LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 3), "Lead Block");
	LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 4), "Nikolite Block");
	LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 5), "Nickel Block");
	LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 6), "Electrum Block");
	LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 7), "Platinum Block");
	LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 8), "Invar Block");
	LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 9), "Coal Coke Block");
	LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 10), "Brass Block");
	LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 11), "Osmium Block");
	LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 12), "Rubber Block");
}
public static void addVanillaRecipes() 
	{
		System.out.println("Block Registration loaded");
		/*############### Vannila Storage blocking ####### */
		if (Storageprops.enablecoal) {
		GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 0), "xxx", "xxx", "xxx", 'x', Item.coal);
		GameRegistry.addShapelessRecipe(new ItemStack(Item.coal, 9), new ItemStack(StorageBlock,1,0));
		if (Storageprops.gregtechcompat) {
			OreDictionary.registerOre("blockCoal", new ItemStack(StorageBlock,1,0)); 
		}
		}
		if (Storageprops.enablecharcoal) {
		GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 1), "xxx", "xxx", "xxx", 'x', new ItemStack(Item.coal,1,1));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.coal, 9, 1), new ItemStack(StorageBlock,1,1));
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockCharcoal", new ItemStack(StorageBlock,1,1));
		}
		}
		if (Storageprops.enableenderpearl) {
		GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 2), "xxx", "xxx", "xxx", 'x', new ItemStack(Item.enderPearl));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.enderPearl, 9), new ItemStack(StorageBlock,1,2));
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockEnderpearl", new ItemStack(StorageBlock,1,2));
		}
		}
		if (Storageprops.enableslime) {
		GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 3), "xxx", "xxx", "xxx", 'x', new ItemStack(Item.slimeBall));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.slimeBall, 9), new ItemStack(StorageBlock,1,3));
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockSlime", new ItemStack(StorageBlock,1,3));
		}
		}
		if (Storageprops.enablewheatbale) {
		GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 4), "xxx", "xxx", "xxx", 'x', new ItemStack(Item.wheat));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.wheat, 9), new ItemStack(StorageBlock,1,4));
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockWheat", new ItemStack(StorageBlock,1,4));
		}
		}
		if (Storageprops.enablesugar) {
		GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 5), "xxx", "xxx", "xxx", 'x', new ItemStack(Item.sugar));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.sugar, 9), new ItemStack(StorageBlock,1,5));
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockSugar", new ItemStack(StorageBlock,1,5));
		}
		}
		if (Storageprops.enablecocoa) {
		GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 6), "xxx", "xxx", "xxx", 'x', new ItemStack(Item.dyePowder,1,3));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.dyePowder, 9, 3), new ItemStack(StorageBlock,1,6));
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockCocoa", new ItemStack(StorageBlock,1,6));
		}
		}
		if (Storageprops.enablesugarcane) {
		GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 7), "xxx", "xxx", "xxx", 'x', new ItemStack(Item.reed));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.reed, 9), new ItemStack(StorageBlock,1,7));		
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockSugarCane", new ItemStack(StorageBlock,1,7));
		}
		}
        if (Storageprops.enableenderpearl) {
        if (Storageprops.dragoneggrecipe) {
    	GameRegistry.addRecipe(new ItemStack(Block.dragonEgg,1), new Object [] {"xxx", "xyx", "xxx", 'x', new ItemStack(StorageBlock,1,2), 'y', Item.egg});
        }
        }
        if (Storageprops.enableblaze) {
    	GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 8), new Object [] {"xxx", "xxx", "xxx", 'x', new ItemStack(Item.blazeRod)});
    	GameRegistry.addShapelessRecipe(new ItemStack(Item.blazeRod, 9), new ItemStack(StorageBlock,1,8));		
    	if (Storageprops.gregtechcompat) { 
    		OreDictionary.registerOre("blockBlazerod", new ItemStack(StorageBlock,1,8));
    	}
        }
        if (Storageprops.enableleather) {
    	GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 9), new Object [] {"xxx", "xxx", "xxx", 'x', new ItemStack(Item.leather)});
    	GameRegistry.addShapelessRecipe(new ItemStack(Item.leather, 9), new ItemStack(StorageBlock,1,9));		
    	if (Storageprops.gregtechcompat) { 
    		OreDictionary.registerOre("blockLeather", new ItemStack(StorageBlock,1,9));
    	}
        }
        if (Storageprops.enablebone) {
    	GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 10), new Object [] {"xxx", "xxx", "xxx", 'x', new ItemStack(Item.bone)});
    	GameRegistry.addShapelessRecipe(new ItemStack(Item.bone, 9), new ItemStack(StorageBlock,1,10));		
    	if (Storageprops.gregtechcompat) { 
    		OreDictionary.registerOre("blockBone", new ItemStack(StorageBlock,1,10));
    	}
        }
        if (Storageprops.enableclaybrick) {
        GameRegistry.addRecipe(new ItemStack(StorageBlock, 4, 11), new Object [] {"xx", "xx", 'x', new ItemStack(Block.blockClay)});
        GameRegistry.addShapelessRecipe(new ItemStack(Block.blockClay), new ItemStack(StorageBlock,1,11));
        GameRegistry.addShapelessRecipe(new ItemStack(Item.clay,4), new ItemStack(Block.blockClay));
        GameRegistry.addRecipe(new ItemStack(Item.clay,16), new Object [] {"xx", "xx", 'x', new ItemStack(StorageBlock, 1, 11)});
    	if (Storageprops.gregtechcompat) { 
    		OreDictionary.registerOre("blockClayBrick", new ItemStack(StorageBlock,1,11));
    	}
        }
	}
public static void addModRecipes() {
		/* ############### Modded Storage blocks ############ */
		if (Storageprops.enabletin) {
        if (!OreDictionary.getOres("ingotTin").isEmpty()) {		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 0), "xxx", "xxx", "xxx", 'x', "ingotTin"));	
		ItemStack tiningot;
	    tiningot = OreDictionary.getOres("ingotTin").get(0);
	    ItemStack result = tiningot.copy();
	    result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 0));
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockTin", new ItemStack(StorageBlockMod,1,0));
		}
        }
	    }
		if (Storageprops.enablecopper) {
	    if (!OreDictionary.getOres("ingotCopper").isEmpty()) {		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 1), "xxx", "xxx", "xxx", 'x', "ingotCopper"));	
		ItemStack copperingot;
	    copperingot = OreDictionary.getOres("ingotCopper").get(0);
	    ItemStack result = copperingot.copy();
	    result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 1));
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockCopper", new ItemStack(StorageBlockMod,1,1));
		}
	    }
		}
		if (Storageprops.enablesilver) {
	    if (!OreDictionary.getOres("ingotSilver").isEmpty()) {		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 2), "xxx", "xxx", "xxx", 'x', "ingotSilver"));	
		ItemStack silveringot;
	    silveringot = OreDictionary.getOres("ingotSilver").get(0);
	    ItemStack result = silveringot.copy();
	    result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 2));
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockSilver", new ItemStack(StorageBlockMod,1,2));
		}
	    }
		}
		if (Storageprops.enablelead) {
	    if (!OreDictionary.getOres("ingotLead").isEmpty()) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 3), "xxx", "xxx", "xxx", 'x', "ingotLead"));	
		ItemStack leadingot;
	    leadingot = OreDictionary.getOres("ingotLead").get(0);
	    ItemStack result = leadingot.copy();
	    result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 3));
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockLead", new ItemStack(StorageBlockMod,1,3));
		}
	    }
		}
		if (Storageprops.enablenikolite) {
	    if (!OreDictionary.getOres("dustNikolite").isEmpty()) {		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 4), "xxx", "xxx", "xxx", 'x', "dustNikolite"));	
		ItemStack nikolite;
	    nikolite = OreDictionary.getOres("dustNikolite").get(0);
	    ItemStack result = nikolite.copy();
	    result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 4));		
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockNikolite", new ItemStack(StorageBlockMod,1,4));
		}
	    }
		}
		if (Storageprops.enablenickel) {
	    if (!OreDictionary.getOres("ingotNickel").isEmpty()) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 5), "xxx", "xxx", "xxx", 'x', "ingotNickel"));	
		ItemStack nickelingot;
	    nickelingot = OreDictionary.getOres("ingotNickel").get(0);
	    ItemStack result = nickelingot.copy();
	    result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 5));
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockNickel", new ItemStack(StorageBlockMod,1,5));
		}
	    }
		}
		if (Storageprops.enableelectrum) {
	    if (!OreDictionary.getOres("ingotElectrum").isEmpty()) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 6), "xxx", "xxx", "xxx", 'x', "ingotElectrum"));	
		ItemStack electrumingot;
	    electrumingot = OreDictionary.getOres("ingotElectrum").get(0);
	    ItemStack result = electrumingot.copy();
	    result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 6));
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockElectrum", new ItemStack(StorageBlockMod,1,6));
		}
		}
		}
		if (Storageprops.enableplatinum) {
	    if (!OreDictionary.getOres("ingotPlatinum").isEmpty()) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 7), "xxx", "xxx", "xxx", 'x', "ingotPlatinum"));	
		ItemStack platinumingot;
	    platinumingot = OreDictionary.getOres("ingotPlatinum").get(0);
	    ItemStack result = platinumingot.copy();
	    result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 7));
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockPlatinum", new ItemStack(StorageBlockMod,1,7));
		}
	    }
		}
		if (Storageprops.enableinvar) {
	    if (!OreDictionary.getOres("ingotInvar").isEmpty()) {		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 8), "xxx", "xxx", "xxx", 'x', "ingotInvar"));	
		ItemStack invaringot;
	    invaringot = OreDictionary.getOres("ingotInvar").get(0);
	    ItemStack result = invaringot.copy();
	    result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 8));
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockInvar", new ItemStack(StorageBlockMod,1,8));
		}
	    }
		}
		if (Storageprops.enablebrass) {
	    if (!OreDictionary.getOres("ingotBrass").isEmpty()) {		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 10), "xxx", "xxx", "xxx", 'x', "ingotBrass"));	
		ItemStack brassingot;
	    brassingot = OreDictionary.getOres("ingotBrass").get(0);
	    ItemStack result = brassingot.copy();
	    result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 10));
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockBrass", new ItemStack(StorageBlockMod,1,10));
		}
	    }
		}
		if (Storageprops.enableosmium) {
		if (!OreDictionary.getOres("ingotOsmium").isEmpty()) {		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 11), "xxx", "xxx", "xxx", 'x', "ingotOsmium"));	
		ItemStack osmiumingot;
		osmiumingot = OreDictionary.getOres("ingotOsmium").get(0);
		ItemStack result = osmiumingot.copy();
		result.stackSize = 9;
	    GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 11));
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockOsmium", new ItemStack(StorageBlockMod,1,11));
		}
		}
		}
		if (Storageprops.enablerubber) {
		if (!OreDictionary.getOres("itemRubber").isEmpty()) {		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 12), "xxx", "xxx", "xxx", 'x', "itemRubber"));	
		ItemStack rubberitem;
		rubberitem = OreDictionary.getOres("itemRubber").get(0);
		ItemStack result = rubberitem.copy();
		result.stackSize = 9;
	    GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 12));
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockRubber", new ItemStack(StorageBlockMod,1,12));
		}
		}
		}
//		if (Loader.isModLoaded("Railcraft")) {
        if (Storageprops.enablecoalcoke) {
//            try {
            		    if (!OreDictionary.getOres("fuelCoke").isEmpty()) {		
            			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 9), "xxx", "xxx", "xxx", 'x', "fuelCoke"));	
            			ItemStack fuelcoke;
            		    fuelcoke = OreDictionary.getOres("fuelCoke").get(0);
            		    ItemStack result = fuelcoke.copy();
            		    result.stackSize = 9;
            			GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 9));
            			if (Storageprops.gregtechcompat) { 
            				OreDictionary.registerOre("blockCoalcoke", new ItemStack(StorageBlockMod,1,9));
            			}
            			}
    //        		LiquidStack liquid = LiquidDictionary.getLiquid("Creosote Oil", 4500);
    //        		ItemStack coalblock = new ItemStack(StorageBlockMod,1,0);
    //        		ItemStack coalcokeblock = new ItemStack(StorageBlockMod,1,9);
    //    		if (liquid != null && Storageprops.enablecoal != null && blCoalcoke != null)
    //    		RailcraftCraftingManager.cokeOven.addRecipe(coalblock, coalcokeblock, liquid, 32400);
           
            }
//             catch (Exception e) {
//                // pokemon!
 //           }
//     }
//}
}
public static void addForestryRecipes() {
//	if (Loader.isModLoaded("Forestry")) {
//		try {
		GameRegistry.registerBlock(ForestryBlock, vanityblocks.StorageItemForestryBlock.class, "ForestryStorage Block");
		LanguageRegistry.addName(new ItemStack(ForestryBlock, 1, 0), "Apatite Block");
		LanguageRegistry.addName(new ItemStack(ForestryBlock, 1, 1), "Honey Block");
		LanguageRegistry.addName(new ItemStack(ForestryBlock, 1, 2), "Honeydew Block");
		LanguageRegistry.addName(new ItemStack(ForestryBlock, 1, 3), "Peat Block");			
		if (Storageprops.enableapatite) {
        if (!OreDictionary.getOres("gemApatite").isEmpty()) {		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ForestryBlock,1,0), "xxx", "xxx", "xxx", 'x', "gemApatite"));	
		ItemStack gemapatite;
	    gemapatite = OreDictionary.getOres("gemApatite").get(0);
	    ItemStack result = gemapatite.copy();
	    result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(ForestryBlock,1,0));
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockApatite", new ItemStack(ForestryBlock,1,0));
		}
		}
		}
		if (Storageprops.enablehoneydrop) {
	    if (!OreDictionary.getOres("dropHoney").isEmpty()) {		
	    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ForestryBlock,1,1), "xxx", "xxx", "xxx", 'x', "dropHoney"));	
	    ItemStack honeydrop;
		honeydrop = OreDictionary.getOres("dropHoney").get(0);
		ItemStack result = honeydrop.copy();
		result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(ForestryBlock,1,1));
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockHoney", new ItemStack(ForestryBlock,1,1));
		}
		}
		}
		if (Storageprops.enablehoneydew) {
	    if (!OreDictionary.getOres("dropHoneydew").isEmpty()) {		
	    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ForestryBlock,1,2), "xxx", "xxx", "xxx", 'x', "dropHoneydew"));	
	    ItemStack honeydewdrop;
		honeydewdrop = OreDictionary.getOres("dropHoneydew").get(0);
		ItemStack result = honeydewdrop.copy();
		result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(ForestryBlock,1,2));
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockHoneydew", new ItemStack(ForestryBlock,1,2));
		}
		}
		}
		if (Storageprops.enablepeat) {
//		if (Storageprops.gregtechcompat) { OreDictionary.registerOre("brickPeat", new ItemStack(Item.arrow));	
	    if (!OreDictionary.getOres("brickPeat").isEmpty()) {		
	    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ForestryBlock,1,3), "xxx", "xxx", "xxx", 'x', "brickPeat"));	
	    ItemStack brickPeat;
		brickPeat = OreDictionary.getOres("brickPeat").get(0);
		ItemStack result = brickPeat.copy();
		result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(ForestryBlock,1,3));
		if (Storageprops.gregtechcompat) { 
			OreDictionary.registerOre("blockPeat", new ItemStack(ForestryBlock,1,3));		
		}
		}
		}
 //   catch (Exception e) {
       // pokemon!
//   }
//}
}
public static Block StorageBlock;
public static Block StorageBlockMod;
public static Block ForestryBlock;
public static int StorageBlockId;
public static int StorageBlockModId;
public static int ForestryBlockId;
}