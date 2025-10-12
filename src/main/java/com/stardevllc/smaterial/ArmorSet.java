package com.stardevllc.smaterial;

import com.stardevllc.starlib.converter.string.EnumStringConverter;
import com.stardevllc.starlib.converter.string.StringConverters;

public enum ArmorSet {

    NONE(SMaterial.AIR, SMaterial.AIR, SMaterial.AIR, SMaterial.AIR),
    LEATHER(SMaterial.LEATHER_HELMET, SMaterial.LEATHER_CHESTPLATE, SMaterial.LEATHER_LEGGINGS, SMaterial.LEATHER_BOOTS),
    CHAINMAIL(SMaterial.CHAINMAIL_HELMET, SMaterial.CHAINMAIL_CHESTPLATE, SMaterial.CHAINMAIL_LEGGINGS, SMaterial.CHAINMAIL_BOOTS),
    GOLD(SMaterial.GOLDEN_HELMET, SMaterial.GOLDEN_CHESTPLATE, SMaterial.GOLDEN_LEGGINGS, SMaterial.GOLDEN_BOOTS),
    IRON(SMaterial.IRON_HELMET, SMaterial.IRON_CHESTPLATE, SMaterial.IRON_LEGGINGS, SMaterial.IRON_BOOTS),
    DIAMOND(SMaterial.DIAMOND_HELMET, SMaterial.DIAMOND_CHESTPLATE, SMaterial.DIAMOND_LEGGINGS, SMaterial.DIAMOND_BOOTS), 
    NETHERITE(SMaterial.NETHERITE_HELMET, SMaterial.NETHERITE_CHESTPLATE, SMaterial.NETHERITE_LEGGINGS, SMaterial.NETHERITE_BOOTS);
    
    static {
        StringConverters.addConverter(ArmorSet.class, new EnumStringConverter<>(ArmorSet.class));
    }

    private final SMaterial helmet, chestplate, leggings, boots;

    ArmorSet(SMaterial helmet, SMaterial chestplate, SMaterial leggings, SMaterial boots) {
        this.helmet = helmet;
        this.chestplate = chestplate;
        this.leggings = leggings;
        this.boots = boots;
    }

    public SMaterial getHelmet() {
        return helmet;
    }

    public SMaterial getChestplate() {
        return chestplate;
    }

    public SMaterial getLeggings() {
        return leggings;
    }

    public SMaterial getBoots() {
        return boots;
    }
}
