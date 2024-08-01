package Collections;

/*  
1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to
ArrayList and perform the below operations
Add an element to the ArrayList
Iterate through the ArrayList by using Iterator object
Add an element at a specific index
Remove an element from the ArrayList, Remove at an index
Update the element at a specific index
Check the element is present at a particular index
Get an element at a particular index
Find out the size of the ArrayList
Check the given element is present in the ArrayList
Remove all elements of the ArrayList?

*/




import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList of type String with 10 string elements
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Element1");
        stringList.add("Element2");
        stringList.add("Element3");
        stringList.add("Element4");
        stringList.add("Element5");
        stringList.add("Element6");
        stringList.add("Element7");
        stringList.add("Element8");
        stringList.add("Element9");
        stringList.add("Element10");

        // Add an element to the ArrayList
        stringList.add("Element11");

        // Iterate through the ArrayList by using Iterator object
        System.out.println("ArrayList elements using Iterator:");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Add an element at a specific index
        stringList.add(5, "ElementInsertedAt5");

        // Remove an element from the ArrayList
        stringList.remove("Element2");

        // Remove at an index
        stringList.remove(7);

        // Update the element at a specific index
        stringList.set(3, "UpdatedElementAt3");

        // Check the element is present at a particular index
        System.out.println("Element at index 4: " + stringList.get(4));

        // Get an element at a particular index
        System.out.println("Element at index 2: " + stringList.get(2));

        // Find out the size of the ArrayList
        System.out.println("Size of the ArrayList: " + stringList.size());

        // Check if the given element is present in the ArrayList
        System.out.println("Is 'Element9' present in the ArrayList? " + stringList.contains("Element9"));

        // Remove all elements of the ArrayList
        stringList.clear();
        System.out.println("Size of the ArrayList after clearing: " + stringList.size());
    }
}

