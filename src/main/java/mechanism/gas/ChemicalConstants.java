package mechanism.gas;

import mekanism.common.base.IChemicalConstant;

public enum ChemicalConstants implements IChemicalConstant {
    ARGON("argon", 0x5e12b2, 4, 302.53f, 1.784f),
    KRYPTON("krypton", 0xd2cbd1, 6, 244.12f, 3.749f),
    XENON("xenon", 0x836b9b, 5, -162.62f, 5.894f),
    RADON("radon", 0xffffff, 0, -79.1f, 9.73f)
    ;

    private final String name;
    private final int color;
    private final int lightLevel;
    private final float temperature;
    private final float density;

    ChemicalConstants(String name, int color, int lightLevel, float temperature, float density) {
        this.name = name;
        this.color = color;
        this.lightLevel = lightLevel;
        this.temperature = temperature;
        this.density = density;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public float getTemperature() {
        return temperature;
    }

    @Override
    public float getDensity() {
        return density;
    }

    @Override
    public int getLightLevel() {
        return lightLevel;
    }
}

/*
    temperatureとdensityはWikipediaの元素の一覧から取っている。
    化学に疎いのでもし間違っていたらすみません
 */
