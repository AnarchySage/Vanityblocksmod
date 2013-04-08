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
//import railcraft.common.api.core.items.ItemRegistry;
//import railcraft.common.api.crafting.ICokeOvenCraftingManager;

@Mod(modid="VanityBlocks-Te", name="Anarchys Vanity Blocks-Te", version= DefaultProps.VERSIONTE)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)



public class VanityBlocksTE {

	@Instance("VanityBlocks-Te")
	public static VanityBlocksTE instance;

	@SidedProxy(clientSide = "vanityblocks.ProxyClient", serverSide = "vanityblocks.Proxy")
	public static Proxy proxy;
	
	public static int vanityentitycofnig;
	public static Block Vanitytileblock;
	public static int VanitytileblockId;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		Storageprops.initProps();
		VanitytileblockId = Storageprops.vanityentityconfig;
		Vanitytileblock = new Vanitytileblock(VanitytileblockId);
		
		String[] vannilastorageBlockNames = { 
			"Melting Core" 
		};

/*#################### Tile Entitys ################ */
		GameRegistry.registerBlock(Vanitytileblock, vanityblocks.vanitytileItemBlock.class, "Vanity TE ");
    	GameRegistry.registerTileEntity(TileMeltingcore.class,"Vanityblocks MeltingCore");
		LanguageRegistry.addName(new ItemStack(Vanitytileblock, 1, 0), "Melting Core");

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
		if (Storageprops.enablemeltingcore) {
		ItemStack blazerod = new ItemStack(Item.blazeRod);
		ItemStack obsidian = new ItemStack(Block.obsidian);
		ItemStack lavabukkit = new ItemStack(Item.bucketLava);
		GameRegistry.addRecipe(new ItemStack(Vanitytileblock, 1, 0), new Object [] {"zxz", "xyx", "zxz", 'x', blazerod, 'y', lavabukkit, 'z', obsidian});
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
