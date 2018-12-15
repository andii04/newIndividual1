import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightNavigationLightTest {

    private RightNavigationLight right1 = new RightNavigationLight("1",false,"Test",Position.port,LightType.green);

    @Test
    void off() {
        right1.off();
        assertFalse(right1.isOn());
    }

    @Test
    void on() {
        right1.on();
        assertTrue(right1.isOn());
    }

    @Test
    void setLightType() {
        right1.setLightType(LightType.red);
        assertEquals("red",LightType.red.toString());
    }

    @Test
    void setPosition() {
        right1.setPosition(Position.port);
        assertEquals("port",Position.port.toString());
    }
}