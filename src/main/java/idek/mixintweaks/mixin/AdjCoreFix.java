package idek.mixintweaks.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.gui.GuiMainMenu;

@Mixin(targets = "Reika/ChromatiCraft/Base/TileEntity/TileEntityWirelessPowered", remap=false)
public abstract class AdjCoreFix {

    @Inject(method="calcEfficiency", at=@At("HEAD"), cancellable=true)
    public void calcEfficiency(CallbackInfo info) {
        // System.out.println("IDEK Mixin Tweaks calcEfficiency cancelled");
        info.cancel();
        // this.efficiencyBoost = adjacency.getAdjacentUpgrade(this);
    }
}
