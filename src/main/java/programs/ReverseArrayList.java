package programs;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {

    public static void main(String[] args) {
        // Create an ArrayList
        List<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Orange");
        originalList.add("Grapes");

        // Print original list
        System.out.println("Original ArrayList: " + originalList);

        // Reverse the ArrayList
        reverseArrayList(originalList);

        // Print reversed list
        System.out.println("Reversed ArrayList: " + originalList);
    }

    public static <T> void reverseArrayList(List<T> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            T temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }
    }
}
