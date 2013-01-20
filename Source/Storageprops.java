package vanityblocks;

import java.io.File;

import net.minecraftforge.common.Configuration;


public class Storageprops {
	public static void initProps()
	{
        Configuration config = new Configuration(new File(DefaultProps.FILE_CONFIG));

		config.load();
		String category = "Block id's";		
		storageblockconfig = config.get(category,"Vannila Storage Blocks",3050).getInt();
		storageblockmodconfig = config.get(category,"Modded Storage Blocks",3051).getInt();
		vanityentityconfig = config.get(category, "Vanity Blocks Tile Entity(such as melting core",3054).getInt();
		vanitydesignconfig = config.get(category,"Vanity design blocks",3055).getInt();


		String category1 = "Blocks Enable or disable";
//		storageblocking = config.get(category1,"Storage blocks enabled?", true).getBoolean(true);
		enablecoal = config.get(category1,"coalblock.enable", true).getBoolean(true);
		enablecharcoal = config.get(category1,"charcoalblock.enable", true).getBoolean(true);
		enabletin = config.get(category1,"tinblock.enable", true).getBoolean(true);
    	enableenderpearl = config.get(category1,"enderpearlblock.enable", true).getBoolean(true);
    	enableslime = config.get(category1,"slimeblock.enable", true).getBoolean(true);
    	enablewheatbale = config.get(category1, "wheatbale.enable", true).getBoolean(true);
    	enablesugar = config.get(category1, "sugarblock.enable", true).getBoolean(true);
    	enableredstone = config.get(category1, "redstoneblock.enable", true).getBoolean(true);
    	enablecocoa = config.get(category1, "cocoablock.enable", true).getBoolean(true);
		enabletin = config.get(category1,"tinblock.enable", true).getBoolean(true);
		enablecopper = config.get(category1,"copperblock.enable", true).getBoolean(true);
		enablesilver = config.get(category1,"silverblock.enable", true).getBoolean(true);
		enablelead = config.get(category1,"leadblock.enable", true).getBoolean(true);
		enablenikolite = config.get(category1,"nikoliteblock.enable", true).getBoolean(true);
//		Blockmeltingcore.enable = config.get(category1,"meltingcore.enable", true).getBoolean(true);
		enablenickel = config.get(category1,"ferrous/nickelblock.enable", true).getBoolean(true);
		enableelectrum = config.get(category1,"electrumblock.enable", true).getBoolean(true);
		enableplatinum = config.get(category1,"platinum/shinyblock.enable", true).getBoolean(true);
		enableinvar = config.get(category1,"invarblock.enable", true).getBoolean(true);
		enablebrass = config.get(category1,"brassblock.enable", true).getBoolean(true);
		enablemeltingcore = config.get(category1, "meltingcore.enable", true).getBoolean(true);
		enablelavalamp = config.get(category1,"lavalamp.enable", true).getBoolean(true);

		String category2 = "Other mod compatibility";
		enablerailcraftuse = config.get(category2,"Use railcraft stuff?", true).getBoolean(true);
		enablecoalcoke = config.get(category2,"coalcokeblock.enable", true).getBoolean(true);
		String category3 = "Recipe enable or disable";
		dragoneggrecipe = config.get(category3,"Crafting Dragon Egg", true).getBoolean(true);
		arrowtofeather = config.get(category3,"Arrow to feather", true).getBoolean(true);
		cobwebcrafting = config.get(category3,"Crafting cobwebs", true).getBoolean(true);
//		String category3 = "Compatibility with other mods";
//		Blockcoalcoke.enable = config.get(category3,"Coal coke block", true).getBoolean(true);
		//         int randomItemID = config.getItem("Redstone Block", 20000).getInt();

		// Since this flag is a boolean, we can read it into the variable directly from the config.
//		Configflags = config.get(Configuration.CATEGORY_GENERAL, "SomeConfigFlag", false).getBoolean(false);

		config.save();
	}
	public static int storageblockconfig;
	public static int storageblockmodconfig;
	public static int vanityentityconfig;
	public static int vanitydesignconfig;
	public static boolean enableredstone;
	public static boolean enablecoal;
	public static boolean enablecharcoal;
	public static boolean enableenderpearl;
	public static boolean enableslime;
	public static boolean enablewheatbale;
	public static boolean enablesugar;
	public static boolean enablecocoa;
	public static boolean enabletin;
	public static boolean enablecopper;
	public static boolean enablesilver;
	public static boolean enablelead;
	public static boolean enablenikolite;
	public static boolean enablenickel;
	public static boolean enableelectrum;
	public static boolean enableplatinum;
	public static boolean enableinvar;
	public static boolean enablebrass;
	public static boolean enablemeltingcore;
	public static boolean enablelavalamp;
	public static boolean dragoneggrecipe;
	public static boolean arrowtofeather;
	public static boolean cobwebcrafting;
	public static boolean enablerailcraftuse;
	public static boolean enablecoalcoke;
	public static boolean storageblocking;
}
