package stream;
import java.util.Arrays;

public class AverageOfSquaresOfOddNumbers {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double averageOfSquaresOfOddNumbers = calculateAverageOfSquaresOfOddNumbers(numbers);

        System.out.println("Average of squares of odd numbers: " + averageOfSquaresOfOddNumbers);
    }

    public static double calculateAverageOfSquaresOfOddNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)         // Filter odd numbers
                .mapToDouble(n -> Math.pow(n, 2)) // Square each odd number
                .average()                        // Calculate average
                .orElse(0.0);                     // Default to 0.0 if no odd numbers are present
    }
}
