package vanityblocks.Items.Mugitems;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class mugmilkhot extends ItemFood {
	public Icon[] icons;
	public String[] textureNames = new String[] { "mugmilkhot" };

	public mugmilkhot(int id, int heal) {
		super(id, heal, 0.0F, false);
		this.setHasSubtypes(true);
		this.maxStackSize = 16;
		setCreativeTab(vanityblocks.VanityBlocks.tabCustom);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
			EntityPlayer player) {
		if (player.canEat(true)
				&& player.getFoodStats().getSaturationLevel() < 18F) {
			player.setItemInUse(par1ItemStack,
					this.getMaxItemUseDuration(par1ItemStack));
		}

		return par1ItemStack;
	}

	@Override
	public ItemStack onEaten(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {
		ItemStack stack = super.onEaten(par1ItemStack, par2World,
				par3EntityPlayer);

		if (!par3EntityPlayer.capabilities.isCreativeMode) {
			if (!par2World.isRemote) {
				par3EntityPlayer.removePotionEffect(2);
				par3EntityPlayer.removePotionEffect(4);
				par3EntityPlayer.removePotionEffect(9);
				par3EntityPlayer.removePotionEffect(15);
				par3EntityPlayer.removePotionEffect(17);
				par3EntityPlayer.removePotionEffect(18);
				par3EntityPlayer.removePotionEffect(19);
				par3EntityPlayer.removePotionEffect(20);
			}
			if (par1ItemStack.stackSize <= 0) {
				return new ItemStack(
						vanityblocks.Registrations.GeneralFoodItemsRegistration.emptymug);
			}

			par3EntityPlayer.inventory
					.addItemStackToInventory(new ItemStack(
							vanityblocks.Registrations.GeneralFoodItemsRegistration.emptymug));
		}
		return stack;
	}

	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.drink;
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
					.registerIcon("vanityblocks:mugmilkhot");
		}
	}
}
