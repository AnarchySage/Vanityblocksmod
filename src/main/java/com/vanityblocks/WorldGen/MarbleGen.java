package com.vanityblocks.WorldGen;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.vanityblocks.Storageprops;
import com.vanityblocks.Registrations.VanityBlocksRegistration;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.IWorldGenerator;

public class MarbleGen implements IWorldGenerator {
	public MarbleGen(int par1) {

		marble = new WorldGenMinable(
				VanityBlocksRegistration.VanityDesignworldblock, 0,
				(Storageprops.marblevein), Blocks.stone);
				//100, Blocks.stone);
		blackmarble = new WorldGenMinable(
				VanityBlocksRegistration.VanityDesignworldblock, 5,
				(Storageprops.blackmarblevein), Blocks.stone);
	}

	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if (Storageprops.generatemarble) {
			if (world.provider.dimensionId == 0)
				generateSurface(random, chunkX * 16, chunkZ * 16, world);
			generateblackmarble(random, chunkX * 16, chunkZ * 16, world);
		}
	}

	void generateSurface(Random random, int xChunk, int zChunk, World world) {
		int heightBand;
		int xPos, yPos, zPos;
		if (Storageprops.generatemarble) {
			for (int q = 0; q < (Storageprops.marblerarity); q++) {
				xPos = xChunk + random.nextInt(16);
				yPos = (Storageprops.marbleheight)
						+ random.nextInt(Storageprops.marblerange);
				zPos = zChunk + random.nextInt(16);

				marble.generate(world, random, xPos, yPos, zPos);
				FMLLog.info("Generating marble at " + "x" + xPos + "y" + yPos + "z" + zPos);

			}
		}
	}

	void generateblackmarble(Random random, int xChunk, int zChunk, World world) {
		int heightBand;
		int xPos, yPos, zPos;
		if (Storageprops.generatemarble) {
			for (int q = 0; q < (Storageprops.blackmarblerarity); q++) {
				xPos = xChunk + random.nextInt(16);
				yPos = (Storageprops.blackmarbleheight)
						+ random.nextInt(Storageprops.blackmarblerange);
				zPos = zChunk + random.nextInt(16);

				blackmarble.generate(world, random, xPos, yPos, zPos);
			}
		}
	}

	WorldGenMinable marble;
	WorldGenMinable blackmarble;
}
// }