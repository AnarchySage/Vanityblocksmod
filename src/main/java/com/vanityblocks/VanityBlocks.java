package com.vanityblocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

import com.vanityblocks.Events.MobDropsBoneEvent;
import com.vanityblocks.FuelHandler.VanityForestryFuelHandler;
import com.vanityblocks.FuelHandler.VanitymodFuelHandler;
import com.vanityblocks.FuelHandler.VanityvanFuelHandler;
import com.vanityblocks.Registrations.ClayStairRegistration;
import com.vanityblocks.Registrations.CompressedRegistrations;
import com.vanityblocks.Registrations.GeneralItemRegistration;
import com.vanityblocks.Registrations.Modbypass;
import com.vanityblocks.Registrations.OreDictionaryBypass;
import com.vanityblocks.Registrations.RandomBlockRegistrations;
import com.vanityblocks.Registrations.RandomRecipes;
import com.vanityblocks.Registrations.RedstoneLampRegistrations;
import com.vanityblocks.Registrations.RupeeRegistration;
import com.vanityblocks.Registrations.StorageBlocksRegistration;
import com.vanityblocks.Registrations.TEBlocksRegistration;
import com.vanityblocks.Registrations.VanityBlocksRegistration;
import com.vanityblocks.WorldGen.GADWorldGen;
import com.vanityblocks.WorldGen.MarbleGen;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "vanityblocks", name = "Anarchys Vanity Blocks", version = "DefaultProps.LOCALMAJVERSION")
// + "." + DefaultProps.LOCALMINVERSION + "." + DefaultProps.LOCALBUILDVERSION)
public class VanityBlocks {

	@Instance("VanityBlocks")
	public static VanityBlocks instance;
	public static final String modid = "vanityblocks";

	// public static final String LANGUAGE_PATH = "assets/vanityblocks/lang/";
	// private static final String[] LANGUAGES_SUPPORTED = new String[] {
	// "en_US" };

	@SidedProxy(clientSide = "com.vanityblocks.ProxyClient", serverSide = "com.vanityblocks.Proxy")
	public static Proxy proxy;

	// public static void checkVersion (Side side)
	// {
	// VersionCheck.startCheck(side);
	// }

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Main part of mod
		Storageprops.initProps(event.getModConfigurationDirectory());
		// Dimension config loader
		// Storageprops.dimensionconfig(event.getModConfigurationDirectory());
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderInformation();
		proxy.addNames();
		/* ########### Storage Block Registration ######### */
		if (Storageprops.enablestorageblocks) {
			StorageBlocksRegistration.blockregistration();
			StorageBlocksRegistration.addVanillaRecipes();
			GameRegistry.registerFuelHandler(new VanityvanFuelHandler());
		}
		/* ####### Furnace melting Registration ### */
		if (Storageprops.furnacemelts) {
			FurnaceMelting.addFurnaceMelts();
		}
		/* Vanity Block Registrations */
		if (Storageprops.enableworldgen) {
			VanityBlocksRegistration.vanityregistration();
			VanityBlocksRegistration.addVanityRecipes();
		}
		/* ######## Tile Entity Registration ###### */
		if (Storageprops.enablemeltingcore) {
			TEBlocksRegistration.teregistration();
			TEBlocksRegistration.addTeRecipes();
		}
		/* General Item Registrations */
		if (Storageprops.enablegeneralitems) {
			GeneralItemRegistration.generalitemregistration();
			GeneralItemRegistration.additemrecipes();
		}
		/* Rupee Registration */
		if (Storageprops.enablerupees) {
			RupeeRegistration.rupeeregistration();
			RupeeRegistration.addrupeerecipes();
		}
		/*
		 * Registration of the Random blocks
		 */
		if (Storageprops.enablerandomblocks) {
			RandomBlockRegistrations.randomblockregistration();
			RandomBlockRegistrations.addRecipes();
		}
		/* Registration of the redstone lamps */
		if (Storageprops.enableredstonelamps) {
			RedstoneLampRegistrations.redstonelampregistration();
			RedstoneLampRegistrations.addRecipes();
		}
		/* Registration of the Trapdoors */
		if (Storageprops.enabletrapdoors) {
			RandomBlockRegistrations.trapdoorregistration();
		}
		/* Registration of the random recipes */
		if (Storageprops.enablerandomrecipes) {
			RandomRecipes.addRandomRecipes();
		}
		/* Registration of the Clay stairs */
		if (Storageprops.enableclaystairs) {
			ClayStairRegistration.claystairregistration();
			ClayStairRegistration.addRecipes();
		}

		/* Registration of the Compressed common materials */
		if (Storageprops.enablecompressblocks) {
			CompressedRegistrations.compressblockregistration();
			CompressedRegistrations.addRecipes();
		}
		/* Registration of the pillars */
		//if (Storageprops.enablepillars) {
		//	PillarRegistrations.pillarregistrations();
		//	PillarRegistrations.addRecipes();
		//}
		/* Dungeon loot stuff */
		if (Storageprops.dungeonlootenablevannila) {
			Dungeonlootspawning.chestHooks();
		}
		if (Storageprops.dungeonlootenablemod) {
			Dungeonlootspawning.chestHooks();
		}
		if (Storageprops.enablebonedrops) {
		MinecraftForge.EVENT_BUS.register(new MobDropsBoneEvent());
		}
		/*
		 * Removed code for time being. GameRegistry.registerWorldGenerator(new
		 * UnderWaterRuinHandler()); //Registration of world gen for
		 * ruins(removed)Dungeonlootspawning.chestHooks();Villager/village
		 * RelatedAVillageTrades trades = new AVillageTrades();
		 * VillagerRegistry.instance().registerVillagerType(56789,
		 * "/mods/vanityblocks/textures/mob/villager.png");
		 * VillagerRegistry.instance().registerVillageCreationHandler(new
		 * VillageModHandler());
		 * VillagerRegistry.instance().registerVillageTradeHandler(56789,
		 * trades);
		 */
	}

	public static CreativeTabs tabvanityblocks = new CreativeTabs(
			"tabvanityblocks") {

		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return Item
					.getItemFromBlock(VanityBlocksRegistration.VanityDesignblock);
		}
	};

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		StorageBlocksRegistration.addModRecipes();
		StorageBlocksRegistration.addForestryRecipes();
		GameRegistry.registerFuelHandler(new VanityForestryFuelHandler());
		GameRegistry.registerFuelHandler(new VanitymodFuelHandler());
		// Dimension provider registrations
		// if (Storageprops.enableminingworld) {
		// DimensionManagement.providerregistrations();
		// }
		/* Mod bypassing */
		if (Storageprops.enablegregtechbypass) {
			Modbypass.bypassrecipes();
			FMLLog.info("[VanityBlocks] Bypass recipes for Gregtech are enabled");
		}
		// Enables the Ore Dictionary ingot attempt fix
		if (Storageprops.enableoredictionaryfix) {
			OreDictionaryBypass.bypassrecipes();
			FMLLog.info("[VanityBlocks] Bypass for OreDictionary ingots are enabled");
		}
		/* ######################## World Gen Registration ###### */
		if (Storageprops.enableworldgen) {
			GameRegistry.registerWorldGenerator(new MarbleGen(0), 25);
			GameRegistry.registerWorldGenerator(new GADWorldGen(0), 0);

		}
		FMLLog.info("[VanityBlocks] Seems to have loaded well!");
	}

	@EventHandler
	public void serverInit(FMLServerStartedEvent event) {
		// if (Storageprops.versioncheck)
		// {
		// VersionCheck.startCheck(Side.SERVER);
		// }
	}

	@EventHandler
	public static void serverStarting(FMLServerStartingEvent event) {
		// if (Storageprops.enableminingworld)
		// {
		// DimensionManagement.dimensionregistration();
		// }
	}
}
