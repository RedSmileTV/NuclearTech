package de.redsmiletv.nucleartech.items;

import de.redsmiletv.nucleartech.ModCreativeModeTab;
import de.redsmiletv.nucleartech.NuclearTech;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NuclearTech.MOD_ID);

    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_NUCLEARTECH)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
