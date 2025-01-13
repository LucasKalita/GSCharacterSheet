package org.example.character.characterClasses;

import org.example.enums.*;

import java.util.List;

public class CharacterClass {
   private String name;
   private boolean isCore;
    private int level;
    private TypeOfWeight typeOfWeight;
    private List<TypeOfWeapons> allowedWeaponList;
    private List <TypeOfArmor> allowedArmorList;
    private List<Checks> allowedChecks;
   private SpellCastSystem spellCastSystem;


    public CharacterClass() {
    }

    public CharacterClass(String name, boolean isCore,TypeOfWeight typeOfWeight, List<TypeOfWeapons> allowedWeaponList, List<TypeOfArmor> allowedArmorList, List<Checks> allowedChecks, int level, SpellCastSystem spellCastSystem) {
        this.name = name;
        this.isCore = isCore;
        this.typeOfWeight = typeOfWeight;
        this.allowedWeaponList = allowedWeaponList;
        this.allowedArmorList = allowedArmorList;
        this.allowedChecks = allowedChecks;
        this.level = level;
        this.spellCastSystem = spellCastSystem;
    }
}
