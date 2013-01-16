package vanityblocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class vanitytileItemBlock extends ItemBlock {
	
	private final static String[] subNames = {
		"Melting Core", "", "", "", "",
		"", "", "", "", "", "", "", "", "", "", ""
	};

	public vanitytileItemBlock(int id) {
		super(id);
		setHasSubtypes(true);
		setItemName("storageblock");
	}
	
	@Override
    public int getMetadata(int i)
    {
        return i;
    }
	
	@Override
	public String getItemNameIS(ItemStack itemstack) {
		return getItemName() + "." + subNames[itemstack.getItemDamage()];
	}

}