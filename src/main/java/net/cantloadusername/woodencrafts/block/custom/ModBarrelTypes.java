package net.cantloadusername.woodencrafts.block.custom;

import net.cantloadusername.woodencrafts.entity.EntityInitialise;
import net.cantloadusername.woodencrafts.entity.ModBarrelBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public enum ModBarrelTypes {

    ACACIA,
    BAMBOO,
    BIRCH,
    CHERRY,
    CRIMSON,
    DARK_OAK,
    JUNGLE,
    MANGROVE,
    OAK,
    WARPED,
    ;

    public BlockEntityType<? extends ModBarrelBlockEntity> getBlockEntityType() {
        return switch (this) {
            case ACACIA -> EntityInitialise.ACACIA_BARREL.get();
            case BAMBOO -> EntityInitialise.BAMBOO_BARREL.get();
            case BIRCH -> EntityInitialise.BIRCH_BARREL.get();
            case CHERRY -> EntityInitialise.CHERRY_BARREL.get();
            case CRIMSON -> EntityInitialise.CRIMSON_BARREL.get();
            case DARK_OAK -> EntityInitialise.DARK_OAK_BARREL.get();
            case JUNGLE -> EntityInitialise.JUNGLE_BARREL.get();
            case MANGROVE -> EntityInitialise.MANGROVE_BARREL.get();
            case OAK -> EntityInitialise.OAK_BARREL.get();
            case WARPED -> EntityInitialise.WARPED_BARREL.get();
        };
    }

    public ModBarrelBlockEntity getBlockEntity(BlockPos pos, BlockState state){
        return new ModBarrelBlockEntity(pos, state, this);
    }
}
