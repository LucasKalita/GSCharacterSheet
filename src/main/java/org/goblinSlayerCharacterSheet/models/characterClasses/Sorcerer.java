package org.goblinSlayerCharacterSheet.models.characterClasses;

import org.goblinSlayerCharacterSheet.models.enums.Checks;
import org.goblinSlayerCharacterSheet.models.enums.SpellCastSystem;
import org.goblinSlayerCharacterSheet.models.enums.TypeOfArmor;
import org.goblinSlayerCharacterSheet.models.enums.TypeOfWeapons;

import java.util.List;

public class Sorcerer extends CharacterClass {
    public Sorcerer(String name,
                    boolean isCore,
                    List<TypeOfWeapons> allowedWeaponList,
                    List<TypeOfArmor> allowedArmorList,
                    List<Checks> allowedChecks,
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
                SpellCastSystem.WORDS_OF_TRUE_POWER);
    }
}
