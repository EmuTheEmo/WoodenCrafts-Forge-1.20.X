package net.cantloadusername.woodencrafts.datagen;

import net.cantloadusername.woodencrafts.WoodenCrafts;
import net.cantloadusername.woodencrafts.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, WoodenCrafts.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.ACACIA_CRAFTING_TABLE.get())
                .add(ModBlocks.BAMBOO_CRAFTING_TABLE.get())
                .add(ModBlocks.BIRCH_CRAFTING_TABLE.get())
                .add(ModBlocks.CHERRY_CRAFTING_TABLE.get())
                .add(ModBlocks.CRIMSON_CRAFTING_TABLE.get())
                .add(ModBlocks.DARK_OAK_CRAFTING_TABLE.get())
                .add(ModBlocks.JUNGLE_CRAFTING_TABLE.get())
                .add(ModBlocks.MANGROVE_CRAFTING_TABLE.get())
                .add(ModBlocks.SPRUCE_CRAFTING_TABLE.get())
                .add(ModBlocks.WARPED_CRAFTING_TABLE.get());
    }
}
