package org.example.character.Player;

public class Background {
    private int origins;
    private int past;
    private int encounter;
    private int lifeForceThrow;
    private int spellCountThrow;
    private int movementThrow;
    private String story;
    private String lookDescription;

    public Background() {
    }

    public Background(int origins, int past, int encounter, int lifeForceThrow, int spellCountThrow, int movementThrow, String story, String lookDescription) {
        this.origins = origins;
        this.past = past;
        this.encounter = encounter;
        this.lifeForceThrow = lifeForceThrow;
        this.spellCountThrow = spellCountThrow;
        this.movementThrow = movementThrow;
        this.story = story;
        this.lookDescription = lookDescription;
    }

    public int getOrigins() {
        return origins;
    }

    public void setOrigins(int origins) {
        this.origins = origins;
    }

    public int getPast() {
        return past;
    }

    public void setPast(int past) {
        this.past = past;
    }

    public int getEncounter() {
        return encounter;
    }

    public void setEncounter(int encounter) {
        this.encounter = encounter;
    }

    public int getLifeForceThrow() {
        return lifeForceThrow;
    }

    public void setLifeForceThrow(int lifeForceThrow) {
        this.lifeForceThrow = lifeForceThrow;
    }

    public int getSpellCountThrow() {
        return spellCountThrow;
    }

    public void setSpellCountThrow(int spellCountThrow) {
        this.spellCountThrow = spellCountThrow;
    }

    public int getMovementThrow() {
        return movementThrow;
    }

    public void setMovementThrow(int movementThrow) {
        this.movementThrow = movementThrow;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getLookDescription() {
        return lookDescription;
    }

    public void setLookDescription(String lookDescription) {
        this.lookDescription = lookDescription;
    }
}
