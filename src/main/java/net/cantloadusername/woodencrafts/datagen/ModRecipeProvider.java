package net.cantloadusername.woodencrafts.datagen;

import net.cantloadusername.woodencrafts.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        twoByTwoPacker(pWriter, RecipeCategory.MISC, Blocks.CRAFTING_TABLE, Items.OAK_PLANKS);
        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.ACACIA_CRAFTING_TABLE.get(), Items.ACACIA_PLANKS);
        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.BAMBOO_CRAFTING_TABLE.get(), Items.BAMBOO_PLANKS);
        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.BIRCH_CRAFTING_TABLE.get(), Items.BIRCH_PLANKS);
        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.CHERRY_CRAFTING_TABLE.get(), Items.CHERRY_PLANKS);
        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.CRIMSON_CRAFTING_TABLE.get(), Items.CRIMSON_PLANKS);
        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.DARK_OAK_CRAFTING_TABLE.get(), Items.DARK_OAK_PLANKS);
        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.JUNGLE_CRAFTING_TABLE.get(), Items.JUNGLE_PLANKS);
        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.MANGROVE_CRAFTING_TABLE.get(), Items.MANGROVE_PLANKS);
        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.SPRUCE_CRAFTING_TABLE.get(), Items.SPRUCE_PLANKS);
        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.WARPED_CRAFTING_TABLE.get(), Items.WARPED_PLANKS);

    }


}
