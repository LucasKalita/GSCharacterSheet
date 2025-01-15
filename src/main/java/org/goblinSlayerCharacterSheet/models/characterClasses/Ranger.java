package org.goblinSlayerCharacterSheet.models.characterClasses;

import org.goblinSlayerCharacterSheet.models.enums.Checks;
import org.goblinSlayerCharacterSheet.models.enums.SpellCastSystem;
import org.goblinSlayerCharacterSheet.models.enums.TypeOfArmor;
import org.goblinSlayerCharacterSheet.models.enums.TypeOfWeapons;

import java.util.List;

public class Ranger extends CharacterClass{
    public Ranger(String name,
                  boolean isCore,
                  List<TypeOfWeapons> allowedWeaponList,
                  List<TypeOfArmor> allowedArmorList,
                  List<Checks> allowedChecks,
                  SpellCastSystem spellCastSystem) {
        super("Ranger",
                true,
                List.of(TypeOfWeapons.BOW, TypeOfWeapons.CROSSBOW, TypeOfWeapons.FIREARMS),
                List.of(TypeOfArmor.CLOTH, TypeOfArmor.LIGHT),
                List.of(Checks.DODGE,
                        Checks.HIT,
                        Checks.FIRST_AID,
                        Checks.STEALTH,
                        Checks.ACROBATICS,
                        Checks.OBSERVATION,
                        Checks.SIX_SENSE,
                        Checks.JUMP),

                SpellCastSystem.NONE);



    }
}
