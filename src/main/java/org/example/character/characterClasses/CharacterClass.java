package org.example.character.characterClasses;

import org.example.enums.Checks;
import org.example.enums.SpellCastSystem;
import org.example.enums.TypeOfArmor;
import org.example.enums.TypeOfWeapons;

import java.util.List;

public class CharacterClass {
   private  String name;
   private  boolean isCore;
   private  List<TypeOfWeapons> allowedWeaponList;
   private  List <TypeOfArmor> allowedArmorList;
   private  List<Checks> allowedChecks;
   private  SpellCastSystem spellCastSystem;

    public CharacterClass(String name,

                          boolean isCore,
                          List<TypeOfWeapons> allowedWeaponList,
                          List<TypeOfArmor> allowedArmorList,
                          List<Checks> allowedChecks,
                          SpellCastSystem spellCastSystem) {
        this.name = name;
        this.isCore = isCore;
        this.allowedWeaponList = allowedWeaponList;
        this.allowedArmorList = allowedArmorList;
        this.allowedChecks = allowedChecks;
        this.spellCastSystem = spellCastSystem;
    }

    public String getName() {
        return name;
    }


    public boolean isCore() {
        return isCore;
    }

    public List<TypeOfWeapons> getAllowedWeaponList() {
        return allowedWeaponList;
    }

    public List<TypeOfArmor> getAllowedArmorList() {
        return allowedArmorList;
    }

    public List<Checks> getAllowedChecks() {
        return allowedChecks;
    }

    public SpellCastSystem getSpellCastSystem() {
        return spellCastSystem;
    }
}
