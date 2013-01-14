package vanityblocksstorage;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class VanityFuelHandler implements IFuelHandler {
	@Override
	public int getBurnTime(ItemStack fuel) {
		int var1 = fuel.itemID;
		int var2 = fuel.itemID;
//		if(var1 == VanityBlocksStorage.charcoalblock.blockID){
//			return 14400;
//		}else if(var1 == VanityBlocksStorage.coalblock.blockID){
//			return 14400;
//		}else if (var2 == VanityBlocksStorage.coalcokeblock.blockID){
//			return 57600;
//		}else{
		{
			return 0;
		}
	}
}