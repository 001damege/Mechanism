package mechanism.registries;

import mechanism.Mechanism;
import mechanism.gas.ChemicalConstants;
import mekanism.api.chemical.gas.Gas;
import mekanism.common.registration.impl.GasDeferredRegister;
import mekanism.common.registration.impl.GasRegistryObject;

public class ModGases {
    public static final GasDeferredRegister GASES = new GasDeferredRegister(Mechanism.MODID);

    public static final GasRegistryObject<Gas> ARGON; // アルゴン
    public static final GasRegistryObject<Gas> KRYPTON; // クリプトン
    public static final GasRegistryObject<Gas> XENON; // キセノン
    public static final GasRegistryObject<Gas> RADON; // ラドン

    static {
        ARGON = GASES.register(ChemicalConstants.ARGON);
        KRYPTON = GASES.register(ChemicalConstants.KRYPTON);
        XENON = GASES.register(ChemicalConstants.XENON);
        RADON = GASES.register(ChemicalConstants.RADON);
    }

    private ModGases() {}
}
