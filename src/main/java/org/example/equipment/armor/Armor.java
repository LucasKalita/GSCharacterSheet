package org.example.equipment.armor;

import org.example.enums.Material;
import org.example.enums.TypeOfArmor;
import org.example.equipment.effects.ArmorEffect;

import java.util.List;

public class Armor {
    boolean isCore;
    String name;
    TypeOfArmor type;
    Material material;
    int armorScore;
    int dodgeModification;
    int movementModification;
    int value;
    List<ArmorEffect> effectList;
    String description;

}
