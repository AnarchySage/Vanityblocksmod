package vanityblocks.ItemBlocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class CurtainItemBlock extends ItemBlock {

	private final static String[] subNames = { "E-W Curtain", "N-S Curtain",
			"", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "" };

	public CurtainItemBlock(int id) {
		super(id);
		setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int i) {
		return i;
	}
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return subNames[itemstack.getItemDamage()];
	}
}
