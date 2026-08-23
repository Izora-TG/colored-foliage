package sofia.foliage.datagen;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureMap;
import net.minecraft.block.Blocks;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import java.util.concurrent.CompletableFuture;
import net.minecraft.registry.RegistryWrapper;

public class TestLootProvider extends FabricBlockLootTableProvider {
    public TestLootProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }
    @Override
    public void generate() {
    }
}
