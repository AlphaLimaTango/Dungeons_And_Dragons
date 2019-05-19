import FanatasyAdventure.Players.Race;
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
    public void startsWithNullCreature(){
        assertEquals(null, wizard.getMythicalCreature());
    }


}
