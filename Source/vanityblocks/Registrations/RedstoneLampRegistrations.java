/*
 *     public static final Block redstoneLampIdle = (new BlockRedstoneLight(123, false)).setHardness(0.3F).setStepSound(soundGlassFootstep).setUnlocalizedName("redstoneLight").setCreativeTab(CreativeTabs.tabRedstone).func_111022_d("redstone_lamp_off");
    public static final Block redstoneLampActive = (new BlockRedstoneLight(124, true)).setHardness(0.3F).setStepSound(soundGlassFootstep).setUnlocalizedName("redstoneLight").func_111022_d("redstone_lamp_on");
 */
package vanityblocks.Registrations;

import vanityblocks.Storageprops;
import vanityblocks.Blocks.RedstonedimLamps;
import vanityblocks.Blocks.RedstonelitLamps;
import vanityblocks.Blocks.VanityRandomBlocks;
import vanityblocks.ItemBlocks.RedstoneLampDimItemBlock;
import vanityblocks.ItemBlocks.RedstoneLampLitItemBlock;
import vanityblocks.ItemBlocks.VanityRandomItemBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class RedstoneLampRegistrations {

	public static void redstonelampregistration() {
		redstonelampdimconfig = Storageprops.redstonelampdimconfig;
		RedstoneLampDim = new RedstonedimLamps(redstonelampdimconfig, false);

		redstonelamplitconfig = Storageprops.redstonelamplitconfig;
		RedstoneLampLit = new RedstonelitLamps(redstonelamplitconfig, true);

		/* ##### Dim Lamps ##### */
		GameRegistry.registerBlock(RedstoneLampDim,
				RedstoneLampDimItemBlock.class, "Redstone Lamp Dim");
		LanguageRegistry.addName(new ItemStack(RedstoneLampDim, 1, 0),
				"Dim Black Redstone Lamp");
		LanguageRegistry.addName(new ItemStack(RedstoneLampDim, 1, 1),
				"Dim Red Redstone Lamp");
		LanguageRegistry.addName(new ItemStack(RedstoneLampDim, 1, 2),
				"Dim Green Redstone Lamp");
		LanguageRegistry.addName(new ItemStack(RedstoneLampDim, 1, 3),
				"Dim Brown Redstone Lamp");
		LanguageRegistry.addName(new ItemStack(RedstoneLampDim, 1, 4),
				"Dim Blue Redstone Lamp");
		LanguageRegistry.addName(new ItemStack(RedstoneLampDim, 1, 5),
				"Dim Purple Redstone Lamp");
		LanguageRegistry.addName(new ItemStack(RedstoneLampDim, 1, 6),
				"Dim Pink Redstone Lamp");
		LanguageRegistry.addName(new ItemStack(RedstoneLampDim, 1, 7),
				"Dim Light Blue Redstone Lamp");
		LanguageRegistry.addName(new ItemStack(RedstoneLampDim, 1, 8),
				"Dim Magenta Redstone Lamp");
		// #### Lit Lamps ###
		GameRegistry.registerBlock(RedstoneLampLit,
				RedstoneLampLitItemBlock.class, "Redstone Lamp Lit");
		LanguageRegistry.addName(new ItemStack(RedstoneLampLit, 1, 0),
				"Lit Black Redstone Lamp");
		LanguageRegistry.addName(new ItemStack(RedstoneLampLit, 1, 1),
				"Lit Red Redstone Lamp");
		LanguageRegistry.addName(new ItemStack(RedstoneLampLit, 1, 2),
				"Lit Green Redstone Lamp");
		LanguageRegistry.addName(new ItemStack(RedstoneLampLit, 1, 3),
				"Lit Brown Redstone Lamp");
		LanguageRegistry.addName(new ItemStack(RedstoneLampLit, 1, 4),
				"Lit Blue Redstone Lamp");
		LanguageRegistry.addName(new ItemStack(RedstoneLampLit, 1, 5),
				"Lit Purple Redstone Lamp");
		LanguageRegistry.addName(new ItemStack(RedstoneLampLit, 1, 6),
				"Lit Pink Redstone Lamp");
		LanguageRegistry.addName(new ItemStack(RedstoneLampLit, 1, 7),
				"Lit Light Blue Redstone Lamp");
		LanguageRegistry.addName(new ItemStack(RedstoneLampLit, 1, 8),
				"Lit Magenta Redstone Lamp");
	}

	public static void addRecipes() {
		// Recipes for Black Lamp
		GameRegistry.addShapelessRecipe(new ItemStack(RedstoneLampDim, 1, 0),
				new ItemStack(Block.redstoneLampIdle), new ItemStack(
						Item.dyePowder, 1, 0));
		// Recipes for Red Lamp
		GameRegistry.addShapelessRecipe(new ItemStack(RedstoneLampDim, 1, 1),
				new ItemStack(Block.redstoneLampIdle), new ItemStack(
						Item.dyePowder, 1, 1));
		// Recipes For Green Lamp
		GameRegistry.addShapelessRecipe(new ItemStack(RedstoneLampDim, 1, 2),
				new ItemStack(Block.redstoneLampIdle), new ItemStack(
						Item.dyePowder, 1, 2));
		// Recipes for Brown Lamp
		GameRegistry.addShapelessRecipe(new ItemStack(RedstoneLampDim, 1, 3),
				new ItemStack(Block.redstoneLampIdle), new ItemStack(
						Item.dyePowder, 1, 3));
		// Recipes for Blue Lamp
		GameRegistry.addShapelessRecipe(new ItemStack(RedstoneLampDim, 1, 4),
				new ItemStack(Block.redstoneLampIdle), new ItemStack(
						Item.dyePowder, 1, 4));
		// Recipes for Purple Lamp
		GameRegistry.addShapelessRecipe(new ItemStack(RedstoneLampDim, 1, 5),
				new ItemStack(Block.redstoneLampIdle), new ItemStack(
						Item.dyePowder, 1, 5));
		// Recipes for Pink Lamp
		GameRegistry.addShapelessRecipe(new ItemStack(RedstoneLampDim, 1, 6),
				new ItemStack(Block.redstoneLampIdle), new ItemStack(
						Item.dyePowder, 1, 9));
		// Recipes for Light Blue Lamp
		GameRegistry.addShapelessRecipe(new ItemStack(RedstoneLampDim, 1, 7),
				new ItemStack(Block.redstoneLampIdle), new ItemStack(
						Item.dyePowder, 1, 12));
		// Recipes for Magenta Lamp
		GameRegistry.addShapelessRecipe(new ItemStack(RedstoneLampDim, 1, 8),
				new ItemStack(Block.redstoneLampIdle), new ItemStack(
						Item.dyePowder, 1, 13));
	}

	public static Block RedstoneLampDim;
	public static int redstonelampdimconfig;
	public static Block RedstoneLampLit;
	public static int redstonelamplitconfig;
}
