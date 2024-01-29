package hashmap;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetIteration {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> stringSet = new HashSet<>();

        // Add 10 strings to the HashSet
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Orange");
        stringSet.add("Grapes");
        stringSet.add("Pineapple");
        stringSet.add("Strawberry");
        stringSet.add("Mango");
        stringSet.add("Peach");
        stringSet.add("Watermelon");
        stringSet.add("Kiwi");

        // Iterate over the HashSet using Iterator
        System.out.println("Iterating over HashSet using Iterator:");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterate over the HashSet using for loop
        System.out.println("\nIterating over HashSet using for loop:");
        Object[] array = stringSet.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Iterate over the HashSet using enhanced for loop
        System.out.println("\nIterating over HashSet using enhanced for loop:");
        for (String str : stringSet) {
            System.out.println(str);
        }
    }
}