package org.example.character.characterClasses;

import org.example.enums.Checks;
import org.example.enums.SpellCastSystem;
import org.example.enums.TypeOfArmor;
import org.example.enums.TypeOfWeapons;

import java.util.List;

public abstract class CharacterClass {
   private  String name;
   private  String description;
   private  boolean isCore;
   private  List<TypeOfWeapons> allowedWeaponList;
   private  List <TypeOfArmor> allowedArmorList;
   private  List<Checks> allowedChecks;
   private  SpellCastSystem spellCastSystem;


}
