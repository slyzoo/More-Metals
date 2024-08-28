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

    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot", new Item(new Item.Settings()));
// ngl i dont even remember
    public static final Item BRASS_INGOT = registerItem("brass_ingot", new Item(new Item.Settings()));
//  hue : -15

    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new Item.Settings()));
//  hue : -25

    public static final Item PURPLE_GOLD_INGOT = registerItem("purple_gold_ingot", new Item(new Item.Settings()));
//  saturation : -123

    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", new Item(new Item.Settings()));
//  hue : 115
//  saturation : something low i dont remember

    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));
//  saturation : 0
//  lightness : -50

    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new Item.Settings()));
//  hue : 195
//  lightness : -20
//  saturation : -90

    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new Item.Settings()));
//  saturation : 0
//  lightness : 100
    public static final Item ZINC_INGOT = registerItem("zinc_ingot", new Item(new Item.Settings()));
//  saturation : -65
//  hue : 82


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Moremetals.MOD_ID, name), item);
    };

    public static void registerModItems(){
        Moremetals.LOGGER.info("Registering Mod Items for " + Moremetals.MOD_ID);

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
        });
    }
}