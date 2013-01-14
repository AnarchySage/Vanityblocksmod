package vanityblocksstorage;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class StorageItemModBlock extends ItemBlock {
	
	private final static String[] subNames = {
		"Tin Block", "Copper Block", "Silver Block",
		"Lead Block", "Nikolite Block", "Nickel/Ferrous Block", "Electrum Block",
		"Platinum/Shiny Block", "Invar Block", "Brass Block"
	};

	public StorageItemModBlock(int id) {
		super(id);
		setHasSubtypes(true);
		setItemName("storageblockmod");
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