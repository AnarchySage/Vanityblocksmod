package vanityblocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.liquids.LiquidDictionary;
import net.minecraftforge.liquids.LiquidStack;
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
import railcraft.common.*;
//import railcraft.common.api.core.items.ItemRegistry;
//import railcraft.common.api.crafting.ICokeOvenCraftingManager;
import railcraft.common.api.crafting.RailcraftCraftingManager;

@Mod(modid="Vanityblocks", name="Anarchys Vanity Blocks", version= "1.3.5")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

/* 				
TO DO
add steel stuff ?
add mossy planks
 */


public class Vanityblocks {

	@Instance("Vanityblocks")
	public static Vanityblocks instance;

	@SidedProxy(clientSide = "vanityblocks.ProxyClient", serverSide = "vanityblocks.Proxy")
	public static Proxy proxy;
	public static int lavalampconfig;
	public static int redstoneblockconfig;
	public static int coalblockconfig;
	public static int charcoalblockconfig;
	public static int enderpearlblockconfig;
	public static int tinblockconfig;
	public static int copperblockconfig;
	public static int silverblockconfig;
	public static int leadblockconfig;
	public static int nikoliteblockconfig;
	public static int slimeblockconfig;
	public static int wheatblockconfig;
	public static int meltingcoreconfig;
	public static int nickelblockconfig;
	public static int electrumblockconfig;
	public static int platinumblockconfig;
	public static int invarblockconfig;
	public static int coalcokeblockconfig;
	public static int liquidCreosoteOil;
	public static boolean railcraftuseconfig;
	public static boolean dragoneggrecipe;
	public static boolean arrowtofeather;
	public static boolean cobwebcrafting;
	
	public static Block lavalamp;
	public static Block redstoneblock;
	public static Block coalblock;
	public static Block charcoalblock;
	public static Block enderpearlblock;
	public static Block tinblock;
	public static Block copperblock;
	public static Block silverblock;
	public static Block leadblock;
	public static Block nikoliteblock;
	public static Block slimeblock;
	public static Block wheatblock;
	public static Block meltingcoreleg;
	public static Block nickelblock;
	public static Block electrumblock;
	public static Block platinumblock;
	public static Block invarblock;
	public static Block coalcokeblock;
	public static boolean Configflags;


	//        public static Logger log = Logger.getLogger("Vanityblocks");

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		// nothing required here
		 // set up default properties		
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());


		config.load();
		String category = "Block id's";	
		lavalampconfig = config.get(category,"Lava Lamp",3000).getInt();
		redstoneblockconfig = config.get(category,"Redstone Block",3001).getInt();
		coalblockconfig = config.get(category,"Coal Block",3002).getInt();
		charcoalblockconfig = config.get(category,"Charcoal Block",3003).getInt();
		enderpearlblockconfig = config.get(category,"Ender Pearl Block",3004).getInt();
		tinblockconfig = config.get(category,"Tin Block",3005).getInt();
		copperblockconfig = config.get(category,"Copper Block",3006).getInt();
		silverblockconfig = config.get(category,"Silver Block",3007).getInt();
		leadblockconfig = config.get(category,"Lead Block",3008).getInt();
		nikoliteblockconfig = config.get(category,"Nikolite Block",3009).getInt();
		slimeblockconfig = config.get(category,"Slime Block",3010).getInt();
		wheatblockconfig = config.get(category,"Bale of Wheat",3011).getInt();
		meltingcoreconfig = config.get(category,"Melting Core block",3012).getInt();
		nickelblockconfig = config.get(category,"Ferrous / Nickel Block",3013).getInt();
		electrumblockconfig = config.get(category,"Electrum Block",3014).getInt();
		platinumblockconfig = config.get(category,"Platinum / Shiny Block",3015).getInt();
		invarblockconfig = config.get(category,"Invar Block",3016).getInt();
		coalcokeblockconfig = config.get(category, "CoalCoke Block",3017).getInt();
		
		String category1 = "Storage blocks option";
		Blocklavalamp.enable = config.get(category1,"lavalamp.enable", true).getBoolean(true);
		Blockredstone.enable = config.get(category1,"redstoneblock.enable", true).getBoolean(true);
		Blockcoal.enable = config.get(category1,"coalblock.enable", true).getBoolean(true);
		Blockcharcoal.enable = config.get(category1,"charcoalblock.enable", true).getBoolean(true);
		Blockenderpearl.enable = config.get(category1,"enderpearlblock.enable", true).getBoolean(true);
		Blocktin.enable = config.get(category1,"tinblock.enable", true).getBoolean(true);
		Blockcopper.enable = config.get(category1,"copperblock.enable", true).getBoolean(true);
		Blocksilver.enable = config.get(category1,"silverblock.enable", true).getBoolean(true);
		Blocklead.enable = config.get(category1,"leadblock.enable", true).getBoolean(true);
		Blocknikolite.enable = config.get(category1,"nikoliteblock.enable", true).getBoolean(true);
		Blockslime.enable = config.get(category1,"slimeblock.enable", true).getBoolean(true);
		Blockwheat.enable = config.get(category1,"wheatblock.enable", true).getBoolean(true);
		Blockmeltingcore.enable = config.get(category1,"meltingcore.enable", true).getBoolean(true);
		Blocknickel.enable = config.get(category1,"ferrous/nickelblock.enable", true).getBoolean(true);
		Blockelectrum.enable = config.get(category1,"electrumblock.enable", true).getBoolean(true);
		Blockplatinum.enable = config.get(category1,"platinum/shinyblock.enable", true).getBoolean(true);
		Blockinvar.enable = config.get(category1,"invarblock.enable", true).getBoolean(true);
		
		
		String category2 = "Recipe enable or disable";
		dragoneggrecipe = config.get(category2,"Crafting Dragon Egg", true).getBoolean(true);
		arrowtofeather = config.get(category2,"Arrow to feather", true).getBoolean(true);
		cobwebcrafting = config.get(category2,"Crafting cobwebs", true).getBoolean(true);
		
		String category3 = "Compatibility with other mods";
		railcraftuseconfig = config.get(category3,"Use railcraft stuff?", true).getBoolean(true);
		Blockcoalcoke.enable = config.get(category3,"Coal coke block", true).getBoolean(true);
		//         int randomItemID = config.getItem("Redstone Block", 20000).getInt();

		// Since this flag is a boolean, we can read it into the variable directly from the config.
//		Configflags = config.get(Configuration.CATEGORY_GENERAL, "SomeConfigFlag", false).getBoolean(false);

		config.save();
	}

	@Init
	public void load(FMLInitializationEvent event) {
		//        	proxy.registerRenderInformation();
		ItemStack glassstack = new ItemStack(Block.glass);
		ItemStack lavabukkit = new ItemStack(Item.bucketLava);
		ItemStack string = new ItemStack(Item.silk);
		ItemStack wheat = new ItemStack(Item.wheat);
		ItemStack redstone = new ItemStack(Item.redstone);
		ItemStack coal = new ItemStack(Item.coal);
		ItemStack charcoal = new ItemStack(Item.coal,1,1);
		ItemStack enderpearl = new ItemStack(Item.enderPearl);
		ItemStack slime = new ItemStack(Item.slimeBall);
		ItemStack egg = new ItemStack(Item.egg);
		ItemStack blazerod = new ItemStack(Item.blazeRod);
		ItemStack obsidian = new ItemStack(Block.obsidian);
		ItemStack skeleskull = new ItemStack(Item.skull);
		ItemStack zombieskull = new ItemStack(Item.skull,1,2);
		ItemStack stevehead = new ItemStack(Item.skull,1,3);
		ItemStack creeperhead = new ItemStack(Item.skull,1,4);
		
        if (Blocklavalamp.enable) {
        	lavalamp = new Blocklavalamp(lavalampconfig,0).setBlockName("lavalamp");
        	GameRegistry.registerBlock(lavalamp, "Vanitysanarchy_lavalamp");
        	LanguageRegistry.addName(lavalamp, "Lava Lamp - Legacy");
        	GameRegistry.addShapelessRecipe(new ItemStack(VanityBlocksVanity.VanityDesignblock, 1, 0), new ItemStack(lavalamp));
//    		GameRegistry.addRecipe(new ItemStack(lavalamp), new Object [] {" x ", "xyx", " x ", 'x', glassstack, 'y', lavabukkit});
        }
        if (Blockmeltingcore.enable) {
        	meltingcoreleg = new Blockmeltingcore(meltingcoreconfig,11).setBlockName("meltingcore");
        	GameRegistry.registerBlock(meltingcoreleg, "Vanitysanarchy_meltingcore");
        	GameRegistry.registerTileEntity(TileMeltingcoreleg.class,"Vanityblocks MeltingCoreleg");
        	LanguageRegistry.addName(meltingcoreleg, "Melting Core - Legacy");
        	GameRegistry.addShapelessRecipe(new ItemStack(VanityBlocksTE.Vanitytileblock, 1, 0), new ItemStack(meltingcoreleg));
//    		GameRegistry.addRecipe(new ItemStack(meltingcore), new Object [] {"zxz", "xyx", "zxz", 'x', blazerod, 'y', lavabukkit, 'z', obsidian});
        }
		ItemStack tiningot, copperingot, silveringot, leadingot, electrumingot, nickelingot, invaringot, platinumingot, nikolite;
        ItemStack blRedstone,blCharcoal, blEnderpearl, blWheat, blTin, blCopper, blSilver, blLead, blNikolite, blElectrum, blNickel, blInvar, blPlatinum, blSlime;
        ItemStack blCoal = null;
        // Vanilla
		System.out.println();
        if (Blockredstone.enable) {
        	if (OreDictionary.getOres("blockRedstone").isEmpty())
        	{
			redstoneblock = new Blockredstone(redstoneblockconfig,1).setBlockName("blockRedstone");
			GameRegistry.registerBlock(redstoneblock, "Vanitysanarchy_blockRedstone");
			LanguageRegistry.addName(redstoneblock, "Redstone Block - Legacy");
//			GameRegistry.addRecipe(new ItemStack(redstoneblock), new Object [] {"xxx", "xxx", "xxx", 'x', redstone});
//			GameRegistry.addShapelessRecipe(new ItemStack(Item.redstone, 9), new ItemStack(redstoneblock,1));
			GameRegistry.addShapelessRecipe(new ItemStack(VanityBlocksStorage.StorageBlock, 1, 7), new ItemStack(redstoneblock,1));

			blRedstone = new ItemStack(redstoneblock);
			
        }
		else blRedstone = OreDictionary.getOres("blockRedstone").get(0);
        }
        if (Blockcoal.enable) {
        	if (OreDictionary.getOres("blockCoal").isEmpty())
        	{
        	coalblock = new Blockcoal(coalblockconfig,2).setBlockName("blockCoal");
			GameRegistry.registerBlock(coalblock, "blockCoal");
			LanguageRegistry.addName(coalblock, "Coal Block - Legacy");
//			GameRegistry.addRecipe(new ItemStack(coalblock), new Object [] {"xxx", "xxx", "xxx", 'x', coal});
//			GameRegistry.addShapelessRecipe(new ItemStack(Item.coal, 9), new ItemStack(coalblock,1));
			GameRegistry.addShapelessRecipe(new ItemStack(VanityBlocksStorage.StorageBlock, 1, 0), new ItemStack(coalblock,1));
			blCoal = new ItemStack(coalblock);
		}
		else blCoal = OreDictionary.getOres("blockCoal").get(0);
        }
        if (Blockcharcoal.enable) {
        	if (OreDictionary.getOres("blockCharcoal").isEmpty())
		{
			charcoalblock = new Blockcharcoal(charcoalblockconfig,3).setBlockName("blockCharcoal");
			GameRegistry.registerBlock(charcoalblock, "blockCharcoal");
			LanguageRegistry.addName(charcoalblock, "Charcoal Block - Legacy");
//			GameRegistry.addRecipe(new ItemStack(charcoalblock), new Object [] {"xxx", "xxx", "xxx", 'x', charcoal});
//			GameRegistry.addShapelessRecipe(new ItemStack(Item.coal, 9,1), new ItemStack(charcoalblock,1));
			GameRegistry.addShapelessRecipe(new ItemStack(VanityBlocksStorage.StorageBlock, 1, 1), new ItemStack(charcoalblock,1));

		}
		else blCharcoal = OreDictionary.getOres("blockCharcoal").get(0);
        }
        if (Blockenderpearl.enable) {
        	if (OreDictionary.getOres("blockEnderpearl").isEmpty())
		{
			enderpearlblock = new Blockenderpearl(enderpearlblockconfig,4).setBlockName("blockEnderpearl");
			GameRegistry.registerBlock(enderpearlblock, "blockEnderpearl");
			LanguageRegistry.addName(enderpearlblock, "Enderpearl Block - Legacy");
//			GameRegistry.addRecipe(new ItemStack(enderpearlblock), new Object [] {"xxx", "xxx", "xxx", 'x', enderpearl});
//			GameRegistry.addShapelessRecipe(new ItemStack(Item.enderPearl, 9), new ItemStack(enderpearlblock,1));
			GameRegistry.addShapelessRecipe(new ItemStack(VanityBlocksStorage.StorageBlock, 1, 2), new ItemStack(enderpearlblock,1));

		}
		else blEnderpearl = OreDictionary.getOres("blockEnderpearl").get(0);
        }
        if (Blockslime.enable) {
        	if (OreDictionary.getOres("blockSlime").isEmpty())
		{
			slimeblock = new Blockslime(slimeblockconfig,10).setBlockName("blockslime");
			GameRegistry.registerBlock(slimeblock, "blockSlime");
			LanguageRegistry.addName(slimeblock, "Slime Block - Legacy");
//			GameRegistry.addRecipe(new ItemStack(slimeblock), new Object [] {"xxx", "xxx", "xxx", 'x', slime});
//			GameRegistry.addShapelessRecipe(new ItemStack(Item.slimeBall, 9), new ItemStack(slimeblock,1));
			GameRegistry.addShapelessRecipe(new ItemStack(VanityBlocksStorage.StorageBlock, 1, 3), new ItemStack(slimeblock,1));
		}
		else blSlime = OreDictionary.getOres("blockSlime").get(0);
        }
        if (Blockwheat.enable) {
        	if (OreDictionary.getOres("blockwheat").isEmpty())
        	{
			wheatblock = new Blockwheat(wheatblockconfig,1).setBlockName("blockWheat");
			GameRegistry.registerBlock(wheatblock, "Vanitysanarchy_blockwheat");
			LanguageRegistry.addName(wheatblock, "Bale of Wheat - Legacy");
//			GameRegistry.addRecipe(new ItemStack(wheatblock), new Object [] {"xxx", "xyx", "xxx", 'x', wheat, 'y', string});
//			GameRegistry.addShapelessRecipe(new ItemStack(Item.wheat, 8), new ItemStack(wheatblock,1));
			GameRegistry.addShapelessRecipe(new ItemStack(VanityBlocksStorage.StorageBlock, 1, 4), new ItemStack(wheatblock,1));
			blWheat = new ItemStack(wheatblock);
			
        }
		else blWheat = OreDictionary.getOres("blockWheat").get(0);
    }
		// Mod Items
        if (Blocktin.enable) {
        	if (!OreDictionary.getOres("ingotTin").isEmpty())
        	{
		    if (OreDictionary.getOres("blockTin").isEmpty())
		    {
			    tinblock = new Blocktin(tinblockconfig,5).setBlockName("blockTin");
			    GameRegistry.registerBlock(tinblock, "blockTin");
			    LanguageRegistry.addName(tinblock, "Tin Block - Legacy");
			    GameRegistry.addShapelessRecipe(new ItemStack(VanityBlocksStorage.StorageBlockMod, 1, 0), new ItemStack(tinblock,1));
//			    blTin = new ItemStack(tinblock);
		    }
/*		    else { blTin = OreDictionary.getOres("blockTin").get(0); }
		    
//		    GameRegistry.addRecipe(new ShapedOreRecipe(blTin, new Object [] {"xxx", "xxx", "xxx", 'x', "ingotTin"}));
		    tiningot = OreDictionary.getOres("ingotTin").get(0);
		    ItemStack result = tiningot.copy();
		    result.stackSize = 9;
    		GameRegistry.addShapelessRecipe(result, blTin); */
		} 
        }
        if (Blockcopper.enable) {
        	if (!OreDictionary.getOres("ingotCopper").isEmpty())
		{
		    if (OreDictionary.getOres("blockCopper").isEmpty())
		    {
			    copperblock = new Blockcopper(copperblockconfig,6).setBlockName("blockCopper");
			    GameRegistry.registerBlock(copperblock, "blockCopper");
			    LanguageRegistry.addName(copperblock, "Copper Block - Legacy");
			    GameRegistry.addShapelessRecipe(new ItemStack(VanityBlocksStorage.StorageBlockMod, 1, 1), new ItemStack(copperblock,1));

//			    blCopper = new ItemStack(copperblock);
		    }
/*		    else { blCopper = OreDictionary.getOres("blockCopper").get(0); }
		    
//		    GameRegistry.addRecipe(new ShapedOreRecipe(blCopper, new Object [] {"xxx", "xxx", "xxx", 'x', "ingotCopper"}));
		    copperingot = OreDictionary.getOres("ingotCopper").get(0);
		    ItemStack result = copperingot.copy();
		    result.stackSize = 9;
    		GameRegistry.addShapelessRecipe(result, blCopper);
    		*/
		}
        }
        if (Blocksilver.enable) {
        	if (!OreDictionary.getOres("ingotSilver").isEmpty())
		{
		    if (OreDictionary.getOres("blockSilver").isEmpty())
		    {
			    silverblock = new Blocksilver(silverblockconfig,7).setBlockName("blockSilver");
			    GameRegistry.registerBlock(silverblock, "blockSilver");
			    LanguageRegistry.addName(silverblock, "Silver Block - Legacy");
			    GameRegistry.addShapelessRecipe(new ItemStack(VanityBlocksStorage.StorageBlockMod, 1, 2), new ItemStack(silverblock,1));

//			    blSilver = new ItemStack(silverblock);
		    }
/*		    else { blSilver = OreDictionary.getOres("blockSilver").get(0); }
		    
//		    GameRegistry.addRecipe(new ShapedOreRecipe(blSilver, new Object [] {"xxx", "xxx", "xxx", 'x', "ingotSilver"}));
		    silveringot = OreDictionary.getOres("ingotSilver").get(0);
		    ItemStack result = silveringot.copy();
		    result.stackSize = 9;
    		GameRegistry.addShapelessRecipe(result, blSilver);
    		*/
		}
        }
        if (Blocklead.enable) {
        	if (!OreDictionary.getOres("ingotLead").isEmpty())
		{
		    if (OreDictionary.getOres("blockLead").isEmpty())
		    {
			    leadblock = new Blocklead(leadblockconfig,8).setBlockName("blockLead");
			    GameRegistry.registerBlock(leadblock, "blockLead");
			    LanguageRegistry.addName(leadblock, "Lead Block - Legacy");
			    GameRegistry.addShapelessRecipe(new ItemStack(VanityBlocksStorage.StorageBlockMod, 1, 3), new ItemStack(leadblock,1));
	//		    blLead = new ItemStack(leadblock);
		    }
	/*	    else { blLead = OreDictionary.getOres("blockLead").get(0); }
		    
//		    GameRegistry.addRecipe(new ShapedOreRecipe(blLead, new Object [] {"xxx", "xxx", "xxx", 'x', "ingotLead"}));
		    leadingot = OreDictionary.getOres("ingotLead").get(0);
		    ItemStack result = leadingot.copy();
		    result.stackSize = 9;
    		GameRegistry.addShapelessRecipe(result, blLead); 
    		*/
		}
        }
        if (Blocknikolite.enable) {
		if (!OreDictionary.getOres("dustNikolite").isEmpty())
		{
		    if (OreDictionary.getOres("blockNikolite").isEmpty())
		    {
			    nikoliteblock = new Blocknikolite(nikoliteblockconfig,9).setBlockName("blockNikolite");
			    GameRegistry.registerBlock(nikoliteblock, "blockNikolite");
			    LanguageRegistry.addName(nikoliteblock, "Nikolite Block - Legacy");
			    GameRegistry.addShapelessRecipe(new ItemStack(VanityBlocksStorage.StorageBlockMod, 1, 4), new ItemStack(nikoliteblock,1));

//			    blNikolite = new ItemStack(nikoliteblock);
		    }
	/*	    else { blNikolite = OreDictionary.getOres("blockNikolite").get(0); }
		    
//		    GameRegistry.addRecipe(new ShapedOreRecipe(blNikolite, new Object [] {"xxx", "xxx", "xxx", 'x', "dustNikolite"}));
		    nikolite = OreDictionary.getOres("dustNikolite").get(0);
		    ItemStack result = nikolite.copy();
		    result.stackSize = 9;
    		GameRegistry.addShapelessRecipe(result, blNikolite); */
		}
        }
        if (Blocknickel.enable) {
		if (!OreDictionary.getOres("ingotNickel").isEmpty())
		{
		    if (OreDictionary.getOres("blockNickel").isEmpty())
		    {
			    nickelblock = new Blocknickel(nickelblockconfig,13).setBlockName("blocknickel");
			    GameRegistry.registerBlock(nickelblock, "blockNickel");
			    LanguageRegistry.addName(nickelblock, "Nickel/Ferrous Block - Legacy");
			    GameRegistry.addShapelessRecipe(new ItemStack(VanityBlocksStorage.StorageBlockMod, 1, 5), new ItemStack(nickelblock,1));
//			    blNickel = new ItemStack(nickelblock);
		    }
/*		    else { blNickel = OreDictionary.getOres("blockNickel").get(0); }
		    
//		    GameRegistry.addRecipe(new ShapedOreRecipe(blNickel, new Object [] {"xxx", "xxx", "xxx", 'x', "ingotNickel"}));
		    nickelingot = OreDictionary.getOres("ingotNickel").get(0);
		    ItemStack result = nickelingot.copy();
		    result.stackSize = 9;
    		GameRegistry.addShapelessRecipe(result, blNickel); */
		}
        }
        if (Blockelectrum.enable) {
		if (!OreDictionary.getOres("ingotElectrum").isEmpty())
		{
		    if (OreDictionary.getOres("blockElectrum").isEmpty())
		    {
			    electrumblock = new Blockelectrum(electrumblockconfig,12).setBlockName("blockelectrum");
			    GameRegistry.registerBlock(electrumblock, "blockElectrum");
			    LanguageRegistry.addName(electrumblock, "Electrum Block - Legacy");
			    GameRegistry.addShapelessRecipe(new ItemStack(VanityBlocksStorage.StorageBlockMod, 1, 6), new ItemStack(electrumblock,1));
//			    blElectrum = new ItemStack(electrumblock);
		    }
/*		    else { blElectrum = OreDictionary.getOres("blockElectrum").get(0); }
		    
//		    GameRegistry.addRecipe(new ShapedOreRecipe(blElectrum, new Object [] {"xxx", "xxx", "xxx", 'x', "ingotElectrum"}));
		    electrumingot = OreDictionary.getOres("ingotElectrum").get(0);
		    ItemStack result = electrumingot.copy();
		    result.stackSize = 9;
    		GameRegistry.addShapelessRecipe(result, blElectrum); */
		}
        }
        if (Blockplatinum.enable) {
		if (!OreDictionary.getOres("ingotPlatinum").isEmpty())
		{
		    if (OreDictionary.getOres("blockPlatinum").isEmpty())
		    {
			    platinumblock = new Blockplatinum(platinumblockconfig,14).setBlockName("blockplatinum");
			    GameRegistry.registerBlock(platinumblock, "blockPlatinum");
			    LanguageRegistry.addName(platinumblock, "Platinum/Shiny Block - Legacy");
			    GameRegistry.addShapelessRecipe(new ItemStack(VanityBlocksStorage.StorageBlockMod, 1, 7), new ItemStack(platinumblock,1));
//			    blPlatinum = new ItemStack(platinumblock);
		    }
/*		    else { blPlatinum = OreDictionary.getOres("blockPlatinum").get(0); }
		    
//		    GameRegistry.addRecipe(new ShapedOreRecipe(blPlatinum, new Object [] {"xxx", "xxx", "xxx", 'x', "ingotPlatinum"}));
		    platinumingot = OreDictionary.getOres("ingotPlatinum").get(0);
		    ItemStack result = platinumingot.copy();
		    result.stackSize = 9;
    		GameRegistry.addShapelessRecipe(result, blPlatinum);
    		*/
		}
        }
        if (Blockinvar.enable) {
		if (!OreDictionary.getOres("ingotInvar").isEmpty())
		{
		    if (OreDictionary.getOres("blockInvar").isEmpty())
		    {
			    invarblock = new Blockinvar(invarblockconfig,15).setBlockName("blockinvar");
			    GameRegistry.registerBlock(invarblock, "blockInvar");
			    LanguageRegistry.addName(invarblock, "Invar Block - Legacy");
			    GameRegistry.addShapelessRecipe(new ItemStack(VanityBlocksStorage.StorageBlockMod, 1, 8), new ItemStack(invarblock,1));
//			    blInvar = new ItemStack(invarblock);
		    }
/*		    else { blInvar = OreDictionary.getOres("blockInvar").get(0); }

		    
//		    GameRegistry.addRecipe(new ShapedOreRecipe(blInvar, new Object [] {"xxx", "xxx", "xxx", 'x', "ingotInvar"}));
		    invaringot = OreDictionary.getOres("ingotInvar").get(0);
		    ItemStack result = invaringot.copy();
		    result.stackSize = 9;
    		GameRegistry.addShapelessRecipe(result, blInvar);
    		*/
		}
        }
		
		if (!OreDictionary.getOres("ingotTin").isEmpty())
			tiningot = OreDictionary.getOres("ingotTin").get(0);
		if (!OreDictionary.getOres("ingotCopper").isEmpty())
			copperingot = OreDictionary.getOres("ingotCopper").get(0);
		if (!OreDictionary.getOres("ingotSilver").isEmpty())
			silveringot = OreDictionary.getOres("ingotSilver").get(0);
		if (!OreDictionary.getOres("ingotLead").isEmpty())
			leadingot = OreDictionary.getOres("ingotLead").get(0);
		if (!OreDictionary.getOres("ingotNickel").isEmpty())
			nickelingot = OreDictionary.getOres("ingotNickel").get(0);
		if (!OreDictionary.getOres("ingotElectrum").isEmpty())
			electrumingot = OreDictionary.getOres("ingotElectrum").get(0);
		if (!OreDictionary.getOres("ingotPlatinum").isEmpty())
			platinumingot = OreDictionary.getOres("ingotPlatinum").get(0);
		if (!OreDictionary.getOres("ingotInvar").isEmpty())
			invaringot = OreDictionary.getOres("ingotInvar").get(0);
		if (!OreDictionary.getOres("dustNikolite").isEmpty())
			nikolite = OreDictionary.getOres("dustNikolite").get(0);		

        	/*########################## Mod integration ########################## */
        	/* Railcraft  fuelCoke */
            if (Loader.isModLoaded("Railcraft")) {
            	if (railcraftuseconfig) {
          		
                try {
                	ItemStack coalcoke;
                	ItemStack blCoalcoke = null;
                    if (Blockcoalcoke.enable) {
                		if (!OreDictionary.getOres("fuelCoke").isEmpty())
                		{
                		    if (OreDictionary.getOres("blockCoalcoke").isEmpty())
                		    {
                			    coalcokeblock = new Blockcoalcoke(coalcokeblockconfig,18).setBlockName("blockcoalcoke");
                			    GameRegistry.registerBlock(coalcokeblock, "blockCoalcoke");
                			    LanguageRegistry.addName(coalcokeblock, "Coalcoke Block - Legacy");
                			    GameRegistry.addShapelessRecipe(new ItemStack(VanityBlocksStorage.StorageBlockMod, 1, 9), new ItemStack(coalcokeblock,1));

//                			    blCoalcoke = new ItemStack(coalcokeblock);
                		    }
/*                		    else { blCoalcoke = OreDictionary.getOres("blockCoalcoke").get(0); }
                		    
//                		    GameRegistry.addRecipe(new ShapedOreRecipe(blCoalcoke, new Object [] {"xxx", "xxx", "xxx", 'x', "fuelCoke"}));
                		    coalcoke = OreDictionary.getOres("fuelCoke").get(0);
                		    ItemStack result = coalcoke.copy();
                		    result.stackSize = 9;
                    		GameRegistry.addShapelessRecipe(result, blCoalcoke);
*/                 
                		}
                        }
/*            		if (!OreDictionary.getOres("fuelCoke").isEmpty())
            			coalcoke = OreDictionary.getOres("fuelCoke").get(0);
            		LiquidStack liquid = LiquidDictionary.getLiquid("Creosote Oil", 4500);
            		if (liquid != null && blCoal != null && blCoalcoke != null) { RailcraftCraftingManager.cokeOven.addRecipe(blCoal, blCoalcoke, liquid, 32400);
                    */
                    }
                 catch (Exception e) {
                    // pokemon!
                }
            }
            }
        
		// **** Put this in a different forgemod. Use the mcmod.info to declare two separate mods. *** 
		//GameRegistry.addRecipe(skeleskull, new Object [] {"xxx", "xxx", "xxx", 'x', Item.bone});

	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// If you want, you can move everything down here.
		// Alternately, you can declare in the mcmod.info that you
		// must be loaded after IC2, Redpower, Buildcraft, etc, etc, etc.
		// Either way will work.
	}
}