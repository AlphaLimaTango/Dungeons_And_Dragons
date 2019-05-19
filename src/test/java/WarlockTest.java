import FanatasyAdventure.Players.Creature;
import FanatasyAdventure.Players.Race;
import FanatasyAdventure.Players.Spell;
import FanatasyAdventure.Players.magician.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before(){
        warlock = new Warlock("Jon", Race.DWARF, 80);
    }

    @Test
    public void hasName(){
        assertEquals("Jon", warlock.getName());
    }

    @Test
    public void hasRace(){
        assertEquals(Race.DWARF, warlock.getRace());
    }

    @Test
    public void hasWallet(){
        assertEquals(80, warlock.getWallet());
    }

    @Test
    public void startsWithNullCreature(){
        assertEquals(null, warlock.getMythicalCreature());
    }

    @Test
    public void startsWithNullSpell(){
        assertEquals(null, warlock.getCast());
    }

    @Test
    public void canSetCreature(){
        warlock.setMythicalCreature(Creature.DRAGON);
        assertEquals(Creature.DRAGON, warlock.getMythicalCreature());
    }

    @Test
    public void canSetSpell(){
        warlock.setCast(Spell.STRIKE);
        assertEquals(Spell.STRIKE, warlock.getCast());
    }
}
