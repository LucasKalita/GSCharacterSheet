package org.goblinSlayerCharacterSheet.models.characterClasses;

import org.goblinSlayerCharacterSheet.models.enums.Checks;
import org.goblinSlayerCharacterSheet.models.enums.SpellCastSystem;
import org.goblinSlayerCharacterSheet.models.enums.TypeOfArmor;
import org.goblinSlayerCharacterSheet.models.enums.TypeOfWeapons;

import java.util.List;

public class Shaman extends CharacterClass{
    public Shaman(String name,
                  boolean isCore,
                  List<TypeOfWeapons> allowedWeaponList,
                  List<TypeOfArmor> allowedArmorList,
                  List<Checks> allowedChecks,
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
                SpellCastSystem.SPIRIT_ARTS);
    }
}
