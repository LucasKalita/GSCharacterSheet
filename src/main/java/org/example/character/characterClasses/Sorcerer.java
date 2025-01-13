package org.example.character.characterClasses;

import org.example.enums.Checks;
import org.example.enums.SpellCastSystem;
import org.example.enums.TypeOfArmor;
import org.example.enums.TypeOfWeapons;

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
