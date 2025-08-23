package de.shadowdara.offroadcars.item;

import de.shadowdara.offroadcars.OffroadCars;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item FUEL_CANISTER = registerItem("fuel_canister", new Item(new Item.Settings()));
    public static final Item EMPTY_CANISTER = registerItem("empty_canister", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(OffroadCars.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OffroadCars.LOGGER.info("Registering ModItems for "+ OffroadCars.MOD_ID);
    }
}
