package org.example.character.characterClasses;

import org.example.enums.Checks;
import org.example.enums.SpellCastSystem;
import org.example.enums.TypeOfArmor;
import org.example.enums.TypeOfWeapons;

import java.util.List;

public class Monk extends CharacterClass {
    public Monk(String name,
                boolean isCore,
                List<TypeOfWeapons> allowedWeaponList,
                List<TypeOfArmor> allowedArmorList,
                List<Checks> allowedChecks,
                int level,
                SpellCastSystem spellCastSystem) {
        super("Monk",
                true,
                List.of(TypeOfWeapons.CLOSE_COMBAT,
                        TypeOfWeapons.THROWING,
                        TypeOfWeapons.STAFF),
                List.of(TypeOfArmor.CLOTH),
                List.of(Checks.DODGE,
                        Checks.HIT,
                        Checks.ACROBATICS,
                        Checks.JUMP),
                1,
                SpellCastSystem.NONE);

    }
}
