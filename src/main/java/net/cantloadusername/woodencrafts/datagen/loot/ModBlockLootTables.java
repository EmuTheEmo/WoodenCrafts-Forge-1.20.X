package net.cantloadusername.woodencrafts.datagen.loot;

import net.cantloadusername.woodencrafts.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.ACACIA_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.BAMBOO_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.BIRCH_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.CHERRY_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.CRIMSON_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.DARK_OAK_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.JUNGLE_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.MANGROVE_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.SPRUCE_CRAFTING_TABLE.get());
        this.dropSelf(ModBlocks.WARPED_CRAFTING_TABLE.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
