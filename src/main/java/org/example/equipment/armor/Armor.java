package org.example.equipment.armor;

import org.example.equipment.armor.effects.Effect;

import java.util.List;

public class Armor {
    boolean isCoreItem;
    String name;
    Type type;
    Material material;
    int armorScore;
    int dodgeModification;
    int movementModification;
    int value;
    List<Effect> effectList;
    String description;

}
