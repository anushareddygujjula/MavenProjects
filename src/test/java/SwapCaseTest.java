import org.junit.Test;
import static org.junit.Assert.assertEquals;
import programs.SwapCase;

public class SwapCaseTest {

    @Test
    public void testSwapCase1() {
        String inputString = "Hello, World!";
        String expectedOutput = "hELLO, wORLD!";

        String actualOutput = SwapCase.swapCase(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSwapCase2() {
        String inputString = "Testing 123";
        String expectedOutput = "tESTING 123";

        String actualOutput = SwapCase.swapCase(inputString);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSwapCase3() {
        String inputString = "Java Programming";
        String expectedOutput = "jAVA pROGRAMMING";

        String actualOutput = SwapCase.swapCase(inputString);

        assertEquals(expectedOutput, actualOutput);
    }
}
