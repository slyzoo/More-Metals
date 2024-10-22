package net.slyzoo.moremetals.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.slyzoo.moremetals.Moremetals;
import net.slyzoo.moremetals.block.ModBlocks;
import net.slyzoo.moremetals.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        /* shaped recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ALUMINIUM_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RAW_ALUMINIUM)
                .criterion(hasItem(ModItems.RAW_ALUMINIUM), conditionsFromItem(ModItems.RAW_ALUMINIUM))
                .offerTo(exporter);

        // shapeless recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_ALUMINIUM, 9)
                .input(ModBlocks.RAW_ALUMINIUM_BLOCK)
                .criterion(hasItem(ModBlocks.RAW_ALUMINIUM_BLOCK), conditionsFromItem(ModBlocks.RAW_ALUMINIUM_BLOCK));
         */

// Aluminium
        // list that can get smelted
        List<ItemConvertible> ALUMINIUM_SMELTABLES = List.of(
                ModItems.RAW_ALUMINIUM,
                ModBlocks.ALUMINIUM_ORE,
                ModBlocks.DEEPSLATE_ALUMINIUM_ORE);

        // smelting recipe
        offerSmelting(exporter, ALUMINIUM_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.ALUMINIUM_INGOT,
                0.25f,
                200,
                "aluminium");

        // blasting recipe
        offerBlasting(exporter, ALUMINIUM_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.ALUMINIUM_INGOT,
                0.25f,
                100,
                "aluminium");

        // ingot to block and vise versa
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.ALUMINIUM_INGOT,
                RecipeCategory.DECORATIONS,
                ModBlocks.ALUMINIUM_BLOCK );

        // nugget to ingot (9 nuggets to 1 ingot)
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT)
                .input(ModItems.ALUMINIUM_NUGGET, 9)
                .criterion(hasItem(ModItems.ALUMINIUM_NUGGET), conditionsFromItem(ModItems.ALUMINIUM_NUGGET))
                .offerTo(exporter, Identifier.of(Moremetals.MOD_ID, "aluminium_ingot_from_aluminium_nugget"));

        // ingot to 9 nuggets
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ALUMINIUM_NUGGET, 9)
                .input(ModItems.ALUMINIUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(exporter, Identifier.of(Moremetals.MOD_ID, "aluminium_nugget_from_aluminium_ingot"));

// Brass
        // nugget to ingot (9 nuggets to 1 ingot)
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BRASS_INGOT)
                .input(ModItems.BRASS_NUGGET, 9)
                .criterion(hasItem(ModItems.BRASS_NUGGET), conditionsFromItem(ModItems.BRASS_NUGGET))
                .offerTo(exporter, Identifier.of(Moremetals.MOD_ID, "brass_ingot_from_brass_nugget"));

        // ingot to 9 nuggets
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BRASS_NUGGET, 9)
                .input(ModItems.BRASS_INGOT)
                .criterion(hasItem(ModItems.BRASS_INGOT), conditionsFromItem(ModItems.BRASS_INGOT))
                .offerTo(exporter, Identifier.of(Moremetals.MOD_ID, "brass_nugget_from_brass_ingot"));

// Bronze
        // list that can get smelted
        List<ItemConvertible> BRONZE_SMELTABLES = List.of(
                ModItems.RAW_BRONZE,
                ModBlocks.BRONZE_ORE,
                ModBlocks.DEEPSLATE_BRONZE_ORE);

        // smelting recipe
        offerSmelting(exporter, BRONZE_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.BRONZE_INGOT,
                0.25f,
                200,
                "bronze");

        // blasting recipe
        offerBlasting(exporter, BRONZE_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.BRONZE_INGOT,
                0.25f,
                100,
                "bronze");

        // ingot to block and vise versa
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.BRONZE_INGOT,
                RecipeCategory.DECORATIONS,
                ModBlocks.BRONZE_BLOCK );

        // nugget to ingot (9 nuggets to 1 ingot)
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BRONZE_INGOT)
                .input(ModItems.BRONZE_NUGGET, 9)
                .criterion(hasItem(ModItems.BRONZE_NUGGET), conditionsFromItem(ModItems.BRONZE_NUGGET))
                .offerTo(exporter, Identifier.of(Moremetals.MOD_ID, "bronze_ingot_from_bronze_nugget"));

        // ingot to 9 nuggets
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BRONZE_NUGGET, 9)
                .input(ModItems.BRONZE_INGOT)
                .criterion(hasItem(ModItems.BRONZE_INGOT), conditionsFromItem(ModItems.BRONZE_INGOT))
                .offerTo(exporter, Identifier.of(Moremetals.MOD_ID, "bronze_nugget_from_bronze_ingot"));

// Lead
        // list that can get smelted
        List<ItemConvertible> LEAD_SMELTABLES = List.of(
                ModItems.RAW_LEAD,
                ModBlocks.LEAD_ORE,
                ModBlocks.DEEPSLATE_LEAD_ORE);

        // smelting recipe
        offerSmelting(exporter, LEAD_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.LEAD_INGOT,
                0.25f,
                200,
                "lead");

        // blasting recipe
        offerBlasting(exporter, LEAD_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.LEAD_INGOT,
                0.25f,
                100,
                "lead");

        // ingot to block and vise versa
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.LEAD_INGOT,
                RecipeCategory.DECORATIONS,
                ModBlocks.LEAD_BLOCK );

        // nugget to ingot (9 nuggets to 1 ingot)
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LEAD_INGOT)
                .input(ModItems.LEAD_NUGGET, 9)
                .criterion(hasItem(ModItems.LEAD_NUGGET), conditionsFromItem(ModItems.LEAD_NUGGET))
                .offerTo(exporter, Identifier.of(Moremetals.MOD_ID, "lead_ingot_from_lead_nugget"));

        // ingot to 9 nuggets
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LEAD_NUGGET, 9)
                .input(ModItems.LEAD_INGOT)
                .criterion(hasItem(ModItems.LEAD_INGOT), conditionsFromItem(ModItems.LEAD_INGOT))
                .offerTo(exporter, Identifier.of(Moremetals.MOD_ID, "lead_nugget_from_lead_ingot"));

// Platinum
        // list that can get smelted
        List<ItemConvertible> PLATINUM_SMELTABLES = List.of(
                ModItems.RAW_PLATINUM,
                ModBlocks.PLATINUM_ORE,
                ModBlocks.DEEPSLATE_PLATINUM_ORE);

        // smelting recipe
        offerSmelting(exporter, PLATINUM_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.PLATINUM_INGOT,
                0.25f,
                200,
                "platinum");

        // blasting recipe
        offerBlasting(exporter, PLATINUM_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.PLATINUM_INGOT,
                0.25f,
                100,
                "platinum");

        // ingot to block and vise versa
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.PLATINUM_INGOT,
                RecipeCategory.DECORATIONS,
                ModBlocks.PLATINUM_BLOCK );

        // nugget to ingot (9 nuggets to 1 ingot)
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_INGOT)
                .input(ModItems.PLATINUM_NUGGET, 9)
                .criterion(hasItem(ModItems.PLATINUM_NUGGET), conditionsFromItem(ModItems.PLATINUM_NUGGET))
                .offerTo(exporter, Identifier.of(Moremetals.MOD_ID, "platinum_ingot_from_platinum_nugget"));

        // ingot to 9 nuggets
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_NUGGET, 9)
                .input(ModItems.PLATINUM_INGOT)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter, Identifier.of(Moremetals.MOD_ID, "platinum_nugget_from_platinum_ingot"));

// Purple Gold
        // nugget to ingot (9 nuggets to 1 ingot)
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PURPLE_GOLD_INGOT)
                .input(ModItems.PURPLE_GOLD_NUGGET, 9)
                .criterion(hasItem(ModItems.PURPLE_GOLD_NUGGET), conditionsFromItem(ModItems.PURPLE_GOLD_NUGGET))
                .offerTo(exporter, Identifier.of(Moremetals.MOD_ID, "purple_gold_ingot_from_purple_gold_nugget"));

        // ingot to 9 nuggets
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PURPLE_GOLD_NUGGET, 9)
                .input(ModItems.PURPLE_GOLD_INGOT)
                .criterion(hasItem(ModItems.PURPLE_GOLD_INGOT), conditionsFromItem(ModItems.PURPLE_GOLD_INGOT))
                .offerTo(exporter, Identifier.of(Moremetals.MOD_ID, "purple_gold_nugget_from_purple_gold_ingot"));

// Steel
        // list that can get smelted
        List<ItemConvertible> STEEL_SMELTABLES = List.of(
                Items.IRON_INGOT);

        // blasting recipe
        offerBlasting(exporter, STEEL_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.STEEL_INGOT,
                0.25f,
                200,
                "steel");

        // nugget to ingot (9 nuggets to 1 ingot)
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_INGOT)
                .input(ModItems.STEEL_NUGGET, 9)
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, Identifier.of(Moremetals.MOD_ID, "steel_ingot_from_steel_nugget"));

        // ingot to 9 nuggets
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_NUGGET, 9)
                .input(ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, Identifier.of(Moremetals.MOD_ID, "steel_nugget_from_steel_ingot"));

// Titanium
        // list that can get smelted
        List<ItemConvertible> TITANIUM_SMELTABLES = List.of(
                ModItems.RAW_TITANIUM,
                ModBlocks.TITANIUM_ORE,
                ModBlocks.DEEPSLATE_TITANIUM_ORE);

        // smelting recipe
        offerSmelting(exporter, TITANIUM_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.TITANIUM_INGOT,
                0.25f,
                200,
                "titanium");

        // blasting recipe
        offerBlasting(exporter, TITANIUM_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.TITANIUM_INGOT,
                0.25f,
                100,
                "titanium");

        // ingot to block and vise versa
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.TITANIUM_INGOT,
                RecipeCategory.DECORATIONS,
                ModBlocks.TITANIUM_BLOCK );

        // nugget to ingot (9 nuggets to 1 ingot)
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_INGOT)
                .input(ModItems.TITANIUM_NUGGET, 9)
                .criterion(hasItem(ModItems.TITANIUM_NUGGET), conditionsFromItem(ModItems.TITANIUM_NUGGET))
                .offerTo(exporter, Identifier.of(Moremetals.MOD_ID, "titanium_ingot_from_titanium_nugget"));

        // ingot to 9 nuggets
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_NUGGET, 9)
                .input(ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, Identifier.of(Moremetals.MOD_ID, "titanium_nugget_from_titanium_ingot"));

// Tin
        // list that can get smelted
        List<ItemConvertible> TIN_SMELTABLES = List.of(
                ModItems.RAW_TIN,
                ModBlocks.TIN_ORE,
                ModBlocks.DEEPSLATE_TIN_ORE);

        // smelting recipe
        offerSmelting(exporter, TIN_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.TIN_INGOT,
                0.25f,
                200,
                "tin");

        // blasting recipe
        offerBlasting(exporter, TIN_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.TIN_INGOT,
                0.25f,
                100,
                "tin");

        // ingot to block and vise versa
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.TIN_INGOT,
                RecipeCategory.DECORATIONS,
                ModBlocks.TIN_BLOCK );

        // nugget to ingot (9 nuggets to 1 ingot)
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TIN_INGOT)
                .input(ModItems.TIN_NUGGET, 9)
                .criterion(hasItem(ModItems.TIN_NUGGET), conditionsFromItem(ModItems.TIN_NUGGET))
                .offerTo(exporter, Identifier.of(Moremetals.MOD_ID, "tin_ingot_from_tin_nugget"));

        // ingot to 9 nuggets
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TIN_NUGGET, 9)
                .input(ModItems.TIN_INGOT)
                .criterion(hasItem(ModItems.TIN_INGOT), conditionsFromItem(ModItems.TIN_INGOT))
                .offerTo(exporter, Identifier.of(Moremetals.MOD_ID, "tin_nugget_from_tin_ingot"));

// Zinc
        // list that can get smelted
        List<ItemConvertible> ZINC_SMELTABLES = List.of(
                ModItems.RAW_ZINC,
                ModBlocks.ZINC_ORE,
                ModBlocks.DEEPSLATE_ZINC_ORE);

        // smelting recipe
        offerSmelting(exporter, ZINC_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.ZINC_INGOT,
                0.25f,
                200,
                "zinc");

        // blasting recipe
        offerBlasting(exporter, ZINC_SMELTABLES,
                RecipeCategory.MISC,
                ModItems.ZINC_INGOT,
                0.25f,
                100,
                "zinc");

        // ingot to block and vise versa
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.ZINC_INGOT,
                RecipeCategory.DECORATIONS,
                ModBlocks.ZINC_BLOCK );

        // nugget to ingot (9 nuggets to 1 ingot)
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ZINC_INGOT)
                .input(ModItems.ZINC_NUGGET, 9)
                .criterion(hasItem(ModItems.ZINC_NUGGET), conditionsFromItem(ModItems.ZINC_NUGGET))
                .offerTo(exporter, Identifier.of(Moremetals.MOD_ID, "zinc_ingot_from_zinc_nugget"));

        // ingot to 9 nuggets
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ZINC_NUGGET, 9)
                .input(ModItems.ZINC_INGOT)
                .criterion(hasItem(ModItems.ZINC_INGOT), conditionsFromItem(ModItems.ZINC_INGOT))
                .offerTo(exporter, Identifier.of(Moremetals.MOD_ID, "zinc_nugget_from_zinc_ingot"));

    }
}
