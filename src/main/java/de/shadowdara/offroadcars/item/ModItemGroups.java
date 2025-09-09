package de.shadowdara.offroadcars.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import de.shadowdara.offroadcars.OffroadCars;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup OFFROADCARS_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(OffroadCars.MOD_ID, "offroadcars_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.FUEL_CANISTER))
                    .displayName(Text.translatable("itemgroup.offroadcars.offroadcars_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.EMPTY_CANISTER);
                        entries.add(ModItems.FUEL_CANISTER);
                    }).build());

    public static void registerItemGroups() {
        OffroadCars.LOGGER.info("Registering Item Groups for " + OffroadCars.MOD_ID);
    }
}
