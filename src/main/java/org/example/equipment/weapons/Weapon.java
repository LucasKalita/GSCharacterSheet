package org.example.equipment.weapons;

import org.example.enums.Material;
import org.example.equipment.effects.WeaponEffect;

import java.util.List;
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
