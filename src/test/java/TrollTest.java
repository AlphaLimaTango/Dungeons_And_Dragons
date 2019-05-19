import FanatasyAdventure.Enemies.Orc;
import FanatasyAdventure.Enemies.Troll;
import FanatasyAdventure.Players.Melee.Barbarian;
import FanatasyAdventure.Players.Protection;
import FanatasyAdventure.Players.Race;
import FanatasyAdventure.Players.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;
    Barbarian barbarian;

    @Before
    public void before() {
        troll = new Troll(50, 8, 10);
        barbarian = new Barbarian("Conan", Race.HUMAN, 100, Weapons.SWORD, Protection.SHIELD);

    }

    @Test
    public void hasHealthPoints() {
        assertEquals(50, troll.getHealthPoints());
    }

    @Test
    public void hasArmour() {
        assertEquals(8, troll.getArmour());
    }

    @Test
    public void getDamage() {
        assertEquals(10, troll.getDamage());
    }

    @Test
    public void canDefendFromAttackWhenDamageMoreThanArmour(){
        troll.defend(25);
        assertEquals(33, troll.getHealthPoints());
    }

    @Test
    public void canDefendFromAttackWhenDamageLessThanArmour(){
        troll.defend(barbarian.getDamage());
        assertEquals(49, troll.getHealthPoints());
    }

    @Test
    public void canAttack(){
        troll.attack(barbarian);
        assertEquals(50, troll.getHealthPoints());
    }
}
