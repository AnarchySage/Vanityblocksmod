package vanityblocks;

import cpw.mods.fml.common.Loader;
import vanityblocks.WorldGen.StructureUnderWaterRuin;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.gen.structure.StructureMineshaftPieces;
import net.minecraftforge.common.ChestGenHooks;

public class Dungeonlootspawning {
   public static final String Underwaterruinchest            = "UnderwaterruinChest"; 

	public static void chestHooks() {
	if (Storageprops.dungeonlootenablevannila) {
//		System.out.println("yes this was called");
// 		Adds storage vannila blocks to dungeon loots
		if (Storageprops.enablecoal) {
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),1,2,4));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),3,4,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),6,7,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,0),3,5,6));
		}
		if (Storageprops.enablecharcoal ) {
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,1),1,2,4));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,1),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,1),3,4,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,1),6,7,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,1),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,1),3,5,6));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,1),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,1),3,5,9));
		}
		if (Storageprops.enableenderpearl) {
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,2),3,4,9));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,2),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,2),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,2),4,8,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,2),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,2),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,2),3,5,9));		
		}
		if (Storageprops.enableslime) {
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,3),3,4,9));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,3),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,3),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,3),4,8,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,3),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,3),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,3),3,5,9));		
		}
		if (Storageprops.enablewheatbale) {
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,4),3,5,6));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,4),3,4,9));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,4),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,4),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,4),4,8,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,4),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,4),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,4),3,5,9));		
		}
		if (Storageprops.enablesugar) {
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,5),3,4,9));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,5),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,5),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,5),4,8,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,5),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,5),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,5),3,5,9));
		}
		if (Storageprops.enablecocoa) {
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,6),3,4,9));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,6),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,6),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,6),4,8,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,6),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,6),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,6),3,5,9));		
		}
		if (Storageprops.enablesugarcane) {
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,7),3,4,9));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,7),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,7),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,7),4,8,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,7),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,7),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,7),3,5,9));		
		}
		if (Storageprops.enableblaze) {
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,8),3,5,3));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,8),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,8),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,8),4,8,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,8),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,8),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,8),3,5,9));		
		}
		if (Storageprops.enableleather) {
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,9),2,3,6));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,9),3,4,9));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,9),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,9),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,9),4,8,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,9),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,9),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,9),3,5,9));		
		}	
		if (Storageprops.enablebone) {
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,10),3,4,9));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,10),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,10),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,10),4,8,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,10),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,10),3,5,9));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlock,0,10),3,5,9));		
		}
	}		
	if (Storageprops.dungeonlootenablemod){
	//adds modded blocks to dungeon loot
		if (Storageprops.enabletin) {
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),3,5,9));;
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,0),3,5,9));
		}
		if (Storageprops.enablecopper) {
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,1),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,1),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,1),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,1),1,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,1),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,1),3,5,9));
		}
		if (Storageprops.enablesilver) {
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,2),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,2),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,2),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,2),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,2),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,2),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,2),3,5,9));
		}
		if (Storageprops.enablelead) {
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,3),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,3),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,3),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,3),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,3),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,3),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,3),3,5,9));
		}
		if (Storageprops.enablenikolite) {
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,4),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,4),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,4),3,4,9));;
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,4),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,4),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,4),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,4),3,5,9));
		}
		if (Storageprops.enablenickel) {
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,5),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,5),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,5),3,4,9));;
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,5),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,5),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,5),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,5),3,5,9));
		}
		if (Storageprops.enableelectrum) {
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,6),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,6),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,6),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,6),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,6),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,6),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,6),3,5,9));
		}
		if (Storageprops.enableplatinum) {
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,7),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,7),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,7),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,7),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,7),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,7),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,7),3,5,9));
		}
		if (Storageprops.enableinvar) {
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,8),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,8),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,8),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,8),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,8),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,8),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,8),3,5,9));
		}
		if (Storageprops.enablebrass) {
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,10),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,10),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,10),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,10),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,10),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,10),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,10),3,5,9));
		}
		if (Storageprops.enableosmium) {
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,11),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,11),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,11),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,11),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,11),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,11),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,11),3,5,9));
		}
		if (Storageprops.enablerubber) {
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,12),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,12),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,12),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,12),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,12),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,12),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,12),3,5,9));
		}
		if (Loader.isModLoaded("Railcraft")) {
			if (Storageprops.enablecoalcoke) {
			try {
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,9),1,2,4));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,9),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,9),3,4,9));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,9),6,7,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,9),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,9),3,5,9));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlockRegistration.StorageBlockMod,0,9),3,5,9));
			}
			catch (Exception e) {
			// pokemon
			}
			}
		}
	}
}
/*		if (Storageprops.generateruin) {
		//adds vanilla blocks to ruins loot       
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
