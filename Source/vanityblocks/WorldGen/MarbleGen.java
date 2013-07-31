package vanityblocks.WorldGen;

import java.util.Random;

import vanityblocks.Storageprops;
import vanityblocks.Registrations.VanityBlocksRegistration;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;

public class MarbleGen implements IWorldGenerator {
	public MarbleGen(int par1) {
		// cobalt = new ManhattanOreGenerator(TContent.oreSlag.blockID, 1, 2, 4,
		// 100, true, false, Block.netherrack.blockID);
		// ardite = new ManhattanOreGenerator(TContent.oreSlag.blockID, 2, 2, 4,
		// 100, true, false, Block.netherrack.blockID);
		marble = new WorldGenMinable(
				vanityblocks.Registrations.VanityBlocksRegistration.VanityDesignworldblock.blockID,
				0, (Storageprops.marblevein), Block.stone.blockID);
		blackmarble = new WorldGenMinable(
				vanityblocks.Registrations.VanityBlocksRegistration.VanityDesignworldblock.blockID,
				5, (Storageprops.blackmarblevein), Block.stone.blockID);
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
			}
		}
	}

	void generateblackmarble(Random random, int xChunk, int zChunk, World world) {
		int heightBand;
		int xPos, yPos, zPos;
		if (Storageprops.generateblackmarble) {
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