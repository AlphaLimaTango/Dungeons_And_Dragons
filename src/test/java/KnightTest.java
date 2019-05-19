import FanatasyAdventure.Enemies.Orc;
import FanatasyAdventure.Players.Melee.Knight;
import FanatasyAdventure.Players.Protection;
import FanatasyAdventure.Players.Race;
import FanatasyAdventure.Players.Weapons;
import FanatasyAdventure.rooms.TreasureRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Orc orc;
    TreasureRoom treasureRoom;

    @Before
    public void before(){
        knight = new Knight("Lewis", Race.HUMAN, 50, Weapons.SWORD, Protection.SHIELD);
        orc = new Orc(50, 10, 7);
        treasureRoom = new TreasureRoom(1000);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, knight.getHealthPoints());
    }

    @Test
    public void hasName(){
        assertEquals("Lewis", knight.getName());
    }

    @Test
    public void hasRace(){
        assertEquals(Race.HUMAN, knight.getRace());
    }

    @Test
    public void hasWallet(){
        assertEquals(50, knight.getWallet());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapons.SWORD, knight.getWeapon());
    }

    @Test
    public void hasProtection(){
        assertEquals(Protection.SHIELD, knight.getProtection());
    }

    @Test
    public void hasDamage(){
        assertEquals(7, knight.getDamage());
    }

    @Test
    public void canSwitchWeapons(){
        knight.setWeapon(Weapons.AXE);
        assertEquals(Weapons.AXE, knight.getWeapon());
    }

    @Test
    public void canAttack(){
        knight.attack(orc);
        assertEquals(100, knight.getHealthPoints());
    }

    @Test
    public void canDefend(){
        knight.defend(orc.getDamage());
        assertEquals(93, knight.getHealthPoints());
    }

    @Test
    public void startsOffNullRoom(){
        assertEquals(null, knight.getCurrentRoom());
    }

    @Test
    public void canEnterRoom(){
        knight.enterRoom(treasureRoom);
        assertEquals(treasureRoom, knight.getCurrentRoom());
    }

    @Test
    public void canGetCoinsFromRoom(){
        knight.enterRoom(treasureRoom);
        knight.getCoins();
        assertEquals(1050, knight.getWallet());
    }

    @Test
    public void cannotGetCoinsUnlessInRoom(){
        assertEquals(50, knight.getCoins());
    }

}
