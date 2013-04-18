package vanityblocks;


import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;

public class Worldgen implements IWorldGenerator
{
    private int numberOfBlocks;
    private int basaltBlockId;

		public Worldgen(int par1)
		{
			//cobalt = new ManhattanOreGenerator(TContent.oreSlag.blockID, 1, 2, 4, 100, true, false, Block.netherrack.blockID);
			//ardite = new ManhattanOreGenerator(TContent.oreSlag.blockID, 2, 2, 4, 100, true, false, Block.netherrack.blockID);
			marble = new WorldGenMinable(VanityBlocksVanity.VanityDesignworldblock.blockID, 0, (Storageprops.marblevein), Block.stone.blockID);
	        this.basaltBlockId = (VanityBlocksVanity.VanityDesignworldblock.blockID);
	        this.numberOfBlocks = par1;
		}
		
		public void generate (Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
		{
			if (Storageprops.generatemarble) {
			if (world.provider.dimensionId == 0)
//				generateNether(random, chunkX*16, chunkZ*16, world);
//			else
				generateSurface(random, chunkX*16, chunkZ*16, world);
			}
		}
		
		void generateSurface(Random random, int xChunk, int zChunk, World world)
		{
			int heightBand;
			int xPos, yPos, zPos;
			if (Storageprops.generatemarble)
			{
				for (int q = 0; q < (Storageprops.marblerarity); q++)
				{
					xPos = xChunk + random.nextInt(16); yPos = (Storageprops.marbleheight) + random.nextInt(Storageprops.marblerange); zPos = zChunk + random.nextInt(16);

					marble.generate(world, random, xPos, yPos, zPos);
				}
			}
		}
	/*		void generateSurfacebasalt(Random random, int xChunk, int zChunk, World world)
			{
				int heightBand;
				int xPos, yPos, zPos;
				if (Storageprops.generatebasalt)
				{
					for (int q = 0; q < (Storageprops.marblerarity); q++)
					{						
						xPos = xChunk + random.nextInt(16); yPos = (Storageprops.marbleheight) + random.nextInt(Storageprops.marblerange); zPos = zChunk + random.nextInt(16);

						marble.generate(world, random, xPos, yPos, zPos);
					}
				}
/*			if (Storageprops.generateTin)
			{
				for (int q = 0; q < PHConstruct.tinDensity; q++)
				{
					xPos = xChunk + random.nextInt(16); yPos = PHConstruct.tinHeight + random.nextInt(PHConstruct.tinRange); zPos = zChunk + random.nextInt(16);
					tin.generate(world, random, xPos, yPos, zPos);
				}
			} */
//		}
		
/*		void generateNether(Random random, int xChunk, int zChunk, World world)
		{
			int xPos, yPos, zPos;
			for (int i = 0; i < PHConstruct.netherDensity; i++)
			{
				if (Storageprops.generateCobalt)
				{
					xPos = xChunk + random.nextInt(16); yPos = random.nextInt(64)+32; zPos = zChunk + random.nextInt(16);
					cobalt.generate(world, random, xPos, yPos, zPos);
				}
				if (Storageprops.generateArdite)
				{
					xPos = xChunk + random.nextInt(16); yPos = random.nextInt(64)+32; zPos = zChunk + random.nextInt(16);
					ardite.generate(world, random, xPos, yPos, zPos);
				}
			}
			for (int i = 0; i < PHConstruct.netherDensity; i++)
			{
				if (Storageprops.generateCobalt)
				{
					xPos = xChunk + random.nextInt(16); yPos = random.nextInt(128); zPos = zChunk + random.nextInt(16);
					cobalt.generate(world, random, xPos, yPos, zPos);
				}
				if (Storageprops.generateArdite)
				{
					xPos = xChunk + random.nextInt(16); yPos = random.nextInt(128); zPos = zChunk + random.nextInt(16);
					ardite.generate(world, random, xPos, yPos, zPos);
				}
			}
		}
		*/
		WorldGenMinable marble;
	}
// }