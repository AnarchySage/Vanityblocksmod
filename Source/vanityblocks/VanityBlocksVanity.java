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
				"Marble", "Marble Brick", "Chiseled Marble", "Ashford Black Marble", "Ashford Black Marble Brick", "Chiseled Ashford Black Marble"
		};
		/* ######### Block registration and naming for vanity #### */
		GameRegistry.registerBlock(VanityDesignblock, vanityblocks.VanitydesignItemBlock.class, "Vanity Blocks Design blocks");
		LanguageRegistry.addName(new ItemStack(VanityDesignblock, 1, 0), "Lava Lamp");
		
		/* ######### Block registration and naming for world gen #### */
		GameRegistry.registerBlock(VanityDesignworldblock, vanityblocks.VanitydesignworldItemBlock.class, "Vanity Blocks World blocks");
		LanguageRegistry.addName(new ItemStack(VanityDesignworldblock, 1, 0), "Marble");
		LanguageRegistry.addName(new ItemStack(VanityDesignworldblock, 1, 1), "Marble Brick");
		LanguageRegistry.addName(new ItemStack(VanityDesignworldblock, 1, 1), "Chiseled Marble");
		LanguageRegistry.addName(new ItemStack(VanityDesignworldblock, 1, 3), "Ashford Black Marble");
		LanguageRegistry.addName(new ItemStack(VanityDesignworldblock, 1, 4), "Ashford Black Marble Brick");
		LanguageRegistry.addName(new ItemStack(VanityDesignworldblock, 1, 5), "Chiseled Ashford Black Marble");
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
		ItemStack glassstack = new ItemStack(Block.glass);
		ItemStack lavabukkit = new ItemStack(Item.bucketLava);
        if (Storageprops.enablelavalamp) {
    	GameRegistry.addRecipe(new ItemStack(VanityDesignblock, 1, 0), " x ", "xyx", " x ", 'x', glassstack, 'y', lavabukkit);
        }
        if (Storageprops.generatemarble) {
        GameRegistry.addRecipe(new ItemStack(VanityDesignworldblock, 4, 1), "xx", "xx",  'x', new ItemStack(VanityDesignworldblock,0,0));
        GameRegistry.addShapelessRecipe(new ItemStack(VanityDesignworldblock, 1, 0), new ItemStack(VanityDesignworldblock,0,1));
        }
    	if (Storageprops.arrowtofeather) {
		GameRegistry.addShapelessRecipe(new ItemStack(Item.feather,1), new ItemStack(Item.arrow,1));
    	}
    	if (Storageprops.fleshtoleather) {
    	GameRegistry.addSmelting(Item.rottenFlesh.itemID, new ItemStack(Item.leather, 1), 0.5F);
    	}
    	if (Storageprops.quartzblocktoquartz) {
    	GameRegistry.addShapelessRecipe(new ItemStack(Item.field_94583_ca, 4), new ItemStack(Block.blockNetherQuartz));
    	// Change field_94583_ca to netherquartz when they rename it
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