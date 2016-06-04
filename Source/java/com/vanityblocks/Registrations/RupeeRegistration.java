package com.vanityblocks.Registrations;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.vanityblocks.Storageprops;
import com.vanityblocks.Items.bigbluerupee;
import com.vanityblocks.Items.biggreenrupee;
import com.vanityblocks.Items.bigredrupee;
import com.vanityblocks.Items.bluerupee;
import com.vanityblocks.Items.greenrupee;
import com.vanityblocks.Items.redrupee;

import cpw.mods.fml.common.registry.GameRegistry;

public class RupeeRegistration {
	public static Item greenrupee1;
	public static Item bluerupee5;
	public static Item redrupee20;
	public static Item biggreenrupee50;
	public static Item bigbluerupee100;
	public static Item bigredrupee200;

	public static void rupeeregistration() {
		if (Storageprops.enablerupees) {
			/* ##### Items ##### */
			greenrupee1 = new greenrupee(Storageprops.greenrupee1 - 256);// .setUnlocalizedName("Greenrupee");
			GameRegistry.registerItem(greenrupee1, "greenrupee1");

			bluerupee5 = new bluerupee(Storageprops.bluerupee5 - 256);// .setUnlocalizedName("Bluerupee");
			GameRegistry.registerItem(bluerupee5, "bluerupee5");

			redrupee20 = new redrupee(Storageprops.redrupee20 - 256);// .setUnlocalizedName("Redrupee");
			GameRegistry.registerItem(redrupee20, "redrupee20");

			biggreenrupee50 = new biggreenrupee(
					Storageprops.biggreenrupee50 - 256);// .setUnlocalizedName("Greenrupee50");
			GameRegistry.registerItem(biggreenrupee50, "biggreenrupee50");

			bigbluerupee100 = new bigbluerupee(
					Storageprops.bigbluerupee100 - 256);// .setUnlocalizedName("Bluerupee100");
			GameRegistry.registerItem(bigbluerupee100, "bigbluerupee100");

			bigredrupee200 = new bigredrupee(Storageprops.bigredrupee200 - 256);// .setUnlocalizedName("Bigredrupee");
			GameRegistry.registerItem(bigredrupee200, "bigredrupee200");
		}
	}

	public static void addrupeerecipes() {

		if (Storageprops.enablerupees) {
			// ############# to make the Blue Rupees
			GameRegistry.addShapelessRecipe(new ItemStack(greenrupee1, 5),
					new ItemStack(bluerupee5));
			GameRegistry.addShapelessRecipe(new ItemStack(bluerupee5),
					new ItemStack(greenrupee1), new ItemStack(greenrupee1),
					new ItemStack(greenrupee1), new ItemStack(greenrupee1),
					new ItemStack(greenrupee1));

			// ########## To make the Red Rupees
			GameRegistry.addShapelessRecipe(new ItemStack(redrupee20),
					new ItemStack(bluerupee5), new ItemStack(bluerupee5),
					new ItemStack(bluerupee5), new ItemStack(bluerupee5));
			GameRegistry.addShapelessRecipe(new ItemStack(bluerupee5, 4),
					new ItemStack(redrupee20));

			// ######### To make the Big Green Rupee
			GameRegistry.addShapelessRecipe(new ItemStack(biggreenrupee50),
					new ItemStack(redrupee20), new ItemStack(redrupee20),
					new ItemStack(bluerupee5), new ItemStack(bluerupee5));
			GameRegistry.addShapelessRecipe(new ItemStack(greenrupee1, 50),
					new ItemStack(biggreenrupee50));

			// ########### To make the Big Blue Rupee
			GameRegistry.addShapelessRecipe(new ItemStack(bigbluerupee100),
					new ItemStack(biggreenrupee50), new ItemStack(
							biggreenrupee50));
			GameRegistry.addShapelessRecipe(new ItemStack(bigbluerupee100),
					new ItemStack(redrupee20), new ItemStack(redrupee20),
					new ItemStack(redrupee20), new ItemStack(redrupee20),
					new ItemStack(redrupee20));
			GameRegistry.addShapelessRecipe(new ItemStack(biggreenrupee50, 2),
					new ItemStack(bigbluerupee100));
			GameRegistry.addShapelessRecipe(new ItemStack(bluerupee5, 10),
					new ItemStack(bigbluerupee100));

			// ####### To make the Big Red Rupee
			GameRegistry.addShapelessRecipe(new ItemStack(bigredrupee200),
					new ItemStack(bigbluerupee100), new ItemStack(
							bigbluerupee100));
			GameRegistry.addShapelessRecipe(new ItemStack(bigredrupee200),
					new ItemStack(biggreenrupee50), new ItemStack(
							biggreenrupee50), new ItemStack(biggreenrupee50),
					new ItemStack(biggreenrupee50));
			GameRegistry.addShapelessRecipe(new ItemStack(bigbluerupee100, 2),
					new ItemStack(bigredrupee200));

		}
	}
}