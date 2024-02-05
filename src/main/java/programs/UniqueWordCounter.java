package programs;
import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {

    public static void main(String[] args) {
        String inputString = "java program to count unique words in a string java program";

        Map<String, Integer> wordCountMap = countUniqueWords(inputString);

        // Print the result
        System.out.println("Unique Words and their Counts:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countUniqueWords(String input) {
        // Null check to handle the case where input is null
        if (input == null) {
            return new HashMap<>();
        }

        // Remove leading and trailing whitespaces and convert to lowercase
        String[] words = input.trim().toLowerCase().split("\\s+");

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            // Increment the count in the map for each unique word
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Debug: Input String: " + input);
        System.out.println("Debug: Word Count Map: " + wordCountMap);

        return wordCountMap;
    }
}
