import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.*;

public class Main {
    @Test
    void equals() {
        assertEquals(2, (1 + 1));
    }
    @Test
    void equalsForTrue() {
        assertTrue(2 == (1 + 1));
    }
    @Test
    void equalsForFalse() {
        assertFalse(1 == (1 + 1));
    }

    @Test
    void notEquals() {
        assertNotEquals("Hello", "World");
    }
    @Test
    void notEqualsForTrue() {
        assertTrue("Hello" != "World");
    }
    @Test
    void notEqualsForFalse() {
        assertFalse("Hello" == "World");
    }

    @Test
    void more() {
        assertTrue(1 > 0.1);
    }
    @Test
    void less() {
        assertTrue(0 < 1);
    }

    @Test
    void nullAssert() {
        assertNull(null);
    }
    @Test
    void notNull() {
        assertNotNull(0);
    }

    @Test
    void timeoutMin() {
        assertTimeout(ofMinutes(1), () -> {
            assertTrue(true);
        });
    }
    @Test
    void timeoutMili() {
        assertTimeoutPreemptively(ofMillis(9), () -> {
            Thread.sleep(1);
        });
    }
}
