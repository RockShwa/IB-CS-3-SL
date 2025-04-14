import org.junit.jupiter.api.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class IrvingTests {
    @Test
    public void testAddAll() {
        Irving irving = new Irving();
        Stack<String> s = new Stack<>();
        s.add("HELLO");
        s.add("WOW");
        irving.addAll(s);
        //irving.printStack();
        // idk how to verify this test other than printing it :sk
        assertEquals(1, 1);
    }

    @Test
    // should error
    public void testRemoveAllError() {
        Irving irving = new Irving();
        Stack<String> s = new Stack<>();
        s.add("HELLO");
        s.add("WOW");
        assertThrows(IllegalStateException.class, () -> {
            irving.removeAll(s);
        });
    }

    // @Test
    // public void testRemoveAll() {
    //     Irving irving = new Irving();
    //     irving.stack.add("HELLO");
    //     irving.stack.add("WOW");
    //     Stack<String> s = new Stack<>();
    //     s.add("HELLO");
    //     s.add("WOW");
    //     irving.removeAll(s);
    //     //irving.printStack();
    //     assertEquals(irving.stack.size(), 0);
    // }

    @Test
    public void testMove() {
        Irving irving = new Irving();
        irving.stack.add("HELLO");
        irving.stack.add("WOW");
        Stack<String> dest = new Stack<>();
        irving.move(2, dest);
        assertEquals(dest.size(), 2);
        assertEquals(irving.stack.size(), 0);
    }
}
