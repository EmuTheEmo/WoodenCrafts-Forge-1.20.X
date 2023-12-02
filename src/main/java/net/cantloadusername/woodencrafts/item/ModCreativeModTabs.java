package net.cantloadusername.woodencrafts.item;

import net.cantloadusername.woodencrafts.WoodenCrafts;
import net.cantloadusername.woodencrafts.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WoodenCrafts.MOD_ID);

    public static final RegistryObject<CreativeModeTab> WOODENCRAFTS_ITEMS = CREATIVE_MODE_TABS.register("woodencrafts_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ACACIA_CRAFTING_TABLE.get()))
                    .title(Component.translatable("wc.items_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModBlocks.ACACIA_BARREL.get());
                        pOutput.accept(ModBlocks.BAMBOO_BARREL.get());
                        pOutput.accept(ModBlocks.BIRCH_BARREL.get());
                        pOutput.accept(ModBlocks.CHERRY_BARREL.get());
                        pOutput.accept(ModBlocks.CRIMSON_BARREL.get());
                        pOutput.accept(ModBlocks.DARK_OAK_BARREL.get());
                        pOutput.accept(ModBlocks.JUNGLE_BARREL.get());
                        pOutput.accept(ModBlocks.MANGROVE_BARREL.get());
                        pOutput.accept(ModBlocks.OAK_BARREL.get());
                        pOutput.accept(ModBlocks.WARPED_BARREL.get());

                        pOutput.accept(ModBlocks.ACACIA_CRAFTING_TABLE.get());
                        pOutput.accept(ModBlocks.BAMBOO_CRAFTING_TABLE.get());
                        pOutput.accept(ModBlocks.BIRCH_CRAFTING_TABLE.get());
                        pOutput.accept(ModBlocks.CHERRY_CRAFTING_TABLE.get());
                        pOutput.accept(ModBlocks.CRIMSON_CRAFTING_TABLE.get());
                        pOutput.accept(ModBlocks.DARK_OAK_CRAFTING_TABLE.get());
                        pOutput.accept(ModBlocks.JUNGLE_CRAFTING_TABLE.get());
                        pOutput.accept(ModBlocks.MANGROVE_CRAFTING_TABLE.get());
                        pOutput.accept(ModBlocks.SPRUCE_CRAFTING_TABLE.get());
                        pOutput.accept(ModBlocks.WARPED_CRAFTING_TABLE.get());

                        pOutput.accept(ModBlocks.ACACIA_CHEST.get());
                        pOutput.accept(ModBlocks.BAMBOO_CHEST.get());
                        pOutput.accept(ModBlocks.BIRCH_CHEST.get());
                        pOutput.accept(ModBlocks.CHERRY_CHEST.get());
                        pOutput.accept(ModBlocks.CRIMSON_CHEST.get());
                        pOutput.accept(ModBlocks.DARK_OAK_CHEST.get());
                        pOutput.accept(ModBlocks.JUNGLE_CHEST.get());
                        pOutput.accept(ModBlocks.MANGROVE_CHEST.get());
                        pOutput.accept(ModBlocks.SPRUCE_CHEST.get());
                        pOutput.accept(ModBlocks.WARPED_CHEST.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
