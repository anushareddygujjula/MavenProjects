import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}


public class LambdaExpTest {

    @Test
    void testAddition() {
        MathOperation addition = (a, b) -> a + b;
        int result = addition.operate(5, 3);
        assertEquals(8, result, "Addition result should be 8 for inputs 5 and 3");
    }


}
