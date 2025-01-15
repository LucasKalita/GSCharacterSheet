package org.GSCS.equipment.armor;

import org.GSCS.enums.Stealth;
import org.GSCS.enums.TypeOfArmor;
import org.GSCS.equipment.effects.ArmorEffect;

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
