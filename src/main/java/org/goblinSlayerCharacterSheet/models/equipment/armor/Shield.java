package org.goblinSlayerCharacterSheet.models.equipment.armor;

import org.goblinSlayerCharacterSheet.models.enums.Stealth;
import org.goblinSlayerCharacterSheet.models.enums.TypeOfArmor;
import org.goblinSlayerCharacterSheet.models.equipment.effects.ArmorEffect;

import java.util.List;

public class Shield {
    String name;
    int blockModification;
    int blockScore;
    Stealth stealth;
    int value;
    TypeOfArmor typeOfArmor;
    List <ArmorEffect> effectList;
    String description;
}
