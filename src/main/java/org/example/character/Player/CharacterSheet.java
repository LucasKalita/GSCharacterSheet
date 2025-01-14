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
  protected String name;
  protected Race race;
  protected int age;
  protected int level;
  protected int experiencePoints;
  protected int cumulativeExperiencePoints;
  protected int advancementPoints;
  protected int money;
  protected int wounds;
  protected int lifeForce ;
  protected Background background;
  protected static AbilityTable abilityTable;
  protected List<CharacterClass> characterClasses;
  protected List<GeneralSkill> generalSkillList;
  protected List<CombatSkill> combatSkillList;
  protected List<MagicSkill> magicSkillList;
  protected List<Weapon> weaponsList;
  protected List<Item> equipment;

    public CharacterSheet() {
    }

    public CharacterSheet(String name,
                          Race race,
                          int age,
                          int level,
                          int experiencePoints,
                          int cumulativeExperiencePoints,
                          int advancementPoints,
                          int lifeForce,
                          Background background,
                          AbilityTable abilityTable,
                          List<CharacterClass> characterClasses,
                          List<GeneralSkill> generalSkillList,
                          List<CombatSkill> combatSkillList,
                          List<MagicSkill> magicSkillList,
                          List<Weapon> weaponsList,
                          List<Item> equipment) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.level = 1;
        this.experiencePoints = 3000;
        this.cumulativeExperiencePoints = 3000;
        this.advancementPoints = 10;
        this.lifeForce = countLifeForce();
        this.background = background;
        CharacterSheet.abilityTable = abilityTable;
        this.characterClasses = characterClasses;
        this.generalSkillList = generalSkillList;
        this.combatSkillList = combatSkillList;
        this.magicSkillList = magicSkillList;
        this.weaponsList = weaponsList;
        this.equipment = equipment;
    }
    private int countLifeForce(){
        return abilityTable.getEndurance() +
                abilityTable.getPsyche() +
                abilityTable.getStrength() +
                background.getLifeForceThrow();
    }

    public int getWounds() {
        return wounds;
    }

    public void setWounds(int wounds) {
        this.wounds = wounds;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getCumulativeExperiencePoints() {
        return cumulativeExperiencePoints;
    }

    public void setCumulativeExperiencePoints(int cumulativeExperiencePoints) {
        this.cumulativeExperiencePoints = cumulativeExperiencePoints;
    }

    public int getAdvancementPoints() {
        return advancementPoints;
    }

    public void setAdvancementPoints(int advancementPoints) {
        this.advancementPoints = advancementPoints;
    }

    public int getLifeForce() {
        return lifeForce;
    }

    public void setLifeForce(int lifeForce) {
        this.lifeForce = lifeForce;
    }


    public Background getBackground() {
        return background;
    }

    public void setBackground(Background background) {
        this.background = background;
    }

    public AbilityTable getAbilityTable() {
        return abilityTable;
    }

    public void setAbilityTable(AbilityTable abilityTable) {
        CharacterSheet.abilityTable = abilityTable;
    }

    public List<CharacterClass> getCharacterClasses() {
        return characterClasses;
    }

    public void setCharacterClasses(List<CharacterClass> characterClasses) {
        this.characterClasses = characterClasses;
    }

    public List<GeneralSkill> getGeneralSkillList() {
        return generalSkillList;
    }

    public void setGeneralSkillList(List<GeneralSkill> generalSkillList) {
        this.generalSkillList = generalSkillList;
    }

    public List<CombatSkill> getCombatSkillList() {
        return combatSkillList;
    }

    public void setCombatSkillList(List<CombatSkill> combatSkillList) {
        this.combatSkillList = combatSkillList;
    }

    public List<MagicSkill> getMagicSkillList() {
        return magicSkillList;
    }

    public void setMagicSkillList(List<MagicSkill> magicSkillList) {
        this.magicSkillList = magicSkillList;
    }

    public List<Weapon> getWeaponsList() {
        return weaponsList;
    }

    public void setWeaponsList(List<Weapon> weaponsList) {
        this.weaponsList = weaponsList;
    }

    public List<Item> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<Item> equipment) {
        this.equipment = equipment;
    }
}

