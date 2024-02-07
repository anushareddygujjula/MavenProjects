package stream;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringFilter {

    public static List<String> filterStrings(List<String> inputList, Predicate<String> predicate) {
        return inputList.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> inputList = List.of("Apple", "Banana", "Orange", "Grapes", "Avocado");

        // Using a lambda expression as a predicate to filter strings starting with "A"
        Predicate<String> startsWithA = s -> s.startsWith("A");

        List<String> result = filterStrings(inputList, startsWithA);

        // Print the result
        result.forEach(System.out::println);
    }
}
