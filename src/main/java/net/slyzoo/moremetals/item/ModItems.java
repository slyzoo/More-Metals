package net.slyzoo.moremetals.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slyzoo.moremetals.Moremetals;

public class ModItems {

    // (all textures from gold ingot)
// Raw ingots

    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot", new Item(new Item.Settings()));
    public static final Item ALUMINIUM_NUGGET = registerItem("aluminium_nugget", new Item(new Item.Settings()));
    public static final Item RAW_ALUMINIUM = registerItem("raw_aluminium", new Item(new Item.Settings()));
// saturation : -100
// lightness : 26

    public static final Item BRASS_INGOT = registerItem("brass_ingot", new Item(new Item.Settings()));
    public static final Item BRASS_NUGGET = registerItem("brass_nugget", new Item(new Item.Settings()));
//  hue : -15

    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new Item.Settings()));
    public static final Item BRONZE_NUGGET = registerItem("bronze_nugget", new Item(new Item.Settings()));
    public static final Item RAW_BRONZE = registerItem("raw_bronze", new Item(new Item.Settings()));
//  hue : -25

    public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item(new Item.Settings()));
    public static final Item LEAD_NUGGET = registerItem("lead_nugget", new Item(new Item.Settings()));
    public static final Item RAW_LEAD = registerItem("raw_lead", new Item(new Item.Settings()));

    public static final Item PURPLE_GOLD_INGOT = registerItem("purple_gold_ingot", new Item(new Item.Settings()));
    public static final Item PURPLE_GOLD_NUGGET = registerItem("purple_gold_nugget", new Item(new Item.Settings()));
//  saturation : -123

    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", new Item(new Item.Settings()));
    public static final Item PLATINUM_NUGGET = registerItem("platinum_nugget", new Item(new Item.Settings()));
    public static final Item RAW_PLATINUM = registerItem("raw_platinum", new Item(new Item.Settings()));
//  hue : 115
// lightness : -45
//  saturation : -50

    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(new Item.Settings()));
//  saturation : -100
//  lightness : -50

    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new Item.Settings()));
    public static final Item TITANIUM_NUGGET = registerItem("titanium_nugget", new Item(new Item.Settings()));
    public static final Item RAW_TITANIUM = registerItem("raw_titanium", new Item(new Item.Settings()));
//  hue : 195
//  lightness : -20
//  saturation : -90

    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new Item.Settings()));
    public static final Item TIN_NUGGET = registerItem("tin_nugget", new Item(new Item.Settings()));
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new Item.Settings()));
//  saturation : -100
//  lightness : 100

    public static final Item ZINC_INGOT = registerItem("zinc_ingot", new Item(new Item.Settings()));
    public static final Item ZINC_NUGGET = registerItem("zinc_nugget", new Item(new Item.Settings()));
    public static final Item RAW_ZINC = registerItem("raw_zinc", new Item(new Item.Settings()));
//  saturation : -65
//  hue : 82

// Registers the Mod Item
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Moremetals.MOD_ID, name), item);
    };

// Adds the Mod Items to the vanilla Tabs (Ingredients) & does the Logger
    public static void registerModItems(){
        Moremetals.LOGGER.info("Registering Mod Items for " + Moremetals.MOD_ID);

/* Adds Mod Items To Vanilla Tabs (Ingredients)
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ALUMINIUM_INGOT);
            entries.add(BRASS_INGOT);
            entries.add(BRONZE_INGOT);
            entries.add(PURPLE_GOLD_INGOT);
            entries.add(PLATINUM_INGOT);
            entries.add(STEEL_INGOT);
            entries.add(TITANIUM_INGOT);
            entries.add(TIN_INGOT);
            entries.add(ZINC_INGOT);
        });*/
    }
}
