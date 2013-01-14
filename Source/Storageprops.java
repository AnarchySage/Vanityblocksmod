package vanityblocksstorage;

import java.io.File;
import net.minecraftforge.common.Configuration;


public class Storageprops {
	public static void initProps()
	{
        Configuration config = new Configuration(new File(DefaultProps.FILE_CONFIG));

		config.load();
		String category = "Block id's";		
//		lavalampconfig = config.get(category,"Lava Lamp",3000).getInt();
//		redstoneblockconfig = config.get(category,"Redstone Block",3001).getInt();
//		coalblockconfig = config.get(category,"Coal Block",3002).getInt();
//		charcoalblockconfig = config.get(category,"Charcoal Block",3003).getInt();
//		enderpearlblockconfig = config.get(category,"Ender Pearl Block",3004).getInt();
//		tinblockconfig = config.get(category,"Tin Block",3005).getInt();
//		copperblockconfig = config.get(category,"Copper Block",3006).getInt();
//		silverblockconfig = config.get(category,"Silver Block",3007).getInt();
//		leadblockconfig = config.get(category,"Lead Block",3008).getInt();
//		nikoliteblockconfig = config.get(category,"Nikolite Block",3009).getInt();
//		slimeblockconfig = config.get(category,"Slime Block",3010).getInt();
//		wheatblockconfig = config.get(category,"Bale of Wheat",3011).getInt();
//		meltingcoreconfig = config.get(category,"Melting Core block",3012).getInt();
//		nickelblockconfig = config.get(category,"Ferrous / Nickel Block",3013).getInt();
//		electrumblockconfig = config.get(category,"Electrum Block",3014).getInt();
//		platinumblockconfig = config.get(category,"Platinum / Shiny Block",3015).getInt();
//		invarblockconfig = config.get(category,"Invar Block",3016).getInt();
//		coalcokeblockconfig = config.get(category, "CoalCoke Block",3017).getInt();
//		brassblockconfig = config.get(category, "Brass Block",3018).getInt();
		storageblockconfig = config.get(category, "Storage Blocks",3050).getInt();

		
		String category1 = "Storage blocks option";
		storageblocking = config.get(category1,"Storage blocks enabled?", true).getBoolean(true);
		enablecoal = config.get(category1,"coalblock.enable", true).getBoolean(true);
		enablecharcoal = config.get(category1,"charcoalblock.enable", true).getBoolean(true);
		enabletin = config.get(category1,"tinblock.enable", true).getBoolean(true);
//		Blockenderpearl.enable = config.get(category1,"enderpearlblock.enable", true).getBoolean(true);
//		Blocktin.enable = config.get(category1,"tinblock.enable", true).getBoolean(true);
//		Blockcopper.enable = config.get(category1,"copperblock.enable", true).getBoolean(true);
//		Blocksilver.enable = config.get(category1,"silverblock.enable", true).getBoolean(true);
//		Blocklead.enable = config.get(category1,"leadblock.enable", true).getBoolean(true);
//		Blocknikolite.enable = config.get(category1,"nikoliteblock.enable", true).getBoolean(true);
//		Blockslime.enable = config.get(category1,"slimeblock.enable", true).getBoolean(true);
//		Blockwheat.enable = config.get(category1,"wheatblock.enable", true).getBoolean(true);
//		Blockmeltingcore.enable = config.get(category1,"meltingcore.enable", true).getBoolean(true);
//		Blocknickel.enable = config.get(category1,"ferrous/nickelblock.enable", true).getBoolean(true);
//		Blockelectrum.enable = config.get(category1,"electrumblock.enable", true).getBoolean(true);
//		Blockplatinum.enable = config.get(category1,"platinum/shinyblock.enable", true).getBoolean(true);
//		Blockinvar.enable = config.get(category1,"invarblock.enable", true).getBoolean(true);
//		Blockbrass.enable = config.get(category1,"brassblock.enable", true).getBoolean(true);
		
//		String category2 = "Recipe enable or disable";
//		dragoneggrecipe = config.get(category2,"Crafting Dragon Egg", true).getBoolean(true);
//		arrowtofeather = config.get(category2,"Arrow to feather", true).getBoolean(true);
//		cobwebcrafting = config.get(category2,"Crafting cobwebs", true).getBoolean(true);
		
//		String category3 = "Compatibility with other mods";
//		railcraftuseconfig = config.get(category2,"Use railcraft stuff?", true).getBoolean(true);
//		Blockcoalcoke.enable = config.get(category3,"Coal coke block", true).getBoolean(true);
		//         int randomItemID = config.getItem("Redstone Block", 20000).getInt();

		// Since this flag is a boolean, we can read it into the variable directly from the config.
//		Configflags = config.get(Configuration.CATEGORY_GENERAL, "SomeConfigFlag", false).getBoolean(false);

		config.save();
	}
	public static int storageblockconfig;
	public static boolean enableredstone;
	public static boolean enablecoal;
	public static boolean enablecharcoal;
	public static boolean enabletin;
	public static boolean storageblocking;
}
