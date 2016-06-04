package com.vanityblocks.Registrations;

import net.minecraft.block.Block;

import com.vanityblocks.Storageprops;
import com.vanityblocks.Blocks.MiddleStonePillars;
import com.vanityblocks.ItemBlocks.PillarsStoneMiddleItemBlock;

import cpw.mods.fml.common.registry.GameRegistry;

public class PillarRegistrations {

	public static void pillarregistrations() {
		/*
		 * Maybe snow? Maybe wool? Pillars of my marble/black marble diyo says
		 * need id per portion, top, middle, bottom Stones \/ Stone 0,
		 * cobblestone 1, sandstone 2, brick 3, mossy cobble 4, obsidian 5,
		 * Netherrack 6, stone brick 7, mossy brick 8, cracked brick 9, circle
		 * brick 10, nether brick 11, end stone 12,
		 * 
		 * Precious metals \/ Iron 0, gold 1, lapis 2, diamond 3, redstone 4,
		 * emerald 5, quartz 6, glowstone 7,
		 * 
		 * Clays \/ white 0, orange 1, magenta 2, light blue 3, yellow 4, lime
		 * 5, pink 6, gray 7, light gray 8, cyan 9, purple 10, blue 11, brown
		 * 12, green 13, red 14, black 15.
		 * 
		 * Woods/planks \/
		 * 
		 * Oak 0, spruce 1, birch 2, jungle 3, acacia 4, dark oak 5, oak planks
		 * 6, spruce planks 7, birch planks 8, jungle planks 9, acacia planks
		 * 10, dark oak planks 11
		 */
		pillarsstoneconfig = Storageprops.pillarsstoneconfig;
		PillarsStone = new MiddleStonePillars(pillarsstoneconfig);

		/* ##### Stone pillars ##### */
		GameRegistry.registerBlock(PillarsStone,
				PillarsStoneMiddleItemBlock.class, "Stone Pillars Middle");
	}

	public static void addRecipes() {
	}

	public static Block PillarsStone;

	public static int pillarsstoneconfig;
	public static int pillarsoresconfig;
	public static int pillarsclaysconfig;
	public static int pillarswoodconfig;
}