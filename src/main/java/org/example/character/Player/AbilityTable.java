package org.example.character.Player;

public class AbilityTable {
   private int strength;
   private int psyche;
   private int technique;
   private int intelligence;
   private int focus;
   private int reflex;
   private int endurance;

    public AbilityTable(int strength, int psyche, int technique, int intelligence, int focus, int reflex, int endurance) {
        this.strength = strength;
        this.psyche = psyche;
        this.technique = technique;
        this.intelligence = intelligence;
        this.focus = focus;
        this.reflex = reflex;
        this.endurance = endurance;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getPsyche() {
        return psyche;
    }

    public void setPsyche(int psyche) {
        this.psyche = psyche;
    }

    public int getTechnique() {
        return technique;
    }

    public void setTechnique(int technique) {
        this.technique = technique;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getFocus() {
        return focus;
    }

    public void setFocus(int focus) {
        this.focus = focus;
    }

    public int getReflex() {
        return reflex;
    }

    public void setReflex(int reflex) {
        this.reflex = reflex;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbilityTable that)) return false;

        return getStrength() == that.getStrength() && getPsyche() == that.getPsyche() && getTechnique() == that.getTechnique() && getIntelligence() == that.getIntelligence() && getFocus() == that.getFocus() && getReflex() == that.getReflex() && getEndurance() == that.getEndurance();
    }

    @Override
    public int hashCode() {
        int result = getStrength();
        result = 31 * result + getPsyche();
        result = 31 * result + getTechnique();
        result = 31 * result + getIntelligence();
        result = 31 * result + getFocus();
        result = 31 * result + getReflex();
        result = 31 * result + getEndurance();
        return result;
    }

    @Override
    public String toString() {
        return "AbilityTable{" +
                "strength=" + strength +
                ", psyche=" + psyche +
                ", technique=" + technique +
                ", intelligence=" + intelligence +
                ", focus=" + focus +
                ", reflex=" + reflex +
                ", endurance=" + endurance +
                '}';
    }
}

