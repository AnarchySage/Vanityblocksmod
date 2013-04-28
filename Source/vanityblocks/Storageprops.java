package vanityblocks;

import java.io.File;
import java.util.Set;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;


public class Storageprops {
	public static void initProps()
	{
        Configuration config = new Configuration(new File(DefaultProps.FILE_CONFIG));

		config.load();
		String category = "Block id's";		
		storageblockconfig = config.get(category,"Vannila Storage Blocks",3050).getInt();
		storageblockmodconfig = config.get(category,"Modded Storage Blocks",3051).getInt();
		forestryblockconfig = config.get(category,"Forestry Storage Blocks",3053).getInt();
		vanitydesignconfig = config.get(category,"Vanity design blocks",3055).getInt();
		vanitydesignworldconfig = config.get(category,"Vanity Blocks World Generation blocks",3058).getInt();
		vanityentityconfig = config.get(category, "Vanity Blocks Tile Entity(such as melting core)",3060).getInt();


		String category1 = "Blocks Enable or disable";
//		storageblocking = config.get(category1,"Storage blocks enabled?", true).getBoolean(true);
		enablecoal = config.get(category1,"Enable Coal Block crafting?", true).getBoolean(true);
		enablecharcoal = config.get(category1,"Enable CharCoal Block crafting?", true).getBoolean(true);
    	enableenderpearl = config.get(category1,"Enable Ender Parl Block crafting?", true).getBoolean(true);
    	enableslime = config.get(category1,"Enable Slime Block crafting?", true).getBoolean(true);
    	enablewheatbale = config.get(category1, "Enable Wheat Bale crafting?", true).getBoolean(true);
    	enablesugar = config.get(category1, "Enable Sugar Block crafting?", true).getBoolean(true);
    	enablesugarcane = config.get(category1, "Enable Sugar Cane Block crafting?", true).getBoolean(true);
    	enablecocoa = config.get(category1, "Enable Cocoa Block crafting?", true).getBoolean(true);
    	enableblaze = config.get(category1, "Enable Blaze Block crafting?", true).getBoolean(true);
    	enableleather = config.get(category1, "Enable Leather Block crafting?", true).getBoolean(true);
    	enablebone = config.get(category1, "Enable Bone Block crafting?", true).getBoolean(true);
		enabletin = config.get(category1,"Enable Tin Block crafting?", true).getBoolean(true);
		enablecopper = config.get(category1,"Enable Copper Block crafting?", true).getBoolean(true);
		enablesilver = config.get(category1,"Enable Silver Block crafting?", true).getBoolean(true);
		enablelead = config.get(category1,"Enable Lead Block crafting?", true).getBoolean(true);
		enablenickel = config.get(category1,"Enable Nickel Block crafting?", true).getBoolean(true);
		enableelectrum = config.get(category1,"Enable Electrum Block crafting?", true).getBoolean(true);
		enableplatinum = config.get(category1,"Enable Platinum/shiny Block crafting?", true).getBoolean(true);
		enablerubber = config.get(category1,"Enable Rubber Block crafting?",true).getBoolean(true);
		enableclaybrick = config.get(category1, "Enable clay brick crafting", true).getBoolean(true);
		enablemeltingcore = config.get(category1, "Enable Melting Core crafting?", true).getBoolean(true);
		enablelavalamp = config.get(category1,"Enable Lavalamp crafting?", true).getBoolean(true);

		String category2 = "Specific Blocks mod compatibility";
		enablecoalcoke = config.get(category2,"Enable CoalCoke Block from Railcraft?", true).getBoolean(true);
		enableosmium = config.get(category2,"Enable Osmium Block from Universal Electricity?",true).getBoolean(true);
		enablebrass = config.get(category2,"Enable Brass Block from various mods?", true).getBoolean(true);
		enableapatite = config.get(category2,"Enable Apatite block from Forestry?", true).getBoolean(true);
		enablehoneydrop = config.get(category2,"Enable Honeydrop Block from Forestry?", true).getBoolean(true);
		enablehoneydew = config.get(category2,"Enable Honeydew Block from Forestry?", true).getBoolean(true);
		enablepeat = config.get(category2,"Enable Peat Block from Forestry?", true).getBoolean(true);
		enableinvar = config.get(category1,"Enable Invar Block from Thermal Expansion?", true).getBoolean(true);
		enablenikolite = config.get(category1,"Enable Nikolite Block from Redpower?", true).getBoolean(true);

		String category3 = "Recipe enable or disable";
		dragoneggrecipe = config.get(category3,"Crafting Dragon Egg(Requires Ender Pearl Block enabled)", true).getBoolean(true);
		arrowtofeather = config.get(category3,"Arrow to feather", true).getBoolean(true);
		fleshtoleather = config.get(category3,"Zombie flesh cooks into leather", true).getBoolean(true);
		quartzblocktoquartz = config.get(category3, "Quartz block decraft to nether quartz", true).getBoolean(true);
		greendye = config.get(category3, "Make green dye from blue and yellow dye?", true).getBoolean(true);
		wooltostring = config.get(category3, "Allow wool to decraft to string?", true).getBoolean(true);
		
		String category4 = "Random things";
		dungeonlootenablevannila= config.get(category4,"Allow vannila storage blocks to spawn in dungeon loot?", true).getBoolean(true);
		dungeonlootenablemod= config.get(category4,"Allow modded storage blocks to spawn in dungeon loot?", true).getBoolean(true);
		
		String category5 = "World Generation - Marble";
		generatemarble = config.get(category5,"Allow marble to generate in the world?", true).getBoolean(true);
		marbleheight = config.get(category5,"Height-How low should the marble generate?",32).getInt();
		marblerange = config.get(category5,"Range-What is the range from ^, such as, if height was 10, and range was 20, it would generate from 10-30.",60).getInt();
		marblevein = config.get(category5,"VeinThickness- How big of a vien of marble should spawn,say you want 50 in a vein, do 25",24).getInt();
		marblerarity = config.get(category5,"Rarity- How often should marble generate in a chunk, good value is below 5",1).getInt();
		
		String category6 = "World Generation - Black Marble";
		generateblackmarble = config.get(category6,"Allow Ashford Black Marble to generate in the world?", true).getBoolean(true);
		blackmarbleheight = config.get(category6,"Height-How low should the black marble generate?",10).getInt();
		blackmarblerange = config.get(category6,"Range-What is the range from ^, such as, if height was 10, and range was 20, it would generate from 10-30.",22).getInt();
		blackmarblevein = config.get(category6,"VeinThickness- How big of a vien of black marble should spawn,say you want 50 in a vein, do 25",24).getInt();
		blackmarblerarity = config.get(category6,"Rarity- How often should black marble generate in a chunk, good value is below 5",1).getInt();
		
		String category7 = "World Generation - Underwater Ruins";
		generateruin = config.get(category7,"Allow Underwater Ruins to generate?", true).getBoolean(true);
		ruinrarity = config.get(category7, "One in how many chance of the ruins to generate. Such as 20 will make it a 1 in 20, play in ssp to find a good value",20).getInt();
//		String category7 = "Texture swapping";
//		Property blackmarbletextures = config.get(category6,"Do you want to use my textures for black marble or alt textures? type true for mine, false for alt",true);
//		blackmarbletextures.comment = "Type true for main textures, false for alt textures";
		//		String category3 = "Compatibility with other mods";
//		Blockcoalcoke.enable = config.get(category3,"Coal coke block", true).getBoolean(true);
		//         int randomItemID = config.getItem("Redstone Block", 20000).getInt();

		// Since this flag is a boolean, we can read it into the variable directly from the config.
//		Configflags = config.get(Configuration.CATEGORY_GENERAL, "SomeConfigFlag", false).getBoolean(false);

		config.save();
	}

	public static int storageblockconfig;
	public static int storageblockmodconfig;
	public static int forestryblockconfig;
	public static int vanityentityconfig;
	public static int vanitydesignconfig;
	public static int vanitydesignworldconfig;
	public static boolean enablesugarcane;
	public static boolean enablecoal;
	public static boolean enablecharcoal;
	public static boolean enableenderpearl;
	public static boolean enableslime;
	public static boolean enablewheatbale;
	public static boolean enablesugar;
	public static boolean enablecocoa;
	public static boolean enableblaze;
	public static boolean enableleather;
	public static boolean enablebone;
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
	public static boolean enablerubber;
	public static boolean enableosmium;
	public static boolean enableapatite;
	public static boolean enablehoneydrop;
	public static boolean enablehoneydew;
	public static boolean enablepeat;
	public static boolean enableclaybrick;
	public static boolean enablemeltingcore;
	public static boolean enablelavalamp;
	public static boolean dragoneggrecipe;
	public static boolean arrowtofeather;
	public static boolean fleshtoleather;
	public static boolean quartzblocktoquartz;
	public static boolean greendye;
	public static boolean wooltostring;
	public static boolean enablecoalcoke;
	public static boolean storageblocking;
	public static boolean dungeonlootenablevannila;
	public static boolean dungeonlootenablemod;
	public static boolean generatemarble;
	public static int marbleheight;
	public static int marblerange;
	public static int marblevein;
	public static int marblerarity;
	public static boolean generateblackmarble;
	public static int blackmarbleheight;
	public static int blackmarblerange;
	public static int blackmarblevein;
	public static int blackmarblerarity;
	public static boolean generateruin;
	public static int ruinrarity;
}
