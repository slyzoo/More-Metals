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
