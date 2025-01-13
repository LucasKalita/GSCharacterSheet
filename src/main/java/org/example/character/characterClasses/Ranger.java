package org.example.character.characterClasses;

import org.example.enums.Checks;
import org.example.enums.SpellCastSystem;
import org.example.enums.TypeOfArmor;
import org.example.enums.TypeOfWeapons;

import java.util.List;

public class Ranger extends CharacterClass{
    public Ranger(String name,
                  boolean isCore,
                  List<TypeOfWeapons> allowedWeaponList,
                  List<TypeOfArmor> allowedArmorList,
                  List<Checks> allowedChecks,
                  int level,
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
                1,
                SpellCastSystem.NONE);



    }
}
