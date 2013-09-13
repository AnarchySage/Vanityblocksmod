package vanityblocks.WorldGen;

import java.util.Random;

import vanityblocks.Registrations.StorageBlocksRegistration;

import net.minecraft.block.Block;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.ChestGenHooks;

//check biome decorates - lemming

public class StructureTest extends WorldGenerator {

	public StructureTest() {

	}

	// public static final WeightedRandomChestContent[] underwaterChestContents
	// = new WeightedRandomChestContent[] { new
	// WeightedRandomChestContent(Item.diamond.itemID, 0, 1, 3, 3) };
	/*
	 * When using the mithion structure program, its a bit dated.
	 * http://www.minecraftforum
	 * .net/topic/1336152-132-updated-metadata-support-simpleschematic
	 * -to-java-file-converter/ make sure to use an updated file set(updating it
	 * as i go) here, https://dl.dropboxusercontent.com/u/126429646
	 * /SchematicToJavaConverter_1.7/Config/textureMappings.ini place into
	 * folder/config/ over the old one. when using blocks with multi
	 * directions(Stairs/pistons/etc) remember its Block.name, direction,
	 * metadata) stair directions, 6 is corner(upside down), 5 is east(upside
	 * down), 4 is west(upside down), 3 is south(upwards), 2 is north(upwards),
	 * 1 is east(upwards), 0 is west(upwards) keep in mind i dunno how the
	 * (area) works, just stating what i seen.
	 * 
	 * on wool, its block.name, metadata, dunno)
	 */
	public boolean generate(World world, Random rand, int x, int y, int z) {
		return false;
	}
}
