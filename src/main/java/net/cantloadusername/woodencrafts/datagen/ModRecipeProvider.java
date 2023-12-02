package net.cantloadusername.woodencrafts.datagen;

import net.cantloadusername.woodencrafts.WoodenCrafts;
import net.cantloadusername.woodencrafts.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        addCraftingTableRecipes(pWriter);
        addChestRecipes(pWriter);
        addBarrelsRecipes(pWriter);

    }

    private void addCraftingTableRecipes(Consumer<FinishedRecipe> pWriter){
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

    private void addChestRecipes(Consumer<FinishedRecipe> pWriter){
        String folder = "chests/";

        //Oak
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, Blocks.CHEST)
                .define('#', Items.OAK_PLANKS)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .unlockedBy(getHasName(Items.OAK_PLANKS), has(Items.OAK_PLANKS))
                .save(pWriter);
        //Acacia
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_CHEST.get())
                .define('#', Items.ACACIA_PLANKS)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .unlockedBy(getHasName(Items.ACACIA_PLANKS), has(Items.ACACIA_PLANKS))
                .save(pWriter, location(folder + "acacia_chest"));
        //Bamboo
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_CHEST.get())
                .define('#', Items.BAMBOO_PLANKS)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .unlockedBy(getHasName(Items.BAMBOO_PLANKS), has(Items.BAMBOO_PLANKS))
                .save(pWriter, location(folder + "bamboo_chest"));
        //Birch
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_CHEST.get())
                .define('#', Items.BIRCH_PLANKS)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .unlockedBy(getHasName(Items.BIRCH_PLANKS), has(Items.BIRCH_PLANKS))
                .save(pWriter, location(folder + "birch_chest"));
        //Cherry
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_CHEST.get())
                .define('#', Items.CHERRY_PLANKS)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .unlockedBy(getHasName(Items.CHERRY_PLANKS), has(Items.CHERRY_PLANKS))
                .save(pWriter, location(folder + "cherry_chest"));
        //Crimson
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_CHEST.get())
                .define('#', Items.CRIMSON_PLANKS)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .unlockedBy(getHasName(Items.CRIMSON_PLANKS), has(Items.CRIMSON_PLANKS))
                .save(pWriter, location(folder + "crimson_chest"));
        //Dark Oak
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_CHEST.get())
                .define('#', Items.DARK_OAK_PLANKS)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .unlockedBy(getHasName(Items.DARK_OAK_PLANKS), has(Items.DARK_OAK_PLANKS))
                .save(pWriter, location(folder + "dark_oak_chest"));
        //Jungle
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_CHEST.get())
                .define('#', Items.JUNGLE_PLANKS)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .unlockedBy(getHasName(Items.JUNGLE_PLANKS), has(Items.JUNGLE_PLANKS))
                .save(pWriter, location(folder + "jungle_chest"));
        //Mangrove
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_CHEST.get())
                .define('#', Items.MANGROVE_PLANKS)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .unlockedBy(getHasName(Items.MANGROVE_PLANKS), has(Items.MANGROVE_PLANKS))
                .save(pWriter, location(folder + "mangrove_chest"));
        //Spruce
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_CHEST.get())
                .define('#', Items.SPRUCE_PLANKS)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .unlockedBy(getHasName(Items.SPRUCE_PLANKS), has(Items.SPRUCE_PLANKS))
                .save(pWriter, location(folder + "spruce_chest"));
        //Warped
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WARPED_CHEST.get())
                .define('#', Items.WARPED_PLANKS)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .unlockedBy(getHasName(Items.WARPED_PLANKS), has(Items.WARPED_PLANKS))
                .save(pWriter, location(folder + "warped_chest"));
    }

    private void addBarrelsRecipes(Consumer<FinishedRecipe> pWriter){
        String folder = "barrels.json/";
        //Acacia
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_BARREL.get())
                .define('#', Items.ACACIA_PLANKS)
                .define('_', Items.ACACIA_SLAB)
                .pattern("#_#")
                .pattern("# #")
                .pattern("#_#")
                .unlockedBy(getHasName(Items.ACACIA_PLANKS), has(Items.ACACIA_PLANKS))
                .save(pWriter, location(folder + "acacia_barrel"));
        //Bamboo
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_BARREL.get())
                .define('#', Items.BAMBOO_PLANKS)
                .define('_', Items.BAMBOO_SLAB)
                .pattern("#_#")
                .pattern("# #")
                .pattern("#_#")
                .unlockedBy(getHasName(Items.BAMBOO_PLANKS), has(Items.BAMBOO_PLANKS))
                .save(pWriter, location(folder + "bamboo_barrel"));
        //Birch
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_BARREL.get())
                .define('#', Items.BIRCH_PLANKS)
                .define('_', Items.BIRCH_SLAB)
                .pattern("#_#")
                .pattern("# #")
                .pattern("#_#")
                .unlockedBy(getHasName(Items.BIRCH_PLANKS), has(Items.BIRCH_PLANKS))
                .save(pWriter, location(folder + "birch_barrel"));
        //Cherry
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_BARREL.get())
                .define('#', Items.CHERRY_PLANKS)
                .define('_', Items.CHERRY_SLAB)
                .pattern("#_#")
                .pattern("# #")
                .pattern("#_#")
                .unlockedBy(getHasName(Items.CHERRY_PLANKS), has(Items.CHERRY_PLANKS))
                .save(pWriter, location(folder + "cherry_barrel"));
        //Crimson
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_BARREL.get())
                .define('#', Items.CRIMSON_PLANKS)
                .define('_', Items.CRIMSON_SLAB)
                .pattern("#_#")
                .pattern("# #")
                .pattern("#_#")
                .unlockedBy(getHasName(Items.CRIMSON_PLANKS), has(Items.CRIMSON_PLANKS))
                .save(pWriter, location(folder + "crimson_barrel"));
        //Dark Oak
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_BARREL.get())
                .define('#', Items.DARK_OAK_PLANKS)
                .define('_', Items.DARK_OAK_SLAB)
                .pattern("#_#")
                .pattern("# #")
                .pattern("#_#")
                .unlockedBy(getHasName(Items.DARK_OAK_PLANKS), has(Items.DARK_OAK_PLANKS))
                .save(pWriter, location(folder + "dark_oak_barrel"));
        //Jungle
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_BARREL.get())
                .define('#', Items.JUNGLE_PLANKS)
                .define('_', Items.JUNGLE_SLAB)
                .pattern("#_#")
                .pattern("# #")
                .pattern("#_#")
                .unlockedBy(getHasName(Items.JUNGLE_PLANKS), has(Items.JUNGLE_PLANKS))
                .save(pWriter, location(folder + "jungle_barrel"));
        //Mangrove
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_BARREL.get())
                .define('#', Items.MANGROVE_PLANKS)
                .define('_', Items.MANGROVE_SLAB)
                .pattern("#_#")
                .pattern("# #")
                .pattern("#_#")
                .unlockedBy(getHasName(Items.MANGROVE_PLANKS), has(Items.MANGROVE_PLANKS))
                .save(pWriter, location(folder + "mangrove_barrel"));
        //Oak
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.OAK_BARREL.get())
                .define('#', Items.OAK_PLANKS)
                .define('_', Items.OAK_SLAB)
                .pattern("#_#")
                .pattern("# #")
                .pattern("#_#")
                .unlockedBy(getHasName(Items.OAK_PLANKS), has(Items.OAK_PLANKS))
                .save(pWriter, location(folder + "oak_barrel"));
        //Spruce
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, Blocks.BARREL)
                .define('#', Items.SPRUCE_PLANKS)
                .define('_', Items.SPRUCE_SLAB)
                .pattern("#_#")
                .pattern("# #")
                .pattern("#_#")
                .unlockedBy(getHasName(Items.SPRUCE_PLANKS), has(Items.SPRUCE_PLANKS))
                .save(pWriter);
        //Warped
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WARPED_BARREL.get())
                .define('#', Items.WARPED_PLANKS)
                .define('_', Items.WARPED_SLAB)
                .pattern("#_#")
                .pattern("# #")
                .pattern("#_#")
                .unlockedBy(getHasName(Items.WARPED_PLANKS), has(Items.WARPED_PLANKS))
                .save(pWriter, location(folder + "warped_barrel"));
    }

    private static ResourceLocation location(String id) {
        return new ResourceLocation(WoodenCrafts.MOD_ID, id);
    }
}
