package vanityblocks.Blocks;

import java.util.List;

import vanityblocks.Storageprops;
import vanityblocks.Renders.BlockCurtainRender;
import vanityblocks.Util.BlockProperties;
import vanityblocks.tileentitys.TileCurtain;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;


/*
 * Thanks to mineshopper, maker of carpenters blocks for all the help with this, if it wasnt for him, this wouldnt be done.
 * As well as the base code for the texture grabbing.
 */
public class BlockCurtain extends BlockContainer {
	public BlockCurtain(int id) {
		super(id, Material.cloth);
		setCreativeTab(vanityblocks.VanityBlocks.tabCustom);
		this.setLightOpacity(0);
//        this.setBlockBounds(0F, 0.85F, 0.375F, 1F, 1F, 0.625F); // bar bounds
        //this.setBlockBounds(0F, -2F, 0.375F, 1F, 1F, 0.625F); //full bound blocks
	}
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	@Override
	public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
		return true;
	}
	@Override
	public int getMobilityFlag() {
		return 0;
	}

	@Override
	public Icon getIcon(int side, int metadata) {
//		return Block.cloth.getIcon(side, metadata); // use this for meta of theicon
		return Block.cloth.getIcon(side, 0);
	}
    @Override
	public void onBlockAdded(World world, int x, int y, int z)
    {	
    	world.setBlockTileEntity(x, y, z, this.createNewTileEntity(world));
    }
	public TileEntity createNewTileEntity(World var1) {
		return new TileCurtain();
	}
	 /**
     * Called upon block activation (right click on the block.)
     */
    @Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int side, float hitX, float hitY, float hitZ)
    {
    	TileCurtain TE = (TileCurtain) world.getBlockTileEntity(x, y, z);
		ItemStack itemStack = entityPlayer.getCurrentEquippedItem();
		boolean actionPerformed = false;
		boolean decrementInventory = false;

    	if (itemStack != null)
    	{
        	// Check held item for dye color properties
        	if (itemStack.itemID == Item.dyePowder.itemID)
        	{
    			if (BlockProperties.doDyeColorsMatch(TE, itemStack)) {
    				actionPerformed = true;
    			} else {
    				BlockProperties.setDyeColor(TE, itemStack);
    				actionPerformed = true;
    				decrementInventory = true;
    			}
        	}
        	
        	// Check held item for special color properties
        	if (itemStack.itemID == Item.speckledMelon.itemID || itemStack.itemID == Item.enderPearl.itemID)
        	{
    			if (BlockProperties.doSpecialColorsMatch(TE, itemStack)) {
    				actionPerformed = true;
    			} else {
    				BlockProperties.setSpecialColor(TE, itemStack);
    				actionPerformed = true;
    				decrementInventory = true;
    			}
        	}
    		
    		if (itemStack.getItem() instanceof ItemBlock || itemStack.getItem() == Item.reed)
    		{
    			Block block;

    			if (itemStack.getItem() == Item.reed) {
    				block = Block.reed;
    			} else {
    				block = Block.blocksList[itemStack.itemID];
    			}

    			if (BlockProperties.isCover(itemStack))
    			{
    				if (BlockProperties.doCoversMatch(TE, itemStack)) {
        				actionPerformed = true;
    				} else {
    					BlockProperties.setCover(TE, itemStack);
        				actionPerformed = true;
    					decrementInventory = true;
    				}
    			}
    		}
    	}
    	
    	if (!world.isRemote && decrementInventory)
    		if (!entityPlayer.capabilities.isCreativeMode && --itemStack.stackSize <= 0)
    			entityPlayer.inventory.setInventorySlotContents(entityPlayer.inventory.currentItem, (ItemStack)null);

    	return actionPerformed;
    }
	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
	 */
	public Icon getBlockTexture(IBlockAccess blockAccess, int x, int y, int z, int side)
	{
		TileCurtain TE = (TileCurtain) blockAccess.getBlockTileEntity(x, y, z);
		return BlockProperties.getCoverBlock(TE).getIcon(side, TE.curtainCoverMetadata);
		}
    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z)
    {
        int meta = world.getBlockMetadata(x, y, z);
        ForgeDirection direction = ForgeDirection.getOrientation(meta);
        if (direction == ForgeDirection.UP) // this is for meta 0
        {
        	this.setBlockBounds(0.375F, 0.85F, 0.0F, 0.625F, 1.0F, 1.0F);
        }
        else if (direction == ForgeDirection.DOWN) //this is for meta 1
        {
        	this.setBlockBounds(0F, 0.85F, 0.375F, 1F, 1F, 0.625F);
        }
        else
        {
            this.setBlockBounds(0F, 0F, 0F, 1F, 1F, 1F);
            return;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getRenderType ()
    {
        return BlockCurtainRender.curtainModelID;
    }

	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs tab, List subItems) {
		for (int ix = 0; ix < 2; ix++) {
			subItems.add(new ItemStack(this, 1, ix));
		}
	}
}
