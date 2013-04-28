package vanityblocks;

import vanityblocks.WorldGen.StructureUnderWaterRuin;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class Dungeonlootspawning {
	public static void chestHooks() {
		if (Storageprops.dungeonlootenablevannila) {
//			System.out.println("yes this was called");
			// Adds storage vannila blocks to dungeon loots
		// Adds block to the Dungeon chest spawns.
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,0),3,4,9));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,1),3,4,9));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,2),3,4,9));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,3),3,4,9));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,4),3,4,9));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,5),3,4,9));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,6),3,4,9));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,7),3,4,9));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,8),3,5,3));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,9),3,4,9));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,10),3,4,9));
		// Adds Blocks to the world bonus chest spawns
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,0),3,5,6));
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,1),3,5,6));
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,4),3,5,6));
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,9),2,3,6));
		// Adds blocks to the Mine-shaft Corridor chest spawns.
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,0),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,1),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,2),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,3),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,4),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,5),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,6),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,7),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,8),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,9),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,10),3,5,9));
		// Adds blocks to the Desert pyramid chest spawns.
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,0),1,10,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,1),1,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,2),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,3),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,4),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,5),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,6),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,7),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,8),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,9),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,10),3,5,9));
		// Adds block to the Jungle pyramid chest spawns.
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,0),4,8,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,1),4,8,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,2),4,8,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,3),4,8,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,4),4,8,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,5),4,8,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,6),4,8,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,7),4,8,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,8),4,8,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,9),4,8,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,10),4,8,9));
		// Adds blocks to the Stronghold Corridor chest spawns.
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,0),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,1),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,2),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,3),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,4),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,5),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,6),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,7),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,8),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,9),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,10),3,5,9));
		// Adds blocks to the Stronghold Library chest spawns.
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,0),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,1),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,2),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,3),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,4),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,5),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,6),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,7),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,8),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,9),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,10),3,5,9));
		// Adds blocks to the Stronghold Crossing chest spawns.
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,0),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,1),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,2),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,3),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,4),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,5),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,6),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,7),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,8),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,9),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,10),3,5,9));
		}
		if (Storageprops.dungeonlootenablemod){
			// Adds modded blocks to dungeon loots
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,1),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,2),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,3),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,4),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,5),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,6),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,7),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,8),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,9),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,10),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,11),1,2,4));
			// Adds blocks to the Mine-shaft Corridor chest spawns.
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,1),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,2),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,3),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,4),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,5),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,6),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,7),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,8),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,9),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,10),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,11),3,5,9));
			// Adds blocks to the Desert pyramid chest spawns.
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,1),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,2),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,3),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,4),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,5),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,6),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,7),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,8),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,9),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,10),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,11),3,4,9));
			// Adds block to the Jungle pyramid chest spawns.
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,1),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,2),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,3),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,4),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,5),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,6),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,7),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,8),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,9),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,10),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,11),6,7,9));
			// Adds blocks to the Stronghold Corridor chest spawns.
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,1),1,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,2),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,3),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,4),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,5),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,6),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,7),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,8),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,9),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,10),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,11),3,5,9));
			// Adds blocks to the Stronghold Library chest spawns.
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,1),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,2),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,3),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,4),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,5),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,6),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,7),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,8),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,9),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,10),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,11),3,5,9));
			// Adds blocks to the Stronghold Crossing chest spawns.
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,1),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,2),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,3),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,4),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,5),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,6),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,7),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,8),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,9),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,10),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,11),3,5,9));
		}
//	    final String VANITYBLOCKSRUIN            = "vanityblocksruinchest";
//		if (Storageprops.generateruin) {
//			ChestGenHooks.addInfo
//			ChestGenHooks.getInfo(category)
//			ChestGenHooks.addInfo(String VANITYBLOCKSRUIN, StructureUnderWaterRuin.underwaterChestContents[], 3, 3);
//			ChestGenHooks.addInfo(VANITYBLOCKSRUIN, WeightedRandomChestContent[], 3, 3);

//		}
	}

}
