package org.example.character.characterClasses;

import org.example.enums.Checks;
import org.example.enums.SpellCastSystem;
import org.example.enums.TypeOfArmor;
import org.example.enums.TypeOfWeapons;

import java.util.List;

public class Fighter extends CharacterClass {


    public Fighter(String name,
                   boolean isCore,
                   List<TypeOfWeapons> allowedWeaponList,
                   List<TypeOfArmor> allowedArmorList,
                   List<Checks> allowedChecks,
                   SpellCastSystem spellCastSystem) {
        super("Fighter", true, List.of(TypeOfWeapons.values()), List.of(TypeOfArmor.values()),
                List.of(Checks.DODGE, Checks.HIT, Checks.BLOCK), 0, SpellCastSystem.NONE);
    }
}
