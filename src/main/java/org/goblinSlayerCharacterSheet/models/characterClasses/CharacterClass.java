package org.goblinSlayerCharacterSheet.models.characterClasses;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.goblinSlayerCharacterSheet.models.enums.Checks;
import org.goblinSlayerCharacterSheet.models.enums.SpellCastSystem;
import org.goblinSlayerCharacterSheet.models.enums.TypeOfArmor;
import org.goblinSlayerCharacterSheet.models.enums.TypeOfWeapons;

import java.util.List;
@Data
@RequiredArgsConstructor
public abstract class CharacterClass {

  final private String name;
  final private boolean isCore;
  private int level = 1;
  final private List<TypeOfWeapons> allowedWeaponList;
  final private List<TypeOfArmor> allowedArmorList;
  final private List<Checks> allowedChecks;
  final private SpellCastSystem spellCastSystem;

}
