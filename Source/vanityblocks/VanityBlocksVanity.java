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


	//        public static Logger log = Logger.getLogger("Vanityblocks");

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		Storageprops.initProps();
		VanityDesignId = Storageprops.vanitydesignconfig;
		VanityDesignblock = new VanityDesignblock(VanityDesignId);
		
		String[] vanitydesignBlockNames = {
				"Lava Lamp"
		};		
		/* ######### Block registration and naming #### */
		GameRegistry.registerBlock(VanityDesignblock, vanityblocks.VanitydesignItemBlock.class, "Vanity Blocks Design blocks");
		LanguageRegistry.addName(new ItemStack(VanityDesignblock, 1, 0), "Lava Lamp");
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
		ItemStack rottenflesh = new ItemStack(Item.rottenFlesh);
		
        if (Storageprops.enablelavalamp) {
    	GameRegistry.addRecipe(new ItemStack(VanityDesignblock, 1, 0), " x ", "xyx", " x ", 'x', glassstack, 'y', lavabukkit);
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