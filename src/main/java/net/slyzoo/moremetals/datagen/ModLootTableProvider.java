package net.slyzoo.moremetals.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.slyzoo.moremetals.block.ModBlocks;
import net.slyzoo.moremetals.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ALUMINIUM_BLOCK);
        addDrop(ModBlocks.RAW_ALUMINIUM_BLOCK);
        addDrop(ModBlocks.BRASS_BLOCK);
        addDrop(ModBlocks.BRONZE_BLOCK);
        addDrop(ModBlocks.RAW_BRONZE_BLOCK);
        addDrop(ModBlocks.LEAD_BLOCK);
        addDrop(ModBlocks.RAW_LEAD_BLOCK);
        addDrop(ModBlocks.PLATINUM_BLOCK);
        addDrop(ModBlocks.RAW_PLATINUM_BLOCK);
        addDrop(ModBlocks.PURPLE_GOLD_BLOCK);
        addDrop(ModBlocks.STEEL_BLOCK);
        addDrop(ModBlocks.TIN_BLOCK);
        addDrop(ModBlocks.RAW_TIN_BLOCK);
        addDrop(ModBlocks.TITANIUM_BLOCK);
        addDrop(ModBlocks.RAW_TITANIUM_BLOCK);
        addDrop(ModBlocks.ZINC_BLOCK);
        addDrop(ModBlocks.RAW_ZINC_BLOCK);

        addDrop(ModBlocks.ALUMINIUM_ORE, oreDrops(ModBlocks.ALUMINIUM_ORE, ModItems.RAW_ALUMINIUM));
        addDrop(ModBlocks.BRONZE_ORE, oreDrops(ModBlocks.BRONZE_ORE, ModItems.RAW_BRONZE));
        addDrop(ModBlocks.LEAD_ORE, oreDrops(ModBlocks.LEAD_ORE, ModItems.RAW_LEAD));
        addDrop(ModBlocks.TIN_ORE, oreDrops(ModBlocks.TIN_ORE, ModItems.RAW_TIN));
        addDrop(ModBlocks.TITANIUM_ORE, oreDrops(ModBlocks.TITANIUM_ORE, ModItems.RAW_TITANIUM));
        addDrop(ModBlocks.ZINC_ORE, oreDrops(ModBlocks.ZINC_ORE, ModItems.RAW_ZINC));

    }
}
