package org.goblinSlayerCharacterSheet.models.equipment.armor;

import org.goblinSlayerCharacterSheet.models.enums.Material;
import org.goblinSlayerCharacterSheet.models.enums.Stealth;
import org.goblinSlayerCharacterSheet.models.enums.TypeOfArmor;
import org.goblinSlayerCharacterSheet.models.equipment.effects.ArmorEffect;

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
