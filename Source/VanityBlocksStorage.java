package vanityblocks;

import railcraft.common.api.crafting.RailcraftCraftingManager;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.liquids.LiquidDictionary;
import net.minecraftforge.liquids.LiquidStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
//import railcraft.common.api.core.items.ItemRegistry;
//import railcraft.common.api.crafting.ICokeOvenCraftingManager;

@Mod(modid="VanityBlocks-Storage", name="Anarchys Vanity Blocks-Storage", version= DefaultProps.VERSIONStorage)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

/* 				
TO DO
add steel stuff ?
add mossy planks
.Nebuleon.. ArrayList is kind of easy to use :P
ArrayList a = new ArrayList(), a.add("blah"); Object a = a.get(0); System.out.println(a);
ArrayList storageblocksarray = new ArrayList(), a.add("redstoneblock") {


ArrayList a = new ArrayList(), a.add("blah"); Object b = a.get(0); System.out.println(b);
ArrayList<Integer> a = new ArrayList<Integer>();
 */


public class VanityBlocksStorage {

	@Instance("VanityBlocks-Storage")
	public static VanityBlocksStorage instance;

	@SidedProxy(clientSide = "vanityblocks.ProxyClient", serverSide = "vanityblocks.Proxy")
	public static Proxy proxy;
	
	public static int storageblockconfig;
	public static int storageblockmodconfig;
	public static boolean storageblockint;
	public static Block StorageBlock;
	public static Block StorageBlockMod;
	public static int StorageBlockId;
	public static int StorageBlockModId;
	
	public static Block redstoneblock;
	public static Block coalblock;



	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		Storageprops.initProps();
		StorageBlockId = Storageprops.storageblockconfig;
		StorageBlock = new StorageBlock(StorageBlockId);
		StorageBlockModId = Storageprops.storageblockmodconfig;
		StorageBlockMod = new StorageBlockMod(StorageBlockModId);
		
		String[] vannilastorageBlockNames = { 
			"Redstone Block", "Coal Block", "Charcoal Block", "Enderpearl Block", "Slime Block",
			"Bale of Wheat", "Sugar Block", "Cocoa Block" 
		};
		String[] modstorageBlockNames = { 
			"Tin Block", "Copper Block", "Silver Block",
			"Lead Block", "Nikolite Block", "Nickel/Ferrous Block", "Electrum Block",
			"Platinum/Shiny Block", "Invar Block", "Brass Block", "Coal coke Block"
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
		LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 7), "Redstone Block");

/* ########### Modded #### */ 
		GameRegistry.registerBlock(StorageBlockMod, vanityblocks.StorageItemModBlock.class, "Modded Storage Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 0), "Tin Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 1), "Coppper Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 2), "Silver Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 3), "Lead Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 4), "Nikolite Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 5), "Nickel/Ferrous Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 6), "Electrum Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 7), "Platinum/Shiny Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 8), "Invar Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 9), "Coal Coke Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 10), "Brass Block");
	}

	@Init
	public void load(FMLInitializationEvent event) {
      	proxy.registerRenderInformation();
		proxy.addNames();
		addRecipes();
	}
	
	public void addRecipes() 
	{
		/*############### Vannila Storage blocking ####### */
		if (Storageprops.enablecoal) {
		GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 0), "xxx", "xxx", "xxx", 'x', Item.coal);
		GameRegistry.addShapelessRecipe(new ItemStack(Item.coal, 9), new ItemStack(StorageBlock,1,0));
		}
		if (Storageprops.enablecharcoal) {
		GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 1), "xxx", "xxx", "xxx", 'x', new ItemStack(Item.coal,1,1));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.coal, 9, 1), new ItemStack(StorageBlock,1,1));
		}
		if (Storageprops.enableenderpearl) {
		GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 2), "xxx", "xxx", "xxx", 'x', new ItemStack(Item.enderPearl));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.enderPearl, 9), new ItemStack(StorageBlock,1,2));
		}
		if (Storageprops.enableslime) {
		GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 3), "xxx", "xxx", "xxx", 'x', new ItemStack(Item.slimeBall));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.slimeBall, 9), new ItemStack(StorageBlock,1,3));
		}
		if (Storageprops.enablewheatbale) {
		GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 4), "xxx", "xyx", "xxx", 'y', new ItemStack(Item.silk), 'x', new ItemStack(Item.wheat));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.wheat, 8), new ItemStack(StorageBlock,1,4));
		}
		if (Storageprops.enablesugar) {
		GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 5), "xxx", "xxx", "xxx", 'x', new ItemStack(Item.sugar));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.sugar, 9), new ItemStack(StorageBlock,1,5));
		}
		if (Storageprops.enablecocoa) {
		GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 6), "xxx", "xxx", "xxx", 'x', new ItemStack(Item.dyePowder,1,3));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.dyePowder, 9, 3), new ItemStack(StorageBlock,1,6));
		}
		if (Storageprops.enableredstone) {
		GameRegistry.addRecipe(new ItemStack(StorageBlock, 1, 7), "xxx", "xxx", "xxx", 'x', new ItemStack(Item.redstone));
		GameRegistry.addShapelessRecipe(new ItemStack(Item.redstone, 9), new ItemStack(StorageBlock,1,7));		
		}
		if (Storageprops.enablecoal && Storageprops.enablecharcoal) {
			GameRegistry.registerFuelHandler(new VanityFuelHandler());
		}
        if (Storageprops.enableenderpearl) {
        	if (Storageprops.dragoneggrecipe) {
    		GameRegistry.addRecipe(new ItemStack(Block.dragonEgg,1), new Object [] {"xxx", "xyx", "xxx", 'x', new ItemStack(StorageBlock,1,2), 'y', Item.egg});
       }
        }
		/* ############### Modded Storage blocks ############ */
		if (Storageprops.enabletin) {
        if (!OreDictionary.getOres("ingotTin").isEmpty()) {		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 0), "xxx", "xxx", "xxx", 'x', "ingotTin"));	
//		if(!OreDictionary.getOres("ingotTin").isEmpty()) GameRegistry.addShapelessRecipe(OreDictionary.getOres("ingotTin").get(0), new ItemStack(StorageBlockMod, 1, 0));
//		ItemStack tin = OreDictionary.getOres("ingotTin").get(0).copy(); tin.stackSize = 9;
		ItemStack tiningot;
	    tiningot = OreDictionary.getOres("ingotTin").get(0);
	    ItemStack result = tiningot.copy();
	    result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 0));
		}
	}
		if (Storageprops.enablecopper) {
	    if (!OreDictionary.getOres("ingotCopper").isEmpty()) {		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 1), "xxx", "xxx", "xxx", 'x', "ingotCopper"));	
//		if(!OreDictionary.getOres("ingotCopper").isEmpty()) GameRegistry.addShapelessRecipe(OreDictionary.getOres("ingotCopper").get(0), new ItemStack(StorageBlockMod, 1, 1));
//		ItemStack copper = OreDictionary.getOres("ingotCopper").get(0).copy(); copper.stackSize = 9;
		ItemStack copperingot;
	    copperingot = OreDictionary.getOres("ingotCopper").get(0);
	    ItemStack result = copperingot.copy();
	    result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 1));
	    }
		}
		if (Storageprops.enablesilver) {
	    if (!OreDictionary.getOres("ingotSilver").isEmpty()) {		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 2), "xxx", "xxx", "xxx", 'x', "ingotSilver"));	
//		if(!OreDictionary.getOres("ingotSilver").isEmpty()) GameRegistry.addShapelessRecipe(OreDictionary.getOres("ingotSilver").get(0), new ItemStack(StorageBlockMod, 1, 2));
//		ItemStack silver = OreDictionary.getOres("ingotSilver").get(0).copy(); silver.stackSize = 9;
		ItemStack silveringot;
	    silveringot = OreDictionary.getOres("ingotSilver").get(0);
	    ItemStack result = silveringot.copy();
	    result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 2));
		}
		}
		if (Storageprops.enablelead) {
	    if (!OreDictionary.getOres("ingotLead").isEmpty()) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 3), "xxx", "xxx", "xxx", 'x', "ingotLead"));	
//		if(!OreDictionary.getOres("ingotLead").isEmpty()) GameRegistry.addShapelessRecipe(OreDictionary.getOres("ingotLead").get(0), new ItemStack(StorageBlockMod, 1, 3));
//		ItemStack lead = OreDictionary.getOres("ingotLead").get(0).copy(); lead.stackSize = 9;
		ItemStack leadingot;
	    leadingot = OreDictionary.getOres("ingotLead").get(0);
	    ItemStack result = leadingot.copy();
	    result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 3));
		}
		}
		if (Storageprops.enablenikolite) {
	    if (!OreDictionary.getOres("dustNikolite").isEmpty()) {		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 4), "xxx", "xxx", "xxx", 'x', "dustNikolite"));	
//		if(!OreDictionary.getOres("dustNikolite").isEmpty()) GameRegistry.addShapelessRecipe(OreDictionary.getOres("dustNikolite").get(0), new ItemStack(StorageBlockMod, 1, 4));
//		ItemStack nikolite = OreDictionary.getOres("dustNikolite").get(0).copy(); nikolite.stackSize = 9;
		ItemStack nikolite;
	    nikolite = OreDictionary.getOres("dustNikolite").get(0);
	    ItemStack result = nikolite.copy();
	    result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 4));		
		}
		}
		if (Storageprops.enablenickel) {
	    if (!OreDictionary.getOres("ingotNickel").isEmpty()) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 5), "xxx", "xxx", "xxx", 'x', "ingotNickel"));	
//		if(!OreDictionary.getOres("ingotNickel").isEmpty()) GameRegistry.addShapelessRecipe(OreDictionary.getOres("ingotNickel").get(0), new ItemStack(StorageBlockMod, 1, 5));
//		ItemStack nickel = OreDictionary.getOres("ingotNickel").get(0).copy(); nickel.stackSize = 9;
		ItemStack nickelingot;
	    nickelingot = OreDictionary.getOres("ingotNickel").get(0);
	    ItemStack result = nickelingot.copy();
	    result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 5));
		}
		}
		if (Storageprops.enableelectrum) {
	    if (!OreDictionary.getOres("ingotElectrum").isEmpty()) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 6), "xxx", "xxx", "xxx", 'x', "ingotElectrum"));	
//		if(!OreDictionary.getOres("ingotElectrum").isEmpty()) GameRegistry.addShapelessRecipe(OreDictionary.getOres("ingotElectrum").get(0), new ItemStack(StorageBlockMod, 1, 6));
//		ItemStack electrum = OreDictionary.getOres("ingotElectrum").get(0).copy(); electrum.stackSize = 9;
		ItemStack electrumingot;
	    electrumingot = OreDictionary.getOres("ingotElectrum").get(0);
	    ItemStack result = electrumingot.copy();
	    result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 6));
		}
		}
		if (Storageprops.enableplatinum) {
	    if (!OreDictionary.getOres("ingotPlatinum").isEmpty()) {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 7), "xxx", "xxx", "xxx", 'x', "ingotPlatinum"));	
//		if(!OreDictionary.getOres("ingotPlatinum").isEmpty()) GameRegistry.addShapelessRecipe(OreDictionary.getOres("ingotPlatinum").get(0), new ItemStack(StorageBlockMod, 1, 7));
//		ItemStack platinum = OreDictionary.getOres("ingotPlatinum").get(0).copy(); platinum.stackSize = 9;
		ItemStack platinumingot;
	    platinumingot = OreDictionary.getOres("ingotPlatinum").get(0);
	    ItemStack result = platinumingot.copy();
	    result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 7));
		}
		}
		if (Storageprops.enableinvar) {
	    if (!OreDictionary.getOres("ingotInvar").isEmpty()) {		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 8), "xxx", "xxx", "xxx", 'x', "ingotInvar"));	
//		if(!OreDictionary.getOres("ingotInvar").isEmpty()) GameRegistry.addShapelessRecipe(OreDictionary.getOres("ingotInvar").get(0), new ItemStack(StorageBlockMod, 1, 8));
//		ItemStack invar = OreDictionary.getOres("ingotInvar").get(0).copy(); invar.stackSize = 9;
		ItemStack invaringot;
	    invaringot = OreDictionary.getOres("ingotInvar").get(0);
	    ItemStack result = invaringot.copy();
	    result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 8));
		}
		}
		if (Storageprops.enablebrass) {
	    if (!OreDictionary.getOres("ingotBrass").isEmpty()) {		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 10), "xxx", "xxx", "xxx", 'x', "ingotBrass"));	
//		if(!OreDictionary.getOres("ingotBrass").isEmpty()) GameRegistry.addShapelessRecipe(OreDictionary.getOres("ingotBrass").get(0), new ItemStack(StorageBlockMod, 1, 10));
//		ItemStack brass = OreDictionary.getOres("ingotBrass").get(0).copy(); brass.stackSize = 9;
		ItemStack brassingot;
	    brassingot = OreDictionary.getOres("ingotBrass").get(0);
	    ItemStack result = brassingot.copy();
	    result.stackSize = 9;
		GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 10));
		}
		}
        if (Loader.isModLoaded("Railcraft")) {
        	if (Storageprops.enablerailcraftuse) {
            try {
            if (Storageprops.enablecoalcoke) {
            		    if (!OreDictionary.getOres("fuelCoke").isEmpty()) {		
            			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(StorageBlockMod, 1, 9), "xxx", "xxx", "xxx", 'x', "fuelCoke"));	
            			ItemStack fuelcoke;
            		    fuelcoke = OreDictionary.getOres("fuelCoke").get(0);
            		    ItemStack result = fuelcoke.copy();
            		    result.stackSize = 9;
            			GameRegistry.addShapelessRecipe(result, new ItemStack(StorageBlockMod, 1, 9));
            			}
            		LiquidStack liquid = LiquidDictionary.getLiquid("Creosote Oil", 4500);
            		ItemStack coalblock = new ItemStack(StorageBlockMod,1,0);
            		ItemStack coalcokeblock = new ItemStack(StorageBlockMod,1,9);
    //    		if (liquid != null && Storageprops.enablecoal != null && blCoalcoke != null)
        		RailcraftCraftingManager.cokeOven.addRecipe(coalblock, coalcokeblock, liquid, 32400);
                
            }
            }
             catch (Exception e) {
                // pokemon!
            }
        }
        }
}
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// If you want, you can move everything down here.
		// Alternately, you can declare in the mcmod.info that you
		// must be loaded after IC2, Redpower, Buildcraft, etc, etc, etc.
		// Either way will work.
	}
}
