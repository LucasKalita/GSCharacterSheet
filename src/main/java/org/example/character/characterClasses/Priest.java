package org.example.character.characterClasses;

import org.example.enums.Checks;
import org.example.enums.SpellCastSystem;
import org.example.enums.TypeOfArmor;
import org.example.enums.TypeOfWeapons;

import java.util.List;

public class Priest extends CharacterClass{
    public Priest(String name,
                  boolean isCore,
                  List<TypeOfWeapons> allowedWeaponList,
                  List<TypeOfArmor> allowedArmorList,
                  List<Checks> allowedChecks,
                  int level,
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
               1,
                SpellCastSystem.MIRACLES);

    }
}
