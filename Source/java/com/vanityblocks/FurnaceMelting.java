package com.vanityblocks;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class FurnaceMelting {

	public static void addFurnaceMelts() {
		if (Storageprops.furnacemelts) {
			GameRegistry.addSmelting(Items.bucket, new ItemStack(
					Items.iron_ingot, 2), 0.0F);
			GameRegistry.addSmelting(Items.minecart, new ItemStack(
					Items.iron_ingot, 5), 0.0F);
			GameRegistry.addSmelting(Items.iron_door, new ItemStack(
					Items.iron_ingot, 6), 0.0F);
			GameRegistry.addSmelting(Blocks.anvil, new ItemStack(
					Items.iron_ingot, 30), 0.0F);
			GameRegistry.addSmelting(Blocks.hopper, new ItemStack(
					Items.iron_ingot, 5), 0.0F);
			GameRegistry.addSmelting(Items.iron_sword, new ItemStack(
					Items.iron_ingot), 0.0f);
			GameRegistry.addSmelting(Items.iron_pickaxe, new ItemStack(
					Items.iron_ingot, 3), 0.0F);
			GameRegistry.addSmelting(Items.iron_shovel, new ItemStack(
					Items.iron_ingot, 2), 0.0F);
			GameRegistry.addSmelting(Items.iron_hoe, new ItemStack(
					Items.iron_ingot, 2), 0.0F);
			GameRegistry.addSmelting(Items.iron_axe, new ItemStack(
					Items.iron_ingot, 3), 0.0F);
			GameRegistry.addSmelting(Items.iron_helmet, new ItemStack(
					Items.iron_ingot, 5), 0.0F);
			GameRegistry.addSmelting(Items.iron_chestplate, new ItemStack(
					Items.iron_ingot, 8), 0.0F);
			GameRegistry.addSmelting(Items.iron_leggings, new ItemStack(
					Items.iron_ingot, 7), 0.0F);
			GameRegistry.addSmelting(Items.iron_boots, new ItemStack(
					Items.iron_ingot, 4), 0.0F);
			GameRegistry.addSmelting(Items.golden_sword, new ItemStack(
					Items.gold_ingot, 2), 0.0F);
			GameRegistry.addSmelting(Items.golden_pickaxe, new ItemStack(
					Items.gold_ingot, 3), 0.0F);
			GameRegistry.addSmelting(Items.golden_shovel, new ItemStack(
					Items.gold_ingot, 2), 0.0F);
			GameRegistry.addSmelting(Items.golden_hoe, new ItemStack(
					Items.gold_ingot, 2), 0.0F);
			GameRegistry.addSmelting(Items.golden_axe, new ItemStack(
					Items.gold_ingot, 3), 0.0F);
			GameRegistry.addSmelting(Items.golden_helmet, new ItemStack(
					Items.gold_ingot, 5), 0.0F);
			GameRegistry.addSmelting(Items.golden_chestplate, new ItemStack(
					Items.gold_ingot, 8), 0.0F);
			GameRegistry.addSmelting(Items.golden_leggings, new ItemStack(
					Items.gold_ingot, 7), 0.0F);
			GameRegistry.addSmelting(Items.golden_boots, new ItemStack(
					Items.gold_ingot, 4), 0.0F);
		}
	}
}
