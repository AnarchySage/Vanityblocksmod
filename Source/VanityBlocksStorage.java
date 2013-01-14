package vanityblocksstorage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.liquids.LiquidDictionary;
import net.minecraftforge.liquids.LiquidStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import railcraft.common.api.crafting.RailcraftCraftingManager;
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

@Mod(modid="VanityBlocks-Storage", name="Anarchys Vanity Blocks-Storage", version= DefaultProps.VERSION)
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

	@Instance("VanityBlocksStorage")
	public static VanityBlocksStorage instance;

	@SidedProxy(clientSide = "vanityblocksstorage.ProxyClient", serverSide = "vanityblocksstorage.Proxy")
	public static Proxy proxy;
	
	public static int storageblockconfig;
	public static boolean storageblockint;
	
	public static Block redstoneblock;
	public static Block coalblock;


//	private boolean storageblocking;

	public static final int StorageBlockId = 3050;
	public static final Block StorageBlock = new StorageBlock(StorageBlockId);
	public static final int StorageBlockModId = 3051;
	public static final Block StorageBlockMod = new StorageBlockMod(StorageBlockModId);
	
	private static final String[] vannilastorageBlockNames = { 
		"Redstone Block", "Coal Block", "Charcoal Block", "Enderpearl Block", "Slime Block",
		"Bale of Wheat"
	};
	private static final String[] modstorageBlockNames = { 
		"Tin Block", "Copper Block", "Silver Block",
		"Lead Block", "Nikolite Block", "Nickel/Ferrous Block", "Electrum Block",
		"Platinum/Shiny Block", "Invar Block", "Brass Block"
	};

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		// nothing required here
		 // set up default properties		
//		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
/*##### Vannila ##### */
		GameRegistry.registerBlock(StorageBlock, vanityblocksstorage.StorageItemBlock.class, "Vannila Storage Block");
		LanguageRegistry.addName(new ItemStack(StorageBlock, 1, 0), "Coal block");
/* ########### Modded #### */ 
		GameRegistry.registerBlock(StorageBlockMod, vanityblocksstorage.StorageItemModBlock.class, "Modded Storage Block");
		LanguageRegistry.addName(new ItemStack(StorageBlockMod, 1, 0), "Tin Block");
	}

	@Init
	public void load(FMLInitializationEvent event) {
		//        	proxy.registerRenderInformation();
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
		/* ############### Modded Storage blocks ############ */
		if (Storageprops.enabletin) {
		GameRegistry.addRecipe(new ItemStack(StorageBlockMod, 1, 0), "xxx", "xxx", "xxx", 'x', "ingotTin");	
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
