package org.example.skills;

import org.example.enums.SkillMasteryGrade;

import java.util.Map;

public class Skill {
    String name;
    String description;
    Map<SkillMasteryGrade, Integer> masteryAndBonusLevel;
}
