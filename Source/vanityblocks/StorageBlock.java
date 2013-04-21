package vanityblocks;


import static net.minecraftforge.common.ForgeDirection.UP;

import java.util.List;
import net.minecraft.util.Icon;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderEnd;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class StorageBlock extends Block {
	public StorageBlock (int id) {
		super(id, Material.rock);
//		setBlockName("storageblock");
//		setCreativeTab(CreativeTabs.tabBlock);
		setCreativeTab(vanityblocks.VanityBlocksStorage.tabCustom);
		}
	@Override
	public boolean isFireSource(World world, int x, int y, int z, int metadata, ForgeDirection side)
    {
        if (metadata == 8 && side == UP)
        {
            return true;
        }
        return false;
    }
	public int getLightValue (IBlockAccess world, int x, int y, int z)
	{
		int metadata = world.getBlockMetadata(x, y, z);
		if (metadata == 8) {
			return !isActive(world.getBlockMetadata(x, y, z)) ? 0 : 15;
		}
		return 0;
	}
	private boolean isActive(int blockMetadata) {
		return true;
	}
	@Override
	public float getBlockHardness (World par1World, int par2, int par3, int par4)
	{
//		return !isActive(par1World.getBlockMetadata(par2, par3, par4)) ? 0 : 3;
		int metadata = par1World.getBlockMetadata(par2, par3, par4);
		if (metadata == 0) return 1.8f;
		if (metadata == 1) return 1.8f;
		if (metadata == 2) return 1.8f;
		if (metadata == 3) return .8f;
		if (metadata == 4) return .8f;
		if (metadata == 5) return .8f;
		if (metadata == 6) return .8f;
		if (metadata == 7) return .8f;
		if (metadata == 8) return 1.8f;
		if (metadata == 9) return .8f;
		if (metadata == 10) return .8f;
		return 2f;
	}
    private Icon[] iconBuffer;
   @Override
   public void registerIcons(IconRegister par1IconRegister)
	    {
	        iconBuffer = new Icon[15]; 
	        
	        iconBuffer[1] = par1IconRegister.registerIcon("vanityblocks:coalblock");
			iconBuffer[2] = par1IconRegister.registerIcon("vanityblocks:charcoalblock"); 
			iconBuffer[3] = par1IconRegister.registerIcon("vanityblocks:enderpearlblock"); 
			iconBuffer[4] = par1IconRegister.registerIcon("vanityblocks:slimeblock"); 
			iconBuffer[5] = par1IconRegister.registerIcon("vanityblocks:blazeblock"); 
			iconBuffer[6] = par1IconRegister.registerIcon("vanityblocks:sugarblock"); 
			iconBuffer[7] = par1IconRegister.registerIcon("vanityblocks:cocoablock"); 
			iconBuffer[8] = par1IconRegister.registerIcon("vanityblocks:sugarcaneblock");
			iconBuffer[9] = par1IconRegister.registerIcon("vanityblocks:wheattopblock");
			iconBuffer[10] = par1IconRegister.registerIcon("vanityblocks:wheatsideblock");
			iconBuffer[11] = par1IconRegister.registerIcon("vanityblocks:leatherblock");
			iconBuffer[12] = par1IconRegister.registerIcon("vanityblocks:boneblock");
			iconBuffer[13] = par1IconRegister.registerIcon("vanityblocks:reedtop");
			iconBuffer[14] = par1IconRegister.registerIcon("vanityblocks:reedside");

	    }
	@Override
//	public Icon getBlockTextureFromSideAndMetadata (int side, int metadata) {
	public Icon getIcon (int side, int metadata) {

		if (metadata == 0){
			return iconBuffer[1];
		}
		if (metadata == 1){
			return iconBuffer[2];
		}
		if (metadata == 2){
			return iconBuffer[3];
		}
		if (metadata == 3){
			return iconBuffer[4];
		}
		if (metadata == 4){
//			return iconBuffer[5];
	        switch (side) {
        case 0:
            return iconBuffer[9];
        case 1:
            return iconBuffer[9];
        default:
            return iconBuffer[10];
		}
		}
		if (metadata == 5){
			return iconBuffer[6];
		}
		if (metadata == 6){
			return iconBuffer[7];
		}
		if (metadata == 7){
//			return iconBuffer[8];
			switch (side) {
			case 0:
				return iconBuffer[13];
			case 1:
				return iconBuffer[13];
			default:
				return iconBuffer[14];
			}
		}
		if (metadata == 8){
			return iconBuffer[5];
		}
		if (metadata == 9){
			return iconBuffer[11];
		}
		if (metadata == 10){
			return iconBuffer[12];
		}
		return blockIcon;
	}
	@Override
	public int damageDropped (int metadata) {
		return metadata;
	}
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs tab, List subItems) {
		for (int ix = 0; ix < 11; ix++) {
			subItems.add(new ItemStack(this, 1, ix));
		}
	}
}