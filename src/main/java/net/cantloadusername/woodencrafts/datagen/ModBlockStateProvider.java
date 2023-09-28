package net.cantloadusername.woodencrafts.datagen;

import net.cantloadusername.woodencrafts.WoodenCrafts;
import net.cantloadusername.woodencrafts.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider{

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, WoodenCrafts.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(ModBlocks.ACACIA_CRAFTING_TABLE.get(), models().orientableWithBottom(ModBlocks.ACACIA_CRAFTING_TABLE.getId().getPath(),
                modLoc("block/acacia_crafting_table_side"),
                modLoc("block/acacia_crafting_table_front"),
                new ResourceLocation("minecraft:block/acacia_planks"),
                modLoc("block/acacia_crafting_table_top")));
    }

}
