package net.stag.mobularmechanisms.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MOBULAR_MECHANISMS = new CreativeModeTab("mobularmechanismstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FINGER_OF_DEATH.get());
        }
    };
}
