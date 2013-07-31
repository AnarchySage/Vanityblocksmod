package vanityblocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fluids.IFluidHandler;

public class TileMeltingcore extends TileEntity implements IFluidHandler {
	@Override
	public boolean canDrain(ForgeDirection from, Fluid fluid) {
		return false;
	}

	@Override
	public boolean canFill(ForgeDirection from, Fluid fluid) {
		return true;
	}

	@Override
	public FluidStack drain(ForgeDirection from, FluidStack resource,
			boolean doDrain) {
		return null;
	}

	@Override
	public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {
		return null;
	}

	@Override
	public int fill(ForgeDirection from, FluidStack resource, boolean doFill) {
		return resource.amount;
	}

	@Override
	public FluidTankInfo[] getTankInfo(ForgeDirection from) {
		return new FluidTankInfo[0];
	}

	/*
	 * @Override public int getSizeInventory () { return 9; }
	 * 
	 * @Override public ItemStack getStackInSlot (int var1) { return null; }
	 * 
	 * @Override public ItemStack decrStackSize (int var1, int var2) { return
	 * null; }
	 * 
	 * @Override public ItemStack getStackInSlotOnClosing (int var1) { return
	 * null; }
	 * 
	 * @Override public void setInventorySlotContents (int var1, ItemStack var2)
	 * { // Do nothing (discarding the item). }
	 * 
	 * @Override public String getInvName () { return "MeltingCore"; }
	 * 
	 * @Override public int getInventoryStackLimit () { return 64; }
	 * 
	 * @Override public boolean isUseableByPlayer (EntityPlayer var1) { return
	 * false; }
	 * 
	 * @Override public void openChest () { }
	 * 
	 * @Override public void closeChest () { }
	 * 
	 * @Override public boolean isInvNameLocalized () { // TODO Auto-generated
	 * method stub return false; }
	 * 
	 * @Override public boolean isStackValidForSlot (int i, ItemStack itemstack)
	 * { // TODO Auto-generated method stub return true; }
	 * 
	 * @Override public int fill (ForgeDirection from, LiquidStack resource,
	 * boolean doFill) { return resource.amount; }
	 * 
	 * @Override public int fill (int tankIndex, LiquidStack resource, boolean
	 * doFill) { return resource.amount; }
	 * 
	 * @Override public LiquidStack drain (ForgeDirection from, int maxDrain,
	 * boolean doDrain) { return null; }
	 * 
	 * @Override public LiquidStack drain (int tankIndex, int maxDrain, boolean
	 * doDrain) { return null; }
	 * 
	 * private ILiquidTank[] tanks = { this };
	 * 
	 * @Override public ILiquidTank[] getTanks (ForgeDirection direction) {
	 * return tanks; }
	 * 
	 * @Override public ILiquidTank getTank (ForgeDirection direction,
	 * LiquidStack type) { return this; }
	 * 
	 * @Override public LiquidStack getLiquid () { return null; }
	 * 
	 * @Override public int getCapacity () { return 10000; }
	 * 
	 * @Override public int fill (LiquidStack resource, boolean doFill) { return
	 * resource.amount; }
	 * 
	 * @Override public LiquidStack drain (int maxDrain, boolean doDrain) {
	 * return null; }
	 * 
	 * @Override public int getTankPressure () { return -1; }
	 */
}
