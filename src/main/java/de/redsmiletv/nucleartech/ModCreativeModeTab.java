package de.redsmiletv.nucleartech;


import de.redsmiletv.nucleartech.items.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab TAB_NUCLEARTECH = new CreativeModeTab("nucleartech") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.URANIUM_INGOT.get());
        }
    };

}
