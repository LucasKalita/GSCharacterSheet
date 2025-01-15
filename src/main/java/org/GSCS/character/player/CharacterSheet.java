package org.GSCS.character.player;

import org.GSCS.character.characterClasses.CharacterClass;
import org.GSCS.enums.Race;
import org.GSCS.equipment.items.Item;
import org.GSCS.equipment.weapons.Weapon;
import org.GSCS.skills.adventurerSkills.CombatSkill;
import org.GSCS.skills.adventurerSkills.MagicSkill;
import org.GSCS.skills.generalSkills.GeneralSkill;

import java.util.ArrayList;
import java.util.List;

public class CharacterSheet {
  protected String name ="";
  protected Race race = Race.HUMAN;
  protected int age = 0;
  protected int level = 1;
  protected int experiencePoints = 3000;
  protected int cumulativeExperiencePoints = 3000;
  protected int advancementPoints = 10;
  protected int money = 0;
  protected int wounds = 0;
  protected int lifeForce = countLifeForce();
  protected Background background = new Background();
  protected static AbilityTable abilityTable = new AbilityTable();
  protected List<CharacterClass> characterClasses = new ArrayList<>();
  protected List<GeneralSkill> generalSkillList = new ArrayList<>();
  protected List<CombatSkill> combatSkillList = new ArrayList<>();
  protected List<MagicSkill> magicSkillList = new ArrayList<>();
  protected List<Weapon> weaponsList = new ArrayList<>();
  protected List<Item> equipment = new ArrayList<>();


    private int countLifeForce(){
        assert background != null;
        return abilityTable.getEndurance() +
                abilityTable.getPsyche() +
                abilityTable.getStrength() +
                background.getLifeForce();
    }


}

