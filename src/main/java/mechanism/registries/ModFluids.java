package mechanism.registries;

import mechanism.Mechanism;
import mekanism.common.registration.impl.FluidDeferredRegister;
import mekanism.common.registration.impl.FluidDeferredRegister.MekanismFluidType;
import mekanism.common.registration.impl.FluidRegistryObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraftforge.fluids.ForgeFlowingFluid.Flowing;
import net.minecraftforge.fluids.ForgeFlowingFluid.Source;

public class ModFluids {
    public static final FluidDeferredRegister FLUIDS = new FluidDeferredRegister(Mechanism.MODID);

    public static final FluidRegistryObject<MekanismFluidType, Source, Flowing, LiquidBlock, BucketItem> BROMINE; // 臭素
    public static final FluidRegistryObject<MekanismFluidType, Source, Flowing, LiquidBlock, BucketItem> FRANCIUM; // フランシウム

    static {
        BROMINE = FLUIDS.register("bromine", props -> props.texture(new ResourceLocation("block/water_still"), new ResourceLocation("block/water_flow")).tint(0xf2441f));
        FRANCIUM = FLUIDS.register("francium", props -> props.texture(new ResourceLocation("block/water_still"), new ResourceLocation("block/water_flow")).tint(0xffffff));
    }

    private ModFluids() {}
}
