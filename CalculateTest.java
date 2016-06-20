
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void testCalA() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calA(2, 2);

        assertEquals(4,n);
    }

    @Test (timeout=100)
     public void testCalB () throws Exception{
        Calculate calculate = new Calculate();
        double b = calculate.calB(2.5, 1.32);

        String str1 = "hello";
        assertNotNull(str1,b);

    }
    @Test (timeout=50)
    public void testNull () throws Exception{
        Calculate calculate = new Calculate();
        double x = calculate.Null(2.5, 1.32);

        String str1 = "Null";
        assertNull(str1,x);

    }
    @Test (timeout=50)
    public void testCalC () throws Exception{
        Calculate calculate = new Calculate();
        double c = calculate.calC(2.5, 1.32);
        double e = 2.5;
        String str1 = "Null";
        assertNotSame(str1, c, e);

    }
}