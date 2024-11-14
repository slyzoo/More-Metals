package net.slyzoo.moremetals.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.slyzoo.moremetals.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
    getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(ModBlocks.ALUMINIUM_BLOCK)
            .add(ModBlocks.RAW_ALUMINIUM_BLOCK)
            .add(ModBlocks.ALUMINIUM_ORE)
            .add(ModBlocks.DEEPSLATE_ALUMINIUM_ORE)

            .add(ModBlocks.BISMUTH_BLOCK)
            .add(ModBlocks.RAW_BISMUTH_BLOCK)
            .add(ModBlocks.BISMUTH_ORE)
            .add(ModBlocks.DEEPSLATE_BISMUTH_ORE)

            .add(ModBlocks.BRASS_BLOCK)

            .add(ModBlocks.BRONZE_BLOCK)
            .add(ModBlocks.RAW_BRONZE_BLOCK)
            .add(ModBlocks.BRONZE_ORE)
            .add(ModBlocks.DEEPSLATE_BRONZE_ORE)

            .add(ModBlocks.LEAD_BLOCK)
            .add(ModBlocks.RAW_LEAD_BLOCK)
            .add(ModBlocks.LEAD_ORE)
            .add(ModBlocks.DEEPSLATE_LEAD_ORE)

            .add(ModBlocks.OSMIUM_BLOCK)
            .add(ModBlocks.RAW_OSMIUM_BLOCK)
            .add(ModBlocks.OSMIUM_ORE)
            .add(ModBlocks.DEEPSLATE_OSMIUM_ORE)

            .add(ModBlocks.PALLADIUM_BLOCK)
            .add(ModBlocks.RAW_PALLADIUM_BLOCK)
            .add(ModBlocks.PALLADIUM_ORE)
            .add(ModBlocks.DEEPSLATE_PALLADIUM_ORE)

            .add(ModBlocks.PLATINUM_BLOCK)
            .add(ModBlocks.RAW_PLATINUM_BLOCK)
            .add(ModBlocks.PLATINUM_ORE)
            .add(ModBlocks.DEEPSLATE_PLATINUM_ORE)

            .add(ModBlocks.PURPLE_GOLD_BLOCK)

            .add(ModBlocks.SILICON_BLOCK)
            .add(ModBlocks.RAW_SILICON_BLOCK)
            .add(ModBlocks.SILICON_ORE)
            .add(ModBlocks.DEEPSLATE_SILICON_ORE)

            .add(ModBlocks.SILVER_BLOCK)
            .add(ModBlocks.RAW_SILVER_BLOCK)
            .add(ModBlocks.SILVER_ORE)
            .add(ModBlocks.DEEPSLATE_SILVER_ORE)

            .add(ModBlocks.TIN_BLOCK)
            .add(ModBlocks.RAW_TIN_BLOCK)
            .add(ModBlocks.TIN_ORE)
            .add(ModBlocks.DEEPSLATE_TIN_ORE)

            .add(ModBlocks.TITANIUM_BLOCK)
            .add(ModBlocks.RAW_TITANIUM_BLOCK)
            .add(ModBlocks.TITANIUM_ORE)
            .add(ModBlocks.DEEPSLATE_TITANIUM_ORE)

            .add(ModBlocks.TUNGSTEN_BLOCK)
            .add(ModBlocks.RAW_TUNGSTEN_BLOCK)
            .add(ModBlocks.TUNGSTEN_ORE)
            .add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE)

            .add(ModBlocks.ZINC_BLOCK)
            .add(ModBlocks.RAW_ZINC_BLOCK)
            .add(ModBlocks.ZINC_ORE)
            .add(ModBlocks.DEEPSLATE_ZINC_ORE);

    getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
            .add(ModBlocks.BISMUTH_BLOCK)
            .add(ModBlocks.RAW_BISMUTH_BLOCK)
            .add(ModBlocks.BISMUTH_ORE)
            .add(ModBlocks.DEEPSLATE_BISMUTH_ORE)

            .add(ModBlocks.BRASS_BLOCK)

            .add(ModBlocks.BRONZE_BLOCK)
            .add(ModBlocks.RAW_BRONZE_BLOCK)
            .add(ModBlocks.BRONZE_ORE)
            .add(ModBlocks.DEEPSLATE_BRONZE_ORE)

            .add(ModBlocks.TIN_BLOCK)
            .add(ModBlocks.RAW_TIN_BLOCK)
            .add(ModBlocks.TIN_ORE)
            .add(ModBlocks.DEEPSLATE_TIN_ORE)

            .add(ModBlocks.SILICON_BLOCK)
            .add(ModBlocks.RAW_SILICON_BLOCK)
            .add(ModBlocks.SILICON_ORE)
            .add(ModBlocks.DEEPSLATE_SILICON_ORE)

            .add(ModBlocks.SILVER_BLOCK)
            .add(ModBlocks.RAW_SILVER_BLOCK)
            .add(ModBlocks.SILVER_ORE)
            .add(ModBlocks.DEEPSLATE_SILVER_ORE)

            .add(ModBlocks.PALLADIUM_BLOCK)
            .add(ModBlocks.RAW_PALLADIUM_BLOCK)
            .add(ModBlocks.PALLADIUM_ORE)
            .add(ModBlocks.DEEPSLATE_PALLADIUM_ORE);

    getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
            .add(ModBlocks.ALUMINIUM_BLOCK)
            .add(ModBlocks.RAW_ALUMINIUM_BLOCK)
            .add(ModBlocks.ALUMINIUM_ORE)
            .add(ModBlocks.DEEPSLATE_ALUMINIUM_ORE)

            .add(ModBlocks.LEAD_BLOCK)
            .add(ModBlocks.RAW_LEAD_BLOCK)
            .add(ModBlocks.LEAD_ORE)
            .add(ModBlocks.DEEPSLATE_LEAD_ORE)

            .add(ModBlocks.OSMIUM_BLOCK)
            .add(ModBlocks.RAW_OSMIUM_BLOCK)
            .add(ModBlocks.OSMIUM_ORE)
            .add(ModBlocks.DEEPSLATE_OSMIUM_ORE)

            .add(ModBlocks.PLATINUM_BLOCK)
            .add(ModBlocks.RAW_PLATINUM_BLOCK)
            .add(ModBlocks.PLATINUM_ORE)
            .add(ModBlocks.DEEPSLATE_PLATINUM_ORE)

            .add(ModBlocks.PURPLE_GOLD_BLOCK)

            .add(ModBlocks.TITANIUM_BLOCK)
            .add(ModBlocks.RAW_TITANIUM_BLOCK)
            .add(ModBlocks.TITANIUM_ORE)
            .add(ModBlocks.DEEPSLATE_TITANIUM_ORE)

            .add(ModBlocks.TUNGSTEN_BLOCK)
            .add(ModBlocks.RAW_TUNGSTEN_BLOCK)
            .add(ModBlocks.TUNGSTEN_ORE)
            .add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE)

            .add(ModBlocks.ZINC_BLOCK)
            .add(ModBlocks.RAW_ZINC_BLOCK)
            .add(ModBlocks.ZINC_ORE)
            .add(ModBlocks.DEEPSLATE_ZINC_ORE);

    getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);


    }
}
