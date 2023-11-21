package net.cantloadusername.woodencrafts.block.custom;

import net.cantloadusername.woodencrafts.entity.EntityInitialise;
import net.cantloadusername.woodencrafts.entity.ModChestBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public enum ModChests {

    ACACIA,
    BAMBOO,
    BIRCH,
    CHERRY,
    CRIMSON,
    DARK_OAK,
    JUNGLE,
    MANGROVE,
    SPRUCE,
    WARPED,
    ;

    public BlockEntityType<? extends ModChestBlockEntity> getBlockEntityType() {
        return switch (this) {
            case ACACIA -> EntityInitialise.ACACIA_CHEST.get();
            case BAMBOO -> EntityInitialise.BAMBOO_CHEST.get();
            case BIRCH -> EntityInitialise.BIRCH_CHEST.get();
            case CHERRY -> EntityInitialise.CHERRY_CHEST.get();
            case CRIMSON -> EntityInitialise.CRIMSON_CHEST.get();
            case DARK_OAK -> EntityInitialise.DARK_OAK_CHEST.get();
            case JUNGLE -> EntityInitialise.JUNGLE_CHEST.get();
            case MANGROVE -> EntityInitialise.MANGROVE_CHEST.get();
            case SPRUCE -> EntityInitialise.SPRUCE_CHEST.get();
            case WARPED -> EntityInitialise.WARPED_CHEST.get();
        };
    }

    public ModChestBlockEntity getBlockEntity(BlockPos pos, BlockState state) {
        return new ModChestBlockEntity(pos, state, this);
    }
}
