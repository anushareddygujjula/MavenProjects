package programs;
import java.util.HashMap;
import java.util.Map;

public class RepeatedDigits {

    public static void main(String[] args) {
        int inputNumber = 122354271;

        Map<Character, Integer> digitFrequency = findRepeatedDigits(inputNumber);

        System.out.println("Digits repeated more than once:");
        for (Map.Entry<Character, Integer> entry : digitFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }

    // Change the access modifier to public
    public static Map<Character, Integer> findRepeatedDigits(int number) {
        Map<Character, Integer> digitFrequency = new HashMap<>();
        char[] digits = String.valueOf(number).toCharArray();

        for (char digit : digits) {
            digitFrequency.put(digit, digitFrequency.getOrDefault(digit, 0) + 1);
        }

        return digitFrequency;
    }
}
