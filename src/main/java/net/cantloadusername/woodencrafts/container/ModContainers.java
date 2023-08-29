package net.cantloadusername.woodencrafts.container;

import net.cantloadusername.woodencrafts.WoodenCrafts;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModContainers {
    public static DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, WoodenCrafts.MOD_ID);

    public static final RegistryObject<MenuType<ModCraftingTableMenu>> MOD_CRAFTING_CONTAINER
            = MENUS.register("mod_crafting_container",
            () -> IForgeMenuType.create(((windowId, inv, data) -> {
                return new ModCraftingTableMenu(windowId, inv);
            })));

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
