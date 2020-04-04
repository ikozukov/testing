import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.condition.JRE.*;
import static org.junit.jupiter.api.condition.OS.*;

public class Additional {

    @Test
    @EnabledOnOs(MAC)
    void onMacOs() {
        System.out.print("Working on Mac");
    }

    @Test
    @DisabledOnOs(LINUX)
    void notOnLinux() {
        System.out.print("Not working on Linux");
    }

    @Test
    @EnabledOnJre(JAVA_8)
    void onJava8() {
        System.out.print("Working on Java 8");
    }

    @Test
    @EnabledOnJre({ JAVA_9, JAVA_10 })
    void onJava9Or10() {
        System.out.print("Working on Jre");
    }

    @Test
    @EnabledForJreRange(min = JAVA_9, max = JAVA_11)
    void fromJava9to11() {
        System.out.print("Working in range of Java");
    }

    @Test
    @EnabledForJreRange(min = JAVA_9)
    void fromJava9toCurrentJavaFeatureNumber() {
        System.out.print("Working in feature of Java");
    }

    @Test
    @EnabledForJreRange(max = JAVA_11)
    void fromJava8To11() {
        System.out.print("Working in range of Jre");
    }

    @Test
    @DisabledOnJre(JAVA_9)
    void notOnJava9() {
        System.out.print("Not working in Java 9");
    }

    @Test
    @DisabledForJreRange(min = JAVA_9, max = JAVA_11)
    void notFromJava9to11() {
        System.out.print("Not working in range of Java");
    }

    @Test
    @DisabledForJreRange(min = JAVA_9)
    void notFromJava9toCurrentJavaFeatureNumber() {
        System.out.print("Not working in feature of Java");
    }

    @Test
    @DisabledForJreRange(max = JAVA_11)
    void notFromJava8to11() {
        System.out.print("Not working in range of Java");
    }
}
