import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import stream.AverageOfSquaresOfOddNumbers;
class AverageOfSquaresOfOddNumbersTest {

    @Test
    void testCalculateAverageOfSquaresOfOddNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double result = AverageOfSquaresOfOddNumbers.calculateAverageOfSquaresOfOddNumbers(numbers);

        // Define the expected result manually based on the input array
        double expected = ((1 * 1) + (3 * 3) + (5 * 5) + (7 * 7) + (9 * 9)) / 5.0;

        // Compare the expected and actual results with a delta for double comparison
        assertEquals(expected, result, 0.0001);
    }
}
