package vanityblocks;

import java.io.File;
import java.util.Set;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class Storageprops {
	public static void initProps(File configBase) {
		Configuration config = new Configuration(new File(configBase,
				DefaultProps.FILE_CONFIG));

		config.load();

		String enabled = "0:What to enable/disable";
		enablestorageblocks = config
				.get(enabled, "Enable Storageblocks?", true).getBoolean(true);
		enablerupees = config.get(enabled, "Enabled the Rupees?", true)
				.getBoolean(true);
		enableclaymugstuff = config.get(enabled,
				"Enable the Mug stuff(like hot chocolate)", true).getBoolean(
				true);
		furnacemelts = config.get(enabled,
				"Allow furnace melting of stuff like iron doors?", true)
				.getBoolean(true);
		versioncheck = config.get(enabled,
				"Turn this to false to turn off the version check", true)
				.getBoolean(true);
		enableredstonelamps = config.get(enabled,
				"Enable the redstone lamp colors?", true).getBoolean(true);
		enabletrapdoors = config.get(enabled, "Enable hidden trap doors", true)
				.getBoolean(true);
		enablecurtains = config.get(enabled, "Enable the curtains?", true)
				.getBoolean(true);
		enablerandomrecipes = config.get(enabled,
				"Enable random recipes load?", true).getBoolean(true);
		// enablefences = config.get(enabled, "Enable the fences?", true)
		// .getBoolean(true);

		String blocks = "Block id's";
		trapdoorconfigs = config.getBlock(blocks, "Vanityblocks trapdoors id",
				3049).getInt(3049);
		storageblockconfig = config.getBlock(blocks,
				"Vannila Storage Blocks ID", 3050).getInt(3050);
		storageblockmodconfig = config.getBlock(blocks,
				"Modded Storage Blocks ID", 3051).getInt(3051);
		forestryblockconfig = config.getBlock(blocks,
				"Forestry Storage Blocks ID", 3053).getInt(3053);
		vanitydesignconfig = config.getBlock(blocks, "Vanity design blocks ID",
				3055).getInt(3055);
		redstonelampdimconfig = config.getBlock(blocks, "Redstone Lamp Dim Id",
				3056).getInt(3056);
		redstonelamplitconfig = config.getBlock(blocks, "Redstone lamp Lit id",
				3057).getInt(3057);
		vanitydesignworldconfig = config.getBlock(blocks,
				"Vanity Blocks World Generation block ID", 3058).getInt(3058);
		vanityentityconfig = config.getBlock(blocks,
				"Vanity Blocks Tile Entity(such as melting core) ID", 3060)
				.getInt(3058);
		vanitydesignworldslabconfig = config.getBlock(blocks,
				"Vanity Blocks World Gen slabs ID", 3061).getInt(3061);
		vanitydesignworldWallconfig = config.getBlock(blocks,
				"Vanity Blocks World Gen walls ID", 3062).getInt(3062);
		curtainblockconfig = config.get(blocks, "Vanity Curtain Id", 3063)
				.getInt(3063);
		randomblocksconfig = config.getBlock(blocks,
				"Vanityblocks random blocks id", 3064).getInt(3064);
		// vanityfenceconfig = config.getBlock(blocks,
		// "Vanity Fences", 3065).getInt(3065);

		String blockstairs = "Marble Stair id's";
		marblestair = config.getBlock(blockstairs, "Marble Stair id", 3038)
				.getInt(3038);
		marblebrickstair = config.getBlock(blockstairs,
				"Marble Brick Stair id", 3039).getInt(3039);
		marblepillarstair = config.getBlock(blockstairs,
				"Marble Pillar Stair id", 3040).getInt(3040);
		marbletilestair = config.getBlock(blockstairs, "Marble Tile Stair id",
				3041).getInt(3041);
		blackmarblestair = config.getBlock(blockstairs,
				"Ashford Black Marble Stair id", 3042).getInt(3042);
		blackmarblebrickstair = config.getBlock(blockstairs,
				"Ashford Black Marble Brick Stair id", 3043).getInt(3043);
		blackmarblepillarstair = config.getBlock(blockstairs,
				"Ashford Black Marble Pillar Stair id", 3044).getInt(3044);
		blackmarbletilestair = config.getBlock(blockstairs,
				"Ashford Black Marble Tile Stair id", 3045).getInt(3045);

		String items = "Item id's";
		// config.getItem("Patterns and Misc", "Tinker's Manual",
		// 14018).getInt(14018); use a second "" to add it to a sub category
		greenrupee1 = config.getItem(items, "Green Rupee - 1 Rupees", 19000)
				.getInt(19000);
		bluerupee5 = config.getItem(items, "Blue Rupee - 5 Rupees", 19001)
				.getInt(19001);
		redrupee20 = config.getItem(items, "Red Rupee - 20 Rupees", 19002)
				.getInt(19002);
		biggreenrupee50 = config.getItem(items, "Big Green Rupee - 50 Rupees",
				19003).getInt(19003);
		bigbluerupee100 = config.getItem(items, "Big Blue Rupee - 100 Rupees",
				19004).getInt(19004);
		bigredrupee200 = config.getItem(items, "Big Red Rupee - 200 Rupees",
				19005).getInt(19005);

		String generalitems = "General Item config";
		enablegeneralitems = config.get(generalitems,
				"Enable the general items?", true).getBoolean(true);
		enablecoalstorageitem = config.get(generalitems,
				"Enable the coal storage item?", true).getBoolean(true);
		coalstorageitem = config.getItem(generalitems, "Coal Storage Item Id",
				19009).getInt(19009);
		enableflintitem = config.get(generalitems, "Enable Flint Item?", true)
				.getBoolean(true);
		flintitem = config
				.getItem(generalitems, "Flint Storage Item Id", 19010).getInt(
						19010);
		enablearrowstorageitem = config.get(generalitems,
				"Enable the arrow bundle item?", true).getBoolean(true);
		arrowstorageitem = config.get(generalitems, "Arrow bundle item Id?",
				19011).getInt(19011);
		enableblazestorageitem = config.get(generalitems,
				"Enable Blaze rod bundle?", true).getBoolean(true);
		blazestorageitem = config.get(generalitems, "Blaze Rod bundle", 19012)
				.getInt(19012);

		String generalfooditems = "General Food Item Config";
		mugunfired = config.get(generalfooditems, "Unfired Mug Id", 19020)
				.getInt(19020);
		emptymug = config.get(generalfooditems, "Empty Mug Id", 19021).getInt(
				19021);
		mugwater = config.get(generalfooditems, "Mug with Water Id", 19022)
				.getInt(19022);
		mugwaterhot = config.get(generalfooditems, "Mug with hot water Id",
				19023).getInt(19023);
		mugwaterhotchoco = config.get(generalfooditems,
				"Hot Chocolate with water Id", 19024).getInt(19024);
		mugwaterhotchocosugar = config.get(generalfooditems,
				"Sweetend Hot Chocolate with water Id", 19025).getInt(19025);
		mugmilk = config.get(generalfooditems, "Mug with milk Id", 19026)
				.getInt(19026);
		mugmilkhot = config
				.get(generalfooditems, "Mug with hot milk Id", 19027).getInt(
						19027);
		mugmilkhotchoco = config.get(generalfooditems,
				"Hot Chocolate with milk Id", 19028).getInt(19028);
		mugmilkhotchocosugar = config.get(generalfooditems,
				"Sweetend Hot Chocolate with milk Id", 19029).getInt(19029);

		String category1 = "Blocks Enable or disable";
		enablecharcoal = config.get(category1,
				"Enable CharCoal Block crafting?", true).getBoolean(true);
		enableenderpearl = config.get(category1,
				"Enable Ender Parl Block crafting?", true).getBoolean(true);
		enableslime = config.get(category1, "Enable Slime Block crafting?",
				true).getBoolean(true);
		enablesugar = config.get(category1, "Enable Sugar Block crafting?",
				true).getBoolean(true);
		enablesugarcane = config.get(category1,
				"Enable Sugar Cane Block crafting?", true).getBoolean(true);
		enablecocoa = config.get(category1, "Enable Cocoa Block crafting?",
				true).getBoolean(true);
		enableleather = config.get(category1, "Enable Leather Block crafting?",
				true).getBoolean(true);
		enablebone = config.get(category1, "Enable Bone Block crafting?", true)
				.getBoolean(true);
		enabletin = config.get(category1, "Enable Tin Block crafting?", true)
				.getBoolean(true);
		enablecopper = config.get(category1, "Enable Copper Block crafting?",
				true).getBoolean(true);
		enablesilver = config.get(category1, "Enable Silver Block crafting?",
				true).getBoolean(true);
		enablelead = config.get(category1, "Enable Lead Block crafting?", true)
				.getBoolean(true);
		enablenickel = config.get(category1, "Enable Nickel Block crafting?",
				true).getBoolean(true);
		enableelectrum = config.get(category1,
				"Enable Electrum Block crafting?", true).getBoolean(true);
		enableplatinum = config.get(category1,
				"Enable Platinum/shiny Block crafting?", true).getBoolean(true);
		enablerubber = config.get(category1, "Enable Rubber Block crafting?",
				true).getBoolean(true);
		enablemeltingcore = config.get(category1,
				"Enable Melting Core crafting?/Enable it", true).getBoolean(
				true);
		enablelavalamp = config.get(category1, "Enable Lavalamp crafting?",
				true).getBoolean(true);
		enablestoneglowstone = config.get(category1,
				"Enable Stone Trimmed Glowstone crafting?", true).getBoolean(
				true);

		String category2 = "Specific Blocks mod compatibility";
		enablebrass = config.get(category2,
				"Enable Brass Block from various mods?", true).getBoolean(true);
		enableapatite = config.get(category2,
				"Enable Apatite block from Forestry?", true).getBoolean(true);
		enablehoneydrop = config.get(category2,
				"Enable Honeydrop Block from Forestry?", true).getBoolean(true);
		enablehoneydew = config.get(category2,
				"Enable Honeydew Block from Forestry?", true).getBoolean(true);
		enablepeat = config.get(category2, "Enable Peat Block from Forestry?",
				true).getBoolean(true);
		enableinvar = config.get(category2,
				"Enable Invar Block from Thermal Expansion?", true).getBoolean(
				true);
		enablenikolite = config.get(category2,
				"Enable Nikolite Block from Redpower?", true).getBoolean(true);
		Property gregtechcomp = config
				.get(category2,
						"If you have gregtech and recipes arent deblocking(after changing gregtechs config)?",
						true);
		gregtechcomp.comment = "Please note, this will only work if you set gregtechs config to this... http://pastebin.com/92FmiGHm  Type true if no gregtech, false if gregtech is added(THIS IS only relevant in gregtechs case). Do this below)";
		gregtechcompat = config.get(category2,
				"Set the true/false here as well for the gregtech option ^",
				true).getBoolean(true);
		enablegregtechbypass = config
				.get(category2,
						"Set this to true if you want to unnerf gregtechs planks and others(requires 2 logs(shapeless)",
						false).getBoolean(false);

		String category3 = "Recipe enable or disable";
		dragoneggrecipe = config
				.get(category3,
						"Crafting Dragon Egg(Requires Ender Pearl Block enabled)",
						true).getBoolean(true);
		arrowtofeather = config.get(category3, "Arrow to feather", true)
				.getBoolean(true);
		fleshtoleather = config.get(category3,
				"Zombie flesh cooks into leather", true).getBoolean(true);
		quartzblocktoquartz = config.get(category3,
				"Quartz block decraft to nether quartz", true).getBoolean(true);
		greendye = config.get(category3,
				"Make green dye from blue and yellow dye?", true).getBoolean(
				true);
		wooltostring = config.get(category3,
				"Allow wool to decraft to string?", true).getBoolean(true);
		magmacreamtoslime = config.get(category3,
				"Allow Magma cream to slimeball recipe?", true)
				.getBoolean(true);
		saddletoleather = config.get(category3,
				"Allow saddles to break down to leather?", true).getBoolean(
				true);
		nametag = config.get(category3,
				"Allow Nametags to be crafted(sign + string)", true)
				.getBoolean(true);
		ironhorsearmor = config
				.get(category3,
						"Allow Iron Horse armor to be crafted(upside down iron chestplate)",
						true).getBoolean(true);
		goldhorsearmor = config
				.get(category3,
						"Allow Gold Horse armor to be crafted(upside down Gold chestplate)",
						true).getBoolean(true);
		diamondhorsearmor = config
				.get(category3,
						"Allow Diamond Horse armor to be crafted(upside down Diamond chestplate)",
						true).getBoolean(true);

		// String category4 = "Random things";
		// dungeonlootenablevannila = config.get(category4,
		// "Allow vannila storage blocks to spawn in dungeon loot?", true)
		// .getBoolean(true);
		// dungeonlootenablemod = config.get(category4,
		// "Allow modded storage blocks to spawn in dungeon loot?", true)
		// .getBoolean(true);
		// furnacemelts = config.get(category4,
		// "Allow furnace melting of stuff like iron doors?", true)
		// .getBoolean(true);

		String category5 = "World Generation - Marble";
		enableworldgen = config.get(category5, "Allow Worldgen?", true)
				.getBoolean(true);
		generatemarble = config.get(category5,
				"Allow marble to generate in the world?", true)
				.getBoolean(true);
		marbleheight = config.get(category5,
				"Height-How low should the marble generate?", 32).getInt();
		marblerange = config
				.get(category5,
						"Range-What is the range from ^, such as, if height was 10, and range was 20, it would generate from 10-30.",
						60).getInt();
		marblevein = config
				.get(category5,
						"VeinThickness- How big of a vien of marble should spawn,say you want 50 in a vein, do 25",
						24).getInt();
		marblerarity = config
				.get(category5,
						"Rarity- How often should marble generate in a chunk, good value is below 5",
						1).getInt();

		String category6 = "World Generation - Black Marble";
		generateblackmarble = config.get(category6,
				"Allow Ashford Black Marble to generate in the world?", true)
				.getBoolean(true);
		blackmarbleheight = config.get(category6,
				"Height-How low should the black marble generate?", 10)
				.getInt();
		blackmarblerange = config
				.get(category6,
						"Range-What is the range from ^, such as, if height was 10, and range was 20, it would generate from 10-30.",
						22).getInt();
		blackmarblevein = config
				.get(category6,
						"VeinThickness- How big of a vien of black marble should spawn,say you want 50 in a vein, do 25",
						24).getInt();
		blackmarblerarity = config
				.get(category6,
						"Rarity- How often should black marble generate in a chunk, good value is below 5",
						1).getInt();

		// String category7 = "World Generation - Underwater Ruins";
		// generateruin = config.get(category7,
		// "Allow Underwater Ruins to generate?", true).getBoolean(true);
		// ruinchance = config
		// .get(category7,
		// "One in how many chance of the ruins to generate. Such as 20 will make it a 1 in 20, play in ssp to find a good value(i suggest 150+)",
		// 150).getInt();

		String category8 = "World Generation - Slabs/stairs/Walls";
		marbleslabs = config.get(category8, "Allowed to make Marble slabs?",
				true).getBoolean(true);
		marblewalls = config.get(category8, "Allowed to make Marble Walls?",
				true).getBoolean(true);
		marblestairs = config
				.get(category8,
						"Enabled/allow White marble stairs?(note marble needs to be enabled)",
						true).getBoolean(true);
		blackmarblestairs = config
				.get(category8,
						"Enabled/Allow Black marble stairs?(note black marble needs to be enabled)",
						true).getBoolean(true);
		// String category7 = "Texture swapping";
		// Property blackmarbletextures =
		// config.get(category6,"Do you want to use my textures for black marble or alt textures? type true for mine, false for alt",true);
		// blackmarbletextures.comment =
		// "Type true for main textures, false for alt textures";

		String category9 = "Random vanity blocks";
		enablerandomblocks = config.get(category9, "Enable the random blocks?",
				true).getBoolean(true);
		enableclaybrick = config.get(category9, "Enable clay brick crafting",
				true).getBoolean(true);
		enableoldlapisblock = config.get(category9,
				"Enable crafting for block with old lapis texture(2x2 lapis)",
				true).getBoolean(true);
		enablewhitesoulsand = config.get(category9,
				"Enable white soul sand crafting?", true).getBoolean(true);
		enablewhitesoulsandspeed = config.get(category9,
				"Enable the white soul sand speed boost?", true).getBoolean(
				true);

		config.save();
	}

	// Enabled sections?
	public static boolean enablestorageblocks;
	public static boolean enablerupees;
	public static boolean enableclaymugstuff;
	public static boolean furnacemelts;
	public static boolean versioncheck;
	public static boolean enableredstonelamps;
	public static boolean enabletrapdoors;
	public static boolean enablerandomrecipes;
	public static boolean enablecurtains;
	// #### Block id ints and booleans###
	public static int storageblockconfig;
	public static int storageblockmodconfig;
	public static int forestryblockconfig;
	public static int vanityentityconfig;
	public static int vanitydesignconfig;
	public static int redstonelampdimconfig;
	public static int redstonelamplitconfig;
	public static int vanitydesignworldconfig;
	public static int vanitydesignworldslabconfig;
	public static int vanitydesignworldWallconfig;
	public static int randomblocksconfig;
	public static int trapdoorconfigs;
	public static int curtainblockconfig;
	// #### Marble stair ints //
	public static int marblestair;
	public static int marblebrickstair;
	public static int marblepillarstair;
	public static int marbletilestair;
	public static int blackmarblestair;
	public static int blackmarblebrickstair;
	public static int blackmarblepillarstair;
	public static int blackmarbletilestair;
	// Enabled blocks?
	public static boolean enablesugarcane;
	public static boolean enablecharcoal;
	public static boolean enableenderpearl;
	public static boolean enableslime;
	public static boolean enablesugar;
	public static boolean enablecocoa;
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
	public static boolean enableapatite;
	public static boolean enablehoneydrop;
	public static boolean enablehoneydew;
	public static boolean enablepeat;
	public static boolean gregtechcompat;
	public static boolean enablegregtechbypass;
	public static boolean enablemeltingcore;
	public static boolean enablelavalamp;
	public static boolean enablestoneglowstone;
	public static boolean enablefences;
	// #### Recipe booleans
	public static boolean magmacreamtoslime;
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
	public static boolean saddletoleather;
	public static boolean nametag;
	public static boolean ironhorsearmor;
	public static boolean goldhorsearmor;
	public static boolean diamondhorsearmor;
	// #### General Item ints and booleans ####
	public static boolean enablegeneralitems;
	public static boolean enableflintitem;
	public static int flintitem;
	public static boolean enablecoalstorageitem;
	public static int coalstorageitem;
	public static boolean enablearrowstorageitem;
	public static int arrowstorageitem;
	public static boolean enableblazestorageitem;
	public static int blazestorageitem;

	// ### General Food Item Ints and Booleans ###
	public static int mugunfired;
	public static int emptymug;
	public static int mugwater;
	public static int mugwaterhot;
	public static int mugwaterhotchoco;
	public static int mugwaterhotchocosugar;
	public static int mugmilk;
	public static int mugmilkhot;
	public static int mugmilkhotchoco;
	public static int mugmilkhotchocosugar;

	// ##### Rupee id ints and booleans ###
	public static int greenrupee1;
	public static int bluerupee5;
	public static int redrupee20;
	public static int biggreenrupee50;
	public static int bigbluerupee100;
	public static int bigredrupee200;

	// #### World gen ints and booleans
	public static boolean enableworldgen;
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
	public static int ruinchance;
	public static boolean marbleslabs;
	public static boolean marblewalls;
	public static boolean marblestairs;
	public static boolean blackmarblestairs;

	// ### Random vanity blocks int and booleans
	public static boolean enablerandomblocks;
	public static boolean enableclaybrick;
	public static boolean enableoldlapisblock;
	public static boolean enablewhitesoulsand;
	public static boolean enablewhitesoulsandspeed;

}
