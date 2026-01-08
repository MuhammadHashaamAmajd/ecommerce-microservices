import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SmokeTest {

    @Test
    @DisplayName("Verify System Environment Check")
    void systemEnvironmentTest() {
        String env = System.getProperty("java.version");
        System.out.println("Running tests on Java version: " + env);
        
        // A simple generic assertion
        assertNotNull(env, "Java runtime environment should be available");
    }
}
