
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class A350Test {

    private A350 a350 = new A350(1999,true,true,true,true,2000,"Name");

    @Test
    void testConstructor()
    {
        A350 a350new = new A350(2010,true,true,true,true,200,"NeuerName");
        assertNotNull(a350new);
    }
}