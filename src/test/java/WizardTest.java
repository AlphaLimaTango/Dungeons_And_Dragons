import FanatasyAdventure.Players.Creature;
import FanatasyAdventure.Players.Race;
import FanatasyAdventure.Players.Spell;
import FanatasyAdventure.Players.magician.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard("Harry", Race.HUMAN, 100);
    }

    @Test
    public void hasName(){
        assertEquals("Harry", wizard.getName());
    }

    @Test
    public void hasRace(){
        assertEquals(Race.HUMAN, wizard.getRace());
    }

    @Test
    public void hasWallet(){
        assertEquals(100, wizard.getWallet());
    }

    @Test
    public void startsWithNullCreature(){
        assertEquals(null, wizard.getMythicalCreature());
    }

    @Test
    public void startsWithNullSpell(){
        assertEquals(null, wizard.getCast());
    }

    @Test
    public void canSetCreature(){
        wizard.setMythicalCreature(Creature.DRAGON);
        assertEquals(Creature.DRAGON, wizard.getMythicalCreature());
    }

    @Test
    public void canSetSpell(){
        wizard.setCast(Spell.STRIKE);
        assertEquals(Spell.STRIKE, wizard.getCast());
    }
}
