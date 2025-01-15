package org.GSCS.character.characterClasses;

import org.GSCS.enums.Checks;
import org.GSCS.enums.SpellCastSystem;
import org.GSCS.enums.TypeOfArmor;
import org.GSCS.enums.TypeOfWeapons;

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
