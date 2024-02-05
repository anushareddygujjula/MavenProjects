package programs;

public class StringRotationChecker {

    public static boolean isRotation(String str1, String str2) {
        // Check if both strings are not null and have the same length
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        // Concatenate str1 with itself, and check if str2 is a substring of the concatenated string
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }

    public static void main(String[] args) {
        // Example usage
        String str1 = "waterbottle";
        String str2 = "erbottlewat";

        if (isRotation(str1, str2)) {
            System.out.println(str2 + " is a rotation of " + str1);
        } else {
            System.out.println(str2 + " is not a rotation of " + str1);
        }
    }
}
