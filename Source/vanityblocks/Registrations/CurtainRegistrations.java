package vanityblocks.Registrations;

import vanityblocks.Storageprops;
import vanityblocks.Blocks.BlockCurtain;
import vanityblocks.Blocks.HiddenTrapdoor;
import vanityblocks.Blocks.VanityRandomBlocks;
import vanityblocks.ItemBlocks.VanityRandomItemBlock;
import vanityblocks.tileentitys.TileCurtain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CurtainRegistrations {
	public static void CurtainRegistration() {
		curtainblockconfig = Storageprops.curtainblockconfig;
		CurtainBlock = new BlockCurtain(curtainblockconfig);

		/* ##### Vannila ##### */
		GameRegistry.registerBlock(CurtainBlock,
				vanityblocks.ItemBlocks.CurtainItemBlock.class,
				"Curtain Blocks");
		LanguageRegistry.addName(new ItemStack(CurtainBlock, 1, 0),
				"E-W Curtain");
		LanguageRegistry.addName(new ItemStack(CurtainBlock, 1, 1),
				"N-S Curtain");
    	GameRegistry.registerTileEntity(TileCurtain.class, "TileEntityCurtain");
	}

	public static void addCurtainRecipes() {
		GameRegistry.addRecipe(new ItemStack(CurtainBlock, 1, 0), "xx ", "xx ",
				"xx ", 'x', new ItemStack(Block.cloth, 1, Short.MAX_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(CurtainBlock, 1, 1), new ItemStack(CurtainBlock, 0, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(CurtainBlock, 1, 0), new ItemStack(CurtainBlock, 0, 1));
		}
public static int curtainblockconfig;
public static Block CurtainBlock;
}