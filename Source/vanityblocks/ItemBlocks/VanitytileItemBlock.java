package vanityblocks.ItemBlocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class VanitytileItemBlock extends ItemBlock {

	private final static String[] subNames = { "Melting Core", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "" };

	public VanitytileItemBlock(int id) {
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