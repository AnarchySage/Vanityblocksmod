package vanityblocks.Registrations;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import vanityblocks.Storageprops;
import vanityblocks.Blocks.MarbleStair;
import vanityblocks.Blocks.MarbleWall;
import vanityblocks.Blocks.Marbleslab;
import vanityblocks.Blocks.VanityDesignblock;
import vanityblocks.Blocks.VanityDesignworldblock;
import vanityblocks.ItemBlocks.ItemBlockMarbleSlab;
import vanityblocks.ItemBlocks.ItemBlockMarbleWall;
import vanityblocks.ItemBlocks.VanitydesignItemBlock;
import vanityblocks.ItemBlocks.VanitydesignworldItemBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class VanityBlocksRegistration {

	public static Block VanityDesignblock;
	public static int VanityDesignId;
	public static int VanityDesignworldId;
	public static Block VanityDesignworldblock;
	public static int VanityDesignworldslabId;
	public static Block VanityDesignworldslabblock;
	public static int VanityDesignworldWallId;
	public static Block VanityDesignworldWallblock;
	// public static int VanityDesignworldStairsId;
	// public static Block VanityDesignworldStairsblock;
	public static Block marblestair;
	public static Block marblebrickstair;
	public static Block marblepillarstair;
	public static Block marbletilestair;
	public static Block blackmarblestair;
	public static Block blackmarblebrickstair;
	public static Block blackmarblepillarstair;
	public static Block blackmarbletilestair;

	public static void vanityregistration() {
		VanityDesignId = Storageprops.vanitydesignconfig;
		VanityDesignblock = new VanityDesignblock(VanityDesignId);

		VanityDesignworldId = Storageprops.vanitydesignworldconfig;
		VanityDesignworldblock = new VanityDesignworldblock(VanityDesignworldId);

		VanityDesignworldslabId = Storageprops.vanitydesignworldslabconfig;
		VanityDesignworldslabblock = new Marbleslab(VanityDesignworldslabId);

		VanityDesignworldWallId = Storageprops.vanitydesignworldWallconfig;
		VanityDesignworldWallblock = new MarbleWall(VanityDesignworldWallId,
				VanityDesignworldblock);

		// VanityDesignworldStairsId = Storageprops.vanitydesignworldWallconfig;
		// VanityDesignworldWallblock = new MarbleWall(VanityDesignworldWallId,
		// VanityDesignworldblock);

		/* Block registration and naming for vanity */
		GameRegistry.registerBlock(VanityDesignblock,
				VanitydesignItemBlock.class, "Vanity Blocks Design blocks");
		LanguageRegistry.addName(new ItemStack(VanityDesignblock, 1, 0),
				"Lava Lamp");
		LanguageRegistry.addName(new ItemStack(VanityDesignblock, 1, 1),
				"Stone Trimmed GlowStone");

		/* Block registration and naming for world gen */
		if (Storageprops.generatemarble && Storageprops.generateblackmarble) {
			GameRegistry.registerBlock(VanityDesignworldblock,
					VanitydesignworldItemBlock.class,
					"Vanity Blocks World blocks");
			LanguageRegistry.addName(
					new ItemStack(VanityDesignworldblock, 1, 0), "Marble");
			LanguageRegistry
					.addName(new ItemStack(VanityDesignworldblock, 1, 1),
							"Marble Brick");
			LanguageRegistry.addName(
					new ItemStack(VanityDesignworldblock, 1, 2),
					"Chiseled Marble");
			LanguageRegistry.addName(
					new ItemStack(VanityDesignworldblock, 1, 3),
					"Marble Pillar");
			LanguageRegistry.addName(
					new ItemStack(VanityDesignworldblock, 1, 4), "Marble Tile");
			LanguageRegistry.addName(
					new ItemStack(VanityDesignworldblock, 1, 5),
					"Ashford Black Marble");
			LanguageRegistry.addName(
					new ItemStack(VanityDesignworldblock, 1, 6),
					"Ashford Black Marble Brick");
			LanguageRegistry.addName(
					new ItemStack(VanityDesignworldblock, 1, 7),
					"Chiseled Ashford Black Marble");
			LanguageRegistry.addName(
					new ItemStack(VanityDesignworldblock, 1, 8),
					"Ashford Black Marble Pillar");
			LanguageRegistry.addName(
					new ItemStack(VanityDesignworldblock, 1, 9),
					"Ashford Black Marble Tile");
		}
		/*
		 * Block Registration of Slabs
		 */
		if (Storageprops.generatemarble && Storageprops.generateblackmarble
				&& Storageprops.marbleslabs) {
			GameRegistry.registerBlock(VanityDesignworldslabblock,
					ItemBlockMarbleSlab.class,
					"Vanity Blocks World Block slabs");
			LanguageRegistry.addName(new ItemStack(VanityDesignworldslabblock,
					1, 0), "Marble Slab");
			LanguageRegistry.addName(new ItemStack(VanityDesignworldslabblock,
					1, 1), "Marble Brick Slab");
			LanguageRegistry.addName(new ItemStack(VanityDesignworldslabblock,
					1, 2), "Chiseled Marble Slab");
			LanguageRegistry.addName(new ItemStack(VanityDesignworldslabblock,
					1, 3), "Marble Pillar Slab");
			LanguageRegistry.addName(new ItemStack(VanityDesignworldslabblock,
					1, 4), "Marble Tile Slab");
			LanguageRegistry.addName(new ItemStack(VanityDesignworldslabblock,
					1, 5), "Ashford Black Marble Slab");
			LanguageRegistry.addName(new ItemStack(VanityDesignworldslabblock,
					1, 6), "Ashford Black Marble Brick Slab");
			LanguageRegistry.addName(new ItemStack(VanityDesignworldslabblock,
					1, 7), "Chiseled Ashford Black Marble Slab");
			LanguageRegistry.addName(new ItemStack(VanityDesignworldslabblock,
					1, 8), "Ashford Black Marble Pillar Slab");
			LanguageRegistry.addName(new ItemStack(VanityDesignworldslabblock,
					1, 9), "Ashford Black Marble Tile Slab");
		}
		/*
		 * Block Registration of Marble walls
		 */
		if (Storageprops.generatemarble && Storageprops.generateblackmarble
				&& Storageprops.marblewalls) {
			GameRegistry.registerBlock(VanityDesignworldWallblock,
					ItemBlockMarbleWall.class,
					"Vanity Blocks World Block Walls");
			LanguageRegistry.addName(new ItemStack(VanityDesignworldWallblock,
					1, 0), "Marble Wall");
			LanguageRegistry.addName(new ItemStack(VanityDesignworldWallblock,
					1, 1), "Marble Brick Wall");
			LanguageRegistry.addName(new ItemStack(VanityDesignworldWallblock,
					1, 2), "Chiseled Marble Wall");
			LanguageRegistry.addName(new ItemStack(VanityDesignworldWallblock,
					1, 3), "Marble Pillar Wall");
			LanguageRegistry.addName(new ItemStack(VanityDesignworldWallblock,
					1, 4), "Marble Tile Wall");
			LanguageRegistry.addName(new ItemStack(VanityDesignworldWallblock,
					1, 5), "Ashford Black Marble Wall");
			LanguageRegistry.addName(new ItemStack(VanityDesignworldWallblock,
					1, 6), "Ashford Black Marble Brick Wall");
			LanguageRegistry.addName(new ItemStack(VanityDesignworldWallblock,
					1, 7), "Chiseled Ashford Black Marble Wall");
			LanguageRegistry.addName(new ItemStack(VanityDesignworldWallblock,
					1, 8), "Ashford Black Marble Pillar Wall");
			LanguageRegistry.addName(new ItemStack(VanityDesignworldWallblock,
					1, 9), "Ashford Black Marble Tile Wall");
		}
		if (Storageprops.generatemarble && Storageprops.marblestairs) {
			marblestair = new MarbleStair(Storageprops.marblestair,
					VanityDesignworldblock, 0)
					.setUnlocalizedName("marblestair");
			marblestair.stepSound = Block.soundStoneFootstep;
			GameRegistry.registerBlock(marblestair, "marblestair");
			LanguageRegistry
					.addName(new ItemStack(marblestair), "Marble Stair");

			marblebrickstair = new MarbleStair(Storageprops.marblebrickstair,
					VanityDesignworldblock, 1)
					.setUnlocalizedName("marblebrickstair");
			marblebrickstair.stepSound = Block.soundStoneFootstep;
			GameRegistry.registerBlock(marblebrickstair, "marblebrickstair");
			LanguageRegistry.addName(new ItemStack(marblebrickstair),
					"Marble Brick Stair");

			marblepillarstair = new MarbleStair(Storageprops.marblepillarstair,
					VanityDesignworldblock, 3)
					.setUnlocalizedName("marblepillarstair");
			marblepillarstair.stepSound = Block.soundStoneFootstep;
			GameRegistry.registerBlock(marblepillarstair, "marblepillarstair");
			LanguageRegistry.addName(new ItemStack(marblepillarstair),
					"Marble Pillar Stair");

			marbletilestair = new MarbleStair(Storageprops.marbletilestair,
					VanityDesignworldblock, 4)
					.setUnlocalizedName("marbletilestair");
			marbletilestair.stepSound = Block.soundStoneFootstep;
			GameRegistry.registerBlock(marbletilestair, "marbletilestair");
			LanguageRegistry.addName(new ItemStack(marbletilestair),
					"Marble Tile Stair");
		}
		if (Storageprops.generateblackmarble && Storageprops.marblestairs) {
			blackmarblestair = new MarbleStair(Storageprops.blackmarblestair,
					VanityDesignworldblock, 5)
					.setUnlocalizedName("blackmarblestair");
			blackmarblestair.stepSound = Block.soundStoneFootstep;
			GameRegistry.registerBlock(blackmarblestair, "blackmarblestair");
			LanguageRegistry.addName(new ItemStack(blackmarblestair),
					"Ashford Black Marble Stair");

			blackmarblebrickstair = new MarbleStair(
					Storageprops.blackmarblebrickstair, VanityDesignworldblock,
					6).setUnlocalizedName("blackmarblebrickstair");
			blackmarblebrickstair.stepSound = Block.soundStoneFootstep;
			GameRegistry.registerBlock(blackmarblebrickstair,
					"blackmarblebrickstair");
			LanguageRegistry.addName(new ItemStack(blackmarblebrickstair),
					"Ashford Black Marble Brick Stair");

			blackmarblepillarstair = new MarbleStair(
					Storageprops.blackmarblepillarstair,
					VanityDesignworldblock, 8)
					.setUnlocalizedName("blackmarblepillarstair");
			blackmarblepillarstair.stepSound = Block.soundStoneFootstep;
			GameRegistry.registerBlock(blackmarblepillarstair,
					"blackmarblepillarstair");
			LanguageRegistry.addName(new ItemStack(blackmarblepillarstair),
					"Ashford Black Marble Pillar Stair");

			blackmarbletilestair = new MarbleStair(
					Storageprops.blackmarbletilestair, VanityDesignworldblock,
					9).setUnlocalizedName("blackmarbletilestair");
			blackmarbletilestair.stepSound = Block.soundStoneFootstep;
			GameRegistry.registerBlock(blackmarbletilestair,
					"blackmarbletilestair");
			LanguageRegistry.addName(new ItemStack(blackmarbletilestair),
					"Ashford Black Marble Tile Stair");
		}
	}

	public static void addVanityRecipes() {
		// ##### This is Vanity Block Recipes
		ItemStack glasspane = new ItemStack(Block.thinGlass);
		ItemStack lavabukkit = new ItemStack(Item.bucketLava);
		if (Storageprops.enablelavalamp) {
			GameRegistry.addRecipe(new ItemStack(VanityDesignblock, 4, 0),
					"zxz", "xyx", "zxz", 'x', glasspane, 'y', lavabukkit, 'z',
					Block.stone);
		}
		if (Storageprops.enablestoneglowstone) {
			GameRegistry
					.addRecipe(new ItemStack(VanityDesignblock, 1, 1), " x ",
							"xyx", " x ", 'x', Block.stone, 'y',
							Block.glowStone);
		}
		// ##### This is world gen recipes for marble/black marble
		if (Storageprops.generatemarble) {
			GameRegistry.addRecipe(new ItemStack(VanityDesignworldblock, 4, 1),
					"xx", "xx", 'x',
					new ItemStack(VanityDesignworldblock, 0, 0));
			GameRegistry.addShapelessRecipe(new ItemStack(
					VanityDesignworldblock, 1, 0), new ItemStack(
					VanityDesignworldblock, 0, 1));
			GameRegistry.addRecipe(new ItemStack(VanityDesignworldblock, 4, 2),
					"xx", "xx", 'x',
					new ItemStack(VanityDesignworldblock, 0, 1));
			GameRegistry.addRecipe(new ItemStack(VanityDesignworldblock, 2, 3),
					"x", "x", 'x', new ItemStack(VanityDesignworldblock, 0, 0));
			GameRegistry.addRecipe(new ItemStack(VanityDesignworldblock, 4, 4),
					" x ", "x x", " x ", 'x', new ItemStack(
							VanityDesignworldblock, 0, 0));

		}
		if (Storageprops.generateblackmarble) {
			GameRegistry.addRecipe(new ItemStack(VanityDesignworldblock, 4, 6),
					"xx", "xx", 'x',
					new ItemStack(VanityDesignworldblock, 0, 5));
			GameRegistry.addShapelessRecipe(new ItemStack(
					VanityDesignworldblock, 1, 5), new ItemStack(
					VanityDesignworldblock, 0, 6));
			GameRegistry.addRecipe(new ItemStack(VanityDesignworldblock, 4, 7),
					"xx", "xx", 'x',
					new ItemStack(VanityDesignworldblock, 0, 6));
			GameRegistry.addRecipe(new ItemStack(VanityDesignworldblock, 2, 8),
					"x", "x", 'x', new ItemStack(VanityDesignworldblock, 0, 5));
			GameRegistry.addRecipe(new ItemStack(VanityDesignworldblock, 4, 9),
					" x ", "x x", " x ", 'x', new ItemStack(
							VanityDesignworldblock, 0, 5));
		}

		/* Marble Slabs */
		if (Storageprops.generatemarble && Storageprops.generateblackmarble
				&& Storageprops.marbleslabs) {
			GameRegistry
					.addRecipe(new ItemStack(VanityDesignworldslabblock, 6, 0),
							"xxx", 'x', new ItemStack(VanityDesignworldblock,
									0, 0));
			GameRegistry
					.addRecipe(new ItemStack(VanityDesignworldslabblock, 6, 1),
							"xxx", 'x', new ItemStack(VanityDesignworldblock,
									0, 1));
			GameRegistry
					.addRecipe(new ItemStack(VanityDesignworldslabblock, 6, 2),
							"xxx", 'x', new ItemStack(VanityDesignworldblock,
									0, 2));
			GameRegistry
					.addRecipe(new ItemStack(VanityDesignworldslabblock, 6, 3),
							"xxx", 'x', new ItemStack(VanityDesignworldblock,
									0, 3));
			GameRegistry
					.addRecipe(new ItemStack(VanityDesignworldslabblock, 6, 4),
							"xxx", 'x', new ItemStack(VanityDesignworldblock,
									0, 4));
			GameRegistry
					.addRecipe(new ItemStack(VanityDesignworldslabblock, 6, 5),
							"xxx", 'x', new ItemStack(VanityDesignworldblock,
									0, 5));
			GameRegistry
					.addRecipe(new ItemStack(VanityDesignworldslabblock, 6, 6),
							"xxx", 'x', new ItemStack(VanityDesignworldblock,
									0, 6));
			GameRegistry
					.addRecipe(new ItemStack(VanityDesignworldslabblock, 6, 7),
							"xxx", 'x', new ItemStack(VanityDesignworldblock,
									0, 7));
			GameRegistry
					.addRecipe(new ItemStack(VanityDesignworldslabblock, 6, 8),
							"xxx", 'x', new ItemStack(VanityDesignworldblock,
									0, 8));
			GameRegistry
					.addRecipe(new ItemStack(VanityDesignworldslabblock, 6, 9),
							"xxx", 'x', new ItemStack(VanityDesignworldblock,
									0, 9));
		}
		/* Marble walls */
		if (Storageprops.generatemarble && Storageprops.generateblackmarble
				&& Storageprops.marblewalls) {
			GameRegistry.addRecipe(new ItemStack(VanityDesignworldWallblock, 6,
					0), "xxx", "xxx", 'x', new ItemStack(
					VanityDesignworldblock, 0, 0));
			GameRegistry.addRecipe(new ItemStack(VanityDesignworldWallblock, 6,
					1), "xxx", "xxx", 'x', new ItemStack(
					VanityDesignworldblock, 0, 1));
			GameRegistry.addRecipe(new ItemStack(VanityDesignworldWallblock, 6,
					2), "xxx", "xxx", 'x', new ItemStack(
					VanityDesignworldblock, 0, 2));
			GameRegistry.addRecipe(new ItemStack(VanityDesignworldWallblock, 6,
					3), "xxx", "xxx", 'x', new ItemStack(
					VanityDesignworldblock, 0, 3));
			GameRegistry.addRecipe(new ItemStack(VanityDesignworldWallblock, 6,
					4), "xxx", "xxx", 'x', new ItemStack(
					VanityDesignworldblock, 0, 4));
			GameRegistry.addRecipe(new ItemStack(VanityDesignworldWallblock, 6,
					5), "xxx", "xxx", 'x', new ItemStack(
					VanityDesignworldblock, 0, 5));
			GameRegistry.addRecipe(new ItemStack(VanityDesignworldWallblock, 6,
					6), "xxx", "xxx", 'x', new ItemStack(
					VanityDesignworldblock, 0, 6));
			GameRegistry.addRecipe(new ItemStack(VanityDesignworldWallblock, 6,
					7), "xxx", "xxx", 'x', new ItemStack(
					VanityDesignworldblock, 0, 7));
			GameRegistry.addRecipe(new ItemStack(VanityDesignworldWallblock, 6,
					8), "xxx", "xxx", 'x', new ItemStack(
					VanityDesignworldblock, 0, 8));
			GameRegistry.addRecipe(new ItemStack(VanityDesignworldWallblock, 6,
					9), "xxx", "xxx", 'x', new ItemStack(
					VanityDesignworldblock, 0, 9));

		}
		/* Recipes for marble stairs */
		if (Storageprops.generatemarble && Storageprops.marblestairs) {
			GameRegistry.addRecipe(new ItemStack(marblestair, 4), "  x", " xx",
					"xxx", 'x', new ItemStack(VanityDesignworldblock, 0, 0));
			GameRegistry.addRecipe(new ItemStack(marblestair, 4), "x   ",
					"xx ", "xxx", 'x', new ItemStack(VanityDesignworldblock, 0,
							0));
			GameRegistry.addRecipe(new ItemStack(marblebrickstair, 4), "  x",
					" xx", "xxx", 'x', new ItemStack(VanityDesignworldblock, 0,
							1));
			GameRegistry.addRecipe(new ItemStack(marblebrickstair, 4), "x   ",
					"xx ", "xxx", 'x', new ItemStack(VanityDesignworldblock, 0,
							1));
			GameRegistry.addRecipe(new ItemStack(marblepillarstair, 4), "  x",
					" xx", "xxx", 'x', new ItemStack(VanityDesignworldblock, 0,
							3));
			GameRegistry.addRecipe(new ItemStack(marblepillarstair, 4), "x   ",
					"xx ", "xxx", 'x', new ItemStack(VanityDesignworldblock, 0,
							3));
			GameRegistry.addRecipe(new ItemStack(marbletilestair, 4), "  x",
					" xx", "xxx", 'x', new ItemStack(VanityDesignworldblock, 0,
							4));
			GameRegistry.addRecipe(new ItemStack(marbletilestair, 4), "x   ",
					"xx ", "xxx", 'x', new ItemStack(VanityDesignworldblock, 0,
							4));
		}
		if (Storageprops.generateblackmarble && Storageprops.marblestairs) {
			GameRegistry.addRecipe(new ItemStack(blackmarblestair, 4), "  x",
					" xx", "xxx", 'x', new ItemStack(VanityDesignworldblock, 0,
							5));
			GameRegistry.addRecipe(new ItemStack(blackmarblestair, 4), "x   ",
					"xx ", "xxx", 'x', new ItemStack(VanityDesignworldblock, 0,
							5));
			GameRegistry.addRecipe(new ItemStack(blackmarblebrickstair, 4),
					"  x", " xx", "xxx", 'x', new ItemStack(
							VanityDesignworldblock, 0, 6));
			GameRegistry.addRecipe(new ItemStack(blackmarblebrickstair, 4),
					"x   ", "xx ", "xxx", 'x', new ItemStack(
							VanityDesignworldblock, 0, 6));
			GameRegistry.addRecipe(new ItemStack(blackmarblepillarstair, 4),
					"  x", " xx", "xxx", 'x', new ItemStack(
							VanityDesignworldblock, 0, 8));
			GameRegistry.addRecipe(new ItemStack(blackmarblepillarstair, 4),
					"x   ", "xx ", "xxx", 'x', new ItemStack(
							VanityDesignworldblock, 0, 8));
			GameRegistry.addRecipe(new ItemStack(blackmarbletilestair, 4),
					"  x", " xx", "xxx", 'x', new ItemStack(
							VanityDesignworldblock, 0, 9));
			GameRegistry.addRecipe(new ItemStack(blackmarbletilestair, 4),
					"x   ", "xx ", "xxx", 'x', new ItemStack(
							VanityDesignworldblock, 0, 9));
		}
	}

}
