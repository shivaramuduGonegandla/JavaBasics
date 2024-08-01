package Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	
	public static Set<Integer> findDuplicates(int[] arr) {
	   
		Set<Integer> duplicates = new HashSet<>();
	    Set<Integer> seen = new HashSet<>();
	    for (int num : arr) {
	        if (!seen.add(num)) {
	            duplicates.add(num);
	        }
	    }
	    return duplicates;
	}

	public static void main(String[] args) {
	    int[] array = {1, 2, 3, 2, 4, 5, 5};
	    Set<Integer> duplicates = findDuplicates(array);
	    System.out.println("Duplicate elements: " + duplicates);
	}

}
// Duplicate elements: [2, 5]
