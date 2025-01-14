package org.example.character.Player;

public class Tiredness {
   private int fatigue;
   private int specialFatigue;
   private int attrition;

    public Tiredness() {
    }

    public Tiredness(int fatigue, int specialFatigue, int attrition) {
        this.fatigue = fatigue;
        this.specialFatigue = specialFatigue;
        this.attrition = attrition;
    }

    public int getFatigue() {
        return fatigue;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    public int getSpecialFatigue() {
        return specialFatigue;
    }

    public void setSpecialFatigue(int specialFatigue) {
        this.specialFatigue = specialFatigue;
    }

    public int getAttrition() {
        return attrition;
    }

    public void setAttrition(int attrition) {
        this.attrition = attrition;
    }
}
