package mechanism.item;

import mekanism.api.text.EnumColor;
import mekanism.api.text.TextComponentUtil;
import mekanism.common.lib.radiation.RadiationManager;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ItemEinsteinium extends Item {
    protected EnumColor color;

    public ItemEinsteinium(Item.Properties properties, EnumColor color) {
        super(properties);
        this.color = color;
    }

    @Override
    public void inventoryTick(ItemStack itemStack, Level level, Entity entity, int slot, boolean selected) {
        if (!level.isClientSide && entity instanceof Player player) {
            if (level.getGameTime() % 100 == 0) {
                applyRadiationDamage(player);
            }
        }
        super.inventoryTick(itemStack, level, entity, slot, selected);
    }

    private void applyRadiationDamage(Player player) {
        double radiationLevel = 1.5;
        RadiationManager.INSTANCE.radiate(player, radiationLevel);
    }

    @Override
    public Component getName(ItemStack itemStack) {
        return TextComponentUtil.build(this.color, super.getName(itemStack));
    }
}
