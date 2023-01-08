package com.drkvass.nuclearbombs.block.custom;

import com.drkvass.nuclearbombs.block.entint.PrimedNuke;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.TntBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import oshi.jna.platform.mac.SystemB;

public class NukeBlock extends TntBlock {

    public NukeBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult res) {
        if (!level.isClientSide && hand == InteractionHand.MAIN_HAND);

        return super.use(state, level, pos, player, hand, res);
    }
}