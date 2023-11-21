package net.cantloadusername.woodencrafts.block;

import net.cantloadusername.woodencrafts.WoodenCrafts;
import net.cantloadusername.woodencrafts.block.custom.ModCraftingTableBlock;
import net.cantloadusername.woodencrafts.block.custom.ModChestBlock;
import net.cantloadusername.woodencrafts.block.custom.ModChests;
import net.cantloadusername.woodencrafts.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
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

    public static final RegistryObject<Block> ACACIA_CHEST = registerChest("acacia_chest",
            () -> new ModChestBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS), ModChests.ACACIA), 300);
    public static final RegistryObject<Block> BAMBOO_CHEST = registerChest("bamboo_chest",
            () -> new ModChestBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS), ModChests.BAMBOO), 300);
    public static final RegistryObject<Block> BIRCH_CHEST = registerChest("birch_chest",
            () -> new ModChestBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS), ModChests.BIRCH), 300);
    public static final RegistryObject<Block> CHERRY_CHEST = registerChest("cherry_chest",
            () -> new ModChestBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS), ModChests.CHERRY), 300);
    public static final RegistryObject<Block> CRIMSON_CHEST = registerChest("crimson_chest",
            () -> new ModChestBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS), ModChests.CRIMSON), 0);
    public static final RegistryObject<Block> DARK_OAK_CHEST = registerChest("dark_oak_chest",
            () -> new ModChestBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS), ModChests.DARK_OAK), 300);
    public static final RegistryObject<Block> JUNGLE_CHEST = registerChest("jungle_chest",
            () -> new ModChestBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS), ModChests.JUNGLE), 300);
    public static final RegistryObject<Block> MANGROVE_CHEST = registerChest("mangrove_chest",
            () -> new ModChestBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS), ModChests.MANGROVE), 300);
    public static final RegistryObject<Block> SPRUCE_CHEST = registerChest("spruce_chest",
            () -> new ModChestBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS), ModChests.SPRUCE), 300);
    public static final RegistryObject<Block> WARPED_CHEST = registerChest("warped_chest",
            () -> new ModChestBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS), ModChests.WARPED), 0);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerChest(String name, Supplier<T> block, int burnTime) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerChestItem(name, toReturn, burnTime);
        return toReturn;
    }

    private static <T extends Block> void registerChestItem(String name, RegistryObject<T> block, int burnTime) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()) {
            @Override
            public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                return burnTime;
            }
        });
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
