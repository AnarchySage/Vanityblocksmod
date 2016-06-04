package com.vanityblocks.TileEntitys;

import java.util.HashMap;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fluids.IFluidHandler;

public class TileMeltingcore extends TileEntity implements IFluidHandler,
		IInventory {
	public static HashMap<FluidStack, Long> storage = new HashMap<FluidStack, Long>();

	FluidTank tank = new FluidTank(1000000);

	// This is for items.
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
	public String getInventoryName() {
		return "Melting Core";
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
	public boolean hasCustomInventoryName() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void openInventory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeInventory() {
		// TODO Auto-generated method stub

	}

	// @Override
	// public boolean isInvNameLocalized ()
	// {
	// return true;
	// }

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}

	// fluids
	@Override
	public int fill(ForgeDirection from, FluidStack resource, boolean doFill) {
		return resource != null && this.canFill(from, resource.getFluid()) ? resource.amount
				: 0;
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
	public boolean canFill(ForgeDirection from, Fluid fluid) {
		return true;
	}

	@Override
	public boolean canDrain(ForgeDirection from, Fluid fluid) {
		return false;
	}

	@Override
	public FluidTankInfo[] getTankInfo(ForgeDirection from) {
		return new FluidTankInfo[] { this.tank.getInfo() };
	}

	// public boolean onActivated(EntityPlayer entityPlayer)
	// {
	// // TODO Auto-generated method stub
	// return false;
	// }
}
