package vanityblocks.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import vanityblocks.WorldGen.StructureTest;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class worldgenitem extends Item {
	public Icon[] icons;
	public String[] textureNames = new String[] { "blazestorageitem" };

	public worldgenitem(int par1) {
		super(par1);
		this.setHasSubtypes(true);
		setCreativeTab(vanityblocks.VanityBlocks.tabCustom);
	}

	public boolean onItemUse(ItemStack par1ItemStack,
			EntityPlayer par2EntityPlayer, World par3World, int i, int j,
			int k, int par7, float par8, float par9, float par10) {
		return new StructureTest().generate(par3World, null, i, j, k);

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
					.registerIcon("vanityblocks:blazerodbundle");
		}
	}
}
