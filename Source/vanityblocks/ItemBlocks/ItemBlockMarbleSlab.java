package vanityblocks.ItemBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBlockMarbleSlab extends ItemBlock {
	private final static String[] subNames = { "Marble Slab",
			"Marble Brick Slab", "Chiseled Marble Slab", "Marble Pillar Slab",
			"Marble Tile Slab", "Ashford Black Marble Slab",
			"Ashford Black Marble Brick Slab",
			"Chiseled Ashford Black Marble Slab",
			"Ashford Black Marble Pillar Slab",
			"Ashford Black Marble Tile Slab", "", "", "", "", "", "" };

	public ItemBlockMarbleSlab(int id) {
		super(id);
		setHasSubtypes(true);
		// setItemName("storageblock");
	}

	@Override
	public int getMetadata(int i) {
		return i;
	}

	@Override
	// public String getItemNameIS(ItemStack itemstack) {
	// return getItemName() + "." + subNames[itemstack.getItemDamage()];
	// }
	public String getUnlocalizedName(ItemStack itemstack) {
		return subNames[itemstack.getItemDamage()];
		// getItemName() + "." +
	}
}
