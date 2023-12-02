package net.cantloadusername.woodencrafts.datagen;

import net.cantloadusername.woodencrafts.WoodenCrafts;
import net.cantloadusername.woodencrafts.block.ModBlocks;
import net.cantloadusername.woodencrafts.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, WoodenCrafts.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_AXE)
        //Crafting Tables
                .add(ModBlocks.ACACIA_CRAFTING_TABLE.get(),
                        ModBlocks.BAMBOO_CRAFTING_TABLE.get(),
                        ModBlocks.BIRCH_CRAFTING_TABLE.get(),
                        ModBlocks.CHERRY_CRAFTING_TABLE.get(),
                        ModBlocks.CRIMSON_CRAFTING_TABLE.get(),
                        ModBlocks.DARK_OAK_CRAFTING_TABLE.get(),
                        ModBlocks.JUNGLE_CRAFTING_TABLE.get(),
                        ModBlocks.MANGROVE_CRAFTING_TABLE.get(),
                        ModBlocks.SPRUCE_CRAFTING_TABLE.get(),
                        ModBlocks.WARPED_CRAFTING_TABLE.get())
        //Chests
                .add(ModBlocks.ACACIA_CHEST.get(),
                        ModBlocks.BAMBOO_CHEST.get(),
                        ModBlocks.BIRCH_CHEST.get(),
                        ModBlocks.CHERRY_CHEST.get(),
                        ModBlocks.CRIMSON_CHEST.get(),
                        ModBlocks.DARK_OAK_CHEST.get(),
                        ModBlocks.JUNGLE_CHEST.get(),
                        ModBlocks.MANGROVE_CHEST.get(),
                        ModBlocks.SPRUCE_CHEST.get(),
                        ModBlocks.WARPED_CHEST.get())
        //Barrels
                .add(ModBlocks.ACACIA_BARREL.get(),
                        ModBlocks.BAMBOO_BARREL.get(),
                        ModBlocks.BIRCH_BARREL.get(),
                        ModBlocks.CHERRY_BARREL.get(),
                        ModBlocks.CRIMSON_BARREL.get(),
                        ModBlocks.DARK_OAK_BARREL.get(),
                        ModBlocks.JUNGLE_BARREL.get(),
                        ModBlocks.MANGROVE_BARREL.get(),
                        ModBlocks.OAK_BARREL.get(),
                        ModBlocks.WARPED_BARREL.get());

        this.tag(Tags.Blocks.BARRELS_WOODEN)
                .replace(false)
                .add(ModBlocks.ACACIA_BARREL.get(),
                        ModBlocks.BAMBOO_BARREL.get(),
                        ModBlocks.BIRCH_BARREL.get(),
                        ModBlocks.CHERRY_BARREL.get(),
                        ModBlocks.CRIMSON_BARREL.get(),
                        ModBlocks.DARK_OAK_BARREL.get(),
                        ModBlocks.JUNGLE_BARREL.get(),
                        ModBlocks.MANGROVE_BARREL.get(),
                        ModBlocks.OAK_BARREL.get(),
                        ModBlocks.WARPED_BARREL.get());

        this.tag(ModTags.Blocks.BARRELS)
                .add(ModBlocks.ACACIA_BARREL.get(),
                        ModBlocks.BAMBOO_BARREL.get(),
                        ModBlocks.BIRCH_BARREL.get(),
                        ModBlocks.CHERRY_BARREL.get(),
                        ModBlocks.CRIMSON_BARREL.get(),
                        ModBlocks.DARK_OAK_BARREL.get(),
                        ModBlocks.JUNGLE_BARREL.get(),
                        ModBlocks.MANGROVE_BARREL.get(),
                        ModBlocks.OAK_BARREL.get(),
                        ModBlocks.WARPED_BARREL.get())
                .replace(false);

        this.tag(BlockTags.GUARDED_BY_PIGLINS)
                .add(ModBlocks.ACACIA_BARREL.get(),
                        ModBlocks.BAMBOO_BARREL.get(),
                        ModBlocks.BIRCH_BARREL.get(),
                        ModBlocks.CHERRY_BARREL.get(),
                        ModBlocks.CRIMSON_BARREL.get(),
                        ModBlocks.DARK_OAK_BARREL.get(),
                        ModBlocks.JUNGLE_BARREL.get(),
                        ModBlocks.MANGROVE_BARREL.get(),
                        ModBlocks.OAK_BARREL.get(),
                        ModBlocks.WARPED_BARREL.get())
                .replace(false);
    }
}
