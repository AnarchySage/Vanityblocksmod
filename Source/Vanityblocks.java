package Vanityblocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
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

@Mod(modid="Vanityblocks", name="Anarchys Vanity Blocks", version= "0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

/* 				
TO DO
add steel stuff ?
add mossy planks
 */


public class Vanityblocks {

	@Instance("Vanityblocks")
	public static Vanityblocks instance;

	@SidedProxy(clientSide = "Vanityblocks.ProxyClient", serverSide = "Vanityblocks.Proxy")
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
	public static boolean Configflags;


	//        public static Logger log = Logger.getLogger("Vanityblocks");

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		// nothing required here
		 // set up default properties		
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());

		config.load();

		lavalampconfig = config.getBlock("LavaLamp",3000).getInt();
		redstoneblockconfig = config.getBlock("Redstone Block",3001).getInt();
		coalblockconfig = config.getBlock("Coal Block",3002).getInt();
		charcoalblockconfig = config.getBlock("Charcoal Block",3003).getInt();
		enderpearlblockconfig = config.getBlock("Ender Pearl Block",3004).getInt();
		tinblockconfig = config.getBlock("Tin Block",3005).getInt();
		copperblockconfig = config.getBlock("Copper Block",3006).getInt();
		silverblockconfig = config.getBlock("Silver Block",3007).getInt();
		leadblockconfig = config.getBlock("Lead Block",3008).getInt();
		nikoliteblockconfig = config.getBlock("Nikolite Block",3009).getInt();
		slimeblockconfig = config.getBlock("Slime Block",3010).getInt();
		wheatblockconfig = config.getBlock("Bale of Wheat",3011).getInt();
		
		String category = "Storage blocks option";
		Blocklavalamp.enable = config.get(category,"lavalamp.enable", true).getBoolean(true);
		Blockredstone.enable = config.get(category,"redstoneblock.enable", true).getBoolean(true);
		Blockcoal.enable = config.get(category,"coalblock.enable", true).getBoolean(true);
		Blockcharcoal.enable = config.get(category,"charcoalblock.enable", true).getBoolean(true);
		Blockenderpearl.enable = config.get(category,"enderpearlblock.enable", true).getBoolean(true);
		Blocktin.enable = config.get(category,"tinblock.enable", true).getBoolean(true);
		Blockcopper.enable = config.get(category,"copperblock.enable", true).getBoolean(true);
		Blocksilver.enable = config.get(category,"silverblock.enable", true).getBoolean(true);
		Blocklead.enable = config.get(category,"leadblock.enable", true).getBoolean(true);
		Blocknikolite.enable = config.get(category,"nikoliteblock.enable", true).getBoolean(true);
		Blockslime.enable = config.get(category,"slimeblock.enable", true).getBoolean(true);
		Blockwheat.enable = config.get(category,"wheatblock.enable", true).getBoolean(true);
		
		String category1 = "Recipe enable or disable";
		dragoneggrecipe = config.get(category1,"dragoneggrecipe.enable", true).getBoolean(true);
		arrowtofeather = config.get(category1,"Arrow to feather", true).getBoolean(true);
		cobwebcrafting = config.get(category1,"Crafting cobwebs", true).getBoolean(true);


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
		ItemStack skeleskull = new ItemStack(Item.skull);
		ItemStack zombieskull = new ItemStack(Item.skull,1,2);
		ItemStack stevehead = new ItemStack(Item.skull,1,3);
		ItemStack creeperhead = new ItemStack(Item.skull,1,4);
		
        if (Blocklavalamp.enable) {
        	lavalamp = new Blocklavalamp(lavalampconfig,0).setBlockName("lavalamp");
        	GameRegistry.registerBlock(lavalamp, "Vanitysanarchy_lavalamp");
        	LanguageRegistry.addName(lavalamp, "Lava Lamp");
    		GameRegistry.addRecipe(new ItemStack(lavalamp), new Object [] {" x ", "xyx", " x ", 'x', glassstack, 'y', lavabukkit});
        }
		ItemStack tiningot, copperingot, silveringot, leadingot, nikolite;
        ItemStack blRedstone, blCoal, blCharcoal, blEnderpearl, blWheat, blTin, blCopper, blSilver, blLead, blNikolite, blSlime;
        
        // Vanilla
		System.out.println();
        if (Blockredstone.enable) {
        	if (OreDictionary.getOres("blockRedstone").isEmpty())
        	{
			redstoneblock = new Blockredstone(redstoneblockconfig,1).setBlockName("blockRedstone");
			GameRegistry.registerBlock(redstoneblock, "Vanitysanarchy_blockRedstone");
			LanguageRegistry.addName(redstoneblock, "Redstone Block");
			GameRegistry.addRecipe(new ItemStack(redstoneblock), new Object [] {"xxx", "xxx", "xxx", 'x', redstone});
			GameRegistry.addShapelessRecipe(new ItemStack(Item.redstone, 9), new ItemStack(redstoneblock,1));
			blRedstone = new ItemStack(redstoneblock);
			
        }
		else blRedstone = OreDictionary.getOres("blockRedstone").get(0);
        }
        if (Blockcoal.enable) {
        	if (OreDictionary.getOres("blockCoal").isEmpty())
        	{
        	coalblock = new Blockcoal(coalblockconfig,2).setBlockName("blockCoal");
			GameRegistry.registerBlock(coalblock, "blockCoal");
			LanguageRegistry.addName(coalblock, "Coal Block");
			GameRegistry.addRecipe(new ItemStack(coalblock), new Object [] {"xxx", "xxx", "xxx", 'x', coal});
			GameRegistry.addShapelessRecipe(new ItemStack(Item.coal, 9), new ItemStack(coalblock,1));
			blCoal = new ItemStack(coalblock);
		}
		else blCoal = OreDictionary.getOres("blockCoal").get(0);
        }
        if (Blockcharcoal.enable) {
        	if (OreDictionary.getOres("blockCharcoal").isEmpty())
		{
			charcoalblock = new Blockcharcoal(charcoalblockconfig,3).setBlockName("blockCharcoal");
			GameRegistry.registerBlock(charcoalblock, "blockCharcoal");
			LanguageRegistry.addName(charcoalblock, "Charcoal Block");
			GameRegistry.addRecipe(new ItemStack(charcoalblock), new Object [] {"xxx", "xxx", "xxx", 'x', charcoal});
			GameRegistry.addShapelessRecipe(new ItemStack(Item.coal, 9,1), new ItemStack(charcoalblock,1));
		}
		else blCharcoal = OreDictionary.getOres("blockCharcoal").get(0);
        }
        if (Blockenderpearl.enable) {
        	if (OreDictionary.getOres("blockEnderpearl").isEmpty())
		{
			enderpearlblock = new Blockenderpearl(enderpearlblockconfig,4).setBlockName("blockEnderpearl");
			GameRegistry.registerBlock(enderpearlblock, "blockEnderpearl");
			LanguageRegistry.addName(enderpearlblock, "Enderpearl Block");
			GameRegistry.addRecipe(new ItemStack(enderpearlblock), new Object [] {"xxx", "xxx", "xxx", 'x', enderpearl});
			GameRegistry.addShapelessRecipe(new ItemStack(Item.enderPearl, 9), new ItemStack(enderpearlblock,1));
		}
		else blEnderpearl = OreDictionary.getOres("blockEnderpearl").get(0);
        }
        if (Blockslime.enable) {
        	if (OreDictionary.getOres("blockSlime").isEmpty())
		{
			slimeblock = new Blockslime(slimeblockconfig,10).setBlockName("blockslime");
			GameRegistry.registerBlock(slimeblock, "blockSlime");
			LanguageRegistry.addName(slimeblock, "Slime Block");
			GameRegistry.addRecipe(new ItemStack(slimeblock), new Object [] {"xxx", "xxx", "xxx", 'x', slime});
			GameRegistry.addShapelessRecipe(new ItemStack(Item.slimeBall, 9), new ItemStack(slimeblock,1));

		}
		else blSlime = OreDictionary.getOres("blockSlime").get(0);
        }
        if (Blockwheat.enable) {
        	if (OreDictionary.getOres("blockwheat").isEmpty())
        	{
			wheatblock = new Blockwheat(wheatblockconfig,1).setBlockName("blockWheat");
			GameRegistry.registerBlock(wheatblock, "Vanitysanarchy_blockwheat");
			LanguageRegistry.addName(wheatblock, "Bale of Wheat");
			GameRegistry.addRecipe(new ItemStack(wheatblock), new Object [] {"xxx", "xyx", "xxx", 'x', wheat, 'y', string});
			GameRegistry.addShapelessRecipe(new ItemStack(Item.wheat, 8), new ItemStack(wheatblock,1));
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
			    LanguageRegistry.addName(tinblock, "Tin Block");
			    blTin = new ItemStack(tinblock);
		    }
		    else { blTin = OreDictionary.getOres("blockTin").get(0); }
		    
		    GameRegistry.addRecipe(new ShapedOreRecipe(blTin, new Object [] {"xxx", "xxx", "xxx", 'x', "ingotTin"}));
		    tiningot = OreDictionary.getOres("ingotTin").get(0);
		    ItemStack result = tiningot.copy();
		    result.stackSize = 9;
    		GameRegistry.addShapelessRecipe(result, blTin);
		}
        }
        if (Blockcopper.enable) {
        	if (!OreDictionary.getOres("ingotCopper").isEmpty())
		{
		    if (OreDictionary.getOres("blockCopper").isEmpty())
		    {
			    copperblock = new Blockcopper(copperblockconfig,6).setBlockName("blockCopper");
			    GameRegistry.registerBlock(copperblock, "blockCopper");
			    LanguageRegistry.addName(copperblock, "Copper Block");
			    blCopper = new ItemStack(copperblock);
		    }
		    else { blCopper = OreDictionary.getOres("blockCopper").get(0); }
		    
		    GameRegistry.addRecipe(new ShapedOreRecipe(blCopper, new Object [] {"xxx", "xxx", "xxx", 'x', "ingotCopper"}));
		    copperingot = OreDictionary.getOres("ingotCopper").get(0);
		    ItemStack result = copperingot.copy();
		    result.stackSize = 9;
    		GameRegistry.addShapelessRecipe(result, blCopper);
		}
        }
        if (Blocksilver.enable) {
        	if (!OreDictionary.getOres("ingotSilver").isEmpty())
		{
		    if (OreDictionary.getOres("blockSilver").isEmpty())
		    {
			    silverblock = new Blocksilver(silverblockconfig,7).setBlockName("blockSilver");
			    GameRegistry.registerBlock(silverblock, "blockSilver");
			    LanguageRegistry.addName(silverblock, "Silver Block");
			    blSilver = new ItemStack(silverblock);
		    }
		    else { blSilver = OreDictionary.getOres("blockSilver").get(0); }
		    
		    GameRegistry.addRecipe(new ShapedOreRecipe(blSilver, new Object [] {"xxx", "xxx", "xxx", 'x', "ingotSilver"}));
		    silveringot = OreDictionary.getOres("ingotSilver").get(0);
		    ItemStack result = silveringot.copy();
		    result.stackSize = 9;
    		GameRegistry.addShapelessRecipe(result, blSilver);
		}
        }
        if (Blocklead.enable) {
        	if (!OreDictionary.getOres("ingotLead").isEmpty())
		{
		    if (OreDictionary.getOres("blockLead").isEmpty())
		    {
			    leadblock = new Blocklead(leadblockconfig,8).setBlockName("blockLead");
			    GameRegistry.registerBlock(leadblock, "blockLead");
			    LanguageRegistry.addName(leadblock, "Lead Block");
			    blLead = new ItemStack(leadblock);
		    }
		    else { blLead = OreDictionary.getOres("blockLead").get(0); }
		    
		    GameRegistry.addRecipe(new ShapedOreRecipe(blLead, new Object [] {"xxx", "xxx", "xxx", 'x', "ingotLead"}));
		    leadingot = OreDictionary.getOres("ingotLead").get(0);
		    ItemStack result = leadingot.copy();
		    result.stackSize = 9;
    		GameRegistry.addShapelessRecipe(result, blLead);
		}
        }
        if (Blocknikolite.enable) {
		if (!OreDictionary.getOres("dustNikolite").isEmpty())
		{
		    if (OreDictionary.getOres("blockNikolite").isEmpty())
		    {
			    nikoliteblock = new Blocknikolite(nikoliteblockconfig,9).setBlockName("blockNikolite");
			    GameRegistry.registerBlock(nikoliteblock, "blockNikolite");
			    LanguageRegistry.addName(nikoliteblock, "Nikolite Block");
			    blNikolite = new ItemStack(nikoliteblock);
		    }
		    else { blNikolite = OreDictionary.getOres("blockNikolite").get(0); }
		    
		    GameRegistry.addRecipe(new ShapedOreRecipe(blNikolite, new Object [] {"xxx", "xxx", "xxx", 'x', "dustNikolite"}));
		    nikolite = OreDictionary.getOres("dustNikolite").get(0);
		    ItemStack result = nikolite.copy();
		    result.stackSize = 9;
    		GameRegistry.addShapelessRecipe(result, blNikolite);
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
		if (!OreDictionary.getOres("dustNikolite").isEmpty())
			nikolite = OreDictionary.getOres("dustNikolite").get(0);

		
		
		/*    ########################### Random Recipes ######## */
        if (Blockenderpearl.enable) {
        	if (dragoneggrecipe) {
    		GameRegistry.addRecipe(new ItemStack(Block.dragonEgg,1), new Object [] {"xxx", "xyx", "xxx", 'x', enderpearlblock, 'y', egg});
       }
        }
        	if (arrowtofeather) {
    		GameRegistry.addShapelessRecipe(new ItemStack(Item.feather,1), new ItemStack(Item.arrow,1));
        }
        	if (cobwebcrafting) {
        		GameRegistry.addRecipe(new ItemStack(Block.web), new Object [] {"x x", " x ", "x x", 'x', string});
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