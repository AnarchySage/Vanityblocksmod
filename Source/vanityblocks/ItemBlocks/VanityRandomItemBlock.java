package vanityblocks.ItemBlocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class VanityRandomItemBlock extends ItemBlock {

	private final static String[] subNames = { "Clay Brick", "White Soul Sand",
			"Lapis Block - Old", "Lapis Brick - Old", "Lapis Brick", "", "",
			"", "", "", "", "", "", "", "", "", "", "" };

	public VanityRandomItemBlock(int id) {
		super(id);
		setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int i) {
		return i;
	}

	/*
	 * @Override
	 * 
	 * @SideOnly(Side.CLIENT) public void addInformation(ItemStack stack,
	 * EntityPlayer player, List list, boolean par4) { switch
	 * (stack.getItemDamage()) { case 0: break; case 1: break; case 2: break;
	 * case 3: break; case 4: break; case 5:
	 * list.add("Ice that wont melt..Or break into water.."); break;
	 * 
	 * } }
	 */
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return subNames[itemstack.getItemDamage()];
		// getItemName() + "." +
	}
}