package net.cantloadusername.woodencrafts.datagen;

import net.cantloadusername.woodencrafts.WoodenCrafts;
import net.cantloadusername.woodencrafts.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.VariantBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider{

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, WoodenCrafts.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        registerCraftingTables();



    }

    private void registerCraftingTables() {
        // Acacia Crafting Table
        simpleBlockWithItem(ModBlocks.ACACIA_CRAFTING_TABLE.get(), models().orientableWithBottom(ModBlocks.ACACIA_CRAFTING_TABLE.getId().getPath(),
                modLoc("block/acacia_crafting_table_side"),
                modLoc("block/acacia_crafting_table_front"),
                new ResourceLocation("minecraft:block/acacia_planks"),
                modLoc("block/acacia_crafting_table_top")));
        // Bamboo Crafting Table
        simpleBlockWithItem(ModBlocks.BAMBOO_CRAFTING_TABLE.get(), models().orientableWithBottom(ModBlocks.BAMBOO_CRAFTING_TABLE.getId().getPath(),
                modLoc("block/bamboo_crafting_table_side"),
                modLoc("block/bamboo_crafting_table_front"),
                new ResourceLocation("minecraft:block/bamboo_planks"),
                modLoc("block/bamboo_crafting_table_top")));
        // Birch Crafting Table
        simpleBlockWithItem(ModBlocks.BIRCH_CRAFTING_TABLE.get(), models().orientableWithBottom(ModBlocks.BIRCH_CRAFTING_TABLE.getId().getPath(),
                modLoc("block/birch_crafting_table_side"),
                modLoc("block/birch_crafting_table_front"),
                new ResourceLocation("minecraft:block/birch_planks"),
                modLoc("block/birch_crafting_table_top")));
        // Cherry Crafting Table
        simpleBlockWithItem(ModBlocks.CHERRY_CRAFTING_TABLE.get(), models().orientableWithBottom(ModBlocks.CHERRY_CRAFTING_TABLE.getId().getPath(),
                modLoc("block/cherry_crafting_table_side"),
                modLoc("block/cherry_crafting_table_front"),
                new ResourceLocation("minecraft:block/cherry_planks"),
                modLoc("block/cherry_crafting_table_top")));
        // Crimson Crafting Table
        simpleBlockWithItem(ModBlocks.CRIMSON_CRAFTING_TABLE.get(), models().orientableWithBottom(ModBlocks.CRIMSON_CRAFTING_TABLE.getId().getPath(),
                modLoc("block/crimson_crafting_table_side"),
                modLoc("block/crimson_crafting_table_front"),
                new ResourceLocation("minecraft:block/crimson_planks"),
                modLoc("block/crimson_crafting_table_top")));
        // Dark Oak Crafting Table
        simpleBlockWithItem(ModBlocks.DARK_OAK_CRAFTING_TABLE.get(), models().orientableWithBottom(ModBlocks.DARK_OAK_CRAFTING_TABLE.getId().getPath(),
                modLoc("block/dark_oak_crafting_table_side"),
                modLoc("block/dark_oak_crafting_table_front"),
                new ResourceLocation("minecraft:block/dark_oak_planks"),
                modLoc("block/dark_oak_crafting_table_top")));
        // Jungle Crafting Table
        simpleBlockWithItem(ModBlocks.JUNGLE_CRAFTING_TABLE.get(), models().orientableWithBottom(ModBlocks.JUNGLE_CRAFTING_TABLE.getId().getPath(),
                modLoc("block/jungle_crafting_table_side"),
                modLoc("block/jungle_crafting_table_front"),
                new ResourceLocation("minecraft:block/jungle_planks"),
                modLoc("block/jungle_crafting_table_top")));
        // Mangrove Crafting Table
        simpleBlockWithItem(ModBlocks.MANGROVE_CRAFTING_TABLE.get(), models().orientableWithBottom(ModBlocks.MANGROVE_CRAFTING_TABLE.getId().getPath(),
                modLoc("block/mangrove_crafting_table_side"),
                modLoc("block/mangrove_crafting_table_front"),
                new ResourceLocation("minecraft:block/mangrove_planks"),
                modLoc("block/mangrove_crafting_table_top")));
        // Spruce Crafting Table
        simpleBlockWithItem(ModBlocks.SPRUCE_CRAFTING_TABLE.get(), models().orientableWithBottom(ModBlocks.SPRUCE_CRAFTING_TABLE.getId().getPath(),
                modLoc("block/spruce_crafting_table_side"),
                modLoc("block/spruce_crafting_table_front"),
                new ResourceLocation("minecraft:block/spruce_planks"),
                modLoc("block/spruce_crafting_table_top")));
        // Warped Crafting Table
        simpleBlockWithItem(ModBlocks.WARPED_CRAFTING_TABLE.get(), models().orientableWithBottom(ModBlocks.WARPED_CRAFTING_TABLE.getId().getPath(),
                modLoc("block/warped_crafting_table_side"),
                modLoc("block/warped_crafting_table_front"),
                new ResourceLocation("minecraft:block/warped_planks"),
                modLoc("block/warped_crafting_table_top")));
    }

}
