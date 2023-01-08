package com.drkvass.nuclearbombs.item.custom;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class RadioactiveItem extends Item {
    public RadioactiveItem(Properties properties) {
        super(properties);
    }

    /*@Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand  hand) {
        //if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
        //    outputRandomNumber(player);
        //    player.getCooldowns().addCooldown(this, 20);
        //}


        return super.use(level, player, hand);
    }*/

    @Override
    public void inventoryTick(ItemStack ItemS, Level level, Entity entity, int Int, boolean bool) {
        if (entity instanceof Player);
            entity.causeFallDamage(7, 1, DamageSource.indirectMagic(entity, entity));

        super.inventoryTick(ItemS, level, entity, Int, bool);

}

    /*private void outputRandomNumber(Player player) {
        player.sendSystemMessage(Component.literal("Your number is: " + getRandomNumber() ));
    }*/

    /*private int getRandomNumber() {
        return RandomSource.createNewThreadLocalInstance().nextInt(10);
    }
    */
}
