import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class HoustonTests {

    private Houston houston;

    @Test
    public void testNormalCode() {
        int[] code = {3, 2, 4, 1, 5, 0};
        houston = new Houston(code);
        String actual = houston.decipher();
        System.out.println(actual);
        String expected = "the cool apple";
        assertEquals(actual, expected);
    }

    @Test
    public void testErrorCode() {
        int[] code = {3, 2, 4, 1, 1, 0};
        houston = new Houston(code);
        String actual = houston.decipher();
        System.out.println(actual);
        String expected = "the cool ERROR";
        assertEquals(actual, expected);
    }

    @Test
    public void testALLErrorCode() {
        int[] code = {17, 0, 1, 0, 1, 0};
        houston = new Houston(code);
        String actual = houston.decipher();
        System.out.println(actual);
        String expected = "ERROR ERROR ERROR";
        assertEquals(actual, expected);
    }

    @Test
    public void testNormalCode2() {
        int[] code = {3, 1, 4, 2, 5, 2};
        houston = new Houston(code);
        String actual = houston.decipher();
        System.out.println(actual);
        String expected = "boo eats moose";
        assertEquals(actual, expected);
    }
    
}
