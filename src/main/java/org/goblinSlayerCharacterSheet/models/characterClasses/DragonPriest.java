package org.goblinSlayerCharacterSheet.models.characterClasses;

import org.goblinSlayerCharacterSheet.models.enums.Checks;
import org.goblinSlayerCharacterSheet.models.enums.SpellCastSystem;
import org.goblinSlayerCharacterSheet.models.enums.TypeOfArmor;
import org.goblinSlayerCharacterSheet.models.enums.TypeOfWeapons;

import java.util.List;

import static org.goblinSlayerCharacterSheet.models.enums.TypeOfWeapons.NONE;

public class DragonPriest extends CharacterClass {
    public DragonPriest(String name,
                        boolean isCore,
                        List<TypeOfWeapons> allowedWeaponList,
                        List<TypeOfArmor> allowedArmorList,
                        List<Checks> allowedChecks,
                        SpellCastSystem spellCastSystem) {
        super("Dragon Priest",
                true,
                List.of(NONE),
                List.of(TypeOfArmor.values()),
                List.of(Checks.SPELL_MAINTENANCE,
                        Checks.SPELL_USE,
                        Checks.FIRST_AID,
                        Checks.MONSTER_KNOWLEDGE,
                        Checks.WORSHIP,
                        Checks.THEOLOGY),
                SpellCastSystem.ANCESTRAL_DRAGON_ARTS);

    }

}
