package vanityblocks.ItemBlocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class VanitydesignItemBlock extends ItemBlock {

	private final static String[] subNames = { "Lava Lamp", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "" };

	public VanitydesignItemBlock(int id) {
		super(id);
		setHasSubtypes(true);
		// setItemName("vanitydesignblocks");
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