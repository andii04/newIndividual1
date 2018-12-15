import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WingTest {

    @Test
    void testConstructor()
    {
        Wing wing = new Wing(20,"Testmanuf");
        assertNotNull(wing);
    }
    @Test
    void calibrate() {
    }
}