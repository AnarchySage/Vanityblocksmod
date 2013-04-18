package vanityblocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class VanitydesignworldItemBlock extends ItemBlock {
	
	private final static String[] subNames = {
		"Marble", "Marble Brick", "Chiseled Marble", "Ashford Black Marble", "Ashford Black Marble Brick", "Chiseled Ashford Black Marble", "", "",
		"", "", "", "", "", "", "", "", "", "", ""
	};

	public VanitydesignworldItemBlock(int id) {
		super(id);
		setHasSubtypes(true);
//		setItemName("vanitydesignblocks");
	}
	
	@Override
    public int getMetadata(int i)
    {
        return i;
    }
	
	@Override
//	public String getItemNameIS(ItemStack itemstack) {
//		return getItemName() + "." + subNames[itemstack.getItemDamage()];
//	}
    public String getUnlocalizedName(ItemStack itemstack) {
		return subNames[itemstack.getItemDamage()];
		//getItemName() + "." + 
    }
}