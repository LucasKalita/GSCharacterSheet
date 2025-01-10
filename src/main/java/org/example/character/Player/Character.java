package org.example.character.Player;

import org.example.enums.Race;
import org.example.enums.SpellCastSystem;
import org.example.equipment.weapons.Weapon;
import org.example.skills.adventurerSkills.CombatSkill;
import org.example.skills.adventurerSkills.MagicSkill;
import org.example.skills.generalSkills.GeneralSkill;

import java.util.List;

public class Character {
    String name;
    int age;
    Race race;
    int level;

    List<GeneralSkill> generalSkillList;
    List<CombatSkill> combatSkillList;
    List<MagicSkill> magicSkillList;
    List<SpellCastSystem> spellCastSystemList;
    List<Weapon> weaponsList;
}
