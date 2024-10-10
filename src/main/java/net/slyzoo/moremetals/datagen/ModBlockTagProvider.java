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

            .add(ModBlocks.BRASS_BLOCK)

            .add(ModBlocks.BRONZE_BLOCK)
            .add(ModBlocks.RAW_BRONZE_BLOCK)
            .add(ModBlocks.BRONZE_ORE)
            .add(ModBlocks.DEEPSLATE_BRONZE_ORE)

            .add(ModBlocks.LEAD_BLOCK)
            .add(ModBlocks.RAW_LEAD_BLOCK)
            .add(ModBlocks.LEAD_ORE)
            .add(ModBlocks.DEEPSLATE_LEAD_ORE)

            .add(ModBlocks.PLATINUM_BLOCK)
            .add(ModBlocks.RAW_PLATINUM_BLOCK)
            .add(ModBlocks.PLATINUM_ORE)
            .add(ModBlocks.DEEPSLATE_PLATINUM_ORE)

            .add(ModBlocks.PURPLE_GOLD_BLOCK)

            .add(ModBlocks.TIN_BLOCK)
            .add(ModBlocks.RAW_TIN_BLOCK)
            .add(ModBlocks.TIN_ORE)
            .add(ModBlocks.DEEPSLATE_TIN_ORE)

            .add(ModBlocks.TITANIUM_BLOCK)
            .add(ModBlocks.RAW_TITANIUM_BLOCK)
            .add(ModBlocks.TITANIUM_ORE)
            .add(ModBlocks.DEEPSLATE_TITANIUM_ORE)

            .add(ModBlocks.ZINC_BLOCK)
            .add(ModBlocks.RAW_ZINC_BLOCK)
            .add(ModBlocks.ZINC_ORE)
            .add(ModBlocks.DEEPSLATE_ZINC_ORE);

    getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
            .add(ModBlocks.BRASS_BLOCK)

            .add(ModBlocks.BRONZE_BLOCK)
            .add(ModBlocks.RAW_BRONZE_BLOCK)
            .add(ModBlocks.BRONZE_ORE)
            .add(ModBlocks.DEEPSLATE_BRONZE_ORE)

            .add(ModBlocks.TIN_BLOCK)
            .add(ModBlocks.RAW_TIN_BLOCK)
            .add(ModBlocks.TIN_ORE)
            .add(ModBlocks.DEEPSLATE_TIN_ORE);

    getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
            .add(ModBlocks.ALUMINIUM_BLOCK)
            .add(ModBlocks.RAW_ALUMINIUM_BLOCK)
            .add(ModBlocks.ALUMINIUM_ORE)
            .add(ModBlocks.DEEPSLATE_ALUMINIUM_ORE)

            .add(ModBlocks.LEAD_BLOCK)
            .add(ModBlocks.RAW_LEAD_BLOCK)
            .add(ModBlocks.LEAD_ORE)
            .add(ModBlocks.DEEPSLATE_LEAD_ORE)

            .add(ModBlocks.PLATINUM_BLOCK)
            .add(ModBlocks.RAW_PLATINUM_BLOCK)
            .add(ModBlocks.PLATINUM_ORE)
            .add(ModBlocks.DEEPSLATE_PLATINUM_ORE)

            .add(ModBlocks.PURPLE_GOLD_BLOCK)

            .add(ModBlocks.TITANIUM_BLOCK)
            .add(ModBlocks.RAW_TITANIUM_BLOCK)
            .add(ModBlocks.TITANIUM_ORE)
            .add(ModBlocks.DEEPSLATE_TITANIUM_ORE)

            .add(ModBlocks.ZINC_BLOCK)
            .add(ModBlocks.RAW_ZINC_BLOCK)
            .add(ModBlocks.ZINC_ORE)
            .add(ModBlocks.DEEPSLATE_ZINC_ORE);

    getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);


    }
}
