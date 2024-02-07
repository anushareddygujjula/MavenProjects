package stream;
import java.util.List;

public class SumOfSquares {

    public static int sumOfSquares(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n > 0)          // Filter out non-positive integers
                .mapToInt(n -> n * n)        // Square each positive integer
                .sum();                      // Sum the squared values
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, -3, 4, -5, 6, 7, -8, 9, 10);

        int result = sumOfSquares(numbers);

        // Print the result
        System.out.println("Sum of squares of positive integers: " + result);
    }
}
