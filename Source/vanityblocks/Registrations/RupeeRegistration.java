package vanityblocks.Registrations;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import vanityblocks.Storageprops;
import vanityblocks.Blocks.ForestryBlock;
import vanityblocks.Blocks.StorageBlock;
import vanityblocks.Blocks.StorageBlockMod;
import vanityblocks.Items.bigbluerupee;
import vanityblocks.Items.biggreenrupee;
import vanityblocks.Items.bigredrupee;
import vanityblocks.Items.bluerupee;
import vanityblocks.Items.greenrupee;
import vanityblocks.Items.redrupee;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

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
			greenrupee1 = new greenrupee(Storageprops.greenrupee1 - 256)
					.setUnlocalizedName("Greenrupee");
			bluerupee5 = new bluerupee(Storageprops.bluerupee5 - 256)
					.setUnlocalizedName("Bluerupee");
			redrupee20 = new redrupee(Storageprops.redrupee20 - 256)
					.setUnlocalizedName("Redrupee");
			biggreenrupee50 = new biggreenrupee(
					Storageprops.biggreenrupee50 - 256)
					.setUnlocalizedName("Greenrupee50");
			bigbluerupee100 = new bigbluerupee(
					Storageprops.bigbluerupee100 - 256)
					.setUnlocalizedName("Bluerupee100");
			bigredrupee200 = new bigredrupee(Storageprops.bigredrupee200 - 256)
					.setUnlocalizedName("Bigredrupee");
			LanguageRegistry.addName(greenrupee1, "Green Rupee - 1 Rupee's");
			LanguageRegistry.addName(bluerupee5, "Blue Rupee - 5 Rupee's");
			LanguageRegistry.addName(redrupee20, "Red Rupee - 20 Rupee's");
			LanguageRegistry.addName(biggreenrupee50,
					"Big Green Rupee - 50 Rupee's");
			LanguageRegistry.addName(bigbluerupee100,
					"Big Blue Rupee - 100 Rupee's");
			LanguageRegistry.addName(bigredrupee200,
					"Big Red Rupee - 200 Rupee's");
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