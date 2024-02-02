import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import programs.ReverseArrayList;

public class ReverseArrayListTest {
    // Test case for List<String>
    @Test
    public void testReverseArrayListWithStrings() {
        List<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Orange");
        originalList.add("Grapes");

        List<String> expectedReversed = new ArrayList<>();
        expectedReversed.add("Grapes");
        expectedReversed.add("Orange");
        expectedReversed.add("Banana");
        expectedReversed.add("Apple");

        ReverseArrayList.reverseArrayList(originalList);

        assertEquals(expectedReversed, originalList);
    }

    // Test case for List<Integer>
    @Test
    public void testReverseArrayListWithIntegers() {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);

        List<Integer> expectedReversed = new ArrayList<>();
        expectedReversed.add(4);
        expectedReversed.add(3);
        expectedReversed.add(2);
        expectedReversed.add(1);

        ReverseArrayList.reverseArrayList(originalList);

        assertEquals(expectedReversed, originalList);
    }
}
