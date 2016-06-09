package com.vanityblocks.Events;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class MobDropsBoneEvent {
	//public static double rand;

	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)	
	
	public void onEntityDrop(LivingDropsEvent event) {
		//rand = Math.random();
		//Value between 0 and 5. Negate off it directly in the code to restrict (eg -2 will be 0-3)
		//int random = (int) ((Math.round(rand * 10)) / 5);
		//if (random < 0) {
		//	random = 0;
		//}
		
		//Everything must only drop 1 or 0 due to stack size limits.
				
		if (event.entityLiving instanceof EntityCow) {
		    ItemStack itemStackToDrop = new ItemStack(Items.bone, 3);
		    event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, 
		    		event.entity.posY, event.entity.posZ, itemStackToDrop));
		}
		if (event.entityLiving instanceof EntitySheep) {
		    ItemStack itemStackToDrop = new ItemStack(Items.bone, 2);
		    event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, 
		    		event.entity.posY, event.entity.posZ, itemStackToDrop));
		}
		if (event.entityLiving instanceof EntityPig) {
		    ItemStack itemStackToDrop = new ItemStack(Items.bone, 1);
		    event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, 
		    		event.entity.posY, event.entity.posZ, itemStackToDrop));
		}
		if (event.entityLiving instanceof EntityChicken) {
		    ItemStack itemStackToDrop = new ItemStack(Items.bone, 1);
		    event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, 
		    		event.entity.posY, event.entity.posZ, itemStackToDrop));
		}
		if (event.entityLiving instanceof EntityMooshroom) {
		    ItemStack itemStackToDrop = new ItemStack(Items.bone, 3);
		    event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, 
		    		event.entity.posY, event.entity.posZ, itemStackToDrop));
		}
	}
}
