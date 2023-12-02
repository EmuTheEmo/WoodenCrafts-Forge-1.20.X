package net.cantloadusername.woodencrafts.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BarrelBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class ModBarrelBlock extends BarrelBlock {
    private final ModBarrelTypes barrelType;

    public ModBarrelBlock(Properties pProperties, ModBarrelTypes barrelType) {
        super(pProperties);
        this.barrelType = barrelType;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return barrelType.getBlockEntity(pPos, pState);
    }

    public ModBarrelTypes getType(){
        return barrelType;
    }
}
