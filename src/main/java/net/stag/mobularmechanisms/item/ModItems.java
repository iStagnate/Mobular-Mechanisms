package net.stag.mobularmechanisms.item;


import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.stag.mobularmechanisms.MobularMechanisms;
import net.stag.mobularmechanisms.item.custom.VoodooDollItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MobularMechanisms.MOD_ID);

    //ores and ingots
    public static final RegistryObject<Item> MOBIUS_INGOT = ITEMS.register("mobius_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOBULAR_MECHANISMS)));

    public static final RegistryObject<Item> RAW_MOBIUS = ITEMS.register("raw_mobius",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOBULAR_MECHANISMS)));
    //gadgets
    public static final RegistryObject<Item> FINGER_OF_DEATH = ITEMS.register("finger_of_death",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOBULAR_MECHANISMS)));

    public static final RegistryObject<Item> VOODOO_DOLL = ITEMS.register("voodoo_doll",
            () -> new VoodooDollItem(new Item.Properties().tab(ModCreativeModeTab.MOBULAR_MECHANISMS).stacksTo(1)));

    //other



    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
