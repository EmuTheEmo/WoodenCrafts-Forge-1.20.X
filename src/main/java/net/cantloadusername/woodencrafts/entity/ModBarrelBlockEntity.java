package net.cantloadusername.woodencrafts.entity;

import net.cantloadusername.woodencrafts.block.custom.ModBarrelTypes;
import net.cantloadusername.woodencrafts.block.custom.ModChests;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.entity.BarrelBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class ModBarrelBlockEntity extends BarrelBlockEntity {
    private final ModBarrelTypes type;

    public ModBarrelBlockEntity(BlockPos pos, BlockState state, ModBarrelTypes type) {
        this(type.getBlockEntityType(), pos, state, type);
    }

    public ModBarrelBlockEntity(BlockEntityType<?> blockEntityType, BlockPos pos, BlockState state, ModBarrelTypes type) {
        super(pos, state);
        this.type = type;
    }

    @Override
    public @NotNull Component getDefaultName() {
        return Component.translatable("container.woodencrafts." + type.name().toLowerCase() + "_barrel");
    }
}
