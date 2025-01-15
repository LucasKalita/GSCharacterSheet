package org.goblinSlayerCharacterSheet.models.characterClasses;

import org.goblinSlayerCharacterSheet.models.enums.Checks;
import org.goblinSlayerCharacterSheet.models.enums.SpellCastSystem;
import org.goblinSlayerCharacterSheet.models.enums.TypeOfArmor;
import org.goblinSlayerCharacterSheet.models.enums.TypeOfWeapons;

import java.util.List;

public class Priest extends CharacterClass {
    public Priest(String name,
                  boolean isCore,
                  List<TypeOfWeapons> allowedWeaponList,
                  List<TypeOfArmor> allowedArmorList,
                  List<Checks> allowedChecks,
                  SpellCastSystem spellCastSystem) {
        super("Priest",
                true,
                List.of(TypeOfWeapons.NONE),
                List.of(TypeOfArmor.CLOTH),
                List.of(Checks.SPELL_MAINTENANCE,
                        Checks.SPELL_USE,
                        Checks.FIRST_AID,
                        Checks.MONSTER_KNOWLEDGE,
                        Checks.WORSHIP,
                        Checks.THEOLOGY
                ),
                SpellCastSystem.MIRACLES);
    }
}
