package vanityblocks.Items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class arrowstorageitem extends Item {
	public Icon[] icons;
	public String[] textureNames = new String[] { "arrowstorageitem" };

	public arrowstorageitem(int par1) {
		super(par1);
		this.setHasSubtypes(true);
		setCreativeTab(vanityblocks.VanityBlocks.tabCustom);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIconFromDamage(int meta) {
		return icons[meta];
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister) {
		this.icons = new Icon[textureNames.length];

		for (int i = 0; i < this.icons.length; ++i) {
			this.icons[i] = iconRegister
					.registerIcon("vanityblocks:arrowstorageitem");
		}
	}
}
