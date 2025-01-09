package org.example.character.characterClasses;

import org.example.enums.Checks;
import org.example.enums.SpellCastSystem;
import org.example.enums.TypeOfArmor;
import org.example.enums.TypeOfWeapons;

import java.util.List;

public class Monk extends CharacterClass {
    public Monk(String name, String description, boolean isCore, List<TypeOfWeapons> allowedWeaponList, List<TypeOfArmor> allowedArmorList, List<Checks> allowedChecks, SpellCastSystem spellCastSystem) {
        super(name, description, isCore, allowedWeaponList, allowedArmorList, allowedChecks, spellCastSystem);
    }
}
