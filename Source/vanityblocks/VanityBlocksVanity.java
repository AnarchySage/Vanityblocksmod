package vanityblocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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

@Mod(modid="VanityBlocks-Vanity", name="Anarchys Vanity Blocks-Vanity", version= DefaultProps.VERSIONVanity)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)




public class VanityBlocksVanity {

	@Instance("VanityBlocksVanity")
	public static VanityBlocksVanity instance;

	@SidedProxy(clientSide = "vanityblocks.ProxyClient", serverSide = "vanityblocks.Proxy")
	public static Proxy proxy;
	public static int vanitydesignconfig;
	public static Block VanityDesignblock;
	public static int VanityDesignId;
	public static int VanityDesignworldId;
	public static Block VanityDesignworldblock;


	//        public static Logger log = Logger.getLogger("Vanityblocks");

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		Storageprops.initProps();
		VanityDesignId = Storageprops.vanitydesignconfig;
		VanityDesignblock = new VanityDesignblock(VanityDesignId);
		VanityDesignworldId = Storageprops.vanitydesignworldconfig;
		VanityDesignworldblock = new VanityDesignworldblock(VanityDesignworldId);
		
		String[] vanitydesignBlockNames = {
				"Lava Lamp"
		};		
		String [] vanitydesignWorldblockNames = {
				"Marble", "Marble Brick", "Chiseled Marble", "Marble Slab", "Marble Stair",
				"Ashford Black Marble", "Ashford Black Marble Brick", "Chiseled Ashford Black Marble", "Ashford Black Marble Slab", "Ashford Black Marble Stair"
		};
		/* ######### Block registration and naming for vanity #### */
		GameRegistry.registerBlock(VanityDesignblock, vanityblocks.VanitydesignItemBlock.class, "Vanity Blocks Design blocks");
		LanguageRegistry.addName(new ItemStack(VanityDesignblock, 1, 0), "Lava Lamp");
		
		/* ######### Block registration and naming for world gen #### */
		GameRegistry.registerBlock(VanityDesignworldblock, vanityblocks.VanitydesignworldItemBlock.class, "Vanity Blocks World blocks");
		LanguageRegistry.addName(new ItemStack(VanityDesignworldblock, 1, 0), "Marble");
		LanguageRegistry.addName(new ItemStack(VanityDesignworldblock, 1, 1), "Marble Brick");
		LanguageRegistry.addName(new ItemStack(VanityDesignworldblock, 1, 2), "Chiseled Marble");
		LanguageRegistry.addName(new ItemStack(VanityDesignworldblock, 1, 3), "Marble Slab");
		LanguageRegistry.addName(new ItemStack(VanityDesignworldblock, 1, 4), "Marble Stair");
		LanguageRegistry.addName(new ItemStack(VanityDesignworldblock, 1, 5), "Ashford Black Marble");
		LanguageRegistry.addName(new ItemStack(VanityDesignworldblock, 1, 6), "Ashford Black Marble Brick");
		LanguageRegistry.addName(new ItemStack(VanityDesignworldblock, 1, 7), "Chiseled Ashford Black Marble");
		LanguageRegistry.addName(new ItemStack(VanityDesignworldblock, 1, 8), "Ashford Black Marble Slab");
		LanguageRegistry.addName(new ItemStack(VanityDesignworldblock, 1, 9), "Ashford Black Marble Stair");
	}
	@Init
	public void load(FMLInitializationEvent event) {
		//        	proxy.registerRenderInformation();
	proxy.registerRenderInformation();
	proxy.addNames();
	addRecipes();
	}
	public void addRecipes()
	{
		ItemStack glasspane = new ItemStack(Block.thinGlass);
		ItemStack lavabukkit = new ItemStack(Item.bucketLava);
        if (Storageprops.enablelavalamp) {
    	GameRegistry.addRecipe(new ItemStack(VanityDesignblock, 4, 0), "zxz", "xyx", "zxz", 'x', glasspane, 'y', lavabukkit , 'z', Block.stone);
        }
        if (Storageprops.generatemarble) {
        GameRegistry.addRecipe(new ItemStack(VanityDesignworldblock, 4, 1), "xx", "xx",  'x', new ItemStack(VanityDesignworldblock,0,0));
        GameRegistry.addShapelessRecipe(new ItemStack(VanityDesignworldblock, 1, 0), new ItemStack(VanityDesignworldblock,0,1));
        GameRegistry.addRecipe(new ItemStack(VanityDesignworldblock, 4, 2), "xx", "xx",  'x', new ItemStack(VanityDesignworldblock,0,1));
        }
        if (Storageprops.generateblackmarble) {
        GameRegistry.addRecipe(new ItemStack(VanityDesignworldblock, 4, 6), "xx", "xx",  'x', new ItemStack(VanityDesignworldblock,0,5));
        GameRegistry.addShapelessRecipe(new ItemStack(VanityDesignworldblock, 1, 5), new ItemStack(VanityDesignworldblock,0,6));
        GameRegistry.addRecipe(new ItemStack(VanityDesignworldblock, 4, 7), "xx", "xx",  'x', new ItemStack(VanityDesignworldblock,0,6));
        }
    	if (Storageprops.arrowtofeather) {
		GameRegistry.addShapelessRecipe(new ItemStack(Item.feather,1), new ItemStack(Item.arrow,1));
    	}
    	if (Storageprops.fleshtoleather) {
    	GameRegistry.addSmelting(Item.rottenFlesh.itemID, new ItemStack(Item.leather, 1), 0.5F);
    	}
    	if (Storageprops.quartzblocktoquartz) {
    	GameRegistry.addShapelessRecipe(new ItemStack(Item.netherQuartz, 4), new ItemStack(Block.blockNetherQuartz));
    	}
    	if (Storageprops.greendye) {
 //           GameRegistry.addRecipe(new ItemStack(Item.dyePowder,1,2), "xy", 'x', new ItemStack(Item.dyePowder,1,4), 'y', new ItemStack(Item.dyePowder,1,11));
 //          GameRegistry.addRecipe(new ItemStack(Item.dyePowder,1,2), "x", "y", 'x', new ItemStack(Item.dyePowder,1,4), 'y', new ItemStack(Item.dyePowder,1,11));
 //           GameRegistry.addRecipe(new ItemStack(Item.dyePowder,1,2), "y", "x", 'x', new ItemStack(Item.dyePowder,1,4), 'y', new ItemStack(Item.dyePowder,1,11));
            GameRegistry.addShapelessRecipe(new ItemStack(Item.dyePowder,1,2), new ItemStack(Item.dyePowder,1,4), new ItemStack(Item.dyePowder,1,11));
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