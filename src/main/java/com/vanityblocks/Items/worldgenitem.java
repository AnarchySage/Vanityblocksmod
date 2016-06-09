package com.vanityblocks.Items;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.MapGenVillage;
import net.minecraft.world.gen.structure.MapGenVillage.Start;
import net.minecraft.world.gen.structure.StructureStart;

import com.vanityblocks.VanityBlocks;

public class worldgenitem extends Item {
	MapGenVillage mapGenVillage = new MapGenVillage();

	public String[] textureNames = new String[] { "blazestorageitem" };
	private boolean villagegen;
	private static Start getStructureStart;

	public worldgenitem(int par1) {
		super();
		this.setTextureName("vanityblocks:blazestorageitem");
		this.setHasSubtypes(true);
		setCreativeTab(VanityBlocks.tabvanityblocks);
	}

	public boolean onItemUse(ItemStack par1ItemStack,
			EntityPlayer par2EntityPlayer, World par3World, int i, int j,
			int k, int par7, float par8, float par9, float par10,int p_75049_1_, int p_75049_2_) {
		System.out.print("Attempting to use.");
		//return new StructureTest().generate(par3World, null, i, j, k);

		// return new MapGenVillage.Start(this.worldObj, this.rand, p_75049_1_, p_75049_2_, this.terrainType) != null;
		// return new MapGenVillage.StructureStart.getStructureStart();
		// return new MapGenVillage.getStructureStart(true);
		return villagegen;
	}

	public static StructureStart villagegen() {
		return getStructureStart;
	}

	protected World worldObj;
	protected Random rand = new Random();
	private int terrainType = 0;

	protected StructureStart getStructureStart(int p_75049_1_, int p_75049_2_) {
		System.out.print("Attempting to generate.");
		return new MapGenVillage.Start(this.worldObj, this.rand, p_75049_1_,
				p_75049_2_, this.terrainType);
	}

	// protected Start getStructureStart(int p_75049_1_, int p_75049_2_)
	// {
	// return new MapGenVillage.Start(null, this.itemRand, p_75049_1_,
	// p_75049_2_, 0);
	// }
}
