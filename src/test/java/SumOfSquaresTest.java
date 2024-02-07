import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import stream.SumOfSquares;

public class SumOfSquaresTest {

    @Test
    void testSumOfSquares() {
        List<Integer> numbers = List.of(1, 2, -3, 4, -5, 6, 7, -8, 9, 10);

        int result = SumOfSquares.sumOfSquares(numbers);

        // Assert that the result is as expected
        assertEquals(287, result, "Sum of squares should be 285 for the provided list");
    }

    @Test
    void testSumOfSquares_EmptyList() {
        List<Integer> numbers = List.of();

        int result = SumOfSquares.sumOfSquares(numbers);

        // Assert that the result is 0 for an empty list
        assertEquals(0, result, "Sum of squares should be 0 for an empty list");
    }

    @Test
    void testSumOfSquares_AllNegative() {
        List<Integer> numbers = List.of(-1, -2, -3, -4, -5);

        int result = SumOfSquares.sumOfSquares(numbers);

        // Assert that the result is 0 for a list with all negative integers
        assertEquals(0, result, "Sum of squares should be 0 for a list with all negative integers");
    }

    // Add more test cases for different scenarios if needed
}
