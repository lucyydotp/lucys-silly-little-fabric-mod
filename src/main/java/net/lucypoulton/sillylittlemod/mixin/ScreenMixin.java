package net.lucypoulton.sillylittlemod.mixin;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Screen.class)
public class ScreenMixin {
    @Overwrite
    public void renderTransparentBackground(GuiGraphics graphics) {
        // Do nothing
    }
}
