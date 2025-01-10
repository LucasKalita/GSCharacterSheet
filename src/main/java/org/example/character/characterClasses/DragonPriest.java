package org.example.character.characterClasses;

import org.example.enums.Checks;
import org.example.enums.SpellCastSystem;
import org.example.enums.TypeOfArmor;
import org.example.enums.TypeOfWeapons;

import java.util.List;

import static org.example.enums.TypeOfWeapons.NONE;

public class DragonPriest extends CharacterClass{


    public DragonPriest(String name,
                        boolean isCore,
                        List<TypeOfWeapons> allowedWeaponList,
                        List<TypeOfArmor> allowedArmorList,
                        List<Checks> allowedChecks,
                        SpellCastSystem spellCastSystem) {
        super("Dragon priest",
                true,
               List<TypeOfWeapons> list = List<TypeOfWeapons>(NONE),
                allowedArmorList,
                allowedChecks,
                SpellCastSystem.ANCESTRAL_DRAGON_ARTS);


    }
List<TypeOfWeapons> typeOfWeapons =new List<TypeOfWeapons>(NONE) {
};

}
