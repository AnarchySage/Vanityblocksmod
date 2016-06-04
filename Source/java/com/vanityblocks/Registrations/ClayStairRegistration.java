package com.vanityblocks.Registrations;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import com.vanityblocks.Blocks.ClayStairs;

import cpw.mods.fml.common.registry.GameRegistry;

public class ClayStairRegistration {

	public static void claystairregistration() {
		stairwhite = new ClayStairs(Blocks.stained_hardened_clay, 0).setBlockName("stair.white");
		stairwhite.stepSound = Block.soundTypeWood;
        GameRegistry.registerBlock(stairwhite, "stair.white");
        
        stairorange = new ClayStairs(Blocks.stained_hardened_clay, 1).setBlockName("stair.orange");
		stairorange.stepSound = Block.soundTypeWood;
        GameRegistry.registerBlock(stairorange, "stair.orange");
        
        stairmagenta = new ClayStairs(Blocks.stained_hardened_clay, 2).setBlockName("stair.magenta");
        stairmagenta.stepSound = Block.soundTypeWood;
        GameRegistry.registerBlock(stairmagenta, "stair.magenta");
        
        stairlightblue = new ClayStairs(Blocks.stained_hardened_clay, 3).setBlockName("stair.lightblue");
		stairlightblue.stepSound = Block.soundTypeWood;
        GameRegistry.registerBlock(stairlightblue, "stair.lightblue");
        
        stairyellow = new ClayStairs(Blocks.stained_hardened_clay, 4).setBlockName("stair.yellow");
        stairyellow.stepSound = Block.soundTypeWood;
        GameRegistry.registerBlock(stairyellow, "stair.yellow");
        
        stairlime = new ClayStairs(Blocks.stained_hardened_clay, 5).setBlockName("stair.lime");
        stairlime.stepSound = Block.soundTypeWood;
        GameRegistry.registerBlock(stairlime, "stair.lime");
        
        stairpink = new ClayStairs(Blocks.stained_hardened_clay, 6).setBlockName("stair.pink");
        stairpink.stepSound = Block.soundTypeWood;
        GameRegistry.registerBlock(stairpink, "stair.pink");
        
        stairgray = new ClayStairs(Blocks.stained_hardened_clay, 7).setBlockName("stair.gray");
        stairgray.stepSound = Block.soundTypeWood;
        GameRegistry.registerBlock(stairgray, "stair.gray");
        
        stairlightgray = new ClayStairs(Blocks.stained_hardened_clay, 8).setBlockName("stair.lightgray");
        stairlightgray.stepSound = Block.soundTypeWood;
        GameRegistry.registerBlock(stairlightgray, "stair.lightgray");
        
        staircyan = new ClayStairs(Blocks.stained_hardened_clay, 9).setBlockName("stair.cyan");
        staircyan.stepSound = Block.soundTypeWood;
        GameRegistry.registerBlock(staircyan, "stair.cyan");
        
        stairpurple = new ClayStairs(Blocks.stained_hardened_clay, 10).setBlockName("stair.purple");
        stairpurple.stepSound = Block.soundTypeWood;
        GameRegistry.registerBlock(stairpurple, "stair.purple");
        
        stairblue = new ClayStairs(Blocks.stained_hardened_clay, 11).setBlockName("stair.blue");
        stairblue.stepSound = Block.soundTypeWood;
        GameRegistry.registerBlock(stairblue, "stair.blue");
        
        stairbrown = new ClayStairs(Blocks.stained_hardened_clay, 12).setBlockName("stair.brown");
        stairbrown.stepSound = Block.soundTypeWood;
        GameRegistry.registerBlock(stairbrown, "stair.brown");
        
        stairgreen = new ClayStairs(Blocks.stained_hardened_clay, 13).setBlockName("stair.green");
        stairgreen.stepSound = Block.soundTypeWood;
        GameRegistry.registerBlock(stairgreen, "stair.green");
        
        stairred = new ClayStairs(Blocks.stained_hardened_clay, 14).setBlockName("stair.red");
        stairred.stepSound = Block.soundTypeWood;
        GameRegistry.registerBlock(stairred, "stair.red");
        
        stairblack = new ClayStairs(Blocks.stained_hardened_clay, 15).setBlockName("stair.black");
        stairblack.stepSound = Block.soundTypeWood;
        GameRegistry.registerBlock(stairblack, "stair.black");

	}

	public static void addRecipes() {		
		GameRegistry.addRecipe(
				new ItemStack(stairwhite, 4), "  x", " xx","xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 0));
		GameRegistry.addRecipe(
				new ItemStack(stairwhite, 4), "x   ", "xx ", "xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 0));
		
		GameRegistry.addRecipe(
				new ItemStack(stairorange, 4), "  x", " xx","xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 1));
		GameRegistry.addRecipe(
				new ItemStack(stairorange, 4), "x   ", "xx ", "xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 1));
		
		GameRegistry.addRecipe(
				new ItemStack(stairmagenta, 4), "  x", " xx","xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 2));
		GameRegistry.addRecipe(
				new ItemStack(stairmagenta, 4), "x   ", "xx ", "xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 2));
		
		GameRegistry.addRecipe(
				new ItemStack(stairlightblue, 4), "  x", " xx","xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 3));
		GameRegistry.addRecipe(
				new ItemStack(stairlightblue, 4), "x   ", "xx ", "xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 3));
		
		GameRegistry.addRecipe(
				new ItemStack(stairyellow, 4), "  x", " xx","xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 4));
		GameRegistry.addRecipe(
				new ItemStack(stairyellow, 4), "x   ", "xx ", "xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 4));
		
		GameRegistry.addRecipe(
				new ItemStack(stairlime, 4), "  x", " xx","xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 5));
		GameRegistry.addRecipe(
				new ItemStack(stairlime, 4), "x   ", "xx ", "xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 5));
		
		GameRegistry.addRecipe(
				new ItemStack(stairpink, 4), "  x", " xx","xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 6));
		GameRegistry.addRecipe(
				new ItemStack(stairpink, 4), "x   ", "xx ", "xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 6));
		
		GameRegistry.addRecipe(
				new ItemStack(stairgray, 4), "  x", " xx","xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 7));
		GameRegistry.addRecipe(
				new ItemStack(stairgray, 4), "x   ", "xx ", "xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 7));
		
		GameRegistry.addRecipe(
				new ItemStack(stairlightgray, 4), "  x", " xx","xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 8));
		GameRegistry.addRecipe(
				new ItemStack(stairlightgray, 4), "x   ", "xx ", "xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 8));
		
		GameRegistry.addRecipe(
				new ItemStack(staircyan, 4), "  x", " xx","xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 9));
		GameRegistry.addRecipe(
				new ItemStack(staircyan, 4), "x   ", "xx ", "xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 9));
		
		GameRegistry.addRecipe(
				new ItemStack(stairpurple, 4), "  x", " xx","xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 10));
		GameRegistry.addRecipe(
				new ItemStack(stairpurple, 4), "x   ", "xx ", "xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 10));
		
		GameRegistry.addRecipe(
				new ItemStack(stairblue, 4), "  x", " xx","xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 11));
		GameRegistry.addRecipe(
				new ItemStack(stairblue, 4), "x   ", "xx ", "xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 11));
		
		GameRegistry.addRecipe(
				new ItemStack(stairbrown, 4), "  x", " xx","xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 12));
		GameRegistry.addRecipe(
				new ItemStack(stairbrown, 4), "x   ", "xx ", "xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 12));
		
		GameRegistry.addRecipe(
				new ItemStack(stairgreen, 4), "  x", " xx","xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 13));
		GameRegistry.addRecipe(
				new ItemStack(stairgreen, 4), "x   ", "xx ", "xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 13));
		
		GameRegistry.addRecipe(
				new ItemStack(stairred, 4), "  x", " xx","xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 14));
		GameRegistry.addRecipe(
				new ItemStack(stairred, 4), "x   ", "xx ", "xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 14));
		
		GameRegistry.addRecipe(
				new ItemStack(stairblack, 4), "  x", " xx","xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 15));
		GameRegistry.addRecipe(
				new ItemStack(stairblack, 4), "x   ", "xx ", "xxx", 'x', new ItemStack(Blocks.stained_hardened_clay, 1, 15));
		
		
	}
	
	public static Block stairwhite;
	public static Block stairorange;
	public static Block stairmagenta;
	public static Block stairlightblue;
	public static Block stairyellow;
	public static Block stairlime;
	public static Block stairpink;
	public static Block stairgray;
	public static Block stairlightgray;
	public static Block staircyan;
	public static Block stairpurple;
	public static Block stairblue;
	public static Block stairbrown;
	public static Block stairgreen;
	public static Block stairred;
	public static Block stairblack;
}