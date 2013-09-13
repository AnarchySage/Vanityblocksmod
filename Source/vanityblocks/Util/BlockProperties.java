package vanityblocks.Util;

import vanityblocks.Registrations.CurtainRegistrations;
import vanityblocks.tileentitys.TileCurtain;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.IShearable;

/*
 * Thanks to mineshopper, maker of carpenters blocks for all the help with this, if it wasnt for him, this wouldnt be done.
 * As well as the base code for the texture grabbing.
 */
public class BlockProperties {

	/**
	 * Ejects an item at given coordinates.
	 */
	private static void ejectEntity(TileCurtain TE, ItemStack itemStack)
	{
		if (!TE.worldObj.isRemote)
		{
			float offset = 0.7F;
			double rand1 = TE.worldObj.rand.nextFloat() * offset + (1.0F - offset) * 0.5D;
			double rand2 = TE.worldObj.rand.nextFloat() * offset + (1.0F - offset) * 0.2D + 0.6D;
			double rand3 = TE.worldObj.rand.nextFloat() * offset + (1.0F - offset) * 0.5D;
			
			EntityItem entityItem = new EntityItem(TE.worldObj, TE.xCoord + rand1, TE.yCoord + rand2, TE.zCoord + rand3, itemStack);

			entityItem.delayBeforeCanPickup = 10;
			TE.worldObj.spawnEntityInWorld(entityItem);
		}
	}
	
	/**
	 * Plays block placement sound when set as a cover.
	 */
	private static void playBlockPlacementSound(TileCurtain TE, int blockID)
	{
		if (!TE.worldObj.isRemote && blockID > 0)
		{
			Block block = Block.blocksList[blockID];
			TE.worldObj.playSoundEffect(TE.xCoord + 0.5F, TE.yCoord + 0.5F, TE.zCoord + 0.5F, block.stepSound.getPlaceSound(), block.stepSound.getVolume() + 1.0F / 2.0F, block.stepSound.getPitch() * 0.8F);
		}
	}
		
	/**
	 * Returns cover block.
	 */
	public final static Block getCoverBlock(TileCurtain TE)
	{
		return hasCover(TE) ? Block.blocksList[TE.curtainCover] : CurtainRegistrations.CurtainBlock;
	}
	/**
	 * Returns whether curtain has cover.
	 */
	public final static boolean hasCover(TileCurtain TE)
	{
		if (Block.blocksList[TE.curtainCover] == null) {
			TE.curtainCover = (short) CurtainRegistrations.CurtainBlock.blockID;
		}
			return TE.curtainCover != CurtainRegistrations.CurtainBlock.blockID;
	}   
	/**
	 * Returns whether block is a cover
	 */
	public final static boolean isCover(ItemStack itemStack)
	{
		if (itemStack.getItem() instanceof ItemBlock) //&& !isSoil(itemStack) && !isPlant(itemStack)
		{
			Block block = Block.blocksList[itemStack.getItem().itemID];
			
			return	!block.hasTileEntity(itemStack.getItemDamage()) &&
					(
						block.renderAsNormalBlock() ||
						block instanceof BlockHalfSlab ||
						block instanceof BlockPane ||
						block instanceof BlockBreakable
					);
		}

		return false;
	}
    /**
     * Check if dye being applied matches existing dye on curtain.
     */
    public static boolean doDyeColorsMatch(TileCurtain TE, ItemStack itemStack)
    {
    	return TE.curtainDyeColor == itemStack.getItemDamage();
    }
    
    /**
     * Returns whether curtain has dye color.
     */
    public static boolean hasDyeColor(TileCurtain TE)
    {
    	return TE.curtainDyeColor >= 0;
    }
    
    /**
     * Ejects dye colors, special colors, or cover blocks from curtain.
     */
    public static void ejectCoverAttributes(TileCurtain TE)
    {
    	boolean alteredState = false;
    	
    	if (hasDyeColor(TE))
    	{    		
    		ejectEntity(TE, new ItemStack(Item.dyePowder, 1, TE.curtainDyeColor));
    		TE.curtainDyeColor = -1;
    		alteredState = true;
    	}
    	if (hasSpecialColor(TE))
    	{
    		ejectEntity(TE, new ItemStack(Item.itemsList[convertSpecialColorIDtoItemID(TE.curtainSpecialColor)]));
    		TE.curtainSpecialColor = -1;
    		alteredState = true;
    	}
    	if (hasCover(TE))
    	{
    		ejectEntity(TE, new ItemStack(TE.curtainCover, 1, TE.curtainCoverMetadata));
    		TE.curtainCover = 0;
    		TE.curtainCoverMetadata = 0;
    		alteredState = true;
    	}
    	
    	if (alteredState)
    		TE.worldObj.markBlockForUpdate(TE.xCoord, TE.yCoord, TE.zCoord);
    }
    
    /**
     * Sets dye color on curtain.
     */
    public static void setDyeColor(TileCurtain TE, ItemStack itemStack)
    {
		ejectCoverAttributes(TE);
    	
		TE.curtainDyeColor = (byte) itemStack.getItemDamage();
		TE.curtainSpecialColor = -1;
		TE.worldObj.markBlockForUpdate(TE.xCoord, TE.yCoord, TE.zCoord);
    }
    
    /**
     * Check if special color being applied matches existing special color on curtain.
     */
    public static boolean doSpecialColorsMatch(TileCurtain TE, ItemStack itemStack)
    {
    	return convertItemIDtoSpecialColorID(itemStack.itemID) == TE.curtainSpecialColor;
    }
    
    /**
     * Returns whether curtain has special color.
     */
    public static boolean hasSpecialColor(TileCurtain TE)
    {
    	return TE.curtainSpecialColor >= 0;
    }
    
    /**
     * Sets special paint color on curtain.
     */
    public static void setSpecialColor(TileCurtain TE, ItemStack itemStack)
    {
		ejectCoverAttributes(TE);
		
		TE.curtainSpecialColor = (byte) convertItemIDtoSpecialColorID(itemStack.itemID);
		TE.curtainDyeColor = -1;
		TE.worldObj.markBlockForUpdate(TE.xCoord, TE.yCoord, TE.zCoord);
    }

    /**
     * Will convert item to its special color ID.
     */
    public static int convertItemIDtoSpecialColorID(int itemID)
    {
    	if (itemID == Item.enderPearl.itemID)
    		return 0;
    	else if (itemID == Item.speckledMelon.itemID)
    		return 1;
    	else // itemID == Block.glass.blockID
    		return 2;
    }
    
    /**
     * Will convert special color to its item ID.
     */
    private static int convertSpecialColorIDtoItemID(int specialColorID)
    {
    	if (specialColorID == 0)
    		return Item.enderPearl.itemID;
    	else
    		return Item.speckledMelon.itemID;
    }
    
    /**
     * Check if cover being applied matches existing cover on curtain.
     */
    public static boolean doCoversMatch(TileCurtain TE, ItemStack itemStack)
    {
    	return TE.curtainCover == itemStack.itemID && TE.curtainCoverMetadata == itemStack.getItemDamage();
    }
	/**
	 * Sets cover block.
	 */
	public final static void setCover(TileCurtain TE, ItemStack itemStack)
	{
		playBlockPlacementSound(TE, itemStack == null ? getCoverBlock(TE).blockID : itemStack.itemID);
		
		int blockID, metadata;
		if (itemStack == null) {
			blockID = CurtainRegistrations.CurtainBlock.blockID;
			metadata = 0;
		} else {
			blockID = itemStack.itemID;
			metadata = itemStack.getItemDamage();
		}
		
		ejectCoverAttributes(TE);

		TE.curtainCover = (short) blockID;
		TE.curtainCoverMetadata = (byte) metadata;
		TE.worldObj.markBlockForUpdate(TE.xCoord, TE.yCoord, TE.zCoord);
	}
}
