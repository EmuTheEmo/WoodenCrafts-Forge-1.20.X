package net.cantloadusername.woodencrafts;

import com.mojang.logging.LogUtils;
import net.cantloadusername.woodencrafts.block.ModBlocks;
import net.cantloadusername.woodencrafts.container.ModContainers;
import net.cantloadusername.woodencrafts.entity.EntityInitialise;
import net.cantloadusername.woodencrafts.item.ModCreativeModTabs;
import net.cantloadusername.woodencrafts.item.ModItems;
import net.cantloadusername.woodencrafts.renderer.ModChestRenderer;
import net.cantloadusername.woodencrafts.screen.ModCraftingScreen;
import net.cantloadusername.woodencrafts.util.ModPOITypes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(WoodenCrafts.MOD_ID)
public class WoodenCrafts {

    public static final String MOD_ID = "woodencrafts";
    private static final Logger LOGGER = LogUtils.getLogger();

    public WoodenCrafts() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModPOITypes.POI_TYPES.register(modEventBus);

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModContainers.register(modEventBus);

        EntityInitialise.registerBlockEntities();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::registerChestEntityRenders);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void registerChestEntityRenders(EntityRenderersEvent.RegisterRenderers event){
        event.registerBlockEntityRenderer(EntityInitialise.ACACIA_CHEST.get(), ModChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.BAMBOO_CHEST.get(), ModChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.BIRCH_CHEST.get(), ModChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.CHERRY_CHEST.get(), ModChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.CRIMSON_CHEST.get(), ModChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.DARK_OAK_CHEST.get(), ModChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.JUNGLE_CHEST.get(), ModChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.MANGROVE_CHEST.get(), ModChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.SPRUCE_CHEST.get(), ModChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.WARPED_CHEST.get(), ModChestRenderer::new);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            MenuScreens.register(ModContainers.MOD_CRAFTING_CONTAINER.get(), ModCraftingScreen::new);

        }
    }

}