package programs;
import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacters {

    public static void main(String[] args) {
        String inputString = "programming";

        Map<Character, Integer> charCountMap = findRepeatedCharacters(inputString);

        System.out.println("Repeated Characters in the String:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }

    public static Map<Character, Integer> findRepeatedCharacters(String input) {
        // Null check to handle the case where input is null
        if (input == null) {
            return new HashMap<>();
        }

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            // Increment the count in the map for each character
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        return charCountMap;
    }
}
