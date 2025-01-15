package org.goblinSlayerCharacterSheet.models.characterClasses;

import org.goblinSlayerCharacterSheet.models.enums.Checks;
import org.goblinSlayerCharacterSheet.models.enums.SpellCastSystem;
import org.goblinSlayerCharacterSheet.models.enums.TypeOfArmor;
import org.goblinSlayerCharacterSheet.models.enums.TypeOfWeapons;

import java.util.List;

public class Monk extends CharacterClass {
    public Monk(String name,
                boolean isCore,
                List<TypeOfWeapons> allowedWeaponList,
                List<TypeOfArmor> allowedArmorList,
                List<Checks> allowedChecks,
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
                SpellCastSystem.NONE);

    }
}
