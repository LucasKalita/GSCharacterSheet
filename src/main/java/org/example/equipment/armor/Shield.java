package org.example.equipment.armor;

import org.example.enums.Stealth;
import org.example.enums.TypeOfArmor;
import org.example.equipment.effects.ArmorEffect;

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
