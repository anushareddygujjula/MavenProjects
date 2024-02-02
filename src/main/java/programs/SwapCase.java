package programs;

public class SwapCase {
    public static void main(String[] args) {
        String inputString = "Hello, World!";

        String swappedString = swapCase(inputString); // calling method swapCase and passing inputstring argument

        System.out.println("Original String: " + inputString);
        System.out.println("Swapped String: " + swappedString);
    }

    public static String swapCase(String input) {
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];

            if (Character.isUpperCase(currentChar)) {
                chars[i] = Character.toLowerCase(currentChar);
            } else if (Character.isLowerCase(currentChar)) {
                chars[i] = Character.toUpperCase(currentChar);
            }
            // Ignore characters that are neither uppercase nor lowercase
        }

        return new String(chars);
    }
}
