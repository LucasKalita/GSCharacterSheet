package org.GSCS.character.characterClasses;

import org.GSCS.enums.Checks;
import org.GSCS.enums.SpellCastSystem;
import org.GSCS.enums.TypeOfArmor;
import org.GSCS.enums.TypeOfWeapons;

import java.util.List;

public class Shaman extends CharacterClass{
    public Shaman(String name,
                  boolean isCore,
                  List<TypeOfWeapons> allowedWeaponList,
                  List<TypeOfArmor> allowedArmorList,
                  List<Checks> allowedChecks,
                  int level,
                  SpellCastSystem spellCastSystem) {
        super("Shaman",
                true,
                List.of(TypeOfWeapons.NONE),
                List.of(TypeOfArmor.CLOTH,
                        TypeOfArmor.LIGHT),
                List.of(Checks.SPELL_MAINTENANCE,
                        Checks.SPELL_USE,
                        Checks.MONSTER_KNOWLEDGE,
                        Checks.SIX_SENSE,
                        Checks.MEDITATION),
                1,
                SpellCastSystem.SPIRIT_ARTS);
    }
}
