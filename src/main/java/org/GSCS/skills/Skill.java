package org.GSCS.skills;

import org.GSCS.enums.SkillMasteryGrade;

import java.util.Map;

public class Skill {
    String name;
    String description;
    Map<SkillMasteryGrade, Integer> masteryAndBonusLevel;
}
