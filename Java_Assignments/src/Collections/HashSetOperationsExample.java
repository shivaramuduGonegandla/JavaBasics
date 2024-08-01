package Collections;

/*
3. Create a HashSet with at least 10 elements of type String
Write program covering all the operations of HashSe

*/
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetOperationsExample {
    public static void main(String[] args) {
        // Step 1: Create a HashSet with at least 10 elements of type String
        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");
        stringSet.add("Date");
        stringSet.add("Elderberry");
        stringSet.add("Fig");
        stringSet.add("Grape");
        stringSet.add("Honeydew");
        stringSet.add("Kiwi");
        stringSet.add("Lemon");

        // Add an element to the HashSet
        stringSet.add("Mango");

        // Check if the HashSet contains a specific element
        System.out.println("Contains 'Apple'? " + stringSet.contains("Apple"));

        // Remove a specific element from the HashSet
        stringSet.remove("Date");

        // Check if the HashSet is empty
        System.out.println("Is the HashSet empty? " + stringSet.isEmpty());

        // Find out the size of the HashSet
        System.out.println("Size of the HashSet: " + stringSet.size());

        // Print all elements using an Iterator
        System.out.println("All elements using Iterator:");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Print all elements using a for-each loop
        System.out.println("All elements using for-each loop:");
        for (String element : stringSet) {
            System.out.println(element);
        }

        // Create a clone/copy of HashSet
        HashSet<String> clonedSet = (HashSet<String>) stringSet.clone();

        // Print the contents of the cloned set to verify
        System.out.println("Contents of the cloned set:");
        for (String element : clonedSet) {
            System.out.println(element);
        }

        // Clear all elements from the HashSet
        stringSet.clear();
        System.out.println("Size of the HashSet after clearing: " + stringSet.size());
    }
}
/*   Contains 'Apple'? true
Is the HashSet empty? false
Size of the HashSet: 10
All elements using Iterator:
Apple
Kiwi
Cherry
Fig
Grape
Mango
Lemon
Elderberry
Honeydew
Banana
All elements using for-each loop:
Apple
Kiwi
Cherry
Fig
Grape
Mango
Lemon
Elderberry
Honeydew
Banana
Contents of the cloned set:
Apple
Kiwi
Cherry
Fig
Grape
Mango
Lemon
Elderberry
Honeydew
Banana
Size of the HashSet after clearing: 0
*/