package net.cantloadusername.woodencrafts.block;

import net.cantloadusername.woodencrafts.WoodenCrafts;
import net.cantloadusername.woodencrafts.block.custom.ModCraftingTableBlock;
import net.cantloadusername.woodencrafts.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, WoodenCrafts.MOD_ID);

    //<editor-fold desc="Crafting Tables">
    // Acacia
    public static final RegistryObject<Block> ACACIA_CRAFTING_TABLE = registerBlock("acacia_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)));
    // Bamboo
    public static final RegistryObject<Block> BAMBOO_CRAFTING_TABLE = registerBlock("bamboo_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)));
    // Birch
    public static final RegistryObject<Block> BIRCH_CRAFTING_TABLE = registerBlock("birch_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)));
    // Cherry
    public static final RegistryObject<Block> CHERRY_CRAFTING_TABLE = registerBlock("cherry_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)));
    // Crimson
    public static final RegistryObject<Block> CRIMSON_CRAFTING_TABLE = registerBlock("crimson_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)));
    // Dark Oak
    public static final RegistryObject<Block> DARK_OAK_CRAFTING_TABLE = registerBlock("dark_oak_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)));
    // Jungle
    public static final RegistryObject<Block> JUNGLE_CRAFTING_TABLE = registerBlock("jungle_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)));
    // Mangrove
    public static final RegistryObject<Block> MANGROVE_CRAFTING_TABLE = registerBlock("mangrove_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)));
    // Spruce
    public static final RegistryObject<Block> SPRUCE_CRAFTING_TABLE = registerBlock("spruce_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)));
    // Warped
    public static final RegistryObject<Block> WARPED_CRAFTING_TABLE = registerBlock("warped_crafting_table",
            () -> new ModCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)));
    //</editor-fold>

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
