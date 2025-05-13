package mechanism.registries;

import mechanism.Mechanism;
import mekanism.api.text.ILangEntry;
import net.minecraft.Util;

public enum ModLang implements ILangEntry {
    MECHANISM("constants", "mod_name")
    ;

    private final String key;

    ModLang(String type, String path) {
        this(Util.makeDescriptionId(type, Mechanism.rl(path)));
    }

    ModLang(String key) {
        this.key = key;
    }

    @Override
    public String getTranslationKey() {
        return key;
    }
}
