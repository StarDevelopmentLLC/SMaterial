package com.stardevllc.smaterial;

import com.stardevllc.starlib.converter.string.EnumStringConverter;
import com.stardevllc.starlib.converter.string.StringConverters;

public enum ToolSet {
    
    WOOD(SMaterial.WOODEN_SWORD, SMaterial.WOODEN_PICKAXE, SMaterial.WOODEN_AXE, SMaterial.WOODEN_SHOVEL, SMaterial.WOODEN_HOE),
    STONE(SMaterial.STONE_SWORD, SMaterial.STONE_PICKAXE, SMaterial.STONE_AXE, SMaterial.STONE_SHOVEL, SMaterial.STONE_HOE),
    GOLD(SMaterial.GOLDEN_SWORD, SMaterial.GOLDEN_PICKAXE, SMaterial.GOLDEN_AXE, SMaterial.GOLDEN_SHOVEL, SMaterial.GOLDEN_HOE),
    IRON(SMaterial.IRON_SWORD, SMaterial.IRON_PICKAXE, SMaterial.IRON_AXE, SMaterial.IRON_SHOVEL, SMaterial.IRON_HOE),
    DIAMOND(SMaterial.DIAMOND_SWORD, SMaterial.DIAMOND_PICKAXE, SMaterial.DIAMOND_AXE, SMaterial.DIAMOND_SHOVEL, SMaterial.DIAMOND_HOE),
    NETHERITE(SMaterial.NETHERITE_SWORD, SMaterial.NETHERITE_PICKAXE, SMaterial.NETHERITE_AXE, SMaterial.NETHERITE_SHOVEL, SMaterial.NETHERITE_HOE);
    
    static {
        StringConverters.addConverter(ToolSet.class, new EnumStringConverter<>(ToolSet.class));
    }
    
    private final SMaterial sword, pickaxe, axe, shovel, hoe;

    ToolSet(SMaterial sword, SMaterial pickaxe, SMaterial axe, SMaterial shovel, SMaterial hoe) {
        this.sword = sword;
        this.pickaxe = pickaxe;
        this.axe = axe;
        this.shovel = shovel;
        this.hoe = hoe;
    }

    public SMaterial getPickaxe() {
        return pickaxe;
    }

    public SMaterial getAxe() {
        return axe;
    }

    public SMaterial getShovel() {
        return shovel;
    }

    public SMaterial getHoe() {
        return hoe;
    }

    public SMaterial getSword() {
        return sword;
    }
}