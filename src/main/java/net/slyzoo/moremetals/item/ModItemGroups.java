package net.slyzoo.moremetals.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.slyzoo.moremetals.Moremetals;
import net.slyzoo.moremetals.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup MORE_METALS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Moremetals.MOD_ID, "more_metals_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack((ModItems.PURPLE_GOLD_INGOT)))
                    .displayName(Text.translatable("itemgroup.moremetals.purple_gold_ingot_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ALUMINIUM_INGOT);
                        entries.add(ModItems.ALUMINIUM_NUGGET);
                        entries.add(ModBlocks.ALUMINIUM_BLOCK);
                        entries.add(ModItems.RAW_ALUMINIUM);
                        entries.add(ModBlocks.RAW_ALUMINIUM_BLOCK);
                        entries.add(ModBlocks.ALUMINIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_ALUMINIUM_ORE);

                        entries.add(ModItems.BISMUTH_INGOT);
                        entries.add(ModItems.BISMUTH_NUGGET);
                        entries.add(ModBlocks.BISMUTH_BLOCK);
                        entries.add(ModItems.RAW_BISMUTH);
                        entries.add(ModBlocks.RAW_BISMUTH_BLOCK);
                        entries.add(ModBlocks.BISMUTH_ORE);
                        entries.add(ModBlocks.DEEPSLATE_BISMUTH_ORE);

                        entries.add(ModItems.BRASS_INGOT);
                        entries.add(ModItems.BRASS_NUGGET);
                        entries.add(ModBlocks.BRASS_BLOCK);

                        entries.add(ModItems.BRONZE_INGOT);
                        entries.add(ModItems.BRONZE_NUGGET);
                        entries.add(ModBlocks.BRONZE_BLOCK);
                        entries.add(ModItems.RAW_BRONZE);
                        entries.add(ModBlocks.RAW_BRONZE_BLOCK);
                        entries.add(ModBlocks.BRONZE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_BRONZE_ORE);

                        entries.add(ModItems.LEAD_INGOT);
                        entries.add(ModItems.LEAD_NUGGET);
                        entries.add(ModBlocks.LEAD_BLOCK);
                        entries.add(ModItems.RAW_LEAD);
                        entries.add(ModBlocks.RAW_LEAD_BLOCK);
                        entries.add(ModBlocks.LEAD_ORE);
                        entries.add(ModBlocks.DEEPSLATE_LEAD_ORE);

                        entries.add(ModItems.OSMIUM_INGOT);
                        entries.add(ModItems.OSMIUM_NUGGET);
                        entries.add(ModBlocks.OSMIUM_BLOCK);
                        entries.add(ModItems.RAW_OSMIUM);
                        entries.add(ModBlocks.RAW_OSMIUM_BLOCK);
                        entries.add(ModBlocks.OSMIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_OSMIUM_ORE);

                        entries.add(ModItems.PALLADIUM_INGOT);
                        entries.add(ModItems.PALLADIUM_NUGGET);
                        entries.add(ModBlocks.PALLADIUM_BLOCK);
                        entries.add(ModItems.RAW_PALLADIUM);
                        entries.add(ModBlocks.RAW_PALLADIUM_BLOCK);
                        entries.add(ModBlocks.PALLADIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PALLADIUM_ORE);

                        entries.add(ModItems.PLATINUM_INGOT);
                        entries.add(ModItems.PLATINUM_NUGGET);
                        entries.add(ModBlocks.PLATINUM_BLOCK);
                        entries.add(ModItems.RAW_PLATINUM);
                        entries.add(ModBlocks.RAW_PLATINUM_BLOCK);
                        entries.add(ModBlocks.PLATINUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PLATINUM_ORE);

                        entries.add(ModItems.PURPLE_GOLD_INGOT);
                        entries.add(ModItems.PURPLE_GOLD_NUGGET);
                        entries.add(ModBlocks.PURPLE_GOLD_BLOCK);

                        entries.add(ModItems.SILICON_INGOT);
                        entries.add(ModItems.SILICON_NUGGET);
                        entries.add(ModBlocks.SILICON_BLOCK);
                        entries.add(ModItems.RAW_SILICON);
                        entries.add(ModBlocks.RAW_SILICON_BLOCK);
                        entries.add(ModBlocks.SILICON_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SILICON_ORE);

                        entries.add(ModItems.SILVER_INGOT);
                        entries.add(ModItems.SILVER_NUGGET);
                        entries.add(ModBlocks.SILVER_BLOCK);
                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModBlocks.RAW_SILVER_BLOCK);
                        entries.add(ModBlocks.SILVER_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);

                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.STEEL_NUGGET);
                        entries.add(ModBlocks.STEEL_BLOCK);

                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.TIN_NUGGET);
                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModBlocks.RAW_TIN_BLOCK);
                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TIN_ORE);

                        entries.add(ModItems.TITANIUM_INGOT);
                        entries.add(ModItems.TITANIUM_NUGGET);
                        entries.add(ModBlocks.TITANIUM_BLOCK);
                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModBlocks.RAW_TITANIUM_BLOCK);
                        entries.add(ModBlocks.TITANIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TITANIUM_ORE);

                        entries.add(ModItems.TUNGSTEN_INGOT);
                        entries.add(ModItems.TUNGSTEN_NUGGET);
                        entries.add(ModBlocks.TUNGSTEN_BLOCK);
                        entries.add(ModItems.RAW_TUNGSTEN);
                        entries.add(ModBlocks.RAW_TUNGSTEN_BLOCK);
                        entries.add(ModBlocks.TUNGSTEN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);

                        entries.add(ModItems.ZINC_INGOT);
                        entries.add(ModItems.ZINC_NUGGET);
                        entries.add(ModBlocks.ZINC_BLOCK);
                        entries.add(ModItems.RAW_ZINC);
                        entries.add(ModBlocks.RAW_ZINC_BLOCK);
                        entries.add(ModBlocks.ZINC_ORE);
                        entries.add(ModBlocks.DEEPSLATE_ZINC_ORE);
                    })
                    .build());

// logger register
    public static void registerItemGroups(){
        Moremetals.LOGGER.info("Registering Item Groups for " + Moremetals.MOD_ID);
    }
}
