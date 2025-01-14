package org.example.character.Player;

import org.example.character.characterClasses.CharacterClass;
import org.example.enums.Race;
import org.example.equipment.items.Item;
import org.example.equipment.weapons.Weapon;
import org.example.skills.adventurerSkills.CombatSkill;
import org.example.skills.adventurerSkills.MagicSkill;
import org.example.skills.generalSkills.GeneralSkill;

import java.util.List;

public class CharacterSheet {
    String name;
    Race race;
    int age;
    int level;
    int experiencePoints;
    int cumulativeExperiencePoints;
    int advancementPoints;
    int lifeForce ;
    int doubleLifeForce;
    BackgroundRolls backgroundRolls;
    AbilityTable abilityTable;
    List<CharacterClass> characterClasses;
    List<GeneralSkill> generalSkillList;
    List<CombatSkill> combatSkillList;
    List<MagicSkill> magicSkillList;
    List<Weapon> weaponsList;
    List<Item> equipment;
}
