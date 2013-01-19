package vanityblocks;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class VanityFuelHandler implements IFuelHandler {
	@Override
	public int getBurnTime(ItemStack fuel) {
//		int var1 = fuel.itemID;
		int var = StorageBlock(0);
		if (var){
			return 14400;
		}
//		if(var1 == ("VanityBlocksStorage.StorageBlock"){
//			return 14400;
//		}else if(var1 == VanityBlocksStorage.coalblock.blockID){
//			return 14400;
//		}else if (var2 == VanityBlocksStorage.coalcokeblock.blockID){
//			return 57600;
//		}else{
//		{
			return 0;
		}
	}
