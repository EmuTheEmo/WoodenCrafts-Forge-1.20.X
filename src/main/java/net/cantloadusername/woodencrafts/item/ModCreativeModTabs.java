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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ACACIA_STICK.get()))
                    .title(Component.translatable("wc.items_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.ACACIA_CRAFTING_TABLE.get());

                        pOutput.accept(ModBlocks.ACACIA_CRAFTING_TABLE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
