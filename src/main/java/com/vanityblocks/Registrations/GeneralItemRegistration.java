package com.vanityblocks.Registrations;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.vanityblocks.Storageprops;
import com.vanityblocks.Items.arrowstorageitem;
import com.vanityblocks.Items.blazestorageitem;
import com.vanityblocks.Items.coalstorageitem;
import com.vanityblocks.Items.flintitem;
import com.vanityblocks.Items.worldgenitem;

import cpw.mods.fml.common.registry.GameRegistry;

public class GeneralItemRegistration {
	public static Item flintitem;
	public static Item coalstorageitem;
	public static Item arrowstorageitem;
	public static Item blazestorageitem;
	public static Item worldgenitem;
	public static Item villagemineitem;

	public static void generalitemregistration() {
		if (Storageprops.enableflintitem) {
			flintitem = new flintitem(Storageprops.flintitem - 256);
			GameRegistry.registerItem(flintitem, "flintitem");
		}
		if (Storageprops.enablecoalstorageitem) {
			coalstorageitem = new coalstorageitem(
					Storageprops.coalstorageitem - 256);
			GameRegistry.registerItem(coalstorageitem, "coalstorageitem");

		}
		if (Storageprops.enablearrowstorageitem) {
			arrowstorageitem = new arrowstorageitem(
					Storageprops.arrowstorageitem - 256);
			GameRegistry.registerItem(arrowstorageitem, "arrowstorageitem");
		}
		if (Storageprops.enableblazestorageitem) {
			blazestorageitem = new blazestorageitem(
					Storageprops.blazestorageitem - 256);
			GameRegistry.registerItem(blazestorageitem, "blazestorageitem");
		}
		 //worldgenitem = new worldgenitem(19500);
		 //GameRegistry.registerItem(worldgenitem, "worldgenitem");
		 //worldgenitem = new worldgenitem(19501);
		 //GameRegistry.registerItem(worldgenitem, "worldgenitem");

		// LanguageRegistry.addName(worldgenitem, "Worldgen Test Item");
	}

	public static void additemrecipes() {

		if (Storageprops.enableflintitem) {
			// ############# to make the flint item
			GameRegistry.addRecipe(new ItemStack(flintitem, 1), "xxx", "xxx",
					"xxx", 'x', new ItemStack(Items.flint, 1));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.flint, 9),
					new ItemStack(flintitem));
		}
		if (Storageprops.enablecoalstorageitem) {
			GameRegistry.addRecipe(new ItemStack(coalstorageitem, 1), "xxx",
					"x x", "xxx", 'x', new ItemStack(Items.coal, 1));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 8),
					new ItemStack(coalstorageitem));
		}
		if (Storageprops.enablearrowstorageitem) {
			GameRegistry.addRecipe(new ItemStack(arrowstorageitem, 1), "xxx",
					"xxx", "xxx", 'x', new ItemStack(Items.arrow, 1));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.arrow, 9),
					new ItemStack(arrowstorageitem));
		}
		if (Storageprops.enableblazestorageitem) {
			GameRegistry.addRecipe(new ItemStack(blazestorageitem, 1),
					new Object[] { "xxx", "xxx", "xxx", 'x',
							new ItemStack(Items.blaze_rod) });
			GameRegistry.addShapelessRecipe(new ItemStack(Items.blaze_rod, 9),
					new ItemStack(blazestorageitem));
		}
	}
}