package org.example.character.characterClasses;

import org.example.enums.Checks;
import org.example.enums.SpellCastSystem;
import org.example.enums.TypeOfArmor;
import org.example.enums.TypeOfWeapons;

import java.util.List;

import static org.example.enums.TypeOfWeapons.NONE;

public class DragonPriest extends CharacterClass {
    public DragonPriest(String name,
                        boolean isCore,
                        List<TypeOfWeapons> allowedWeaponList,
                        List<TypeOfArmor> allowedArmorList,
                        List<Checks> allowedChecks,
                        int level,
                        SpellCastSystem spellCastSystem) {
        super("Dragon Priest",
                true,
                List.of(NONE),
                List.of(TypeOfArmor.values()),
                allowedChecks, level, spellCastSystem);



    }
}
