package org.example.character;

import org.example.character.enums.Race;
import org.example.skills.adventurerSkills.CombatSkill;
import org.example.skills.adventurerSkills.MagicSkill;
import org.example.skills.generalSkills.GeneralSkill;

import java.util.List;

public class Character {
    String name;
    int age;
    Race race;
    List<GeneralSkill> generalSkillList;
    List<CombatSkill> combatSkillList;
    List<MagicSkill> magicSkillList;
}
