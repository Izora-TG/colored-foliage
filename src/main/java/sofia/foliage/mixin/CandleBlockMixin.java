package sofia.foliage.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.CandleBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CandleBlock.class)
public class CandleBlockMixin {
    @Inject(method = "canPlaceAt", at = @At("HEAD"), cancellable = true)
    private void coloredFoliage$allowUnsupportedPlacement(
            BlockState state, WorldView world, BlockPos pos, CallbackInfoReturnable<Boolean> cir
    ) {
        cir.setReturnValue(true);
    }
}
