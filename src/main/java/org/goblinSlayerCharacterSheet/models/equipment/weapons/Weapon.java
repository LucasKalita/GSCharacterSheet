package org.goblinSlayerCharacterSheet.models.equipment.weapons;

import org.goblinSlayerCharacterSheet.models.enums.Material;
import org.goblinSlayerCharacterSheet.models.equipment.effects.WeaponEffect;

import java.util.Set;

public class Weapon {
    String name;
    String use;
    String range;
    int hitModification;
    int power;
    int value;
    Material material;
    Set<WeaponEffect> weaponEffects;
    String description;
}
