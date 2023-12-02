package net.cantloadusername.woodencrafts.entity;

import net.cantloadusername.woodencrafts.WoodenCrafts;
import net.cantloadusername.woodencrafts.block.ModBlocks;
import net.cantloadusername.woodencrafts.block.custom.ModBarrelTypes;
import net.cantloadusername.woodencrafts.block.custom.ModChests;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = WoodenCrafts.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityInitialise {

    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, WoodenCrafts.MOD_ID);

    //<editor-fold desc="Chests">
    public static final RegistryObject<BlockEntityType<ModChestBlockEntity>> ACACIA_CHEST =
            BLOCK_ENTITIES.register("acacia_chest", () ->
                    BlockEntityType.Builder.of((pos, state)-> new ModChestBlockEntity(
                                    pos, state, ModChests.ACACIA),
                            ModBlocks.ACACIA_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModChestBlockEntity>> BAMBOO_CHEST =
            BLOCK_ENTITIES.register("bamboo_chest", () ->
                    BlockEntityType.Builder.of((pos, state)-> new ModChestBlockEntity(
                                    pos, state, ModChests.BAMBOO),
                            ModBlocks.BAMBOO_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModChestBlockEntity>> BIRCH_CHEST =
            BLOCK_ENTITIES.register("birch_chest", () ->
                    BlockEntityType.Builder.of((pos, state)-> new ModChestBlockEntity(
                                    pos, state, ModChests.BIRCH),
                            ModBlocks.BIRCH_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModChestBlockEntity>> CHERRY_CHEST =
            BLOCK_ENTITIES.register("cherry_chest", () ->
                    BlockEntityType.Builder.of((pos, state)-> new ModChestBlockEntity(
                                    pos, state, ModChests.CHERRY),
                            ModBlocks.CHERRY_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModChestBlockEntity>> CRIMSON_CHEST =
            BLOCK_ENTITIES.register("crimson_chest", () ->
                    BlockEntityType.Builder.of((pos, state)-> new ModChestBlockEntity(
                                    pos, state, ModChests.CRIMSON),
                            ModBlocks.CRIMSON_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModChestBlockEntity>> DARK_OAK_CHEST =
            BLOCK_ENTITIES.register("dark_oak_chest", () ->
                    BlockEntityType.Builder.of((pos, state)-> new ModChestBlockEntity(
                                    pos, state, ModChests.DARK_OAK),
                            ModBlocks.DARK_OAK_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModChestBlockEntity>> JUNGLE_CHEST =
            BLOCK_ENTITIES.register("jungle_chest", () ->
                    BlockEntityType.Builder.of((pos, state)-> new ModChestBlockEntity(
                                    pos, state, ModChests.JUNGLE),
                            ModBlocks.JUNGLE_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModChestBlockEntity>> MANGROVE_CHEST =
            BLOCK_ENTITIES.register("mangrove_chest", () ->
                    BlockEntityType.Builder.of((pos, state)-> new ModChestBlockEntity(
                                    pos, state, ModChests.MANGROVE),
                            ModBlocks.MANGROVE_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModChestBlockEntity>> SPRUCE_CHEST =
            BLOCK_ENTITIES.register("spruce_chest", () ->
                    BlockEntityType.Builder.of((pos, state)-> new ModChestBlockEntity(
                                    pos, state, ModChests.SPRUCE),
                            ModBlocks.SPRUCE_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModChestBlockEntity>> WARPED_CHEST =
            BLOCK_ENTITIES.register("warped_chest", () ->
                    BlockEntityType.Builder.of((pos, state)-> new ModChestBlockEntity(
                                    pos, state, ModChests.WARPED),
                            ModBlocks.WARPED_CHEST.get()).build(null));
    //</editor-fold>

    //<editor-fold desc="Barrels">
    public static final RegistryObject<BlockEntityType<ModBarrelBlockEntity>> ACACIA_BARREL =
            BLOCK_ENTITIES.register("acacia_barrel", () ->
                    BlockEntityType.Builder.of((pPos, pState) -> new ModBarrelBlockEntity(
                                    pPos, pState, ModBarrelTypes.ACACIA),
                            ModBlocks.ACACIA_BARREL.get()).build(null));
    public static final RegistryObject<BlockEntityType<ModBarrelBlockEntity>> BAMBOO_BARREL =
            BLOCK_ENTITIES.register("bamboo_barrel", () ->
                    BlockEntityType.Builder.of((pPos, pState) -> new ModBarrelBlockEntity(
                                    pPos, pState, ModBarrelTypes.BAMBOO),
                            ModBlocks.BAMBOO_BARREL.get()).build(null));
    public static final RegistryObject<BlockEntityType<ModBarrelBlockEntity>> BIRCH_BARREL =
            BLOCK_ENTITIES.register("birch_barrel", () ->
                    BlockEntityType.Builder.of((pPos, pState) -> new ModBarrelBlockEntity(
                                    pPos, pState, ModBarrelTypes.BIRCH),
                            ModBlocks.BIRCH_BARREL.get()).build(null));
    public static final RegistryObject<BlockEntityType<ModBarrelBlockEntity>> CHERRY_BARREL =
            BLOCK_ENTITIES.register("cherry_barrel", () ->
                    BlockEntityType.Builder.of((pPos, pState) -> new ModBarrelBlockEntity(
                                    pPos, pState, ModBarrelTypes.CHERRY),
                            ModBlocks.CHERRY_BARREL.get()).build(null));
    public static final RegistryObject<BlockEntityType<ModBarrelBlockEntity>> CRIMSON_BARREL =
            BLOCK_ENTITIES.register("crimson_barrel", () ->
                    BlockEntityType.Builder.of((pPos, pState) -> new ModBarrelBlockEntity(
                                    pPos, pState, ModBarrelTypes.CRIMSON),
                            ModBlocks.CRIMSON_BARREL.get()).build(null));
    public static final RegistryObject<BlockEntityType<ModBarrelBlockEntity>> DARK_OAK_BARREL =
            BLOCK_ENTITIES.register("dark_oak_barrel", () ->
                    BlockEntityType.Builder.of((pPos, pState) -> new ModBarrelBlockEntity(
                                    pPos, pState, ModBarrelTypes.DARK_OAK),
                            ModBlocks.DARK_OAK_BARREL.get()).build(null));
    public static final RegistryObject<BlockEntityType<ModBarrelBlockEntity>> JUNGLE_BARREL =
            BLOCK_ENTITIES.register("jungle_barrel", () ->
                    BlockEntityType.Builder.of((pPos, pState) -> new ModBarrelBlockEntity(
                                    pPos, pState, ModBarrelTypes.JUNGLE),
                            ModBlocks.MANGROVE_BARREL.get()).build(null));
    public static final RegistryObject<BlockEntityType<ModBarrelBlockEntity>> MANGROVE_BARREL =
            BLOCK_ENTITIES.register("mangrove_barrel", () ->
                    BlockEntityType.Builder.of((pPos, pState) -> new ModBarrelBlockEntity(
                                    pPos, pState, ModBarrelTypes.MANGROVE),
                            ModBlocks.OAK_BARREL.get()).build(null));
    public static final RegistryObject<BlockEntityType<ModBarrelBlockEntity>> OAK_BARREL =
            BLOCK_ENTITIES.register("oak_barrel", () ->
                    BlockEntityType.Builder.of((pPos, pState) -> new ModBarrelBlockEntity(
                                    pPos, pState, ModBarrelTypes.OAK),
                            ModBlocks.WARPED_BARREL.get()).build(null));
    public static final RegistryObject<BlockEntityType<ModBarrelBlockEntity>> WARPED_BARREL =
            BLOCK_ENTITIES.register("warped_barrel", () ->
                    BlockEntityType.Builder.of((pPos, pState) -> new ModBarrelBlockEntity(
                                    pPos, pState, ModBarrelTypes.WARPED),
                            ModBlocks.ACACIA_BARREL.get()).build(null));
    //</editor-fold>

    public static void registerBlockEntities() {
        BLOCK_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}

