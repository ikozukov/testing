import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT;

@Execution(CONCURRENT)
public class Main {
    @BeforeAll
    @DisplayName("Before all")
    static void ball() {
        System.out.print("Print before all tests");
    }

    @BeforeEach
    @DisplayName("Before each")
    void beach() {
        System.out.print("Print before each test:\n");
    }

    @Test
    @Timeout(1)
    void succeedingTest() {
        System.out.print("Succeeding test");
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void failingTest() {
        fail("Failing test");
    }

    @Test
    @Disabled("Reason for disabling test")
    void disabledTest() {
        System.out.print("Disabled test");
    }

    @RepeatedTest(value = 2, name = "{currentRepetition} of {totalRepetitions} cycle")
    void repeatingTest() {
        System.out.print("2 times repeating test");
    }

    @Test
    void abortedTest() {
        assumeTrue("abc".contains("Z"));
        fail("Test should have been aborted");
    }

    @ParameterizedTest
    @ValueSource(strings  = {"Hello", "World"})
    void parameterizedTest(String string) {
        HelloWorld.main(string);
    }

    @AfterEach
    @DisplayName("After each")
    void afterEach() {
        System.out.print("\nAfter each test");
    }

    @AfterAll
    @DisplayName("After all")
    static void afterAll() {
        System.out.print("Print after all tests");
    }
}
