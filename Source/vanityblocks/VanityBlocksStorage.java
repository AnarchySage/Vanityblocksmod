package vanityblocks;

import vanityblocks.FuelHandler.VanityForestryFuelHandler;
import vanityblocks.FuelHandler.VanitymodFuelHandler;
import vanityblocks.FuelHandler.VanityvanFuelHandler;
import vanityblocks.WorldGen.AVillageTrades;
import vanityblocks.WorldGen.MarbleGen;
import vanityblocks.WorldGen.UnderWaterRuinHandler;
import vanityblocks.WorldGen.VillageModHandler;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.liquids.LiquidDictionary;
import net.minecraftforge.liquids.LiquidStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
//import railcraft.common.api.crafting.RailcraftCraftingManager;
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
import cpw.mods.fml.common.registry.VillagerRegistry;

@Mod(modid="VanityBlocks-Storage", name="Anarchys Vanity Blocks-Storage", version= DefaultProps.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

/* 				
TO DO
add steel stuff ?
add mossy planks
GameRegistry.addShapelessRecipe(new ItemStack(VanityBlocksStorage.StorageBlock, 1, 7), new ItemStack(redstoneblock,1));
^how to legacy
Hold f3 and hit h for item id's
user suggestion
make fish block, maybe smooth version of end stone-vanity,double stone slab crafting - vanity
maybe arrow bundle, yay first item idea XD, liquid water thats colored -waiting on forge api for it
 humus and bog earth, not ore dictioned, would require api
maybe- potatoe, carrot, seeds, clay block 9x clayballs
Villager that trades modded items
Vanity - Chiseled sandstone blocks, chairs? coral blocks/generation, redstone lamps diff colored, curtains maybe?, inverted redstone lamps, colored sand/glass
Add new module, integration, dusts and such for gregtech, 
spling wants enchant for bow that teleports the mob, and potion of swimming,  ..SubSide.. Anarchy, you could make it that only if they are in water, they get a speed potion boost.
To add info to the bottom of blocks = https://github.com/mDiyo/Natura/blob/master/mods/natura/blocks/CloudItem.java
ADD STONEHENGE!!!!!!!!!!
!!!!!!!!
 */


public class VanityBlocksStorage {

	@Instance("VanityBlocks-Storage")
	public static VanityBlocksStorage instance;
	public static final String modid = "VanityBlocksStorage";

	@SidedProxy(clientSide = "vanityblocks.ProxyClient", serverSide = "vanityblocks.Proxy")
	public static Proxy proxy;
	
/*	public static int storageblockconfig;
	public static int storageblockmodconfig;
	public static boolean storageblockint;
	public static Block StorageBlock;
	public static Block StorageBlockMod;
	public static Block ForestryBlock;
	public static int StorageBlockId;
	public static int StorageBlockModId;
	public static int ForestryBlockId; */

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		Storageprops.initProps();
		BlockRegistration.blockregistration();
	}

	@Init
	public void load(FMLInitializationEvent event) {
     	proxy.registerRenderInformation();
		proxy.addNames();
		BlockRegistration.addVanillaRecipes();
		FurnaceMelting.addFurnaceMelts();
		Dungeonlootspawning.chestHooks();
		GameRegistry.registerWorldGenerator(new MarbleGen(0));
		GameRegistry.registerWorldGenerator(new UnderWaterRuinHandler());
		GameRegistry.registerFuelHandler(new VanityvanFuelHandler());
		// ### Villager/village Related
//		AVillageTrades trades = new AVillageTrades();
//		VillagerRegistry.instance().registerVillagerType(56789, "/mods/vanityblocks/textures/mob/villager.png");
//        VillagerRegistry.instance().registerVillageCreationHandler(new VillageModHandler());
//        VillagerRegistry.instance().registerVillageTradeHandler(56789, trades);
        //###Creative tab related
		LanguageRegistry.instance().addStringLocalization("itemGroup.vanityblocks", "en_US", "Anarchys Vanity Blocks");
	}
    public static CreativeTabs tabCustom = new CreativeTabs("vanityblocks") {
        public ItemStack getIconItemStack() {
                return new ItemStack(VanityBlocksVanity.VanityDesignblock, 1, 0);
        } 
};	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		BlockRegistration.addModRecipes();
		BlockRegistration.addForestryRecipes();
		Dungeonlootspawning.chestHooks();
		GameRegistry.registerFuelHandler(new VanityForestryFuelHandler());
		GameRegistry.registerFuelHandler(new VanitymodFuelHandler());
	}
}
