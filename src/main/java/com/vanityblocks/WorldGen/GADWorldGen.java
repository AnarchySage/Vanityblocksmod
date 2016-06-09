package com.vanityblocks.WorldGen;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.vanityblocks.Storageprops;
import com.vanityblocks.Registrations.VanityBlocksRegistration;

import cpw.mods.fml.common.IWorldGenerator;

public class GADWorldGen implements IWorldGenerator {
	public GADWorldGen(int par1) {
		// cobalt = new ManhattanOreGenerator(TContent.oreSlag.blockID, 1, 2, 4,
		// 100, true, false, Block.netherrack.blockID);
		// ardite = new ManhattanOreGenerator(TContent.oreSlag.blockID, 2, 2, 4,
		// 100, true, false, Block.netherrack.blockID);
		Granite = new WorldGenMinable(
				VanityBlocksRegistration.VanityWorldGraniteblock, 0,
				(Storageprops.gadvein), Blocks.stone);
		Diorite = new WorldGenMinable(
				VanityBlocksRegistration.VanityWorldDioriteblock, 0,
				(Storageprops.gadvein), Blocks.stone);
		Andesite = new WorldGenMinable(
				VanityBlocksRegistration.VanityWorldAndesiteblock, 0,
				(Storageprops.gadvein), Blocks.stone);
	}
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if (Storageprops.enablediorite) {
			if (world.provider.dimensionId == 0)
				generateGraniteSurface(random, chunkX * 16, chunkZ * 16, world);
				generateDioriteSurface(random, chunkX * 16, chunkZ * 16, world);
				generateAndesiteSurface(random, chunkX * 16, chunkZ * 16, world);
		}
	}
	void generateGraniteSurface(Random random, int xChunk, int zChunk, World world) {
		int heightBand;
		int xPos, yPos, zPos;
		if (Storageprops.enablediorite) {
			for (int q = 0; q < (Storageprops.gadrarity); q++) {
				xPos = xChunk + random.nextInt(16);
				yPos = (Storageprops.gadheight)
						+ random.nextInt(Storageprops.gadrange);
				zPos = zChunk + random.nextInt(16);

				Granite.generate(world, random, xPos, yPos, zPos);
			}
		}
	}
	void generateDioriteSurface(Random random, int xChunk, int zChunk, World world) {
		int heightBand;
		int xPos, yPos, zPos;
		if (Storageprops.enablediorite) {
			for (int q = 0; q < (Storageprops.gadrarity); q++) {
				xPos = xChunk + random.nextInt(16);
				yPos = (Storageprops.gadheight)
						+ random.nextInt(Storageprops.gadrange);
				zPos = zChunk + random.nextInt(16);

				Diorite.generate(world, random, xPos, yPos, zPos);
			}
		}
	}
	void generateAndesiteSurface(Random random, int xChunk, int zChunk, World world) {
		int heightBand;
		int xPos, yPos, zPos;
		if (Storageprops.enablediorite) {
			for (int q = 0; q < (Storageprops.gadrarity); q++) {
				xPos = xChunk + random.nextInt(16);
				yPos = (Storageprops.gadheight)
						+ random.nextInt(Storageprops.gadrange);
				zPos = zChunk + random.nextInt(16);

				Andesite.generate(world, random, xPos, yPos, zPos);
			}
		}
	}

	WorldGenMinable Granite;
	WorldGenMinable Diorite;
	WorldGenMinable Andesite;
}
// }