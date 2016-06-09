package com.vanityblocks.Village;

import java.util.Random;

import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;

public class AVillageTrades implements IVillageTradeHandler
{

    @Override
    public void manipulateTradesForVillager (EntityVillager villager, MerchantRecipeList recipeList, Random random)
    {
        // recipeList.addToListWithCheck(new MerchantRecipe(new
        // ItemStack(Whattogive,howmany), new ItemStack(whattoreceive, howmany,
        // metaifany)));
        //
        if (villager.getProfession() == 56789)
        {
            ItemStack arrow = new ItemStack(Items.arrow);
            // recipeList.addToListWithCheck(new MerchantRecipe(silverNugget,
            // new ItemStack(TContent.materials, 1, 1)));
            // recipeList.addToListWithCheck(new MerchantRecipe(arrow, new
            // ItemStack(Block.stone, 2, 1)));
            recipeList.addToListWithCheck(new MerchantRecipe(new ItemStack(Items.arrow, 5), new ItemStack(Blocks.stone, 2)));

        }

    }
}
