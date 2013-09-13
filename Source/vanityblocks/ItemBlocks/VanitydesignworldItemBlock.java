package vanityblocks.ItemBlocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class VanitydesignworldItemBlock extends ItemBlock {

	private final static String[] subNames = { "Marble", "Marble Brick",
			"Chiseled Marble", "Marble Pillar", "Marble Tile",
			"Ashford Black Marble", "Ashford Black Marble Brick",
			"Chiseled Ashford Black Marble", "Ashford Black Marble Pillar",
			"Ashford Black Marble Tile", "", "", "", };

	public VanitydesignworldItemBlock(int id) {
		super(id);
		setHasSubtypes(true);
		// setItemName("vanitydesignblocks");
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

	/*
	 * @Override
	 * 
	 * @SideOnly(Side.CLIENT) public void addInformation (ItemStack stack,
	 * EntityPlayer player, List list, boolean par4) { switch
	 * (stack.getItemDamage()) { case 0: break; case 1: break; case 2: break;
	 * case 3: // list.add("Ignore for now, placeholder."); break; case 4: //
	 * list.add("Ignore for now, placeholder."); break; case 5: break; case 6:
	 * break; } }
	 */
}