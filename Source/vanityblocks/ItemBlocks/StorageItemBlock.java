package vanityblocks.ItemBlocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class StorageItemBlock extends ItemBlock {

	private final static String[] subNames = { "SugarCane Block", "Coal Block",
			"Charcoal Block", "Enderpearl Block", "Slime Block",
			"Bale of Wheat", "Sugar Block", "Cocoa Block", "", "Leather Block",
			"Bone Block", "", "", "", "", "" };

	public StorageItemBlock(int id) {
		super(id);
		setHasSubtypes(true);
		// setItemName("storageblock");
	}

	@Override
	public int getMetadata(int i) {
		return i;
	}

	@Override
	// public String getItemNameIS(ItemStack itemstack) {
	// return getItemName() + "." + subNames[itemstack.getItemDamage()];
	// }
	public String getUnlocalizedName(ItemStack itemstack) {
		return subNames[itemstack.getItemDamage()];
		// getItemName() + "." +
	}
}