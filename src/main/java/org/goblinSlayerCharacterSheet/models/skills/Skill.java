package org.goblinSlayerCharacterSheet.models.skills;

import org.goblinSlayerCharacterSheet.models.enums.SkillMasteryGrade;

import java.util.Map;

public class Skill {
    String name;
    String description;
    Map<SkillMasteryGrade, Integer> masteryAndBonusLevel;
}
