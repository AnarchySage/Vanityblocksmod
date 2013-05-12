package vanityblocks.WorldGen;

import java.util.Random;

import vanityblocks.BlockRegistration;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.ChestGenHooks;

//check biome decorates - lemming
public class StructureUnderWaterRuin extends WorldGenerator {

	public StructureUnderWaterRuin() {

	}
    public static final WeightedRandomChestContent[] underwaterChestContents = new WeightedRandomChestContent[] {new WeightedRandomChestContent(Item.diamond.itemID, 0, 1, 3, 3)};
	public boolean generate(World world, Random rand, int x, int y, int z) 
    { 
 //       if(world.getBlockId(x, y, z)!= Block.grass.blockID || world.getBlockId(x, y + 1, z)!= 0)
//        {
 //          return false;
 //       }
  		int cobble = Block.cobblestone.blockID;
		int mossycobble = Block.cobblestoneMossy.blockID;
  		int stonebrick = Block.stoneBrick.blockID;
  		int dirt = Block.dirt.blockID;
//		int mossybrick = (Block.stoneBrick.blockID,2,2);
//  	#using bbob builder, take the data and use it like so 1,2,3,4
//		# that turns to this x + 1, y + 2, z + 3, 4 is the blockid
  		world.setBlock(x + 0,  y + 0,  z + 0, Block.cobblestone.blockID);
  		world.setBlock(x - 1,  y + 0,  z + 0, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x - 2,  y + 0,  z + 0, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x - 3,  y + 0,  z + 0, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x - 3,  y + 0,  z + 1, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x - 3,  y + 0,  z + 2, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x + 0,  y + 0,  z + 1, Block.cobblestone.blockID);
  		world.setBlock(x + 0,  y + 0,  z + 2, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x + 0,  y + 0,  z + 3, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x - 1,  y + 0,  z + 3, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x - 2,  y + 0,  z + 3, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x - 3,  y + 0,  z + 3, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x - 3,  y + 0,  z - 1, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x - 3,  y + 0,  z - 2, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x - 3,  y + 0,  z - 3, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x - 2,  y + 0,  z - 3, Block.cobblestone.blockID);
  		world.setBlock(x - 1,  y + 0,  z - 3, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x + 0,  y + 0,  z - 3, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x + 1,  y + 0,  z - 3, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x + 1,  y + 0,  z + 0, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x + 2,  y + 0,  z + 0, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x + 3,  y + 0,  z + 0, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x + 3,  y + 0,  z - 1, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x + 3,  y + 0,  z - 2, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x + 3,  y + 0,  z - 3, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x + 2,  y + 0,  z - 3, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x + 3,  y + 0,  z + 1, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x + 3,  y + 0,  z + 2, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x + 3,  y + 0,  z + 3, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x + 2,  y + 0,  z + 3, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x + 1,  y + 0,  z + 3, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x + 1,  y + 0,  z + 2, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x + 1,  y + 0,  z + 1, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x + 2,  y + 0,  z + 1, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x + 2,  y + 0,  z + 2, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x - 1,  y + 0,  z + 2, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x - 2,  y + 0,  z + 2, Block.cobblestone.blockID);
  		world.setBlock(x - 2,  y + 0,  z + 1, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x - 1,  y + 0,  z + 1, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x - 2,  y + 0,  z - 1, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x - 1,  y + 0,  z - 2, Block.stoneBrick.blockID,1,2);
  		world.setBlock(x + 0,  y + 0,  z - 2, Block.stoneBrick.blockID,1,2);
		world.setBlock(x + 1,  y + 0,  z - 2, Block.stoneBrick.blockID,1,2);
		world.setBlock(x + 2,  y + 0,  z - 2, Block.stoneBrick.blockID,1,2);
		world.setBlock(x + 2,  y + 0,  z - 1, Block.stoneBrick.blockID,1,2);
		world.setBlock(x + 1,  y + 0,  z - 1, Block.cobblestone.blockID);
		world.setBlock(x + 0,  y + 0,  z - 1, Block.stoneBrick.blockID,1,2);
		world.setBlock(x - 1,  y + 0,  z - 1, Block.stoneBrick.blockID,1,2);
		world.setBlock(x - 2,  y + 0,  z - 2, Block.stoneBrick.blockID,1,2);
		
		world.setBlock(x - 3,  y + 1,  z + 2, Block.cobblestone.blockID);
		world.setBlock(x - 3,  y + 1,  z + 0, Block.cobblestone.blockID);
		world.setBlock(x - 3,  y + 1,  z + 1, Block.cobblestone.blockID);
		world.setBlock(x - 3,  y + 1,  z - 3, Block.cobblestone.blockID);
		world.setBlock(x + 1,  y + 1,  z - 3, Block.cobblestone.blockID);
		world.setBlock(x + 2,  y + 1,  z - 3, Block.cobblestone.blockID);
		world.setBlock(x + 3,  y + 1,  z - 3, Block.cobblestone.blockID);
		world.setBlock(x - 3,  y + 1,  z - 2, Block.stoneBrick.blockID,2,2);
		world.setBlock(x - 3,  y + 1,  z + 3, Block.stoneBrick.blockID,2,2);
		world.setBlock(x + 2,  y + 1,  z + 3, Block.stoneBrick.blockID,2,2);
		world.setBlock(x + 0,  y + 1,  z + 3, Block.stoneBrick.blockID,2,2);
		world.setBlock(x + 3,  y + 1,  z + 1, Block.stoneBrick.blockID,2,2);
		world.setBlock(x + 3,  y + 1,  z + 0, Block.stoneBrick.blockID,2,2);
		world.setBlock(x + 3,  y + 1,  z - 2, Block.cobblestone.blockID);
		world.setBlock(x + 3,  y + 1,  z - 1, Block.cobblestone.blockID);
		world.setBlock(x + 3,  y + 1,  z + 2, Block.cobblestone.blockID);
		world.setBlock(x + 0,  y + 1,  z + 0, Block.chest.blockID);
		
		TileEntityChest chest = (TileEntityChest)world.getBlockTileEntity(x + 0, y + 1, z + 0);
//		ChestGenHooks dungeonloot = ChestGenHooks.getInfo("UnderwaterruinChest");
		ChestGenHooks dungeonloot = ChestGenHooks.getInfo("dungeonChest");
		if (chest != null) WeightedRandomChestContent.generateChestContents(rand, dungeonloot.getItems(rand), chest, dungeonloot.getCount(rand));

		world.setBlock(x + 1,  y + 1,  z + 3, Block.cobblestone.blockID);
		
		world.setBlock(x - 3,  y + 2,  z + 3, Block.stoneBrick.blockID,1,2);
		world.setBlock(x - 3,  y + 2,  z + 2, Block.stoneBrick.blockID,1,2);
		world.setBlock(x + 1,  y + 2,  z - 3, Block.stoneBrick.blockID,1,2);
		world.setBlock(x + 3,  y + 2,  z + 0, Block.stoneBrick.blockID,1,2);
		world.setBlock(x + 3,  y + 2,  z + 1, Block.stoneBrick.blockID,1,2);
		world.setBlock(x + 3,  y + 2,  z + 2, Block.stoneBrick.blockID,1,2);
		world.setBlock(x - 3,  y + 2,  z - 3, Block.cobblestone.blockID);
		
		
		world.setBlock(x - 3,  y + 3,  z - 3, Block.cobblestone.blockID);
		world.setBlock(x - 1,  y + 3,  z - 3, Block.cobblestone.blockID);
		world.setBlock(x + 2,  y + 3,  z - 3, Block.cobblestone.blockID);
		world.setBlock(x - 3,  y + 3,  z - 1, Block.cobblestone.blockID);
		world.setBlock(x - 3,  y + 3,  z + 2, Block.cobblestone.blockID);
		world.setBlock(x - 3,  y + 3,  z + 3, Block.cobblestone.blockID);
		world.setBlock(x - 3,  y + 3,  z - 2, Block.stoneBrick.blockID,1,2);
		world.setBlock(x - 3,  y + 3,  z + 0, Block.stoneBrick.blockID,1,2);
		world.setBlock(x - 2,  y + 3,  z - 3, Block.stoneBrick.blockID,1,2);
		world.setBlock(x + 3,  y + 3,  z + 1, Block.stoneBrick.blockID,1,2);
		world.setBlock(x - 3,  y + 3,  z + 1, Block.stoneBrick.blockID,2,2);
		world.setBlock(x + 0,  y + 3,  z - 3, Block.stoneBrick.blockID,2,2);
		world.setBlock(x + 3,  y + 3,  z - 3, Block.stoneBrick.blockID,2,2);
		world.setBlock(x + 3,  y + 3,  z + 2, Block.stoneBrick.blockID,2,2);
		
  		return true;
     }
/*    public static final String Underwaterruinchest            = "UnderwaterruinChest";
    public static void ruinloot() {
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,0),3,5,9));
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,1),3,5,9));
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,2),3,5,9));
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,3),3,5,9));
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,4),3,5,9));
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,5),3,5,9));
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,6),3,5,9));
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,7),3,5,9));
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,8),3,5,9));
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,9),3,5,9));
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,10),3,5,9));
		//Adds mod blocks to ruins loot
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),1,2,4));
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,1),1,2,4));
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,2),1,2,4));
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,3),1,2,4));
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,4),1,2,4));
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,5),1,2,4));
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,6),1,2,4));
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,7),1,2,4));
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,8),1,2,4));
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,9),1,2,4));
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,10),1,2,4));
		ChestGenHooks.getInfo(Underwaterruinchest).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,11),1,2,4));
		} */
    }
