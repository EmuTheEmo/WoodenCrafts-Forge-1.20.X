package net.cantloadusername.woodencrafts.entity;

import net.cantloadusername.woodencrafts.block.custom.ModChests;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class ModChestBlockEntity extends ChestBlockEntity {
    private final ModChests type;

    public ModChestBlockEntity(BlockPos pos, BlockState state, ModChests type) {
        this(type.getBlockEntityType(), pos, state, type);
    }

    public ModChestBlockEntity(BlockEntityType<?> blockEntityType, BlockPos pos, BlockState state, ModChests type) {
        super(blockEntityType, pos, state);
        this.type = type;
    }

    public ModChests getChestType() {
        return type;
    }

    @Override
    public @NotNull Component getDefaultName() {
        return Component.translatable("container.woodencrafts." + type.name().toLowerCase() + "_chest");
    }

}
