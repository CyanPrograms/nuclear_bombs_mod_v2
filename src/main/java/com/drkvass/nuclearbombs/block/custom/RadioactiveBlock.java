package com.drkvass.nuclearbombs.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockState;

public class RadioactiveBlock extends DropExperienceBlock {
    public RadioactiveBlock(Properties properties, UniformInt of) {
        super(properties);
    }

    @Override
    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
        if (entity instanceof LivingEntity livingentity){
            livingentity.causeFallDamage(7, 1, DamageSource.indirectMagic(entity, entity));
        }
        super.stepOn(level, blockPos, blockState, entity);
    }
}

