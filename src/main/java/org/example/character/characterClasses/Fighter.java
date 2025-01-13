package org.example.character.characterClasses;

import org.example.enums.*;

import java.util.List;

public class Fighter extends CharacterClass {

    public Fighter(String name,
                   boolean isCore,
                   TypeOfWeight typeOfWeight,
                   List<TypeOfWeapons> allowedWeaponList,
                   List<TypeOfArmor> allowedArmorList,
                   List<Checks> allowedChecks,
                   SpellCastSystem spellCastSystem) {
        super("Fighter",
                true,
                TypeOfWeight.ALL,
                List.of(TypeOfWeapons.values()),
                List.of(TypeOfArmor.values()),
                List.of(Checks.DODGE, Checks.HIT, Checks.BLOCK),
                1,
                SpellCastSystem.NONE);
    }

}
