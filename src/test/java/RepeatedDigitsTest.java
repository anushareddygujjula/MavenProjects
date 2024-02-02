import org.junit.Test;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import programs.RepeatedDigits;

public class RepeatedDigitsTest {

    @Test
    public void testFindRepeatedDigitsWithRepeats() {
        int inputNumber = 122354271;

        Map<Character, Integer> digitFrequency = RepeatedDigits.findRepeatedDigits(inputNumber);

        assertEquals(2, (int) digitFrequency.get('1'));
        assertEquals(3, (int) digitFrequency.get('2'));
    }

    @Test
    public void testFindRepeatedDigitsWithoutRepeats() {
        int inputNumber = 123456789;

        Map<Character, Integer> digitFrequency = RepeatedDigits.findRepeatedDigits(inputNumber);

        assertEquals(1, (int) digitFrequency.get('1'));
        assertEquals(1, (int) digitFrequency.get('2'));
        assertEquals(1, (int) digitFrequency.get('3'));
        assertEquals(1, (int) digitFrequency.get('4'));
        assertEquals(1, (int) digitFrequency.get('5'));
        assertEquals(1, (int) digitFrequency.get('6'));
        assertEquals(1, (int) digitFrequency.get('7'));
        assertEquals(1, (int) digitFrequency.get('8'));
        assertEquals(1, (int) digitFrequency.get('9'));
    }

    @Test
    public void testFindRepeatedDigitsWithEmptyInput() {
        int inputNumber = 0;

        Map<Character, Integer> digitFrequency = RepeatedDigits.findRepeatedDigits(inputNumber);

        assertEquals(1, (int) digitFrequency.get('0'));
    }
}
