package vanityblocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class VanityRandomItemBlock extends ItemBlock {

	private final static String[] subNames = { "Clay Brick", "Lapis Block - Old", "White SoulSand", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "" };

	public VanityRandomItemBlock(int id) {
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