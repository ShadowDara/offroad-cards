package de.shadowdara.offroadcars.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_HELMET)
                .pattern("ASX")
                .pattern("SBX")
                .pattern("SXX")
                .input('A', Items.BLACK_CONCRETE)
                .input('B', Items.COAL)
                .input('S', Items.IRON_INGOT)
                .input('X', Items.IRON_BLOCK)
                .criterion("has_copper_ingot", conditionsFromItem(Items.EMPTY_CANISTER))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_HELMET)
                .pattern("SX")
                .input('S', Items.EMPTY_CANISTER)
                .input('X', Items.COAL_BLOCK)
                .criterion("has_copper_ingot", conditionsFromItem(Items.FUEL_CANISTER))
                .offerTo(exporter);
    }
}
