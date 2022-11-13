package net.stag.mobularmechanisms.item;


import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.stag.mobularmechanisms.MobularMechanisms;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MobularMechanisms.MOD_ID);

    //ores
    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOBULAR_MECHANISMS)));
    public static final RegistryObject<Item> FINGER_OF_DEATH = ITEMS.register("finger_of_death",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOBULAR_MECHANISMS)));
    //gadgets
    //other


    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
