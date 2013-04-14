package vanityblocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

	public class TileMeltingcore extends TileEntity implements IInventory {

		@Override
		public int getSizeInventory() {
			return 9;
		}

		@Override
		public ItemStack getStackInSlot(int var1) {
			return null;
		}

		@Override
		public ItemStack decrStackSize(int var1, int var2) {
			return null;
		}

		@Override
		public ItemStack getStackInSlotOnClosing(int var1) {
			return null;
		}

		@Override
		public void setInventorySlotContents(int var1, ItemStack var2) {
			// Do nothing (discarding the item).
		}

		@Override
		public String getInvName() {
			return "MeltingCore";
		}

		@Override
		public int getInventoryStackLimit() {
			return 64;
		}

		@Override
		public boolean isUseableByPlayer(EntityPlayer var1) {
			return false;
		}

		@Override
		public void openChest() {
		}

		@Override
		public void closeChest() {
		}

		@Override
		public boolean isInvNameLocalized() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isStackValidForSlot(int i, ItemStack itemstack) {
			// TODO Auto-generated method stub
			return true;
		}
	}
