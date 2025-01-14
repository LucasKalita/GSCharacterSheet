package org.example.character.Player;

import org.example.character.characterClasses.CharacterClass;
import org.example.enums.Race;
import org.example.enums.SpellCastSystem;
import org.example.equipment.items.Item;
import org.example.equipment.weapons.Weapon;
import org.example.skills.adventurerSkills.CombatSkill;
import org.example.skills.adventurerSkills.MagicSkill;
import org.example.skills.generalSkills.GeneralSkill;

import java.util.List;

public class Character {
    String name;
    Race race;
    int age;
    int level;
    AbilityTable abilityTable;
    BackgroundRolls backgroundRolls;

    List<CharacterClass> characterClasses;
    List<GeneralSkill> generalSkillList;
    List<CombatSkill> combatSkillList;
    List<MagicSkill> magicSkillList;
    List<Weapon> weaponsList;
    List<Item> equipment;
}
