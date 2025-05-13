package mechanism.registries;

import mechanism.Mechanism;
import mechanism.item.ItemEinsteinium;
import mekanism.api.text.EnumColor;
import mekanism.common.registration.impl.ItemDeferredRegister;
import mekanism.common.registration.impl.ItemRegistryObject;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final ItemDeferredRegister ITEMS = new ItemDeferredRegister(Mechanism.MODID);

    public static final ItemRegistryObject<Item> NEUTRONIUM; // 中性子
    public static final ItemRegistryObject<Item> MAGNESIUM; // マグネシウム
    public static final ItemRegistryObject<Item> ALUMINIUM; // アルミニウム
    public static final ItemRegistryObject<Item> SILICON; // ケイ素/シリコン
    public static final ItemRegistryObject<Item> PHOSPHORUS; // リン
    public static final ItemRegistryObject<Item> POTASSIUM; // カリウム
    public static final ItemRegistryObject<Item> CALCIUM; // カルシウム
    public static final ItemRegistryObject<Item> SCANDIUM; // スカンジウム
    public static final ItemRegistryObject<Item> TITANIUM; // チタニウム
    public static final ItemRegistryObject<Item> VANADIUM; // バナジウム
    public static final ItemRegistryObject<Item> CHROMIUM; // クロム
    public static final ItemRegistryObject<Item> MANGANESE; // マンガン
    public static final ItemRegistryObject<Item> COBALT; // コバルト
    public static final ItemRegistryObject<Item> NICKEL; // ニッケル
    public static final ItemRegistryObject<Item> ZINC; // 亜鉛
    public static final ItemRegistryObject<Item> GALLIUM; // ガリウム
    public static final ItemRegistryObject<Item> ARSENIC; // ヒ素
    public static final ItemRegistryObject<Item> RUBIDIUM; // ルビジウム
    public static final ItemRegistryObject<Item> STRONTIUM; // ストロンチウム
    public static final ItemRegistryObject<Item> YTTRIUM; // イットリウム
    public static final ItemRegistryObject<Item> ZIRCONIUM; // ジルコニウム
    public static final ItemRegistryObject<Item> NIOBIUM; // ニオブ
    public static final ItemRegistryObject<Item> MOLYBDENUM; // モリブデン
    public static final ItemRegistryObject<Item> TECHNETIUM; // テクネチウム
    public static final ItemRegistryObject<Item> RUTHENIUM; // ルテニウム
    public static final ItemRegistryObject<Item> RHODIUM; // ロジウム
    public static final ItemRegistryObject<Item> PALLADIUM; // パラジウム
    public static final ItemRegistryObject<Item> SILVER; // 銀
    public static final ItemRegistryObject<Item> CADMIUM; // カドミウム
    public static final ItemRegistryObject<Item> INDIUM; // インジウム
    public static final ItemRegistryObject<Item> ANTIMONY; // アンチモン
    public static final ItemRegistryObject<Item> TELLURIUM; // テルル
    public static final ItemRegistryObject<Item> IODINE; // ヨウ素
    public static final ItemRegistryObject<Item> CAESIUM; // セシウム
    public static final ItemRegistryObject<Item> BARIUM; // バリウム
    public static final ItemRegistryObject<Item> LANTHANUM; // ランタン
    public static final ItemRegistryObject<Item> CERIUM; // セリウム
    public static final ItemRegistryObject<Item> PRASEODYMIUM; // プラセオジム
    public static final ItemRegistryObject<Item> NEODYMIUM; // ネオジム
    public static final ItemRegistryObject<Item> PROMETHIUM; // プロメチウム
    public static final ItemRegistryObject<Item> SAMARIUM; // サマリウム
    public static final ItemRegistryObject<Item> EUROPIUM; // ユーロピウム
    public static final ItemRegistryObject<Item> GADOLINIUM; // ガドリニウム
    public static final ItemRegistryObject<Item> TERBIUM; // テルビウム
    public static final ItemRegistryObject<Item> DYSPROSIUM; // ジスプロシウム
    public static final ItemRegistryObject<Item> HOLMIUM; // ホルミウム
    public static final ItemRegistryObject<Item> ERBIUM; // エルビウム
    public static final ItemRegistryObject<Item> THULIUM; // ツリウム
    public static final ItemRegistryObject<Item> YTTERBIUM; // イッテルビウム
    public static final ItemRegistryObject<Item> LUTETIUM; // ルテチウム
    public static final ItemRegistryObject<Item> HAFNIUM; // ハフニウム
    public static final ItemRegistryObject<Item> TANTALUM; // タンタル
    public static final ItemRegistryObject<Item> TUNGSTEN; // タングステン
    public static final ItemRegistryObject<Item> RHENIUM; // レニウム
    public static final ItemRegistryObject<Item> IRIDIUM; // イリジウム
    public static final ItemRegistryObject<Item> MERCURY; // 水銀
    public static final ItemRegistryObject<Item> THALLIUM; // タリウム
    public static final ItemRegistryObject<Item> BISMUTH; // ビスマス
    public static final ItemRegistryObject<Item> ASTATIUM; // アスタチン
    public static final ItemRegistryObject<Item> RADIUM; // ラジウム
    public static final ItemRegistryObject<Item> ACTINIUM; // アクチニウム
    public static final ItemRegistryObject<Item> THORIUM; // トリウム
    public static final ItemRegistryObject<Item> PROTACTINIUM; // プロトアクチニウム
    public static final ItemRegistryObject<Item> NEPTUNIUM; // ネプツニウム
    public static final ItemRegistryObject<Item> AMERICIUM; // アメリシウム
    public static final ItemRegistryObject<Item> CURIUM; // キュリウム
    public static final ItemRegistryObject<Item> BERKELIUM; // バークリウム
    public static final ItemRegistryObject<Item> CALIFORNIUM; // カリホルニウム
    public static final ItemRegistryObject<Item> EINSTEINIUM; // アインスタイニウム

    static {
        NEUTRONIUM = ITEMS.register("neutronium");
        MAGNESIUM = ITEMS.register("magnesium");
        ALUMINIUM = ITEMS.register("aluminium");
        SILICON = ITEMS.register("silicon");
        PHOSPHORUS = ITEMS.register("phosphorus");
        POTASSIUM = ITEMS.register("potassium");
        CALCIUM = ITEMS.register("calcium");
        SCANDIUM = ITEMS.register("scandium");
        TITANIUM = ITEMS.register("titanium");
        VANADIUM = ITEMS.register("vanadium");
        CHROMIUM = ITEMS.register("chromium");
        MANGANESE = ITEMS.register("manganese");
        COBALT = ITEMS.register("cobalt");
        NICKEL = ITEMS.register("nickel");
        ZINC = ITEMS.register("zinc");
        GALLIUM = ITEMS.register("gallium");
        ARSENIC = ITEMS.register("arsenic");
        RUBIDIUM = ITEMS.register("rubidium");
        STRONTIUM = ITEMS.register("strontium");
        YTTRIUM = ITEMS.register("yttrium");
        ZIRCONIUM = ITEMS.register("zirconium");
        NIOBIUM = ITEMS.register("niobium");
        MOLYBDENUM = ITEMS.register("molybdenum");
        TECHNETIUM = ITEMS.register("technetium");
        RUTHENIUM = ITEMS.register("ruthenium");
        RHODIUM = ITEMS.register("rhodium");
        PALLADIUM = ITEMS.register("palladium");
        SILVER = ITEMS.register("silver");
        CADMIUM = ITEMS.register("cadmium");
        INDIUM = ITEMS.register("indium");
        ANTIMONY = ITEMS.register("antimony");
        TELLURIUM = ITEMS.register("tellurium");
        IODINE = ITEMS.register("iodine");
        CAESIUM = ITEMS.register("caesium");
        BARIUM = ITEMS.register("barium");
        LANTHANUM = ITEMS.register("lanthanum");
        CERIUM = ITEMS.register("cerium");
        PRASEODYMIUM = ITEMS.register("praseodymium");
        NEODYMIUM = ITEMS.register("neodymium");
        PROMETHIUM = ITEMS.register("promethium");
        SAMARIUM = ITEMS.register("samarium");
        EUROPIUM = ITEMS.register("europium");
        GADOLINIUM = ITEMS.register("gadolinium");
        TERBIUM = ITEMS.register("terbium");
        DYSPROSIUM = ITEMS.register("dysprosium");
        HOLMIUM = ITEMS.register("holmium");
        ERBIUM = ITEMS.register("erbium");
        THULIUM = ITEMS.register("thulium");
        YTTERBIUM = ITEMS.register("ytterbium");
        LUTETIUM = ITEMS.register("lutetium");
        HAFNIUM = ITEMS.register("hafnium");
        TANTALUM = ITEMS.register("tantalum");
        TUNGSTEN = ITEMS.register("tungsten");
        RHENIUM = ITEMS.register("rhenium");
        IRIDIUM = ITEMS.register("iridium");
        MERCURY = ITEMS.register("mercury");
        THALLIUM = ITEMS.register("thallium");
        BISMUTH = ITEMS.register("bismuth");
        ASTATIUM = ITEMS.register("astatium");
        RADIUM = ITEMS.register("radium");
        ACTINIUM = ITEMS.register("actinium");
        THORIUM = ITEMS.register("thorium");
        PROTACTINIUM = ITEMS.register("protactinium");
        NEPTUNIUM = ITEMS.register("neptunium");
        AMERICIUM = ITEMS.register("americium");
        CURIUM = ITEMS.register("curium");
        BERKELIUM = ITEMS.register("berkelium");
        CALIFORNIUM = ITEMS.register("californium");
        EINSTEINIUM = ITEMS.register("einsteinium", () -> new ItemEinsteinium(new Item.Properties(), EnumColor.DARK_BLUE));
    }

    private ModItems() {}
}
