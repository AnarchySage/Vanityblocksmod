package vanityblocks.Registrations;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import vanityblocks.Storageprops;
import vanityblocks.Blocks.ForestryBlock;
import vanityblocks.Blocks.StorageBlock;
import vanityblocks.Blocks.StorageBlockMod;
import vanityblocks.Items.arrowstorageitem;
import vanityblocks.Items.bigbluerupee;
import vanityblocks.Items.biggreenrupee;
import vanityblocks.Items.bigredrupee;
import vanityblocks.Items.blazestorageitem;
import vanityblocks.Items.bluerupee;
import vanityblocks.Items.coalstorageitem;
import vanityblocks.Items.flintitem;
import vanityblocks.Items.greenrupee;
import vanityblocks.Items.redrupee;
import vanityblocks.Items.blazestorageitem;
import vanityblocks.Items.worldgenitem;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class GeneralItemRegistration {
	public static Item flintitem;
	public static Item coalstorageitem;
	public static Item arrowstorageitem;
	public static Item blazestorageitem;

	// public static Item worldgenitem;

	public static void generalitemregistration() {
		if (Storageprops.enableflintitem) {
			flintitem = new flintitem(Storageprops.flintitem - 256)
					.setUnlocalizedName("FlintStorageItem");
			LanguageRegistry.addName(flintitem, "Flint Storage Item");
		}
		if (Storageprops.enablecoalstorageitem) {
			coalstorageitem = new coalstorageitem(
					Storageprops.coalstorageitem - 256)
					.setUnlocalizedName("CoalStorageItem");
			LanguageRegistry.addName(coalstorageitem,
					"Coal Storage Item( 8pieces )");
		}
		if (Storageprops.enablearrowstorageitem) {
			arrowstorageitem = new arrowstorageitem(
					Storageprops.arrowstorageitem - 256)
					.setUnlocalizedName("ArrowStorageItem");
			LanguageRegistry.addName(arrowstorageitem, "Arrow Bundle");
		}
		if (Storageprops.enableblazestorageitem) {
			blazestorageitem = new blazestorageitem(
					Storageprops.blazestorageitem - 256)
					.setUnlocalizedName("BlazeStorageItem");
			LanguageRegistry.addName(blazestorageitem, "Blaze Rod Bundle");
		}
		// worldgenitem = new
		// worldgenitem(19500).setUnlocalizedName("worldgenitem");
		// LanguageRegistry.addName(worldgenitem, "Worldgen Test Item");
	}

	public static void additemrecipes() {

		if (Storageprops.enableflintitem) {
			// ############# to make the flint item
			GameRegistry.addRecipe(new ItemStack(flintitem, 1), "xxx", "xxx",
					"xxx", 'x', new ItemStack(Item.flint, 1));
			GameRegistry.addShapelessRecipe(new ItemStack(Item.flint, 9),
					new ItemStack(flintitem));
		}
		if (Storageprops.enablecoalstorageitem) {
			// GameRegistry.addRecipe(new ItemStack(coalstorageitem, 1), "xxx",
			// "x x", "xxx", 'x', new ItemStack(Item.coal, 1));
			GameRegistry.addShapelessRecipe(new ItemStack(Item.coal, 8),
					new ItemStack(coalstorageitem));
		}
		if (Storageprops.enablearrowstorageitem) {
			GameRegistry.addRecipe(new ItemStack(arrowstorageitem, 1), "xxx",
					"xxx", "xxx", 'x', new ItemStack(Item.arrow, 1));
			GameRegistry.addShapelessRecipe(new ItemStack(Item.arrow, 9),
					new ItemStack(arrowstorageitem));
		}
		if (Storageprops.enableblazestorageitem) {
			GameRegistry.addRecipe(new ItemStack(blazestorageitem, 1),
					new Object[] { "xxx", "xxx", "xxx", 'x',
							new ItemStack(Item.blazeRod) });
			GameRegistry.addShapelessRecipe(new ItemStack(Item.blazeRod, 9),
					new ItemStack(blazestorageitem));
		}
	}
}