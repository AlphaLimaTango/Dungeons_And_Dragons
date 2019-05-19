package FanatasyAdventure.Players.magician;

import FanatasyAdventure.Players.Creature;
import FanatasyAdventure.Players.Player;
import FanatasyAdventure.Players.Race;
import FanatasyAdventure.Players.Spell;

public abstract class Magician extends Player {

    private Creature mythicalCreature;
    private Spell cast;

    public Magician(String name, Race race, int wallet) {
        super(name, race, wallet);
        this.mythicalCreature = null;
        this.cast = null;
    }

    public Creature getMythicalCreature() {
        return mythicalCreature;
    }

    public void setMythicalCreature(Creature mythicalCreature) {
        this.mythicalCreature = mythicalCreature;
    }

    public Spell getCast() {
        return cast;
    }

    public void setCast(Spell cast) {
        this.cast = cast;
    }
}
