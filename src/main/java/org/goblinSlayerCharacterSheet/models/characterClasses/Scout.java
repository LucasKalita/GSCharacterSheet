package org.goblinSlayerCharacterSheet.models.characterClasses;

import org.goblinSlayerCharacterSheet.models.enums.Checks;
import org.goblinSlayerCharacterSheet.models.enums.SpellCastSystem;
import org.goblinSlayerCharacterSheet.models.enums.TypeOfArmor;
import org.goblinSlayerCharacterSheet.models.enums.TypeOfWeapons;

import java.util.List;

public class Scout extends CharacterClass{
    public Scout(String name,
                 boolean isCore,
                 List<TypeOfWeapons> allowedWeaponList,
                 List<TypeOfArmor> allowedArmorList,
                 List<Checks> allowedChecks,
                 SpellCastSystem spellCastSystem) {
        super("Scout",
                true,
                List.of(TypeOfWeapons.LIGHT_ONE_HANDED_AXE,
                        TypeOfWeapons.LIGHT_ONE_HANDED_MACE,
                        TypeOfWeapons.LIGHT_ONE_HANDED_SWORD,
                        TypeOfWeapons.LIGHT_SPEAR,
                        TypeOfWeapons.CLOSE_COMBAT,
                        TypeOfWeapons.THROWING),
                List.of(TypeOfArmor.CLOTH,
                        TypeOfArmor.LIGHT),
                List.of(Checks.DODGE,
                        Checks.HIT,
                        Checks.BLOCK,
                        Checks.STEALTH,
                        Checks.ACROBATICS,
                        Checks.OBSERVATION,
                        Checks.SIX_SENSE,
                        Checks.OBSERVATION,
                        Checks.HANDIWORK,
                        Checks.CRIMINAL_KNOWLEDGE),
                SpellCastSystem.NONE);
    }
}
