package vanityblocks.Registrations;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import vanityblocks.Storageprops;
import vanityblocks.TileMeltingcore;
import vanityblocks.VanityDesignblock;
import vanityblocks.VanityDesignworldblock;
import vanityblocks.Vanitytileblock;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TEBlocksRegistration {

	public static int vanityentitycofnig;
	public static Block Vanitytileblock;
	public static int VanitytileblockId;

	public static void teregistration() {

		VanitytileblockId = Storageprops.vanityentityconfig;
		Vanitytileblock = new Vanitytileblock(VanitytileblockId);

		String[] vannilastorageBlockNames = { "Melting Core" };

		GameRegistry.registerBlock(Vanitytileblock,
				vanityblocks.VanitytileItemBlock.class, "Vanity TE ");
		GameRegistry.registerTileEntity(TileMeltingcore.class,
				"Vanityblocks MeltingCore");
		LanguageRegistry.addName(new ItemStack(Vanitytileblock, 1, 0),
				"Melting Core");

	}

	public static void addTeRecipes() {
		{
			/* ############### Vannila Storage blocking ####### */
			if (Storageprops.enablemeltingcore) {
				ItemStack blazerod = new ItemStack(Item.blazeRod);
				ItemStack obsidian = new ItemStack(Block.obsidian);
				ItemStack lavabukkit = new ItemStack(Item.bucketLava);
				GameRegistry.addRecipe(new ItemStack(Vanitytileblock, 1, 0),
						new Object[] { "zxz", "xyx", "zxz", 'x', blazerod, 'y',
								lavabukkit, 'z', obsidian });
			}
		}

	}
}