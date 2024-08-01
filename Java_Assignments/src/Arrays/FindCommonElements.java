package Arrays;

import java.util.HashSet;
import java.util.Set;

// Find the common values between two arrays


public class FindCommonElements {

	public static Set<Integer> findCommonElements(int[] arr1, int[] arr2) {
	    Set<Integer> set1 = new HashSet<>();
	    Set<Integer> common = new HashSet<>();
	    for (int num : arr1) {
	        set1.add(num);
	    }
	    for (int num : arr2) {
	        if (set1.contains(num)) {
	            common.add(num);
	        }
	    }
	    return common;
	}

	public static void main(String[] args) {
	    int[] array1 = {1, 2, 3, 4, 5};
	    int[] array2 = {3, 4, 5, 6, 7};
	    Set<Integer> common = findCommonElements(array1, array2);
	    System.out.println("Common elements: " + common);
	}

}
// Common elements: [3, 4, 5]
