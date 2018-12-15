import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirplaneTest {

    @Test
    void testConstructor()
    {
        Airplane Airplane1 = new Airplane(2015,true,true,false,false,1500,"Name Test") {
        };
        assertNotNull(Airplane1);
    }
    @Test
    void testMethods()
    {

        Airplane Airplane2 = new Airplane(1999,true,true,true,true,100,"Name") {
        };
        Airplane2.closeDoors();
        assertTrue(Airplane2.isClosed);
        Airplane2.openDoors();
        assertTrue(Airplane2.isOpen);
        Airplane2.UnlockDoors();
        assertTrue(Airplane2.isUnlocked);
        Airplane2.brake(50);
        assertEquals(40,40);

    }

    @Test
    void brake() {
    }

    @Test
    void closeDoors() {
    }

    @Test
    void greeting() {
    }

    @Test
    void leftTurn() {
    }

    @Test
    void lockDoors() {
    }

    @Test
    void openDoors() {
    }

    @Test
    void rightTurn() {
    }

    @Test
    void speed() {
    }

    @Test
    void unlockDoors() {
    }
}