package net.slyzoo.moremetals;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.slyzoo.moremetals.datagen.ModBlockTagProvider;
import net.slyzoo.moremetals.datagen.ModItemTagProvider;
import net.slyzoo.moremetals.datagen.ModLootTableProvider;

public class MoremetalsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
	}
}
