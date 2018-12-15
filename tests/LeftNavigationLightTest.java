import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeftNavigationLightTest {

    private LeftNavigationLight left1 = new LeftNavigationLight("1",false,"Test",Position.port,LightType.green);

    @Test
    void off() {
        left1.off();
        assertFalse(left1.isOn());
    }

    @Test
    void on() {
        left1.on();
        assertTrue(left1.isOn());
    }

    @Test
    void setLightType() {
        left1.setLightType(LightType.red);
        assertEquals("red",LightType.red.toString());
    }

    @Test
    void setPosition() {
        left1.setPosition(Position.port);
        assertEquals("port",Position.port.toString());
    }
}