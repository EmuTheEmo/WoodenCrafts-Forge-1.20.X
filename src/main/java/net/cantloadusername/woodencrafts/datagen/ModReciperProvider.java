package net.cantloadusername.woodencrafts.datagen;

import net.cantloadusername.woodencrafts.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModReciperProvider extends RecipeProvider implements IConditionBuilder {

    public ModReciperProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        twoByTwoPacker(pWriter, RecipeCategory.MISC, ModBlocks.ACACIA_CRAFTING_TABLE.get(), Items.ACACIA_PLANKS);
    }


}
