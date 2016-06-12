package com.vanityblocks.Registrations;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import com.vanityblocks.Storageprops;
import com.vanityblocks.Items.oredictionarybook;

import cpw.mods.fml.common.registry.GameRegistry;

public class OreDictionaryBypass {
	public static Item oredictionarybook;

	public static void bypassrecipes() {
		// Registers the Item itself and recipe for item
		oredictionarybook = new oredictionarybook(Storageprops.oredictionarybook - 256);
		GameRegistry.registerItem(oredictionarybook, "oredictionarybook");
		GameRegistry.addRecipe(new ItemStack(oredictionarybook, 1),
				"xyx", "yzy", "xyx", 'x', Items.iron_ingot, 'y', Items.emerald, 'z', Items.book);
		//Attempt to fix this.....
		// testing purposes
//		OreDictionary.registerOre("ingotTin", new ItemStack(
//				Items.paper));
		if (!OreDictionary.getOres("ingotTin").isEmpty()) {
			ItemStack tiningot;
			tiningot = OreDictionary.getOres("ingotTin").get(0);
			ItemStack result = tiningot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotTin", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotCopper").isEmpty()) {
			ItemStack copperingot;
			copperingot = OreDictionary.getOres("ingotCopper").get(0);
			ItemStack result = copperingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotCopper", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotAluminium").isEmpty()) {
			ItemStack Aluminiumingot;
			Aluminiumingot = OreDictionary.getOres("ingotAluminium").get(0);
			ItemStack result = Aluminiumingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotAluminium", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotAluminumBrass").isEmpty()) {
			ItemStack AluminumBrassingot;
			AluminumBrassingot = OreDictionary.getOres("ingotAluminumBrass").get(0);
			ItemStack result = AluminumBrassingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotAluminumBrass", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotAlumite").isEmpty()) {
			ItemStack Alumiteingot;
			Alumiteingot = OreDictionary.getOres("ingotAlumite").get(0);
			ItemStack result = Alumiteingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotAlumite", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotArdite").isEmpty()) {
			ItemStack Arditeingot;
			Arditeingot = OreDictionary.getOres("ingotArdite").get(0);
			ItemStack result = Arditeingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotArdite", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotBrick").isEmpty()) {
			ItemStack Brickingot;
			Brickingot = OreDictionary.getOres("ingotBrick").get(0);
			ItemStack result = Brickingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotBrick", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotBrickNether").isEmpty()) {
			ItemStack BrickNetheringot;
			BrickNetheringot = OreDictionary.getOres("ingotBrickNether").get(0);
			ItemStack result = BrickNetheringot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotBrickNether", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotBronze").isEmpty()) {
			ItemStack Bronzeingot;
			Bronzeingot = OreDictionary.getOres("ingotBronze").get(0);
			ItemStack result = Bronzeingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotBronze", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotCarbon").isEmpty()) {
			ItemStack Carboningot;
			Carboningot = OreDictionary.getOres("ingotCarbon").get(0);
			ItemStack result = Carboningot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotCarbon", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotCobalt").isEmpty()) {
			ItemStack Cobaltingot;
			Cobaltingot = OreDictionary.getOres("ingotCobalt").get(0);
			ItemStack result = Cobaltingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotCobalt", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotConductiveIron").isEmpty()) {
			ItemStack ConductiveIroningot;
			ConductiveIroningot = OreDictionary.getOres("ingotConductiveIron").get(0);
			ItemStack result = ConductiveIroningot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotConductiveIron", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotConstantan").isEmpty()) {
			ItemStack Constantaningot;
			Constantaningot = OreDictionary.getOres("ingotConstantan").get(0);
			ItemStack result = Constantaningot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotConstantan", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotCupronickel").isEmpty()) {
			ItemStack Cupronickelingot;
			Cupronickelingot = OreDictionary.getOres("ingotCupronickel").get(0);
			ItemStack result = Cupronickelingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotCupronickel", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotDarkSoularium").isEmpty()) {
			ItemStack DarkSoulariumingot;
			DarkSoulariumingot = OreDictionary.getOres("ingotDarkSoularium").get(0);
			ItemStack result = DarkSoulariumingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotDarkSoularium", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotDarkSteel").isEmpty()) {
			ItemStack DarkSteelingot;
			DarkSteelingot = OreDictionary.getOres("ingotDarkSteel").get(0);
			ItemStack result = DarkSteelingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotDarkSteel", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotDesh").isEmpty()) {
			ItemStack Deshingot;
			Deshingot = OreDictionary.getOres("ingotDesh").get(0);
			ItemStack result = Deshingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotDesh", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotElectricalSteel").isEmpty()) {
			ItemStack ElectricalSteelingot;
			ElectricalSteelingot = OreDictionary.getOres("ingotElectricalSteel").get(0);
			ItemStack result = ElectricalSteelingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotElectricalSteel", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotElectrotineAlloy").isEmpty()) {
			ItemStack ElectrotineAlloyingot;
			ElectrotineAlloyingot = OreDictionary.getOres("ingotElectrotineAlloy").get(0);
			ItemStack result = ElectrotineAlloyingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotElectrotineAlloy", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotElectrum").isEmpty()) {
			ItemStack Electrumingot;
			Electrumingot = OreDictionary.getOres("ingotElectrum").get(0);
			ItemStack result = Electrumingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotElectrum", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotElectrumFlux").isEmpty()) {
			ItemStack ElectrumFluxingot;
			ElectrumFluxingot = OreDictionary.getOres("ingotElectrumFlux").get(0);
			ItemStack result = ElectrumFluxingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotElectrumFlux", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotEnderium").isEmpty()) {
			ItemStack Enderiumingot;
			Enderiumingot = OreDictionary.getOres("ingotEnderium").get(0);
			ItemStack result = Enderiumingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotEnderium", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotEnderiumBase").isEmpty()) {
			ItemStack EnderiumBaseingot;
			EnderiumBaseingot = OreDictionary.getOres("ingotEnderiumBase").get(0);
			ItemStack result = EnderiumBaseingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotEnderiumBase", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotEnergeticAlloy").isEmpty()) {
			ItemStack EnergeticAlloyingot;
			EnergeticAlloyingot = OreDictionary.getOres("ingotEnergeticAlloy").get(0);
			ItemStack result = EnergeticAlloyingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotEnergeticAlloy", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotHOPGraphite").isEmpty()) {
			ItemStack HOPGraphiteingot;
			HOPGraphiteingot = OreDictionary.getOres("ingotHOPGraphite").get(0);
			ItemStack result = HOPGraphiteingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotHOPGraphite", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotInvar").isEmpty()) {
			ItemStack Invaringot;
			Invaringot = OreDictionary.getOres("ingotInvar").get(0);
			ItemStack result = Invaringot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotInvar", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotIronCompressed").isEmpty()) {
			ItemStack IronCompressedingot;
			IronCompressedingot = OreDictionary.getOres("ingotIronCompressed").get(0);
			ItemStack result = IronCompressedingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotIronCompressed", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotLead").isEmpty()) {
			ItemStack Leadingot;
			Leadingot = OreDictionary.getOres("ingotLead").get(0);
			ItemStack result = Leadingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotLead", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotLumium").isEmpty()) {
			ItemStack Lumiumingot;
			Lumiumingot = OreDictionary.getOres("ingotLumium").get(0);
			ItemStack result = Lumiumingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotLumium", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotManyullyn").isEmpty()) {
			ItemStack Manyullyningot;
			Manyullyningot = OreDictionary.getOres("ingotManyullyn").get(0);
			ItemStack result = Manyullyningot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotManyullyn", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotMeat").isEmpty()) {
			ItemStack Meatingot;
			Meatingot = OreDictionary.getOres("ingotMeat").get(0);
			ItemStack result = Meatingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotMeat", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotMeatRaw").isEmpty()) {
			ItemStack MeatRawingot;
			MeatRawingot = OreDictionary.getOres("ingotMeatRaw").get(0);
			ItemStack result = MeatRawingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotMeatRaw", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotMeteoricIron").isEmpty()) {
			ItemStack MeteoricIroningot;
			MeteoricIroningot = OreDictionary.getOres("ingotMeteoricIron").get(0);
			ItemStack result = MeteoricIroningot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotMeteoricIron", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotMithril").isEmpty()) {
			ItemStack Mithrilingot;
			Mithrilingot = OreDictionary.getOres("ingotMithril").get(0);
			ItemStack result = Mithrilingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotMithril", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotNickel").isEmpty()) {
			ItemStack Nickelingot;
			Nickelingot = OreDictionary.getOres("ingotNickel").get(0);
			ItemStack result = Nickelingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotNickel", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotObsidian").isEmpty()) {
			ItemStack Obsidianingot;
			Obsidianingot = OreDictionary.getOres("ingotObsidian").get(0);
			ItemStack result = Obsidianingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotObsidian", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotOsmium").isEmpty()) {
			ItemStack Osmiumingot;
			Osmiumingot = OreDictionary.getOres("ingotOsmium").get(0);
			ItemStack result = Osmiumingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotOsmium", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotPhasedGold").isEmpty()) {
			ItemStack PhasedGoldingot;
			PhasedGoldingot = OreDictionary.getOres("ingotPhasedGold").get(0);
			ItemStack result = PhasedGoldingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotPhasedGold", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotPhasedIron").isEmpty()) {
			ItemStack PhasedIroningot;
			PhasedIroningot = OreDictionary.getOres("ingotPhasedIron").get(0);
			ItemStack result = PhasedIroningot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotPhasedIron", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotPigIron").isEmpty()) {
			ItemStack PigIroningot;
			PigIroningot = OreDictionary.getOres("ingotPigIron").get(0);
			ItemStack result = PigIroningot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotPigIron", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotPlatinum").isEmpty()) {
			ItemStack Platinumingot;
			Platinumingot = OreDictionary.getOres("ingotPlatinum").get(0);
			ItemStack result = Platinumingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotPlatinum", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotPulsatingIron").isEmpty()) {
			ItemStack PulsatingIroningot;
			PulsatingIroningot = OreDictionary.getOres("ingotPulsatingIron").get(0);
			ItemStack result = PulsatingIroningot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotPulsatingIron", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotRedAlloy").isEmpty()) {
			ItemStack RedAlloyingot;
			RedAlloyingot = OreDictionary.getOres("ingotRedAlloy").get(0);
			ItemStack result = RedAlloyingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotRedAlloy", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotRedstoneAlloy").isEmpty()) {
			ItemStack RedstoneAlloyingot;
			RedstoneAlloyingot = OreDictionary.getOres("ingotRedstoneAlloy").get(0);
			ItemStack result = RedstoneAlloyingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotRedstoneAlloy", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotRefinedGlowstone").isEmpty()) {
			ItemStack RefinedGlowstoneingot;
			RefinedGlowstoneingot = OreDictionary.getOres("ingotRefinedGlowstone").get(0);
			ItemStack result = RefinedGlowstoneingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotRefinedGlowstone", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotRefinedObsidian").isEmpty()) {
			ItemStack RefinedObsidianingot;
			RefinedObsidianingot = OreDictionary.getOres("ingotRefinedObsidian").get(0);
			ItemStack result = RefinedObsidianingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotRefinedObsidian", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotSignalum").isEmpty()) {
			ItemStack Signalumingot;
			Signalumingot = OreDictionary.getOres("ingotSignalum").get(0);
			ItemStack result = Signalumingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotSignalum", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotSilicon").isEmpty()) {
			ItemStack Siliconingot;
			Siliconingot = OreDictionary.getOres("ingotSilicon").get(0);
			ItemStack result = Siliconingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotSilicon", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotSilver").isEmpty()) {
			ItemStack Silveringot;
			Silveringot = OreDictionary.getOres("ingotSilver").get(0);
			ItemStack result = Silveringot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotSilver", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotSoularium").isEmpty()) {
			ItemStack Soulariumingot;
			Soulariumingot = OreDictionary.getOres("ingotSoularium").get(0);
			ItemStack result = Soulariumingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotSoularium", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotSteel").isEmpty()) {
			ItemStack Steelingot;
			Steelingot = OreDictionary.getOres("ingotSteel").get(0);
			ItemStack result = Steelingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotSteel", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotThaumium").isEmpty()) {
			ItemStack Thaumiumingot;
			Thaumiumingot = OreDictionary.getOres("ingotThaumium").get(0);
			ItemStack result = Thaumiumingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotThaumium", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotTitanium").isEmpty()) {
			ItemStack Titaniumingot;
			Titaniumingot = OreDictionary.getOres("ingotTitanium").get(0);
			ItemStack result = Titaniumingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotTitanium", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotUnstable").isEmpty()) {
			ItemStack Unstableingot;
			Unstableingot = OreDictionary.getOres("ingotUnstable").get(0);
			ItemStack result = Unstableingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotUnstable", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotVibrantAlloy").isEmpty()) {
			ItemStack VibrantAlloyingot;
			VibrantAlloyingot = OreDictionary.getOres("ingotVibrantAlloy").get(0);
			ItemStack result = VibrantAlloyingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotVibrantAlloy", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotVoid").isEmpty()) {
			ItemStack Voidingot;
			Voidingot = OreDictionary.getOres("ingotVoid").get(0);
			ItemStack result = Voidingot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotVoid", oredictionarybook ));
			}
		if (!OreDictionary.getOres("ingotWroughtIron").isEmpty()) {
			ItemStack WroughtIroningot;
			WroughtIroningot = OreDictionary.getOres("ingotWroughtIron").get(0);
			ItemStack result = WroughtIroningot.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "ingotWroughtIron", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockTin").isEmpty()) {
			ItemStack tinblock;
			tinblock = OreDictionary.getOres("blockTin").get(0);
			ItemStack result = tinblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockTin", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockCopper").isEmpty()) {
			ItemStack copperblock;
			copperblock = OreDictionary.getOres("blockCopper").get(0);
			ItemStack result = copperblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockCopper", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockAluminium").isEmpty()) {
			ItemStack Aluminiumblock;
			Aluminiumblock = OreDictionary.getOres("blockAluminium").get(0);
			ItemStack result = Aluminiumblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockAluminium", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockAluminumBrass").isEmpty()) {
			ItemStack AluminumBrassblock;
			AluminumBrassblock = OreDictionary.getOres("blockAluminumBrass").get(0);
			ItemStack result = AluminumBrassblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockAluminumBrass", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockAlumite").isEmpty()) {
			ItemStack Alumiteblock;
			Alumiteblock = OreDictionary.getOres("blockAlumite").get(0);
			ItemStack result = Alumiteblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockAlumite", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockArdite").isEmpty()) {
			ItemStack Arditeblock;
			Arditeblock = OreDictionary.getOres("blockArdite").get(0);
			ItemStack result = Arditeblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockArdite", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockBrick").isEmpty()) {
			ItemStack Brickblock;
			Brickblock = OreDictionary.getOres("blockBrick").get(0);
			ItemStack result = Brickblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockBrick", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockBrickNether").isEmpty()) {
			ItemStack BrickNetherblock;
			BrickNetherblock = OreDictionary.getOres("blockBrickNether").get(0);
			ItemStack result = BrickNetherblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockBrickNether", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockBronze").isEmpty()) {
			ItemStack Bronzeblock;
			Bronzeblock = OreDictionary.getOres("blockBronze").get(0);
			ItemStack result = Bronzeblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockBronze", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockCarbon").isEmpty()) {
			ItemStack Carbonblock;
			Carbonblock = OreDictionary.getOres("blockCarbon").get(0);
			ItemStack result = Carbonblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockCarbon", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockCobalt").isEmpty()) {
			ItemStack Cobaltblock;
			Cobaltblock = OreDictionary.getOres("blockCobalt").get(0);
			ItemStack result = Cobaltblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockCobalt", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockConductiveIron").isEmpty()) {
			ItemStack ConductiveIronblock;
			ConductiveIronblock = OreDictionary.getOres("blockConductiveIron").get(0);
			ItemStack result = ConductiveIronblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockConductiveIron", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockConstantan").isEmpty()) {
			ItemStack Constantanblock;
			Constantanblock = OreDictionary.getOres("blockConstantan").get(0);
			ItemStack result = Constantanblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockConstantan", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockCupronickel").isEmpty()) {
			ItemStack Cupronickelblock;
			Cupronickelblock = OreDictionary.getOres("blockCupronickel").get(0);
			ItemStack result = Cupronickelblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockCupronickel", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockDarkSoularium").isEmpty()) {
			ItemStack DarkSoulariumblock;
			DarkSoulariumblock = OreDictionary.getOres("blockDarkSoularium").get(0);
			ItemStack result = DarkSoulariumblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockDarkSoularium", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockDarkSteel").isEmpty()) {
			ItemStack DarkSteelblock;
			DarkSteelblock = OreDictionary.getOres("blockDarkSteel").get(0);
			ItemStack result = DarkSteelblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockDarkSteel", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockDesh").isEmpty()) {
			ItemStack Deshblock;
			Deshblock = OreDictionary.getOres("blockDesh").get(0);
			ItemStack result = Deshblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockDesh", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockElectricalSteel").isEmpty()) {
			ItemStack ElectricalSteelblock;
			ElectricalSteelblock = OreDictionary.getOres("blockElectricalSteel").get(0);
			ItemStack result = ElectricalSteelblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockElectricalSteel", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockElectrotineAlloy").isEmpty()) {
			ItemStack ElectrotineAlloyblock;
			ElectrotineAlloyblock = OreDictionary.getOres("blockElectrotineAlloy").get(0);
			ItemStack result = ElectrotineAlloyblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockElectrotineAlloy", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockElectrum").isEmpty()) {
			ItemStack Electrumblock;
			Electrumblock = OreDictionary.getOres("Electrum").get(0);
			ItemStack result = Electrumblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockElectrum", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockElectrumFlux").isEmpty()) {
			ItemStack ElectrumFluxblock;
			ElectrumFluxblock = OreDictionary.getOres("blockElectrumFlux").get(0);
			ItemStack result = ElectrumFluxblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockElectrumFlux", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockEnderium").isEmpty()) {
			ItemStack Enderiumblock;
			Enderiumblock = OreDictionary.getOres("blockEnderium").get(0);
			ItemStack result = Enderiumblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockEnderium", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockEnderiumBase").isEmpty()) {
			ItemStack EnderiumBaseblock;
			EnderiumBaseblock = OreDictionary.getOres("blockEnderiumBase").get(0);
			ItemStack result = EnderiumBaseblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockEnderiumBase", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockEnergeticAlloy").isEmpty()) {
			ItemStack EnergeticAlloyblock;
			EnergeticAlloyblock = OreDictionary.getOres("blockEnergeticAlloy").get(0);
			ItemStack result = EnergeticAlloyblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockEnergeticAlloy", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockHOPGraphite").isEmpty()) {
			ItemStack HOPGraphiteblock;
			HOPGraphiteblock = OreDictionary.getOres("blockHOPGraphite").get(0);
			ItemStack result = HOPGraphiteblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockHOPGraphite", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockInvar").isEmpty()) {
			ItemStack Invarblock;
			Invarblock = OreDictionary.getOres("blockInvar").get(0);
			ItemStack result = Invarblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockInvar", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockIronCompressed").isEmpty()) {
			ItemStack IronCompressedblock;
			IronCompressedblock = OreDictionary.getOres("blockIronCompressed").get(0);
			ItemStack result = IronCompressedblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockIronCompressed", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockLead").isEmpty()) {
			ItemStack Leadblock;
			Leadblock = OreDictionary.getOres("blockLead").get(0);
			ItemStack result = Leadblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockLead", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockLumium").isEmpty()) {
			ItemStack Lumiumblock;
			Lumiumblock = OreDictionary.getOres("blockLumium").get(0);
			ItemStack result = Lumiumblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockLumium", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockManyullyn").isEmpty()) {
			ItemStack Manyullynblock;
			Manyullynblock = OreDictionary.getOres("blockManyullyn").get(0);
			ItemStack result = Manyullynblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockManyullyn", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockMeat").isEmpty()) {
			ItemStack Meatblock;
			Meatblock = OreDictionary.getOres("blockMeat").get(0);
			ItemStack result = Meatblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockMeat", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockMeatRaw").isEmpty()) {
			ItemStack MeatRawblock;
			MeatRawblock = OreDictionary.getOres("blockMeatRaw").get(0);
			ItemStack result = MeatRawblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockMeatRaw", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockMeteoricIron").isEmpty()) {
			ItemStack MeteoricIronblock;
			MeteoricIronblock = OreDictionary.getOres("blockMeteoricIron").get(0);
			ItemStack result = MeteoricIronblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockMeteoricIron", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockMithril").isEmpty()) {
			ItemStack Mithrilblock;
			Mithrilblock = OreDictionary.getOres("blockMithril").get(0);
			ItemStack result = Mithrilblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockMithril", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockNickel").isEmpty()) {
			ItemStack Nickelblock;
			Nickelblock = OreDictionary.getOres("blockNickel").get(0);
			ItemStack result = Nickelblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockNickel", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockObsidian").isEmpty()) {
			ItemStack Obsidianblock;
			Obsidianblock = OreDictionary.getOres("blockObsidian").get(0);
			ItemStack result = Obsidianblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockObsidian", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockOsmium").isEmpty()) {
			ItemStack Osmiumblock;
			Osmiumblock = OreDictionary.getOres("blockOsmium").get(0);
			ItemStack result = Osmiumblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockOsmium", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockPhasedGold").isEmpty()) {
			ItemStack PhasedGoldblock;
			PhasedGoldblock = OreDictionary.getOres("blockPhasedGold").get(0);
			ItemStack result = PhasedGoldblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockPhasedGold", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockPhasedIron").isEmpty()) {
			ItemStack PhasedIronblock;
			PhasedIronblock = OreDictionary.getOres("blockPhasedIron").get(0);
			ItemStack result = PhasedIronblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockPhasedIron", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockPigIron").isEmpty()) {
			ItemStack PigIronblock;
			PigIronblock = OreDictionary.getOres("blockPigIron").get(0);
			ItemStack result = PigIronblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockPigIron", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockPlatinum").isEmpty()) {
			ItemStack Platinumblock;
			Platinumblock = OreDictionary.getOres("blockPlatinum").get(0);
			ItemStack result = Platinumblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockPlatinum", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockPulsatingIron").isEmpty()) {
			ItemStack PulsatingIronblock;
			PulsatingIronblock = OreDictionary.getOres("blockPulsatingIron").get(0);
			ItemStack result = PulsatingIronblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockPulsatingIron", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockRedAlloy").isEmpty()) {
			ItemStack RedAlloyblock;
			RedAlloyblock = OreDictionary.getOres("blockRedAlloy").get(0);
			ItemStack result = RedAlloyblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockRedAlloy", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockRedstoneAlloy").isEmpty()) {
			ItemStack RedstoneAlloyblock;
			RedstoneAlloyblock = OreDictionary.getOres("blockRedstoneAlloy").get(0);
			ItemStack result = RedstoneAlloyblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockRedstoneAlloy", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockRefinedGlowstone").isEmpty()) {
			ItemStack RefinedGlowstoneblock;
			RefinedGlowstoneblock = OreDictionary.getOres("blockRefinedGlowstone").get(0);
			ItemStack result = RefinedGlowstoneblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockRefinedGlowstone", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockRefinedObsidian").isEmpty()) {
			ItemStack RefinedObsidianblock;
			RefinedObsidianblock = OreDictionary.getOres("blockRefinedObsidian").get(0);
			ItemStack result = RefinedObsidianblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockRefinedObsidian", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockSignalum").isEmpty()) {
			ItemStack Signalumblock;
			Signalumblock = OreDictionary.getOres("blockSignalum").get(0);
			ItemStack result = Signalumblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockSignalum", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockSilicon").isEmpty()) {
			ItemStack Siliconblock;
			Siliconblock = OreDictionary.getOres("blockSilicon").get(0);
			ItemStack result = Siliconblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockSilicon", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockSilver").isEmpty()) {
			ItemStack Silverblock;
			Silverblock = OreDictionary.getOres("blockSilver").get(0);
			ItemStack result = Silverblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockSilver", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockSoularium").isEmpty()) {
			ItemStack Soulariumblock;
			Soulariumblock = OreDictionary.getOres("blockSoularium").get(0);
			ItemStack result = Soulariumblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockSoularium", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockSteel").isEmpty()) {
			ItemStack Steelblock;
			Steelblock = OreDictionary.getOres("blockSteel").get(0);
			ItemStack result = Steelblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockSteel", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockThaumium").isEmpty()) {
			ItemStack Thaumiumblock;
			Thaumiumblock = OreDictionary.getOres("blockThaumium").get(0);
			ItemStack result = Thaumiumblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockThaumium", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockTitanium").isEmpty()) {
			ItemStack Titaniumblock;
			Titaniumblock = OreDictionary.getOres("blockTitanium").get(0);
			ItemStack result = Titaniumblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockTitanium", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockUnstable").isEmpty()) {
			ItemStack Unstableblock;
			Unstableblock = OreDictionary.getOres("blockUnstable").get(0);
			ItemStack result = Unstableblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockUnstable", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockVibrantAlloy").isEmpty()) {
			ItemStack VibrantAlloyblock;
			VibrantAlloyblock = OreDictionary.getOres("blockVibrantAlloy").get(0);
			ItemStack result = VibrantAlloyblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockVibrantAlloy", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockVoid").isEmpty()) {
			ItemStack Voidblock;
			Voidblock = OreDictionary.getOres("blockVoid").get(0);
			ItemStack result = Voidblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockVoid", oredictionarybook ));
			}
		if (!OreDictionary.getOres("blockWroughtIron").isEmpty()) {
			ItemStack WroughtIronblock;
			WroughtIronblock = OreDictionary.getOres("blockWroughtIron").get(0);
			ItemStack result = WroughtIronblock.copy();
			result.stackSize = 1;
			GameRegistry.addRecipe(new ShapelessOreRecipe(result, "blockWroughtIron", oredictionarybook ));
			}
	}
}