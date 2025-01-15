package org.GSCS.character.characterClasses;

import org.GSCS.enums.Checks;
import org.GSCS.enums.SpellCastSystem;
import org.GSCS.enums.TypeOfArmor;
import org.GSCS.enums.TypeOfWeapons;

import java.util.List;

public class CharacterClass {
    private String name;
    private boolean isCore;
    private int level;
    private List<TypeOfWeapons> allowedWeaponList;
    private List<TypeOfArmor> allowedArmorList;
    private List<Checks> allowedChecks;
    private SpellCastSystem spellCastSystem;


    public CharacterClass() {
    }

    public CharacterClass(String name, boolean isCore, List<TypeOfWeapons> allowedWeaponList, List<TypeOfArmor> allowedArmorList, List<Checks> allowedChecks, int level, SpellCastSystem spellCastSystem) {
        this.name = name;
        this.isCore = isCore;
        this.allowedWeaponList = allowedWeaponList;
        this.allowedArmorList = allowedArmorList;
        this.allowedChecks = allowedChecks;
        this.level = level;
        this.spellCastSystem = spellCastSystem;
    }

    public String getName() {
        return name;
    }

    public boolean isCore() {
        return isCore;
    }

    public int getLevel() {
        return level;
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

    public void setLevel(int level) {
        this.level = level;
    }
}
