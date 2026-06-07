package yoink.nanobatch.always_show_debug_info.mixin;
import net.minecraft.client.gui.components.debug.DebugScreenEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
@Mixin(DebugScreenEntry.class)
public interface GameRulesMixin {
    @Inject(method = "isAllowed", at = @At("HEAD"), cancellable = true)
    private void alwaysAllow(boolean reducedDebugInfo, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}