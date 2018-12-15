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
    void testMethod()
    {
        Airplane Airplane2 = new Airplane(1999,true,true,true,true,100,"Name") {
        };
        Airplane2.closeDoors();
        assertTrue(Airplane2.isClosed);
        Airplane2.openDoors();
        assertTrue(Airplane2.isOpen);
        Airplane2.UnlockDoors();
        assertTrue(Airplane2.isUnlocked);
    }

}