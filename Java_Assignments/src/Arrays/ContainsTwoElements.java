package Arrays;

// Verify if the array contains two specified elements (12, 23)

public class ContainsTwoElements {

	public static boolean containsTwoElements(int[] arr, int elem1, int elem2) {
	    boolean containsElem1 = false;
	    boolean containsElem2 = false;
	    for (int num : arr) {
	        if (num == elem1) containsElem1 = true;
	        if (num == elem2) containsElem2 = true;
	        if (containsElem1 && containsElem2) return true;
	    }
	    return false;
	}

	public static void main(String[] args) {
	    int[] array = {10, 12, 23, 45};
	    System.out.println("Array contains both 12 and 23: " + containsTwoElements(array, 12, 23));
	}

}

// Array contains both 12 and 23: true
