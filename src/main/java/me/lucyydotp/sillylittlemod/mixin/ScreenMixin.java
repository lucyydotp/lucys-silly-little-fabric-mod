package me.lucyydotp.sillylittlemod.mixin;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Screen.class)
public class ScreenMixin {
    /**
     * @author Lucy
     * @reason because i can!
     */
    @Overwrite
    public void renderTransparentBackground(GuiGraphics graphics) {
        // Do nothing
    }
}
