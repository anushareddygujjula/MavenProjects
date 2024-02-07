import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.function.Predicate;
import static org.junit.jupiter.api.Assertions.*;
import stream.StringFilter;

public class StringFilterTest {

    @Test
    void testFilterStrings() {
        List<String> inputList = List.of("Apple", "Banana", "Orange", "Grapes", "Avocado");

        // Using a lambda expression as a predicate to filter strings starting with "A"
        Predicate<String> startsWithA = s -> s.startsWith("A");

        List<String> result = StringFilter.filterStrings(inputList, startsWithA);

        // Assert that the result contains the expected strings
        assertEquals(2, result.size());
        assertTrue(result.contains("Apple"));
        assertTrue(result.contains("Avocado"));
        assertFalse(result.contains("Banana"));
        assertFalse(result.contains("Orange"));
        assertFalse(result.contains("Grapes"));
    }

    @Test
    void testFilterStrings_EmptyList() {
        List<String> inputList = List.of();

        // Using a lambda expression as a predicate to filter strings starting with "A"
        Predicate<String> startsWithA = s -> s.startsWith("A");

        List<String> result = StringFilter.filterStrings(inputList, startsWithA);

        // Assert that the result is an empty list
        assertTrue(result.isEmpty());
    }
}
