package vanityblocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

public class FurnaceMelting {

	public static void addFurnaceMelts() {
		if (Storageprops.furnacemelts) {
    	GameRegistry.addSmelting(Item.bucketEmpty.itemID, new ItemStack(Item.ingotIron, 2), 0.0F);
    	GameRegistry.addSmelting(Item.minecartEmpty.itemID, new ItemStack(Item.ingotIron, 5), 0.0F);
    	GameRegistry.addSmelting(Item.doorIron.itemID, new ItemStack(Item.ingotIron, 6), 0.0F);
    	GameRegistry.addSmelting(Block.anvil.blockID, new ItemStack(Item.ingotIron, 30), 0.0F);
    	GameRegistry.addSmelting(Block.hopperBlock.blockID, new ItemStack(Item.ingotIron, 5), 0.0F);
    	FurnaceRecipes.smelting().addSmelting(Item.swordIron.itemID, 0, new ItemStack(Item.ingotIron, 2), 0.0f);
    	FurnaceRecipes.smelting().addSmelting(Item.pickaxeIron.itemID, 0, new ItemStack(Item.ingotIron, 3), 0.0F);
    	FurnaceRecipes.smelting().addSmelting(Item.shovelIron.itemID, 0, new ItemStack(Item.ingotIron, 2), 0.0F);
    	FurnaceRecipes.smelting().addSmelting(Item.hoeIron.itemID, 0, new ItemStack(Item.ingotIron, 2), 0.0F);
    	FurnaceRecipes.smelting().addSmelting(Item.axeIron.itemID, 0, new ItemStack(Item.ingotIron, 3), 0.0F);
    	FurnaceRecipes.smelting().addSmelting(Item.helmetIron.itemID, 0, new ItemStack(Item.ingotIron, 5), 0.0F);
    	FurnaceRecipes.smelting().addSmelting(Item.plateIron.itemID, 0, new ItemStack(Item.ingotIron, 8), 0.0F);
    	FurnaceRecipes.smelting().addSmelting(Item.legsIron.itemID, 0, new ItemStack(Item.ingotIron, 7), 0.0F);
    	FurnaceRecipes.smelting().addSmelting(Item.bootsIron.itemID, 0, new ItemStack(Item.ingotIron, 4), 0.0F);
    	FurnaceRecipes.smelting().addSmelting(Item.swordGold.itemID, 0, new ItemStack(Item.ingotGold, 2), 0.0F);
    	FurnaceRecipes.smelting().addSmelting(Item.pickaxeGold.itemID, 0, new ItemStack(Item.ingotGold, 3), 0.0F);
    	FurnaceRecipes.smelting().addSmelting(Item.shovelGold.itemID, 0, new ItemStack(Item.ingotGold, 2), 0.0F);
    	FurnaceRecipes.smelting().addSmelting(Item.hoeGold.itemID, 0, new ItemStack(Item.ingotGold, 2), 0.0F);
    	FurnaceRecipes.smelting().addSmelting(Item.axeGold.itemID, 0, new ItemStack(Item.ingotGold, 3), 0.0F);
    	FurnaceRecipes.smelting().addSmelting(Item.helmetGold.itemID, 0, new ItemStack(Item.ingotGold, 5), 0.0F);
    	FurnaceRecipes.smelting().addSmelting(Item.plateGold.itemID, 0, new ItemStack(Item.ingotGold, 8), 0.0F);
    	FurnaceRecipes.smelting().addSmelting(Item.legsGold.itemID, 0, new ItemStack(Item.ingotGold, 7), 0.0F);
    	FurnaceRecipes.smelting().addSmelting(Item.bootsGold.itemID, 0, new ItemStack(Item.ingotGold, 4), 0.0F);
/*    	GameRegistry.addSmelting((Block.fenceIron.blockID, 8), new ItemStack(Item.ingotIron, 1), 0.5F);
    	GameRegistry.addSmelting(Item.swordIron.itemID, new ItemStack(Item.ingotIron, 2), 0.0F);
    	GameRegistry.addSmelting(Item.pickaxeIron.itemID, new ItemStack(Item.ingotIron, 3), 0.0F);
    	GameRegistry.addSmelting(Item.shovelIron.itemID, new ItemStack(Item.ingotIron, 2), 0.0F);
    	GameRegistry.addSmelting(Item.hoeIron.itemID, new ItemStack(Item.ingotIron, 2), 0.0F);
    	GameRegistry.addSmelting(Item.axeIron.itemID, new ItemStack(Item.ingotIron, 3), 0.0F);
    	GameRegistry.addSmelting(Item.helmetIron.itemID, new ItemStack(Item.ingotIron, 5), 0.0F);
    	GameRegistry.addSmelting(Item.plateIron.itemID, new ItemStack(Item.ingotIron, 8), 0.0F);
    	GameRegistry.addSmelting(Item.legsIron.itemID, new ItemStack(Item.ingotIron, 7), 0.0F);
    	GameRegistry.addSmelting(Item.bootsIron.itemID, new ItemStack(Item.ingotIron, 4), 0.0F);
    	GameRegistry.addSmelting(Item.swordGold.itemID, new ItemStack(Item.ingotGold, 2), 0.0F);
    	GameRegistry.addSmelting(Item.pickaxeGold.itemID, new ItemStack(Item.ingotGold, 3), 0.0F);
    	GameRegistry.addSmelting(Item.shovelGold.itemID, new ItemStack(Item.ingotGold, 2), 0.0F);
    	GameRegistry.addSmelting(Item.hoeGold.itemID, new ItemStack(Item.ingotGold, 2), 0.0F);
    	GameRegistry.addSmelting(Item.axeGold.itemID, new ItemStack(Item.ingotGold, 3), 0.0F);
    	GameRegistry.addSmelting(Item.helmetGold.itemID, new ItemStack(Item.ingotGold, 5), 0.0F);
    	GameRegistry.addSmelting(Item.plateGold.itemID, new ItemStack(Item.ingotGold, 8), 0.0F);
    	GameRegistry.addSmelting(Item.legsGold.itemID, new ItemStack(Item.ingotGold, 7), 0.0F);
    	GameRegistry.addSmelting(Item.bootsGold.itemID, new ItemStack(Item.ingotGold, 4), 0.0F);
    	GameRegistry.addSmelting(Block.hopperBlock.blockID, new ItemStack(Item.ingotIron, 5), 0.0F);
    	*/
	}
  }
}
