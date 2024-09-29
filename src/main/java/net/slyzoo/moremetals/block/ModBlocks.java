package net.slyzoo.moremetals.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.slyzoo.moremetals.Moremetals;
import org.lwjgl.openal.AL;


public class ModBlocks {

// Block maker yooo
    public static final Block ALUMINIUM_BLOCK = registerBlock("aluminium_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block RAW_ALUMINIUM_BLOCK = registerBlock("raw_aluminium_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block BRASS_BLOCK = registerBlock("brass_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.COPPER)));

    public static final Block BRONZE_BLOCK = registerBlock("bronze_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.COPPER)));

    public static final Block RAW_BRONZE_BLOCK = registerBlock("raw_bronze_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.COPPER)));

    public static final Block PURPLE_GOLD_BLOCK = registerBlock("purple_gold_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block ZINC_BLOCK = registerBlock("zinc_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block RAW_ZINC_BLOCK = registerBlock("raw_zinc_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));



// registers the Mod Blocks
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Moremetals.MOD_ID, name), block);
    }

// registers the Mod Block Items
    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(Moremetals.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
    }

// Logs Mod Blocks
    public static void registerModBlocks(){
        Moremetals.LOGGER.info("Registering Mod Blocks for "+ Moremetals.MOD_ID);

/* Adds Mod Blocks to Minecraft vanilla tab (Ingredients)

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ALUMINIUM_BLOCK);
            entries.add(BRASS_BLOCK);
            entries.add(BRONZE_BLOCK);
            entries.add(PURPLE_GOLD_BLOCK);
            entries.add(PLATINUM_BLOCK);
            entries.add(STEEL_BLOCK);
            entries.add(TIN_BLOCK);
            entries.add(TITANIUM_BLOCK);
            entries.add(ZINC_BLOCK);
        });*/
    }
}
