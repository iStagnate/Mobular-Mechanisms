package net.stag.mobularmechanisms.block;

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
import net.stag.mobularmechanisms.MobularMechanisms;
import net.stag.mobularmechanisms.block.custom.LifeBlock;
import net.stag.mobularmechanisms.item.ModCreativeModeTab;
import net.stag.mobularmechanisms.item.ModItems;

import java.rmi.registry.Registry;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MobularMechanisms.MOD_ID);

//mobius ore related blocks
    public static final RegistryObject<Block> MOBIUS_BLOCK = registerBlock("mobius_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MOBULAR_MECHANISMS);
    public static final RegistryObject<Block> MOBIUS_ORE = registerBlock("mobius_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3,7)), ModCreativeModeTab.MOBULAR_MECHANISMS);
    public static final RegistryObject<Block> DEEPSLATE_MOBIUS_ORE = registerBlock("deepslate_mobius_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MOBULAR_MECHANISMS);
    public static final RegistryObject<Block> RAW_MOBIUS_BLOCK = registerBlock("raw_mobius_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MOBULAR_MECHANISMS);
//gadget blocks
public static final RegistryObject<Block> LIFE_BLOCK = registerBlock("life_block",
        () -> new LifeBlock(BlockBehaviour.Properties.of(Material.METAL)
                .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MOBULAR_MECHANISMS);
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
            public static void register(IEventBus eventBus) {
                BLOCKS.register(eventBus);
            }
}
