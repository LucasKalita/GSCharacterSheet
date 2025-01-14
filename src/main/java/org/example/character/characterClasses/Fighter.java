package org.example.character.characterClasses;

import org.example.enums.Checks;
import org.example.enums.SpellCastSystem;
import org.example.enums.TypeOfArmor;
import org.example.enums.TypeOfWeapons;

import java.util.List;

public class Fighter extends CharacterClass {

    public Fighter(String name,
                   boolean isCore,
                   List<TypeOfWeapons> allowedWeaponList,
                   List<TypeOfArmor> allowedArmorList,
                   List<Checks> allowedChecks,
                   SpellCastSystem spellCastSystem) {
        super("Fighter",
                true,
                List.of(TypeOfWeapons.TWO_HANDED_AXE,
                        TypeOfWeapons.TWO_HANDED_MACE,
                        TypeOfWeapons.TWO_HANDED_SWORD,
                        TypeOfWeapons.LIGHT_ONE_HANDED_MACE,
                        TypeOfWeapons.LIGHT_ONE_HANDED_SWORD,
                        TypeOfWeapons.LIGHT_ONE_HANDED_AXE,
                        TypeOfWeapons.HEAVY_ONE_HANDED_AXE,
                        TypeOfWeapons.HEAVY_ONE_HANDED_MACE,
                        TypeOfWeapons.HEAVY_ONE_HANDED_SWORD,
                        TypeOfWeapons.CLOSE_COMBAT,
                        TypeOfWeapons.LIGHT_SPEAR,
                        TypeOfWeapons.HEAVY_SPEAR),
                List.of(TypeOfArmor.values()),
                List.of(Checks.DODGE,
                        Checks.HIT,
                        Checks.BLOCK),
                1,
                SpellCastSystem.NONE);
    }

}
