import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A380Test {

    @Test
    void testConstructor()
    {
        A380 a380new = new A380(2010,true,true,true,true,200,"NeuerName");
        assertNotNull(a380new);
    }
}