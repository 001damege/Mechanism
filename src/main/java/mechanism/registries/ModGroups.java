package mechanism.registries;

import mechanism.Mechanism;
import mekanism.common.registration.impl.CreativeTabDeferredRegister;
import mekanism.common.registration.impl.CreativeTabRegistryObject;
import mekanism.common.registries.MekanismCreativeTabs;

public class ModGroups {
    public static final CreativeTabDeferredRegister TAB = new CreativeTabDeferredRegister(Mechanism.MODID);

    public static final CreativeTabRegistryObject MECHANISM = TAB.registerMain(ModLang.MECHANISM, ModItems.NEUTRONIUM, builder ->
            builder.withBackgroundLocation(Mechanism.rl("textures/gui/creative_tab.png"))
                    .withSearchBar(70)
                    .withTabsBefore(MekanismCreativeTabs.MEKANISM.key())
                    .displayItems((display, output) -> {
                        CreativeTabDeferredRegister.addToDisplay(ModItems.ITEMS, output);
                    }));
}
