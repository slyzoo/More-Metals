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
                        entries.add(ModBlocks.ALUMINIUM_BLOCK);
                        entries.add(ModItems.RAW_ALUMINIUM);
                        entries.add(ModBlocks.RAW_ALUMINIUM_BLOCK);
                        entries.add(ModItems.BRASS_INGOT);
                        entries.add(ModBlocks.BRASS_BLOCK);
                        entries.add(ModItems.BRONZE_INGOT);
                        entries.add(ModBlocks.BRONZE_BLOCK);
                        entries.add(ModItems.RAW_BRONZE);
                        entries.add(ModBlocks.RAW_BRONZE_BLOCK);
                        entries.add(ModItems.PLATINUM_INGOT);
                        entries.add(ModBlocks.PLATINUM_BLOCK);
                        entries.add(ModItems.RAW_PLATINUM);
                        entries.add(ModBlocks.RAW_PLATINUM_BLOCK);
                        entries.add(ModItems.PURPLE_GOLD_INGOT);
                        entries.add(ModBlocks.PURPLE_GOLD_BLOCK);
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModBlocks.STEEL_BLOCK);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModBlocks.RAW_TIN_BLOCK);
                        entries.add(ModItems.TITANIUM_INGOT);
                        entries.add(ModBlocks.TITANIUM_BLOCK);
                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModBlocks.RAW_TITANIUM_BLOCK);
                        entries.add(ModItems.ZINC_INGOT);
                        entries.add(ModBlocks.ZINC_BLOCK);
                        entries.add(ModItems.RAW_ZINC);
                        entries.add(ModBlocks.RAW_ZINC_BLOCK);
                    })
                    .build());

// logger register
    public static void registerItemGroups(){
        Moremetals.LOGGER.info("Registering Item Groups for " + Moremetals.MOD_ID);
    }
}
