package idek.mixintweaks;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = IDEKMixinTweaks.MODID, version = IDEKMixinTweaks.VERSION)
public class IDEKMixinTweaks
{
    public static final String MODID = "idekmixintweaks";
    public static final String VERSION = "0.0.1";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("IDEK Mixin Tweaks initialized!");
    }
}
