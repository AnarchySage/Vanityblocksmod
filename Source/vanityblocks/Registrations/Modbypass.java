package vanityblocks.Registrations;

import java.util.HashMap;
import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

public class Modbypass {
	public static void bypassrecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(Block.planks, 8, 0),
				new ItemStack(Block.wood, 1, 0),
				new ItemStack(Block.wood, 1, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(Block.planks, 8, 1),
				new ItemStack(Block.wood, 1, 0),
				new ItemStack(Block.wood, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Block.planks, 8, 2),
				new ItemStack(Block.wood, 1, 0),
				new ItemStack(Block.wood, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(Block.planks, 8, 3),
				new ItemStack(Block.wood, 1, 0),
				new ItemStack(Block.wood, 1, 3));
	}
}
