package vanityblocks;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class VanityFuelHandler implements IFuelHandler {
	@Override
	public int getBurnTime(ItemStack fuel) {
//		int var1 = fuel.itemID;
		if (fuel.itemID == VanityBlocksStorage.StorageBlock.blockID){
		if (fuel.getItemDamage() == (0)){
					return 14400;
		}
		if (fuel.getItemDamage() == (1)){
			return 14400;
		}
		}
			return 0;
		}
	}
