package vanityblocks.WorldGen;

import java.util.Random;

import vanityblocks.Storageprops;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import cpw.mods.fml.common.IWorldGenerator;

public class UnderWaterRuinHandler implements IWorldGenerator {
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateSurface(World world, Random rand, int y, int z) {
		// for (int i = 0; i < Storageprops.ruinrarity; i++)
		if (world.getWorldChunkManager().getBiomeGenAt(y, z).biomeName.equals("Ocean")) {
		if(rand.nextInt(Storageprops.ruinchance)==1) {
		//rand.nextInt(10)==1 the 10 stands for a 1 in 10 chance
			int RandPosX = y + rand.nextInt(16);
			int RandPosZ = z + rand.nextInt(16);
			for(int height = 70; height>0; height--)
			{
				if(world.getBlockId(RandPosX, height, RandPosZ)== Block.sand.blockID || world.getBlockId(RandPosX, height, RandPosZ)== Block.dirt.blockID)
				{
				(new StructureUnderWaterRuin()).generate(world, rand, RandPosX, height + 1, RandPosZ);
//testing purposes					(new StructureUnderWaterRuin()).generate(world, rand, RandPosX, 64 , RandPosZ); 
					break;
				}
			}

		}
	}
}
}