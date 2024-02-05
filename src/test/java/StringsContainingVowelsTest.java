import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import stream.StringsContainingVowels;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StringsContainingVowelsTest {

    @Test
    void testPrintStringsWithVowels() {
        List<String> stringList = Arrays.asList("hello", "world", "apple", "banana", "java");

        // Redirect System.out to capture printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the main method of StringsContainingVowels
        StringsContainingVowels.main(null);

        // Reset System.out
        System.setOut(System.out);

        // Convert captured output to a string
        String printedOutput = outputStream.toString().trim();

        // Verify the presence of expected substrings in the actual output
        assertTrue(printedOutput.contains("apple - Number of Vowels: 2"));
        assertTrue(printedOutput.contains("banana - Number of Vowels: 3"));
        assertTrue(printedOutput.contains("java - Number of Vowels: 2"));
    }
}
