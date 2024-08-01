package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Remove the duplicate elements and return the new array
public interface RemoveDuplicatesAndReturn {

	public static int[] removeDuplicatesAndReturn(int[] arr) {
	    Set<Integer> uniqueElements = new HashSet<>();
	    for (int num : arr) {
	        uniqueElements.add(num);
	    }
	    return uniqueElements.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
	    int[] array = {1, 2, 2, 3, 4, 4, 5};
	    int[] uniqueArray = removeDuplicatesAndReturn(array);
	    System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
	}

}
// Array after removing duplicates: [1, 2, 3, 4, 5]
