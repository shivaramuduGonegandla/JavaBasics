package Collections;

/* 
  2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
Insert a Key value mapping into the map
Fetch the value of a Key
Create a clone/copy of HashMap
Check if the given Key is in the Map
Check if the value is in the Map
Check if the map is empty
Print the size of the Map to the console
Print all the Keys of the map to the console
Print all the Keys of the map to the console
Remove a specific Key-value pair
Copy all the elements of the Map to another Map
   
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapOperations {
    public static void main(String[] args) {
        // Step 1: Create a HashMap with at least 10 key-value pairs of Student ID and Name
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Eve");
        studentMap.put(106, "Frank");
        studentMap.put(107, "Grace");
        studentMap.put(108, "Hank");
        studentMap.put(109, "Ivy");
        studentMap.put(110, "Jack");

        // Insert a Key-Value mapping into the map
        studentMap.put(111, "Lily");

        // Fetch the value of a Key
        int keyToFetch = 104;
        System.out.println("Value for key " + keyToFetch + ": " + studentMap.get(keyToFetch));

        // Create a clone/copy of HashMap
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) studentMap.clone();

        // Check if the given Key is in the Map
        int keyToCheck = 105;
        System.out.println("Is key " + keyToCheck + " in the map? " + studentMap.containsKey(keyToCheck));

        // Check if the value is in the Map
        String valueToCheck = "Alice";
        System.out.println("Is value '" + valueToCheck + "' in the map? " + studentMap.containsValue(valueToCheck));

        // Check if the map is empty
        System.out.println("Is the map empty? " + studentMap.isEmpty());

        // Print the size of the Map to the console
        System.out.println("Size of the map: " + studentMap.size());

        // Print all the Keys of the map to the console
        System.out.println("All keys in the map:");
        Set<Integer> keys = studentMap.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }

        // Print all the Values of the map to the console
        System.out.println("All values in the map:");
        for (String value : studentMap.values()) {
            System.out.println(value);
        }

        // Remove a specific Key-Value pair
        studentMap.remove(108);

        // Copy all the elements of the Map to another Map
        HashMap<Integer, String> anotherMap = new HashMap<>(studentMap);

        // Print the contents of the new map to verify
        System.out.println("Contents of the new map:");
        for (Map.Entry<Integer, String> entry : anotherMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
/* Output:-
   Value for key 104: David
Is key 105 in the map? true
Is value 'Alice' in the map? true
Is the map empty? false
Size of the map: 11
All keys in the map:
101
102
103
104
105
106
107
108
109
110
111
All values in the map:
Alice
Bob
Charlie
David
Eve
Frank
Grace
Hank
Ivy
Jack
Lily
Contents of the new map:
Key: 101, Value: Alice
Key: 102, Value: Bob
Key: 103, Value: Charlie
Key: 104, Value: David
Key: 105, Value: Eve
Key: 106, Value: Frank
Key: 107, Value: Grace
Key: 109, Value: Ivy
Key: 110, Value: Jack
Key: 111, Value: Lily
*/
