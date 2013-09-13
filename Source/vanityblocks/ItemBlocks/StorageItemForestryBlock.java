package vanityblocks.ItemBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import java.util.List;

public class StorageItemForestryBlock extends ItemBlock {

	private final static String[] subNames = { "Apatite Block", "Honey Block",
			"Honeydew Block", "Peat Block", "", "", "", "", "", "", "", "", "",
			"", "", "" };

	public StorageItemForestryBlock(int id) {
		super(id);
		setHasSubtypes(true);
		// setItemName("storageblockmod");
	}

	@Override
	public int getMetadata(int i) {
		return i;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return subNames[itemstack.getItemDamage()];
		// getItemName() + "." +
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list,
			boolean par4) {
		switch (stack.getItemDamage()) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			// list.add("Some mods call it Ferrous");
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		/*
		 * case 12: list.add("Some mods call it Shiny"); break; case 13:
		 * list.add("Some mods call it Shiny"); break; case 14:
		 * list.add("Some mods call it Shiny"); break; case 15:
		 * list.add("Some mods call it Shiny"); break; case 16:
		 * list.add("Some mods call it Shiny"); break;
		 */
		}
	}
}
