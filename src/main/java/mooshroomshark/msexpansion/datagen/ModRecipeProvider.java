package mooshroomshark.msexpansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.MISC, Blocks.SPAWNER)
                        .pattern("#E#")
                        .pattern("#B#")
                        .pattern("#E#")
                        .input('#', Items.IRON_BARS)
                        .input('E',Items.END_CRYSTAL)
                        .input('B', Items.BEACON)
                        .criterion(hasItem(Items.BEACON), conditionsFromItem(Items.BEACON))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Blocks.TRIAL_SPAWNER)
                        .pattern("cEc")
                        .pattern("IBI")
                        .pattern("RER")
                        .input('c', Items.COPPER_INGOT)
                        .input('E', Items.END_CRYSTAL)
                        .input('I', Items.IRON_BARS)
                        .input('R', Items.REDSTONE)
                        .input('B', Items.BEACON)
                        .criterion(hasItem(Items.BEACON), conditionsFromItem(Items.BEACON))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Blocks.VAULT)
                        .pattern("cgc")
                        .pattern("IBI")
                        .pattern("RER")
                        .input('c', Items.COPPER_INGOT)
                        .input('E', Items.END_CRYSTAL)
                        .input('I', Items.IRON_BARS)
                        .input('R', Items.REDSTONE)
                        .input('B', Items.BEACON)
                        .input('g', Items.GOLD_INGOT)
                        .criterion(hasItem(Items.BEACON), conditionsFromItem(Items.BEACON))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.ZOMBIE_SPAWN_EGG)
                        .pattern("#Z#")
                        .pattern("#N#")
                        .pattern("GGG")
                        .input('#', Items.ROTTEN_FLESH)
                        .input('Z', Items.ZOMBIE_HEAD)
                        .input('N', Items.NETHER_STAR)
                        .input('G', Items.GHAST_TEAR)
                        .criterion(hasItem(Items.GHAST_TEAR), conditionsFromItem(Items.GHAST_TEAR))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.SKELETON_SPAWN_EGG)
                        .pattern("#S#")
                        .pattern("#N#")
                        .pattern("GGG")
                        .input('#', Items.BONE)
                        .input('S', Items.SKELETON_SKULL)
                        .input('N', Items.NETHER_STAR)
                        .input('G', Items.GHAST_TEAR)
                        .criterion(hasItem(Items.GHAST_TEAR), conditionsFromItem(Items.GHAST_TEAR))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.SPIDER_SPAWN_EGG)
                        .pattern("#S#")
                        .pattern("#N#")
                        .pattern("GGG")
                        .input('#', Items.STRING)
                        .input('S', Items.SPIDER_EYE)
                        .input('N', Items.NETHER_STAR)
                        .input('G', Items.GHAST_TEAR)
                        .criterion(hasItem(Items.GHAST_TEAR), conditionsFromItem(Items.GHAST_TEAR))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.CREEPER_SPAWN_EGG)
                        .pattern("#C#")
                        .pattern("#N#")
                        .pattern("GGG")
                        .input('#', Items.GUNPOWDER)
                        .input('C', Items.CREEPER_HEAD)
                        .input('N', Items.NETHER_STAR)
                        .input('G', Items.GHAST_TEAR)
                        .criterion(hasItem(Items.GHAST_TEAR), conditionsFromItem(Items.GHAST_TEAR))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.ENDERMAN_SPAWN_EGG)
                        .pattern("#E#")
                        .pattern("#N#")
                        .pattern("GGG")
                        .input('#', Items.ENDER_PEARL)
                        .input('E', Items.ENDER_EYE)
                        .input('N', Items.NETHER_STAR)
                        .input('G', Items.GHAST_TEAR)
                        .criterion(hasItem(Items.GHAST_TEAR), conditionsFromItem(Items.GHAST_TEAR))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.SLIME_SPAWN_EGG)
                        .pattern("#S#")
                        .pattern("#N#")
                        .pattern("GGG")
                        .input('#', Items.SLIME_BALL)
                        .input('S', Items.SLIME_BLOCK)
                        .input('N', Items.NETHER_STAR)
                        .input('G', Items.GHAST_TEAR)
                        .criterion(hasItem(Items.GHAST_TEAR), conditionsFromItem(Items.GHAST_TEAR))
                        .offerTo(exporter);


            }
        };
    }

    @Override
    public String getName() {
        return "MoshroomShark's Expansion Recipes";
    }

}
