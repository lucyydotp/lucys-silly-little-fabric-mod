package net.lucypoulton.transparentbackground.mixin;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Screen.class)
public class ScreenMixin {
    @Inject(
            at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screen/Screen;fillGradient(Lnet/minecraft/client/util/math/MatrixStack;IIIIII)V"),
            method = "renderBackground(Lnet/minecraft/client/util/math/MatrixStack;I)V",
            cancellable = true
    )
    public void renderBackground(MatrixStack matrices, int vOffset, CallbackInfo ci) {
        ci.cancel();
    }
}
