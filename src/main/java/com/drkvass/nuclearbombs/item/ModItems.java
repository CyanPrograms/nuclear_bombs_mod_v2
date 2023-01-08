package com.drkvass.nuclearbombs.item;

import com.drkvass.nuclearbombs.NuclearBombs;
import com.drkvass.nuclearbombs.item.custom.RadioactiveItem;
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
    public static final RegistryObject<Item> URANIUM = ITEMS.register("uranium",
            () -> new RadioactiveItem(new Item.Properties().tab(ModCreativeModeTab.NUCLEARBOMBS_TAB)));
    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium",
            () -> new RadioactiveItem(new Item.Properties().tab(ModCreativeModeTab.NUCLEARBOMBS_TAB)));
        public static final RegistryObject<Item> SECURE_URANIUM = ITEMS.register("secure_uranium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NUCLEARBOMBS_TAB)));
    public static final RegistryObject<Item> HYDROGEN_PEROXIDE = ITEMS.register("hydrogen_peroxide",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NUCLEARBOMBS_TAB).stacksTo(16)));
    public static final RegistryObject<Item> REFINED_URANIUM = ITEMS.register("refined_uranium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NUCLEARBOMBS_TAB)));
    public static final RegistryObject<Item> PROCESSED_URANIUM = ITEMS.register("processed_uranium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NUCLEARBOMBS_TAB)));
    public static final RegistryObject<Item> NETHERITE_CAGE = ITEMS.register("netherite_cage",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NUCLEARBOMBS_TAB)));
    public static final RegistryObject<Item> SCUM = ITEMS.register("scum",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NUCLEARBOMBS_TAB)));
    public static final RegistryObject<Item> DETONATOR = ITEMS.register("detonator",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NUCLEARBOMBS_TAB)));
    public static final RegistryObject<Item> WEAPON_CORE = ITEMS.register("weapon_core",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NUCLEARBOMBS_TAB)));


    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NUCLEARBOMBS_TAB)));
    public static final RegistryObject<Item> LEAD = ITEMS.register("lead",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NUCLEARBOMBS_TAB)));


    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new RadioactiveItem(new Item.Properties().tab(ModCreativeModeTab.NUCLEARBOMBS_TAB).stacksTo(1)));


    public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);

    }
}
/*
Raw Uranium ITEM
Raw Uranium Ingot (smelting/blasting) ITEM
Secure Raw Uranium Ingot (3 Uranium + 3 lead) ITEM
Hydrogen Peroxide bottle ([water bottle + glowstown == thick potion] + redstone; BREWING) ITEM
Secure Refined Uranium Ingot (1 SRU ingot + 8 H2O2) ITEM
Secure Processed Uranium Ingot (SRefinedU ingot -> smelting 1 coal block) ITEM
Secure Processed Uranium Block (9 SPU ingots) BLOCK
Netherite cage (9 Netherite blocks) ITEM
Sub-critical Uranium Mass (9 SPU Blocks) ITEM
Detonator (9 TNT) ITEM
Weapon core ( 4 Netherite cage + 4 detonators + SCUM) ITEM
Nuclear bomb ( 8 iron blocks + weapon core) BLOCK

Lead Ore
Lead Block
Lead Ingot
Raw Lead
*/