package org.GSCS.character.characterClasses;

import org.GSCS.enums.Checks;
import org.GSCS.enums.SpellCastSystem;
import org.GSCS.enums.TypeOfArmor;
import org.GSCS.enums.TypeOfWeapons;

import java.util.List;

public class Sorcerer extends CharacterClass {
    public Sorcerer(String name,
                    boolean isCore,
                    List<TypeOfWeapons> allowedWeaponList,
                    List<TypeOfArmor> allowedArmorList,
                    List<Checks> allowedChecks,
                    int level,
                    SpellCastSystem spellCastSystem) {
        super("Sorcerer",
                true,
                List.of(TypeOfWeapons.NONE),
                List.of(TypeOfArmor.CLOTH),
                List.of(Checks.SPELL_MAINTENANCE,
                        Checks.SPELL_USE,
                        Checks.MONSTER_KNOWLEDGE,
                        Checks.GENERAL_KNOWLEDGE,
                        Checks.RESEARCH,
                        Checks.MAGIC_KNOWLEDGE,
                        Checks.MEDITATION),
                1,
                SpellCastSystem.WORDS_OF_TRUE_POWER);
    }
}
