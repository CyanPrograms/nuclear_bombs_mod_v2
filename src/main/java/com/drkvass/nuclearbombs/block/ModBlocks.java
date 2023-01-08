package com.drkvass.nuclearbombs.block;

import com.drkvass.nuclearbombs.NuclearBombs;
import com.drkvass.nuclearbombs.block.custom.NukeBlock;
import com.drkvass.nuclearbombs.block.custom.RadioactiveBlock;
import com.drkvass.nuclearbombs.item.ModCreativeModeTab;
import com.drkvass.nuclearbombs.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, NuclearBombs.MOD_ID);

    public static final  RegistryObject<Block> SECURE_URANIUM_BLOCK = registerBlock("uranium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.NUCLEARBOMBS_TAB);

    public static final  RegistryObject<Block> PROCESSED_URANIUM_BLOCK = registerBlock("processed_uranium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.NUCLEARBOMBS_TAB);

    public static final  RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.NUCLEARBOMBS_TAB);

    public static final  RegistryObject<Block> URANIUM_ORE = registerBlock("uranium_ore",
            () -> new RadioactiveBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)),
            ModCreativeModeTab.NUCLEARBOMBS_TAB);

    public static final  RegistryObject<Block> DEEPSLATE_URANIUM_ORE = registerBlock("deepslate_uranium_ore",
            () -> new RadioactiveBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)),
            ModCreativeModeTab.NUCLEARBOMBS_TAB);
    public static final  RegistryObject<Block> LEAD_ORE = registerBlock("lead_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL)
            .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)),
            ModCreativeModeTab.NUCLEARBOMBS_TAB);

    public static final  RegistryObject<Block> DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL)
            .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)),
            ModCreativeModeTab.NUCLEARBOMBS_TAB);

    public static final  RegistryObject<Block> NUCLEAR_WEAPON = registerBlock("nuclear_weapon",
            () -> new NukeBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.NUCLEARBOMBS_TAB);





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<BlockItem> registerBlockItem(String name, RegistryObject<T> block,
                                                                                 CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
