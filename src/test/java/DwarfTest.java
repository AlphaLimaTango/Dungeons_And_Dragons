import FanatasyAdventure.Enemies.Orc;
import FanatasyAdventure.Players.Melee.Barbarian;
import FanatasyAdventure.Players.Melee.Dwarf;
import FanatasyAdventure.Players.Protection;
import FanatasyAdventure.Players.Race;
import FanatasyAdventure.Players.Weapons;
import FanatasyAdventure.rooms.TreasureRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Orc orc;
    TreasureRoom treasureRoom;

    @Before
    public void before(){
        dwarf = new Dwarf("Ron", Race.DWARF, 50, Weapons.MACE, Protection.SHIELD);
        orc = new Orc(50, 10, 7);
        treasureRoom = new TreasureRoom(1000);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(150, dwarf.getHealthPoints());
    }

    @Test
    public void hasName(){
        assertEquals("Ron", dwarf.getName());
    }

    @Test
    public void hasRace(){
        assertEquals(Race.DWARF, dwarf.getRace());
    }

    @Test
    public void hasWallet(){
        assertEquals(50, dwarf.getWallet());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapons.MACE, dwarf.getWeapon());
    }

    @Test
    public void hasProtection(){
        assertEquals(Protection.SHIELD, dwarf.getProtection());
    }

    @Test
    public void hasDamage(){
        assertEquals(18, dwarf.getDamage());
    }

    @Test
    public void canSwitchWeapons(){
        dwarf.setWeapon(Weapons.AXE);
        assertEquals(Weapons.AXE, dwarf.getWeapon());
    }

    @Test
    public void canAttack(){
        dwarf.attack(orc);
        assertEquals(150, dwarf.getHealthPoints());
    }

    @Test
    public void canDefend(){
        dwarf.defend(orc.getDamage());
        assertEquals(143, dwarf.getHealthPoints());
    }

    @Test
    public void startsOffNullRoom(){
        assertEquals(null, dwarf.getCurrentRoom());
    }

    @Test
    public void canEnterRoom(){
        dwarf.enterRoom(treasureRoom);
        assertEquals(treasureRoom, dwarf.getCurrentRoom());
    }

    @Test
    public void canGetCoinsFromRoom(){
        dwarf.enterRoom(treasureRoom);
        dwarf.getCoins();
        assertEquals(1050, dwarf.getWallet());
    }

    @Test
    public void cannotGetCoinsUnlessInRoom(){
        assertEquals(50, dwarf.getCoins());
    }

}
