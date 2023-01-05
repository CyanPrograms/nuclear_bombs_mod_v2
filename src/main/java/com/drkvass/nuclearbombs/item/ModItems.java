package com.drkvass.nuclearbombs.item;

import com.drkvass.nuclearbombs.NuclearBombs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NuclearBombs.MOD_ID);

    //ITEM TEMPLATE #1:
    //public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
    //        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NUCLEARBOMBS_TAB)));
    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NUCLEARBOMBS_TAB)));



    public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);

    }
}
