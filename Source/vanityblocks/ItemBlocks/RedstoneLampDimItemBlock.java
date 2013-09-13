package vanityblocks.ItemBlocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class RedstoneLampDimItemBlock extends ItemBlock {

	private final static String[] subNames = { "blackLamp", "redLamp",
			"greenLamp", "brownLamp", "blueLamp", "purpleLamp", "pinkLamp",
			"lightBlueLamp", "magentaLamp", "", "", "", "", "", "", "", "", "" };

	public RedstoneLampDimItemBlock(int id) {
		super(id);
		setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int i) {
		return i;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return subNames[itemstack.getItemDamage()];
		// getItemName() + "." +
	}
}