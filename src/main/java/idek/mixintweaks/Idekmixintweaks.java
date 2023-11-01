package idek.mixintweaks;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Idekmixintweaks.MODID, version = Idekmixintweaks.VERSION)
public class Idekmixintweaks
{
    public static final String MODID = "idekmixintweaks";
    public static final String VERSION = "@VERSION@";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("IDEK Mixin Tweaks initialized!");
    }
}
