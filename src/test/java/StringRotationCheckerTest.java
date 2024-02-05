import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import programs.StringRotationChecker;

class StringRotationCheckerTest {

    @Test
    void testIsRotation() {
        // Test case with a rotation
        assertTrue(StringRotationChecker.isRotation("waterbottle", "erbottlewat"));

        // Test case with non-rotation
        assertFalse(StringRotationChecker.isRotation("hello", "world"));

        // Test case with null strings
        assertFalse(StringRotationChecker.isRotation(null, "abc"));
        assertFalse(StringRotationChecker.isRotation("abc", null));
        assertFalse(StringRotationChecker.isRotation(null, null));

        // Test case with strings of different lengths
        assertFalse(StringRotationChecker.isRotation("abc", "def"));
    }
}
