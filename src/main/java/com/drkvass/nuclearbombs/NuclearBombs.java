package com.drkvass.nuclearbombs;

import com.drkvass.nuclearbombs.block.ModBlocks;
import com.drkvass.nuclearbombs.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(NuclearBombs.MOD_ID)
public class NuclearBombs {
    public static final String MOD_ID = "nuclearbombs";
    private static final Logger LOGGER = LogUtils.getLogger();

    public NuclearBombs() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
/*
Raw Uranium
Raw Uranium Ingot (smelting/blasting)
Secure Raw Uranium Ingot (3 Uranium + 3 lead)
Hydrogen Peroxide bottle ([water bottle + glowstown == thick potion] + redstone; BREWING)
Secure Refined Uranium Ingot (1 SRU ingot + 8 H2O2)
Secure Processed Uranium Ingot (SRefinedU ingot -> smelting 1 coal block)
Secure Processed Uranium Block (9 SPU ingots)
Netherite cage (9 Netherite blocks)
Sub-critical Uranium Mass (9 SPU Blocks)
Detonator (9 TNT)
Weapon core ( 4 Netherite cage + 4 detonators + SCUM)
Nuclear bomb ( 8 iron blocks + weapon core)
*/