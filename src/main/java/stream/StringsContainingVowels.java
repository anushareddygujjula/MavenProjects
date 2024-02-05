package  stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsContainingVowels {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("hello", "world", "apple", "banana", "java");

        // Using streams and lambda functions to filter and print strings with vowels
        stringList.stream()
                .filter(s -> containsVowels(s))
                .forEach(s -> System.out.println(s + " - Number of Vowels: " + countVowels(s)));
    }

    // Function to check if a string contains vowels
    private static boolean containsVowels(String str) {
        return str.toLowerCase().chars().anyMatch(c -> "aeiou".indexOf(c) != -1);
    }

    // Function to count the number of vowels in a string
    private static long countVowels(String str) {
        return str.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }
}
