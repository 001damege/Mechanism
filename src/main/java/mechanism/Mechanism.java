package mechanism;

import mechanism.registries.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(Mechanism.MODID)
public class Mechanism {
    public static final String MODID = "mechanism";
    public static final Logger LOGGER = LoggerFactory.getLogger("Mechanism");

    public Mechanism() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(modEventBus);
        ModGroups.TAB.register(modEventBus);
        ModFluids.FLUIDS.register(modEventBus);
        ModGases.GASES.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    public static ResourceLocation rl(String path) {
        return new ResourceLocation(MODID, path);
    }
}
