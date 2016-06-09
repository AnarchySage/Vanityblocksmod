package com.vanityblocks.Registrations;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.vanityblocks.Storageprops;
import com.vanityblocks.Blocks.Tileblock;
import com.vanityblocks.ItemBlocks.TileItemBlock;
import com.vanityblocks.TileEntitys.TileMeltingcore;

import cpw.mods.fml.common.registry.GameRegistry;

public class TEBlocksRegistration {

	public static int vanityentitycofnig;
	public static Block Vanitytileblock;
	public static int VanitytileblockId;

	public static void teregistration() {

		VanitytileblockId = Storageprops.vanityentityconfig;
		Vanitytileblock = new Tileblock(VanitytileblockId);

		String[] vannilastorageBlockNames = { "Melting Core" };

		GameRegistry.registerBlock(Vanitytileblock, TileItemBlock.class,
				"Vanity TE ");
		GameRegistry.registerTileEntity(TileMeltingcore.class,
				"Vanityblocks MeltingCore");
	}

	public static void addTeRecipes() {
		{
			/* ############### Vannila Storage blocking ####### */
			if (Storageprops.enablemeltingcore) {
				ItemStack blazerod = new ItemStack(Items.blaze_rod);
				ItemStack obsidian = new ItemStack(Blocks.obsidian);
				ItemStack lavabukkit = new ItemStack(Items.lava_bucket);
				GameRegistry.addRecipe(new ItemStack(Vanitytileblock, 1, 0),
						new Object[] { "zxz", "xyx", "zxz", 'x', blazerod, 'y',
								lavabukkit, 'z', obsidian });
			}
		}
	}
}