package org.GSCS.equipment.weapons;

import org.GSCS.enums.Material;
import org.GSCS.equipment.effects.WeaponEffect;

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
