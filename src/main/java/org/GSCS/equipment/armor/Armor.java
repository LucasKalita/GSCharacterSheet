package org.GSCS.equipment.armor;

import org.GSCS.enums.Material;
import org.GSCS.enums.Stealth;
import org.GSCS.enums.TypeOfArmor;
import org.GSCS.equipment.effects.ArmorEffect;

import java.util.List;

public class Armor {
    boolean isCore;
    String name;
    Stealth stealth;
    TypeOfArmor type;
    Material material;
    int armorScore;
    int dodgeModification;
    int movementModification;
    int value;
    List<ArmorEffect> effectList;
    String description;

}
