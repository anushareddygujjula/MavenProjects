package hashmap;
import org.junit.Test;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StudentHashMapTest {

    @Test
    public void testGetStudentByName() {
        StudentHashMap studentHashMap = new StudentHashMap();

        // Test Case 1: Valid student name
        String searchName1 = "Alice";
        StudentHashMap.Student result1 = studentHashMap.getStudentByName(searchName1);
        assertEquals("Alice", result1.firstName);
        assertEquals("Johnson", result1.lastName);
        assertEquals(3.8, result1.GPA, 0.01);

        // Test Case 2: Invalid student name
        String searchName2 = "InvalidName";
        StudentHashMap.Student result2 = studentHashMap.getStudentByName(searchName2);
        assertNull(result2);
    }

    @Test
    public void testInitialStudentMapSize() {
        StudentHashMap studentHashMap = new StudentHashMap();
        Map<String, StudentHashMap.Student> studentMap = studentHashMap.getStudentMap();

        // Test the initial size of the student map
        assertEquals(8, studentMap.size());
    }
}